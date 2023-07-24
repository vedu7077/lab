package com.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student1 implements Comparable<Student1>{
	
	int id;
	String name;
	int rollNo;
	
	public Student1(int id,String name,int rollNo) {
		this.id=id;
		this.name=name;
		this.rollNo=rollNo;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		return this.id-o.id;
	}
	
	
}
public class StudentMain{
	public static void main(String[] args) {
		HashMap<Student1, String>hm=new HashMap<>();
		hm.put(new Student1(1,"Vedant",99), "java");
		hm.put(new Student1(2,"Adwait",55), "python");
		hm.put(new Student1(3,"Parth",95), "c++");
		hm.put(new Student1(4,"Ram",85), "net");
		
		TreeMap<Student1, String>tm=new TreeMap<>();
		tm.putAll(hm);
		for(Map.Entry<Student1, String>em:tm.entrySet()){
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		System.out.println("--------------");
		TreeMap<Student1, String>tm1=new TreeMap<>(new Name());
		tm1.putAll(hm);
		for(Map.Entry<Student1, String>em1:tm1.entrySet()){
			System.out.println(em1.getKey()+" "+em1.getValue());
		}

		
		
	}

	
	

}

class Name implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}