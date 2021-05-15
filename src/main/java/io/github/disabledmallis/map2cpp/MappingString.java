package io.github.disabledmallis.map2cpp;

public class MappingString implements CharSequence {

	String fullMap;

	public MappingString(String fullMap) {
		this.fullMap = fullMap;
	}

	/*

	Returns the class name without the package path

	Example:
	net/minecraft/client/MinecraftClient
	becomes
	MinecraftClient

	*/
	public String getPackagelessName() {
		String[] split = fullMap.split("/");
		String last = split[split.length-1];
		return last;
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
