package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(25);
		list.add(4);
		
		
		//stream concept**********
		List<Integer> newAl = new ArrayList<Integer>();
		newAl = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
		newAl.stream().forEach(x -> System.out.println(x));
		
		
		list.stream().filter(i -> i%2 == 0).forEach (x -> System.out.println(x));
		list.stream().map(i -> i*i).forEach (x -> System.out.println(x));
		
		
		
			
		
		
		
//		List<Integer> arList = findElement(list);
//		for(Integer i : arList) {
//			System.out.println(i);
//		}
//		
//	}
//	
//	public static List<Integer> findElement(List<Integer> list){
//		List<Integer> newAl = new ArrayList<Integer>();
//		for(Integer i : list) {
//			if(i >= 15) {
//				newAl.add(i);
//			}
//		}
//		
//		return newAl;
	}

}
