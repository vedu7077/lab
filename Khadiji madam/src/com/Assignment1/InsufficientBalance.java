package com.Assignment1;

import java.util.Scanner;

public class InsufficientBalance {
	
	
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Name");
    	String name=sc.next();
    	
    	try {
    		System.out.println("Enter Balance ");
    		int balance = sc.nextInt();
    		int minumumbalance = 1000;
    		
		if(balance < minumumbalance) {
    		System.out.println("Insufficient Balance For "+name);
    		
    	}
		else {
			System.out.println("Sufficient Balance for "+ name);
		}
    	}
    catch (Exception e){
    	System.out.println("Invalid Balance plz Valid balance...");	
    	e.printStackTrace();
    }
    	
    	
    	
    	
    	
    	
       
    }
}
