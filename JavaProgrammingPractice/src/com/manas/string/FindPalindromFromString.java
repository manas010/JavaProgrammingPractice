package com.manas.string;

import java.util.HashMap;

public class FindPalindromFromString {

	public boolean palindrome(String str) {
		boolean flag = false;
		String st2 = reverseString(str);
		if (str.equals(st2)) {
			flag = true;
		}
		return flag;
	}

	public String reverseString(String str) {
		char[] chr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = chr.length - 1; i >= 0; i--) {
			sb.append(chr[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "abcbaxyzmnmo";
		FindPalindromFromString fString = new FindPalindromFromString();
		int n = str.length();
		int temp1 = 0;
		int temp2 = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n; j++) {
				if ((str.substring(i, j)).length() != 0 && (str.substring(i, j)).length() != 1) {
					if (fString.palindrome(str.substring(i, j))) {
						
						temp1 = str.substring(i, j).length();
						if (temp1 > temp2) {

							temp2 = str.substring(i, j).length();
							System.out.println("llll :" + str.substring(i, j));
						}
						System.out.println(str.substring(i, j));

					}
				}

			}

		}

	}
}
