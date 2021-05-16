package io.github.disabledmallis.map2cpp;

public class MappedField extends Mapping {
	public MappedField(String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(this.getMapped());
		builder.append("\n");

		return builder.toString();
	}
}
