package com.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(10, "ADWAIT");
		hm.put(11, "VEDANT");
		hm.put(20, "PARTH");
	
		
		
		
		TreeMap<Integer,String>tm = new TreeMap<>(); 
		tm.putAll(hm);
		
		
		
		
		
		for(Entry<Integer, String> et:tm.entrySet()) {
			
			
			System.out.println(et.getKey()+" "+et.getValue());
			
		}
		
		System.out.println();
		NavigableMap<Integer,String>nm=tm.descendingMap();
		System.out.println(nm);
		
	

		
		
	}
	}


