package io.github.disabledmallis.map2cpp;

import java.util.ArrayList;

import net.fabricmc.mapping.tree.ClassDef;
import net.fabricmc.mapping.tree.FieldDef;
import net.fabricmc.mapping.tree.TinyTree;

public class MappingReader {
	private TinyTree intermediaryTree;
	private TinyTree mappingTree;

	public MappingReader(TinyTree intermediaryTree, TinyTree mappingTree) {
		this.intermediaryTree = intermediaryTree;
		this.mappingTree = mappingTree;
	}

	public ClassDef getFromIntermediary(String intermediary) {
		//Loop through named mappings
		for(ClassDef cdef : mappingTree.getClasses()) {
			String sInter = cdef.getName("intermediary");
			//Find class name
			if(intermediary.equals(sInter)) {
				//Store it
				return cdef;
			}
		}
		try {
			throw new Exception("No class found with the intermediary \""+intermediary+"\"");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public MappedClass[] generateClasses() {
		//Class array
		ArrayList<MappedClass> classArrL = new ArrayList<>();

		//Loop classes
		intermediaryTree.getClasses().forEach(c -> {
			//Class names
			String intermediary = c.getName("intermediary");
			ClassDef namedDef = getFromIntermediary(intermediary);
			if(namedDef == null) {
				return;
			}
			String official = c.getName("official");
			String name = namedDef.getName("official");
			


			//If the name isnt null (some class names are never added to yarn for one reason or another)
			if(name != null) {
				//Create a new MappedClass instance
				MappedClass mappedClass = new MappedClass(official, intermediary, name);

				//Loop through class fields
				c.getFields().forEach(f -> { 
					FieldDef[] namedFieldDef = {null};
					namedDef.getFields().forEach(nf -> {
						if(f.getName("intermediary").equals(nf.getName("intermediary"))) {
							namedFieldDef[0] = nf;
						}
					});
					MappedField mField = new MappedField(f.getName("official"), f.getName("intermediary"), namedFieldDef[0].getName("named"));
					mappedClass.addField(mField);
				});

				classArrL.add(mappedClass);
			}
		});

		MappedClass[] retArr = new MappedClass[classArrL.size()];
		for(int i = 0; i < retArr.length; i++) {
			retArr[i] = classArrL.get(i);
		}

		return retArr;
	}
}
