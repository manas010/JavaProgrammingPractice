package com.manas.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//// 2 9 3 4 1 2 4
public class CheckForStringAnagram {

	public static void main(String[] args) {

		String a = "abccca";
		String b = "cccbaa";

		System.out.println("Anagram : "+isAnagram(a, b));
	}

	public static boolean isAnagram(String a, String b) {
		Map<String, Integer> m1 = new HashMap();
		Map<String, Integer> m2 = new HashMap();
		boolean flag = false;
		if (a.length() == b.length()) {
			for (int i = 0; i <= a.length() - 1; i++) {
				if (m1.isEmpty()) {
					m1.put(a.valueOf(a.charAt(i)), 1);

				} else if (m1.containsKey(a.valueOf(a.charAt(i)))) {
					Integer val = m1.get(a.valueOf(a.charAt(i)));

					m1.replace(a.valueOf(a.charAt(i)), val + 1);
				} else {
					m1.put(a.valueOf(a.charAt(i)), 1);
				}
				// String str=a.valueOf(a.charAt(i));
			}
			for (int i = 0; i <= b.length() - 1; i++) {
				if (m2.isEmpty()) {
					m2.put(b.valueOf(b.charAt(i)), 1);

				} else if (m2.containsKey(b.valueOf(b.charAt(i)))) {
					Integer val = m2.get(b.valueOf(b.charAt(i)));

					m2.replace(b.valueOf(b.charAt(i)), val + 1);
				} else {
					m2.put(b.valueOf(b.charAt(i)), 1);
				}
				// String str=a.valueOf(a.charAt(i));
			}
			if (m1.keySet().equals(m2.keySet())) {
				Set<String> hash_Set = new HashSet();
				hash_Set = m1.keySet();
				Iterator itr = hash_Set.iterator();
				while (itr.hasNext()) {
					String key = (String) itr.next();
					if (m2.containsKey(key) == m1.containsKey(key)) {
						if (m1.get(key) == m2.get(key)) {
							// System.out.println("Anagram");
							flag = true;
						}
					}

				}

			} else {
				flag = false;
			}

		} else {
			flag = false;
			// System.out.println("InAnagram");
		}
		return flag;
	}

}
