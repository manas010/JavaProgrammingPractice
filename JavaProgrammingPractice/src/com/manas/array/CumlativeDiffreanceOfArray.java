package com.manas.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Manas Dash
 * @version
 * @Date 05-Dec-2020
 * 
 * This Application will sort the array in Ascending order and find the cumulative difference of the array
 * for Example if 1. Array arr[]={7,2,3,4,1},
 * 2. arr[] will be arr[]={1,2,3,4,7},
 * 3. then need to find difference of each adjacent elements like {|1-2|=1,|2-3|=1,|3-4|=1,|4-7|=3}
 * 4. add all the difference to find the cumulative difference  
 * ex: adjacent diff ={|1-2|=1,|2-3|=1,|3-4|=1,|4-7|=3} that is {1,1,1,3}=1+1+1+3=6
 *
 */

public class CumlativeDiffreanceOfArray {

	
	public static void main (String[] args) 
    { 
        Integer[] arr={7,2,3,4,1};
        List<Integer>  al=Arrays.asList(arr); 
        Collections.sort(al);
        int sum=0;
        System.out.println("Ascending Order :"+al);
        for(int i=al.size()-1;i>=0;i--) {
        	if(i>0) {
        		sum+=((al.get(i))-(al.get(i-1)));
			}        	
        }
        System.out.println("Cumulative difference :"+sum);
        
    } 
}
