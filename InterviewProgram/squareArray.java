package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squareArray {
	public static void main(String[] args) {
		
//		int[] arr =  {1, 2, 3, 4, 5};
//		int[] sqArr = new  int[arr.length];
//		for(int i = 0;i < arr.length; i++) {
//			sqArr[i] = arr[i] * arr[i]; 
//		}
//		for(int num : sqArr) {
//			System.out.print(num + " ");
//		}
		
		
		
		//java8
		int[] arr =  {5, 2, 1, 4, 3};
		int[] sqArr = Arrays.stream(arr).map(x -> x * x).toArray(); 
		
	    Arrays.stream(sqArr).sorted().forEach(x -> System.out.print(x + " "));
	    
	    //List<Integer> SqList = Arrays.stream(arr).map(x -> x*x).sorted().boxed().collect(Collectors.toList());
	   // System.out.println(SqList);
	    
	    
	    
		
		
		
	}

}
