
package com.manas.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Manas Dash
 * @Date 05-Dec-2020
 * 
 * @Description: This program is build to  
 */
public class StringConcaneteLeftAndRight {
	public static void main(String[] args) {
		String str="acfdgdacaa";
		String temp;
		String leftString = str.substring(0, str.length()/2);
		String rightString = str.substring(str.length()/2);
		
		
		//swapping
		temp=rightString;
		rightString=leftString;
		leftString=temp;
				
		System.out.println("Left String :"+leftString);
		System.out.println("Right String :"+rightString);
		List<String> rl=new ArrayList<String>();
		String[] rs=rightString.split("");
		rl= Arrays.asList(rs);
		System.out.println("rl :"+rl);
		Collections.reverse(rl);
		System.out.println("rl after :"+rl);
		
		List<String> ll=new ArrayList<String>();
		String[] ls=rightString.split("");
		ll= Arrays.asList(ls);
		int count=ls.length-1;
		System.out.println("Count :"+count);
		while(count>=0) {
			int innerCount=ls.length;
			if(ll.get(count).equalsIgnoreCase(rl.get(count))) {
				while(innerCount!=0) {
					
				}
				ll.remove(count);
				rl.remove(count);
			}
			count--;
		}
		
		//Collections.reverse(rl);
		//ll.addAll(rl);
		//System.out.println("Whole Strig :"+ll);
	}

}
