package com.src12;
import java.util.function.IntBinaryOperator;

public class Example2 {
	public static void main(String[] args) {
		
		        IntBinaryOperator sum = (a, b) -> a + b;
		        System.out.println("Result: "+sum.applyAsInt(12, 20));
		        
		        IntBinaryOperator sub = (a, b) -> a - b;
		        System.out.println("Result: "+sub.applyAsInt(50, 20));
		        
		        IntBinaryOperator mult = (a, b) -> a * b;
		        System.out.println("Result: "+mult.applyAsInt(10, 20));		      		       
	}
}