package io.github.disabledmallis.map2cpp.mapping;

public abstract class Mapping {
	private MappingString officialName;
	private MappingString intermediaryName;
	private MappingString mappedName;

	public Mapping(String officialName, String intermediaryName, String mappedName) {
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
}
