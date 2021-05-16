package io.github.disabledmallis.map2cpp;

public class MappedClass extends Mapping {

	public MappedClass(String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
	}

	public String getSourcePath() {
		return this.getMapped()+".h";
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


		return classCode.toString();
	}
}
