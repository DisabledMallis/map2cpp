package io.github.disabledmallis.map2cpp;

public class MappedClass {
	private MappingString officialName;
	private MappingString intermediaryName;
	private MappingString mappedName;

	public MappedClass(String officialName, String intermediaryName, String mappedName) {
		this.officialName = new MappingString(officialName);
		this.intermediaryName = new MappingString(intermediaryName);
		this.mappedName = new MappingString(mappedName);
	}

	public String getOfficial() {
		return this.officialName.toString();
	}

	public String getIntermediary() {
		return this.intermediaryName.toString();
	}

	public String getMapped() {
		return this.mappedName.toString();
	}

	public String getPackageless() {
		return this.mappedName.getPackagelessName();
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
