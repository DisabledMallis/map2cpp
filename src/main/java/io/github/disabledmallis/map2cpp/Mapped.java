package io.github.disabledmallis.map2cpp;

public abstract class Mapped {
	public static boolean includeSpacing = false;
	public static String NEWLINE = "\n";
	public static String TAB = "\t";
	
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

	public String getTopName() throws Exception {
		if(this.getMappedName() != null)
			return this.getMappedName();
		else if(this.getIntermediary() != null)
			return this.getIntermediary();
		else if(this.getOfficial() != null)
			return this.getOfficial();
		throw new Exception("No name available for this mapping");
	}
}
