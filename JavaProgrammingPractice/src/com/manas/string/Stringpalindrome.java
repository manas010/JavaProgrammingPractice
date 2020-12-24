package com.manas.string;

public class Stringpalindrome {

	public static void main(String[] args) {
		Stringpalindrome sp=new Stringpalindrome();
		String str="abcba";
		String str2="abc";
		System.out.println(sp.palindrome(str));
		System.out.println(sp.palindrome(str2));
	}
	public  boolean palindrome(String str) {
		boolean flag=false;
		String st2=reverseString(str);
		System.out.println("reverse of String: "+st2);
		if(str.equals(st2)) {
			flag=true;
		}
		return flag;
	}
	public  String reverseString(String str) {
		char[] chr=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=chr.length-1;i>=0;i--) {
			sb.append(chr[i]);	
		}
		return sb.toString();
	}
}
