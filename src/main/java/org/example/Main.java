package org.example;

import OOP.Animal;
import OOP.Dog;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal ani = new Animal();
        Dog freshDog = new Dog();

        ani.makeSound();


        freshDog.makeSound();

        freshDog.fetch();

        String str= "Geeks", nstr="";
        char ch;



        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}





        /*

Feature breakdown

Generates random number with Random Class?

Stores the number somewhere?

Takes user input - (added feature filter for number)

Checks if user number = to the generated number

If user number = generated number  = Show thumbs up.

If user number > generated number - Print too high

If user < generated number - Print too low

        * */
//        Random rand = new Random();
//        int randNum = rand.nextInt(100) + 1;
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Welcome to the random number game." +
//                "Guess a whole number from 1 - 100. " +
//                "You have 6 attempts. ");
//
//        int trials = 6;
//        int guessNumber = -1;
//
//        while (guessNumber != randNum && trials > 0) {
//
//
//
//            if (userInput.hasNextInt()) {
//                    guessNumber = userInput.nextInt();
//                    if (guessNumber >= 1 && guessNumber <=100){
//
//                        trials--;
//
//                        if (guessNumber < randNum) {
//                            System.out.println("Too low! Try again. You have " +
//                                    trials + " Attempts remaining");
//
//                        } else if (guessNumber > randNum) {
//                            System.out.println("Too high! Try again. You have " +
//                                    trials + " Attempts remaining");
//
//                        } else {
//                            System.out.println("Congratulations! You guessed the right number" +
//                                    " It was " + randNum);
//                        }
//
//
//                    } else {
//                        System.out.println("Please enter a whole number from 1 - 100");
//                    }
//                } else {
//                    System.out.println("Please enter a valid whole number");
//                    userInput.next();
//
//                }
//
//            }
//        if (guessNumber != randNum) {
//            System.out.println("Sorry, you've used all your attempts");
//
//        }
//
//        userInput.close();
//
//    }
//
//
//}