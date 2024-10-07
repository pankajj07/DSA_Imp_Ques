package com.java8;
import java.util.function.BiConsumer;

public class LambdaEx {


		
		public static void main(String[] args) {
//			add(12, 10);
//			
//		}
	//	
//		public static void add(int a, int b) {
//			System.out.println(a + b);
			
			//Lambda Ex...
			BiConsumer<Integer , Integer > bi = (a, b) -> System.out.println(a + b);
			bi.accept(13, 15);
		}

	}


