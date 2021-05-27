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

		builder.append(returnType.getCppType());
		builder.append(" ");
		builder.append(this.getMapped());
		builder.append("\n");

		return builder.toString();
	}
}
