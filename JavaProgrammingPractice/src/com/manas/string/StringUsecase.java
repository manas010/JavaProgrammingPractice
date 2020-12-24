package com.manas.string;


public class StringUsecase {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3=new String("java");
		System.out.print("s1.equals(s2) ?");
		System.out.println(s1.equals(s2));
		System.out.print("s1.equals(s3) ?");
		System.out.println(s1.equals(s3));
		System.out.print("s2.equals(s3) ?");
		System.out.println(s2.equals(s3));
		System.out.print("(s1==s2 ?");
		System.out.println(s1==s2);
		System.out.print("(s1==s3 ?");
		System.out.println(s1==s3);
	}

}
