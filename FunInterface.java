package com.java8;

@FunctionalInterface
public interface FunInterface {
	void singleabstractMethod();
	//void singleabstractMethod2();

	
	default void A() {
		System.out.println("FI");
	}
	
	

}
