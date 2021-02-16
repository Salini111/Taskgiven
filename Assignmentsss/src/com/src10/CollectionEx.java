package com.src10;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();		
		al.add(101);
		al.add(105);
		al.add(51);
		al.add(501);
		al.add(1);	
		System.out.println(al);
		System.out.println(Collections.min(al));
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(Collections.max(al));
		
	        List<Integer> list = Arrays.asList(3,2,1,4,5,6,6);
	        for (Integer integer : list) {
	            System.out.println(integer);
	        }
	        
	        System.out.println("Sorting with natural order");
	        List<String> l1 = createList();
	        l1.sort(null);
	        l1.forEach(System.out::println);

	        System.out.println("Sorting with a lamba expression for the comparison");
	        List<String> l2 = createList();
	        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
	        l2.forEach(System.out::println);

	        System.out.println("Sorting with a method references");
	        List<String> l3 = createList();
	        l3.sort(String::compareToIgnoreCase);
	        l3.forEach(System.out::println);
                         }

	    private static List<String>  createList() {
	        return Arrays.asList("gokul", "ramana", "rahul", "jafar");	
	}
}
