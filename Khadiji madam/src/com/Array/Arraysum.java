package com.Array;



public class Arraysum {
	
	
	
	
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        if (arr.length >= 2) {
        	
            int sum = arr[0] + arr[arr.length - 1];
            
            System.out.println("Sum of  number " + sum);
        } else {
            System.out.println("Array should contain at least two numbers.");
        }
    }
}
