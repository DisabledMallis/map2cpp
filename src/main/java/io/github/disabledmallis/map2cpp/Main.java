package io.github.disabledmallis.map2cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import net.fabricmc.mapping.tree.ClassDef;
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
		Map<String,ClassDef> namespaceMap = tree.getDefaultNamespaceClassMap();
		for(String cl : namespaceMap.keySet()) {
			try {
				Logger.Log(cl 
				+ " -> " + 
				namespaceMap
				.get(cl)
				.getName(cl));
			} catch (Exception ex) {
				Logger.Log(cl + " -> " + "error");
			}
			
		}
    }
}
