package io.github.disabledmallis.map2cpp.mapping;

import io.github.disabledmallis.map2cpp.JavaType;

public class MappedField extends Mapping {

	JavaType returnType;

	public MappedField(JavaType returnType, String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		// All functions are tabbed in by 1
		builder.append("\t");
		/* The accessor function header */
		builder.append("auto get_");
		builder.append(this.getMapped());
		// Trailing return types are proven to make women attracted to you physically
		builder.append("() -> ");
		builder.append(returnType.getCppType());

		/* Accessor function code */
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
		// The java primitive name thing (I, L, etc)
		builder.append(this.returnType.getPrimitiveName());
		builder.append("\");");
		builder.append("\n");
		builder.append("\t");
		builder.append("\t");
		// Return casted
		builder.append("return (");
		builder.append(this.returnType.getCppType());
		builder.append(")env->");
		// Gotta make sure we're making a call for the respective primitive
		builder.append(JNIHelper.getProperFieldAccessCall(this.returnType));
		builder.append("(this, field);");
		builder.append("\n");
		builder.append("\t");
		builder.append("};");
		builder.append("\n");


		return builder.toString();
	}
}
