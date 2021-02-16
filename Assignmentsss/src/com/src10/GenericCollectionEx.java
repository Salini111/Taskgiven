package com.src10;
import java.util.ArrayList;

interface Shape{
	void draw();	
}

class Circle implements Shape{
	public void draw()
	{
		System.out.println("Draw a Circle");
	}
}

class Rectangle implements Shape{
	public void draw()
	{
		System.out.println("Draw a Rectangle");
	}
}

class Square implements Shape{
	public void draw()
	{
		System.out.println("Draw a Square");
	}
}

public class GenericCollectionEx {	
	public static void main(String[] args)
	{		
		GenericCollectionEx gce=new GenericCollectionEx();
		
		ArrayList list1=new ArrayList();
	
		Circle c=new Circle();
		
		Rectangle r=new Rectangle();
		
		Square s=new Square();

		list1.add(c);
		
		list1.add(r);
		
		list1.add(s);
	
		gce.call(list1);			
	}
	
	void call(ArrayList<? extends Shape>list1)
	{
	for(Shape s:list1)
	{
		s.draw();
	}
	}
}
