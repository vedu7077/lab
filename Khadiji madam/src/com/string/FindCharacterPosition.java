package com.string;


//
import java.util.Scanner;
//
public class FindCharacterPosition {
    public static void main(String[] args) {
        String s = "hello";
        Scanner sc = new Scanner(System.in);

// enter a char
        System.out.print("Enter a character: ");
        char c = sc.nextLine().charAt(0);

//position of the char
        int position = s.indexOf(c);

//display the Position
        if (position != -1) {
            System.out.println("The position of '" + c + "' in the string is: " + position);
        } else {
            System.out.println("The character '" + c + "' is not found in the string.");
        }
    }
}

//
//
//
//
//
//
//



































