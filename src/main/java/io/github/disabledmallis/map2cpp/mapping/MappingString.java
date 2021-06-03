package io.github.disabledmallis.map2cpp.mapping;

public class MappingString implements CharSequence {

	private String fullMap;

	public MappingString(String fullMap) {
		this.fullMap = fullMap;
	}

	/*

	Returns the class name without the package path

	Example:
	net/minecraft/client/MinecraftClient
	or
	net/minecraft/client/MinecraftClient$BullshitSubclass
	becomes
	MinecraftClient

	nobody cares about subclasses or what ever the fuck they are so like

	*/
	public String getPackagelessName() {
		String[] split = fullMap.split("/");
		String last = split[split.length-1];
		if(last.contains("$")) {
			return last.substring(0, last.indexOf("$"));
		}
		return last;
	}

	public String getFullName() {
		return fullMap;
	}

	@Override
	public String toString() {
		return fullMap;
	}

	@Override
	public int length() {
		return fullMap.length();
	}

	@Override
	public char charAt(int index) {
		return fullMap.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return fullMap.subSequence(start, end);
	}
}
