package com.Assignment1;








public class FindSecondOccurrence {
	
	
    public static void main(String[] args) {
    	
    	
        String input = "java programs";
        char target = 'a';

        int index = findSecondOccurrence(input, target);
        if (index != -1) {
            System.out.println("Second occurrence of '" + target + "' found at index: " + index);
        } else {
            System.out.println("Second occurrence of '" + target + "' not found.");
        }
    }

    public static int findSecondOccurrence(String input, char target) {
        int firstIndex = input.indexOf(target);
        if (firstIndex != -1) {
            int secondIndex = input.indexOf(target, firstIndex + 1);
            return secondIndex;
        }
        return -1;
    }
}
