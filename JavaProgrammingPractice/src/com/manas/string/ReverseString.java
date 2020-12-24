package com.manas.string;

public class ReverseString {
	public static void main(String[] args) {
		String str="abc";
		char[] chr=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=chr.length-1;i>=0;i--) {
			sb.append(chr[i]);	
		}
		String str2=sb.toString();
		System.out.println(str2);
		
		
	}

}
