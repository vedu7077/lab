package com.comp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Customer {
	
	
	
     int id;
     String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}

public class Main {
	
	
    public static void main(String[] args) {
    	
    
    	
    	
    
    	
    	
    	
    	
    	
    	
       HashMap<Integer, Customer> customerMap = new HashMap<>();

        Customer c1 = new Customer(1, "VEDANT");
        Customer c2 = new Customer(2, "ADWAIT");
        Customer c3 = new Customer(3, "PARTH");

        customerMap.put(c1.getId(), c1);
       customerMap.put(c2.getId(), c2);
        customerMap.put(c3.getId(), c3);

        System.out.println("All Customers:");
        
        System.out.println();
       Set<Entry<Integer,Customer>> set=customerMap.entrySet();
       
       Iterator<Entry<Integer,Customer> > it=set.iterator();
        
        
        while(it.hasNext()) {
        	
        	Entry<Integer, Customer> en = it.next();
        	System.out.println(en.getKey()+" "+ en.getValue());
        }
        
//        
//        for (Customer c : customerMap.values()) {
//        	
//            System.out.println(c.toString());
//        }
    }
}
