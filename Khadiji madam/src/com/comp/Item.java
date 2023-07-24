package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Item implements Comparable<Item> {
	
	
	
    int id;
     String name;
     int price;

    public Item(int id, String name, int price) {
    	
        this.id = id;
        this.name = name;
        this.price = price;
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item other) {
    	
    	
        // descending ORDER
    	
    	
        if (this.price > other.price) {
        	
            return -1;
            
        }
        
        else if (this.price < other.price) {
        	
        	
            return -1;
        }

        // pricee reqal ascending OrdeR
        
        return this.name.compareTo(other.name);
    }

    
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "A", 100));
        items.add(new Item(2, "B", 300));
        items.add(new Item(3, "C", 200));

        //USINNG COMAPRIABLE
        Collections.sort(items);

    
        for (Item item : items) {
        	
        	
            System.out.println("ID: " + item.getId() +
                    ", Name: " + item.getName() +
                    ", Price: " + item.getPrice());
        }
    }
}
