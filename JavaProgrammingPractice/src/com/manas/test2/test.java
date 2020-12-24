package com.manas.test2;

import javax.management.ValueExp;

public class test {

	public static void main(String[] args) {
		/*String str=" Ilink Systems Pvt Ltd";
		String[] strAr=str.split(" ");
		StringBuffer strb=new StringBuffer();
		for(int i=strAr.length-1;i>=0;i--) {
			strb.append(strAr[i]+" ");
		}
		System.out.println(strb.toString());
	}*/
	
		String str="abcd";
		
		    System.out.println(isInteger(str,10));
	}
	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
