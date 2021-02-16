package com.src12;

import java.util.function.Function;

public class Example4 {
		public static void main(String[] args) {
		    Integer[] a= {1,2,99,45};
		//return sum;
		//System.out.println(sum);
		Function<Integer[],Integer> f=(n)->{
		    //int a[]= {4,8,9,32};
		int sum=0;
		int i;
		for(i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		}
		return sum;};
		System.out.println(f.apply(a));
   }	
}
		 
