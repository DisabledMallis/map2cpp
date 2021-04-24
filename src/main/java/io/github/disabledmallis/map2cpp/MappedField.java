package io.github.disabledmallis.map2cpp;

public class MappedField extends Mapped{
	public MappedField(String officialName, String intermediaryName, String mappedName) {
		super(officialName, intermediaryName, mappedName);
	}

	public String toString() {
		StringBuilder sbuild = new StringBuilder();

		/*
			Get field func
		*/
		sbuild.append("void* get_");

		try {
			sbuild.append(this.getTopName());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		sbuild.append("(");
		/*TODO: params*/
		sbuild.append(") {");
		sbuild.append(NEWLINE);
		/*TODO: Call java code*/
		sbuild.append("};");

		/*
			Set field function
		*/
		//TODO: This
		
		return sbuild.toString();
	}
}
