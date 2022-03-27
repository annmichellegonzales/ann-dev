package com.portfolio.ann;

import java.util.Scanner;

import org.springframework.util.SystemPropertyUtils;

public class addingInput {

    // public static void main(String[] args) {
    //     try (Scanner myObj = new Scanner(System.in)) {
    //         System.out.println("Enter username:");

    //         String userName =  myObj.nextLine();
    //         System.out.println("Username is: " + userName);
    //     }
    // }


    // public static void main(String[] args) {
    //     try (Scanner userInput = new Scanner(System.in)) {
    //         System.out.println("Please enter your age: ");

    //         String userAge = userInput.nextLine();
    //         System.out.println("You are " + userAge + " years old.");
    //     }
    // }
    

    // public static void main(String[] args) {
    //     try (Scanner userInput = new Scanner(System.in)) {
    //         System.out.println("Where are you from?");

    //         String userLocation = userInput.nextLine();
    //         System.out.println("You live in: " + userLocation);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println("What's your favorite food?");

    //     String favFood = userInput.nextLine();
    //     System.out.println("Mmm " + favFood.toLowerCase() + " sounds delicious!");
    // }


    // public static void main(String[] args) {
    //     Scanner userInput = new Scanner(System.in);
    //     System.out.println("Who do you have a crush on?");

    //     String userCrush = userInput.next();
    //     System.out.println("Tell " + userCrush + " how you feel.");
    // }


    // public static void main(String[] args) {
    //     try (Scanner userInput = new Scanner(System.in)) {
    //         System.out.println("Who do you have a crush on?");

    //         String userCrush = userInput.next();
    //         System.err.println("OOOH! I didn't know you have a crush on " + userCrush + " !");
    //     }
    // }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's your favorite toy?");

        String userToy = userInput.next();
        System.out.println("DING! Your favorite toy is: " + userToy);
    }

}
