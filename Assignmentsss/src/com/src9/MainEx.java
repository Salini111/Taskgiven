package com.src9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.NavigableSet;

import com.src9.Employee;
import com.src9.Student;

public class MainEx {
	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		NavigableSet ns=new TreeSet();
		TreeMap hm=new TreeMap( new Comparator()
		{

			@Override
			public int compare(Object o1, Object o2)
                                                                   {
				Student s1=(Student) o1; 
				Student s2=(Student) o2;
				if(s1.getStudentid()>s2.getStudentid())
				{
					return 1;
			                  }
				else if(s1.getStudentid()<s2.getStudentid())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			            }
	                  });

			 hm.put(new Student(12,"salini"),new Employee(120,"salini"));
			 hm.put(new Student(52,"manju"),new Employee(190,"manju"));
			 hm.put(new Student(5,"mohan"),new Employee(170,"mohan"));
			 
		System.out.println(hm);
		Set set=hm.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry ent=(Entry) it.next();
			System.out.println(ent.getKey()+"- "+ent.getValue());
		}
		
		
		System.out.println("-----sortedset----");
		
		ss.add(new Employee (180,"kri"));
		ss.add(new Employee (136,"keerthi"));
		ss.add(new Employee (300,"abi"));
		ss.add(new Employee(100,"pk"));
		ss.add(new Employee (69,"kk"));
		ss.add(new Employee (400,"shiva"));
		System.out.println(ss);
		System.out.println("->first element");
		System.out.println(ss.first());
		System.out.println("->last element");
		System.out.println(ss.last());
		
		//System.out.println(ss.subSet);
		System.out.println("-----navigableset----");
	
		ns.add(new Employee (1900,"ponnu"));
		ns.add(new Employee (1200,"appu"));
		ns.add(new Employee (4000,"adhi"));
		ns.add(new Employee (1600,"athira"));
		ns.add(new Employee (6008,"hari"));
		ns.add(new Employee (1006,"ramu"));
		System.out.println(ns);
		System.out.println("->first element");
		System.out.println(ns.first());
		System.out.println("->last element");
		System.out.println(ns.last());
		System.out.println("->poll1st element");
		System.out.println(ns.pollFirst());
		System.out.println("->polllast element");
		System.out.println(ns.pollLast());
		System.out.println(ns);									
	}
}