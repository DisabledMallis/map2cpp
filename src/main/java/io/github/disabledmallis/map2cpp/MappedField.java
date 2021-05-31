package io.github.disabledmallis.map2cpp;

public class MappedField extends Mapping {

	JavaType returnType;

	public MappedField(JavaType returnType, String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("\t");
		builder.append("auto get_");
		builder.append(this.getMapped());
		builder.append("() -> ");
		builder.append(returnType.getCppType());
		builder.append(" {");
		builder.append("\n");
		builder.append("\t");
		builder.append("\t");
		builder.append("JNIEnv* env = getJNI();");
		builder.append("\n");
		builder.append("\t");
		builder.append("\t");
		builder.append("jfieldID field = env->GetFieldID(env->GetObjectClass(this), \"");
		builder.append(this.getIntermediary());
		builder.append("\", \"");
		builder.append(this.returnType.getPrimitiveName());
		builder.append("\");");
		builder.append("\n");
		builder.append("\t");
		builder.append("\t");
		builder.append("return (");
		builder.append(this.returnType.getCppType());
		builder.append(")env->GetObjectField(this, field);");
		builder.append("\n");
		builder.append("\t");
		builder.append("};");
		builder.append("\n");


		return builder.toString();
	}
}
