package io.github.disabledmallis.map2cpp;

public abstract class Mapped {
	private String officialName;
	private String intermediaryName;
	private String mappedName;

	public Mapped(String officialName, String intermediaryName, String mappedName) {
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
