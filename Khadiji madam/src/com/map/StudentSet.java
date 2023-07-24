package com.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return o.marks-this.marks;
	}
	
}

public class StudentSet {

	public static void main(String[] args) {
		
		HashSet<Student> hs= new HashSet<>();
		
		
		hs.add(new Student(101,"Vedant",89));
		hs.add(new Student(114,"Vedang",91));
		hs.add(new Student(116,"Jai",65));
		hs.add(new Student(109,"Mangesh",72));
		hs.add(new Student(103,"Nikhil",80));
				TreeSet<Student>tm=new TreeSet<>(hs);
		System.out.println(tm);
		
		
	ArrayList<Student> al= new ArrayList<>(tm);
		for(Student s:al) {
			System.out.println(s);
		}
		

	}

}