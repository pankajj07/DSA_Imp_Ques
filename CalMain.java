package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CalMain {
    public static void main(String[] args) {
    	
    	//Date & Time API
    			LocalDate date = LocalDate.now();
    			LocalTime time = LocalTime.now();
    			//LocalDateTime dateTime = LocalDateTime.now();

    			System.out.print(date + " ");    
    			System.out.println(time + " ");    
    			//System.out.println(dateTime); 
    	
        // Using Lambda Expression for the custom functional interface
//        Calculator add = (a, b) -> a + b;
//        Calculator multiply = (a, b) -> a * b;
//    
//        System.out.println("Addition: " + add.operate(5, 10));  
//        System.out.println("Multiplication: " + multiply.operate(5, 10)); 
    	
    	//method reference
    	
    	Calculator add = MathOperation :: add;
        Calculator multiply = MathOperation :: multiply;
        
        System.out.println("Addition: " + add.operate(5, 10));  
        System.out.println("Multiplication: " + multiply.operate(5, 10));  
    }
    
   
    
    class MathOperation{
    	public static int add(int a, int b) {
    		return a+b;
    		
    	}
    	
    	public static int multiply(int a, int b) {
    		return a*b;
    		
    	}
    }
}
