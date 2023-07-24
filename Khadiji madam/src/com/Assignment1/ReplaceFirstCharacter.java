package com.Assignment1;





public class ReplaceFirstCharacter {
	
	
    public static void main(String[] args) {
    	
        String input = (" Hello ");
        
        char orig = 'o';
        char replace = 'a';

        String result = replaceFirstCharacter(input, orig, replace);
        System.out.println("Result: " + result);
    }

    public static String replaceFirstCharacter(String input, char orig, char replac) {
    	
    	
        char[] c = input.toCharArray();
        
        boolean find = false;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == orig) {
                c[i] = replac;
                find = true;
                break;
            }
        }

        if (find) {
            return new String(c);
        } else {
        	
            return input;
        }
    }
}
