package io.github.disabledmallis.map2cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import net.fabricmc.mapping.reader.v2.MappingGetter;
import net.fabricmc.mapping.reader.v2.TinyVisitor;
import net.fabricmc.mapping.tree.TinyMappingFactory;
import net.fabricmc.mapping.tree.TinyTree;

public class Main {
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
			Logger.Log(c.getName("official") + " -> " + c.getRawName("intermediary"));
		});
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
