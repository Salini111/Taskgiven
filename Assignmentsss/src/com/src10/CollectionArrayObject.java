package com.src10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionArrayObject {
	public static void main(String[] args) {		
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(89);
		a.add(58);
		
                                    ArrayList a1=new ArrayList();		
		a1.add(452);
		a1.add(90);
		a1.add(158);
		a1.add(a);		
                                    System.out.println(a);
		
		System.out.println(Collections.min(a));
		Collections.reverse(a);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.swap(a1, 3,1);
		System.out.println(a1);
		
		Object[] o=a.toArray();
		
		Arrays.sort(o);
		System.out.println(o);
		Arrays.fill(o, a);
		System.out.println(o);
		Arrays.hashCode(o);
		System.out.println(o);
		
	}

}
