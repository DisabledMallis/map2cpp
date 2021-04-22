package io.github.disabledmallis.map2cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import net.fabricmc.mapping.reader.v2.MappingGetter;
import net.fabricmc.mapping.reader.v2.TinyVisitor;
import net.fabricmc.mapping.tree.TinyMappingFactory;
import net.fabricmc.mapping.tree.TinyTree;

public class Main {

	static ArrayList<MappedClass> classes = new ArrayList<>();

	static String intermediaryPath = "mappings/intermediary.tiny";
    public static void main(String[] args) throws IOException {
		for(int i = 0; i < args.length; i++) {
			String current = args[i];
			if(current.equals("-i") || current.equals("--intermediary")) {
				intermediaryPath = args[i+1];
			}
		}
		
		BufferedReader reader = new BufferedReader(new FileReader(intermediaryPath));
		TinyTree tree = TinyMappingFactory.loadLegacy(reader);
		tree.getClasses().forEach(c -> {
			MappedClass mappedClass = new MappedClass(null, c.getName("intermediary"), c.getName("official"));
			c.getFields().forEach(f -> {
				MappedField mappedField = new MappedField(null, f.getName("intermediary"), f.getName("official"));
				mappedClass.addField(mappedField);
			});
			classes.add(mappedClass);
		});

		Logger.Log(classes.toString());
    }

	public static class Visitor implements TinyVisitor {
		/**
		 * Visit a class.
		 *
		 * <p>{@link #start(TinyMetadata)} is called before this call and the visit stack
		 * is empty.
		 *
		 * @param name the mappings
		 */
		public void pushClass(MappingGetter name) {
			Logger.Log(name.getAllNames()[0]);
		}
	}
}
