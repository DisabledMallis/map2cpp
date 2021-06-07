package io.github.disabledmallis.map2cpp.mapping;

import java.util.ArrayList;

import io.github.disabledmallis.map2cpp.JavaType;
import io.github.disabledmallis.map2cpp.Main;

public class MappedClass extends Mapping {

	private ArrayList<MappedField> fields = new ArrayList<>();

	public MappedClass(String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
	}

	// Get the path to the source file
	public String getSourcePath() {
		return this.getMapped()+".h";
	}

	// Add a field to the class
	public void addField(MappedField field) {
		fields.add(field);
	}

	public JavaType asMappedType() {
		return new JavaType("L"+this.getMapped()+";");
	}

	// toString should output generated C++ code for the class
	public String toString() {
		StringBuilder classCode = new StringBuilder();

		/* Header guarding uwu */
		String guardName = "GUARD_"+this.getPackageless();
		classCode.append("#ifndef ");
		classCode.append(guardName);
		classCode.append("\n");
		classCode.append("#define ");
		classCode.append(guardName);
		classCode.append("\n");

		//Include required files
		classCode.append("#include \"");
		/*
		 We should get the JNIUtil.h relatively to avoid conflicts and issues
		*/
		 for(char c : this.getSourcePath().toCharArray()) {
			if(c == '/' || c == '\\') {
				// Add ../ to the include to go up one dir
				classCode.append("../");
			}
		}
		classCode.append("JNIUtil.h\"");
		classCode.append("\n");
		classCode.append("\n");

		//Code time
		classCode.append("class ");
		classCode.append(this.getPackageless());
		classCode.append(" : public _jobject {");
		classCode.append("\n");
		classCode.append("public:");
		classCode.append("\n");

		/* Generate field accessors & modifiers */
		for(MappedField f : this.fields) {
			classCode.append(f.toString());
		}

		/* TODO: Generate function calls */

		classCode.append("};");
		//Close header guard
		classCode.append("\n");
		classCode.append("#endif");
		classCode.append(" //");
		classCode.append(guardName);
		classCode.append("\n");


		return classCode.toString();
	}
}
