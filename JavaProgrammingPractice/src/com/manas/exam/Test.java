package com.manas.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("Manas");
		l.add("Jitendra");
		
		
		Map<String, String> map=new HashMap<>();
		for(int i=0;i<l.size();i++) {
			String str=l.get(i).toString();
			
			map.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length()-1)));
		}
		System.out.println(map);
	}
}
