package io.github.disabledmallis.map2cpp;

import java.util.ArrayList;

public class MappedClass extends Mapped {
	ArrayList<MappedField> fields;
	public MappedClass(String mappedName, String intermediaryName, String officialName)  {
		super(mappedName, intermediaryName, officialName);
		fields = new ArrayList<>();
	}

	public void addField(MappedField field) {
		fields.add(field);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		String nameToUse = "nameless";
		sb.append("class ");
		if(this.getMappedName()==null) {
			if(this.getIntermediary()==null) {
				if(this.getOfficial()==null) {
					try {
						throw new Exception("No name available for a class... the heck?");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else {
					nameToUse = this.getOfficial();
				}
			}
			else {
				nameToUse = this.getIntermediary();
			}
		}
		else {
			nameToUse = this.getMappedName();
		}
		sb.append(nameToUse);
		sb.append(" {");
		sb.append(NEWLINE);
		sb.append("public:");
		for(MappedField f : fields) {
			sb.append(f.toString());
			sb.append(NEWLINE);
		}
		sb.append("};");
		return sb.toString();
	}
}
