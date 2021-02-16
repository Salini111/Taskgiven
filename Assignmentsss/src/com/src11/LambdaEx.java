package com.src11;

interface example1
{
	public void display(int...num);
}

public class LambdaEx {
	public static void main(String[] args) {
		example1 e=(num)->{
			int sum=0;
			for(int  i:num)
			{
				sum=sum+i;				
			}
			System.out.println(sum);
		};
		e.display(12,78,45,23);
		e.display(12,78,45,23,11);
	}
	}

