package com.src12;

import java.util.function.Consumer;

public class Example3 {
	public static void main(String[] args) {	
		int n[]= {2,9,6,8};
		Consumer<int[]>cs=(x)->
		 {
			int max=x[0];
			int min=x[0];
			for(int i:x)
			{
				if(i<min)
				{
					min=i;
				}if(i>max)
				{
					max=i;
				}
			}
			System.out.println(max);
			System.out.println(min);
		 };
	cs.accept(n);
	}
}
