package com.composition;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "abacce";
		s.replaceAll("a", "k");
		System.out.println("s>>>>>> " + s);
		char[] c = s.toCharArray();
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (l.containsKey(s.charAt(i))) {
				Integer in = l.get(s.charAt(i));
				l.put(s.charAt(i), in + 1);
			} else {
				l.put(s.charAt(i), 1);
			}

		}

		for (Map.Entry m : l.entrySet()) {
			if ((Integer) m.getValue() == 1) {
				System.out.println("first character >> " + m.getKey());
				break;
			}
		}
	}

}
