package com.manas.string;

public class ReverseStringUsingRecursion {

	public String reverseString(String str) {
		if (str.isEmpty()) {
			System.out.println("String is empty.");
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		ReverseStringUsingRecursion rs = new ReverseStringUsingRecursion();
		String resultantSting1 = rs.reverseString("abc");
		System.out.println(resultantSting1);
		// to understand substring();
		String str2="Manas";
		System.out.println("SubString :"+str2.substring(1)+str2.charAt(0));
	}
}
