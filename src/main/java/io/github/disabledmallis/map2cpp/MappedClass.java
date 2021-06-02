package io.github.disabledmallis.map2cpp;

import java.util.ArrayList;

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

	// toString should output generated C++ code for the class
	public String toString() {
		StringBuilder classCode = new StringBuilder();

		/* Header guarding uwu */
		classCode.append("#ifndef ");
		classCode.append(this.getPackageless());
		classCode.append("\n");
		classCode.append("#define ");
		classCode.append(this.getPackageless());
		classCode.append("\n");

		//Include required files
		classCode.append("#include <");
		classCode.append(Main.outputDir);
		classCode.append("JNIUtil.h>");
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
		classCode.append("\n");


		return classCode.toString();
	}
}
