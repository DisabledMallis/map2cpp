package io.github.disabledmallis.map2cpp;

import java.util.ArrayList;

import net.fabricmc.mapping.tree.TinyTree;

public class MappingReader {
	private TinyTree intermediaryTree;
	private TinyTree mappingTree;

	public MappingReader(TinyTree intermediaryTree, TinyTree mappingTree) {
		this.intermediaryTree = intermediaryTree;
		this.mappingTree = mappingTree;
	}

	public MappedClass[] generateClasses() {
		ArrayList<MappedClass> classArrL = new ArrayList<>();

		intermediaryTree.getClasses().forEach(c -> {
			String intermediary = c.getName("intermediary");
			String official = c.getName("official");
			String[] name = {null};
			mappingTree.getClasses().forEach(h -> {
				String sInter = h.getName("intermediary");
				if(intermediary.equals(sInter)) {
					name[0] = h.getName("named");
				}
			});
			if(name[0] != null) {
				MappedClass mappedClass = new MappedClass(official, intermediary, name[0]);
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
