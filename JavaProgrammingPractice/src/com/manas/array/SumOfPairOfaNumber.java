package com.manas.array;

public class SumOfPairOfaNumber {
	public static void main(String[] args) {
		int[] arr= {10,20,30,50,60,25,5};
		int n=30;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println("pair :"+arr[i]+" : "+arr[j]);
				}
			}
		}
	}

}
