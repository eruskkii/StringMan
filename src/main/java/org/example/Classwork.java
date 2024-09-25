package org.example;

public class Classwork {

//    public void evenOrOdd(int num){
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        }
//    }

    public static void fullName(String firstName,String surName){
        System.out.println("Your full name is " + firstName + " " + surName);
    }

    public void fullNamepublic(String firstname,String surname){
        System.out.println("Your full name is " + firstname + " " + surname);
    }

    public static void main(String[] args) {


//        Write a program that calculates the sum of numbers from 1 - 5
//        Number starts with 0 and we're looping to get to five.
//        n = 0 n++, n = 1, n++

        Classwork obj = new Classwork();

        obj.fullNamepublic("Samuel", "Ajinomoto");

        fullName("Emmanuel", "Paul");

        int sum = 0;

        for (int n = 1; n <= 5; n++ ) {

            sum = sum + n;

        }
        System.out.println("Sum is = " + sum);


//        for (int i= 0; i <= 10; i = i + 2)
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }


    }
}
