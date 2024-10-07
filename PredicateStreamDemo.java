package com.java8;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class PredicateStreamDemo {
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Pankaj", "John", "Sara", "Michael", "Mukesh", "Jugesh");

		// Using Predicate to filter names that start with 'P'
		List<Boolean> list = names.stream().map(name -> name.startsWith("J")).collect(Collectors.toList());
		List<String> filname = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
		System.out.println(names);  
		System.out.println(list);
		System.out.println(filname);
		
		
		//Date & Time API
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(date);    
		System.out.println(time);    
		System.out.println(dateTime); 


	}
	


}
