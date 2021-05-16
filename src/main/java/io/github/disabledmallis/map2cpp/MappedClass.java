package io.github.disabledmallis.map2cpp;

import java.util.ArrayList;

public class MappedClass extends Mapping {

	private ArrayList<MappedField> fields = new ArrayList<>();

	public MappedClass(String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
	}

	public String getSourcePath() {
		return this.getMapped()+".h";
	}

	public void addField(MappedField field) {
		fields.add(field);
	}

	public String toString() {
		StringBuilder classCode = new StringBuilder();

		/* Header guarding uwu */
		classCode.append("#IFNDEF ");
		classCode.append(this.getMapped());
		classCode.append("\n");
		classCode.append("#DEFINE ");
		classCode.append(this.getMapped());
		classCode.append("\n");
		//Include JNI
		classCode.append("#include <jni.h>");
		classCode.append("\n");
		//Code time
		classCode.append("class ");
		classCode.append(this.getPackageless());
		classCode.append(" : public _jobject {");
		classCode.append("\n");
		classCode.append("public:");
		classCode.append("\n");
		classCode.append("};");
		//Close header guard
		classCode.append("\n");
		classCode.append("#ENDIF");


		return classCode.toString();
	}
}
