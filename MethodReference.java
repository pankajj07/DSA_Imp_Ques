package com.java8;

public class MethodReference {
	public static void main(String[] args) {
//		FunInterface f = Test :: testImplementation;  //MethodReference
//		f.singleabstractMethod();
//	}
	
	
	//Lambda ex...
	FunInterface f = () -> System.out.println("MR");
	f.singleabstractMethod();

	
	
//	class Test{
//		public static void testImplementation() {
//			System.out.println("MR");
//		}
//	}

}
}