package io.github.disabledmallis.map2cpp;

public abstract class Mapped {
	private String officialName;
	private String intermediaryName;
	private String mappedName;

	public Mapped(String mappedName, String intermediaryName, String officialName) {
		this.officialName = officialName;
		this.intermediaryName = intermediaryName;
		this.mappedName = mappedName;
	}

	public String getOfficial() {
		return this.officialName;
	}
	public String getIntermediary() {
		return this.intermediaryName;
	}
	public String getMappedName() {
		return this.mappedName;
	}
}
