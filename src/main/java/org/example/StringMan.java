package org.example;

import java.util.Scanner;


//Write a program that accepts a string input from the user and
// then performs the following operations using different methods:
//Convert the string to uppercase.
//Reverse the string.
//Count the number of vowels in the string.
//Check if the string is a palindrome.
//Learning Objective: Practice using string methods like toUpperCase(), length(), charAt(), and looping through characters.

public class StringMan {

        // Method to convert the string to uppercase
        public static String convertToUpperCase(String input) {
            return input.toUpperCase();
        }

        // Method to reverse the string
        public static String reverseString(String input) {

            String nstr = "";
            char ch;

            for (int i=0; i<input.length(); i++)
            {
                ch= input.charAt(i); //extracts each character
                nstr= ch + nstr; //adds each character in front of the existing string
            }
            return nstr;
        }

        // Method to count the number of vowels in the string
        public static int countVowels(String input) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            return count;
        }

        // Method to check if the string is a palindrome
        public static boolean isPalindrome(String input) {

            String reversed = reverseString(input).toLowerCase();

            return reversed.equalsIgnoreCase(reversed);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the user input
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            // Perform the operations
            String upperCaseString = convertToUpperCase(input);
            String reversedString = reverseString(input);
            int vowelCount = countVowels(input);
            boolean checkPalindrome = isPalindrome(input);

            // Display the results
            System.out.println("Uppercase: " + upperCaseString);
            System.out.println("Reversed: " + reversedString);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Is palindrome: " + (checkPalindrome ? "Yes" : "No"));

            scanner.close();
        }
}

