package com.tts;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  /*      AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");

       String yourName = keyboard.next();
       System.out.printf("Hello %s!\n", yourName);

        // Ask if user wants to begin the interactive portion
        System.out.println("Would you like to continue to the interactive zone?");
        System.out.print("(Y/N): ");
        String yourResponse = keyboard.next();
        boolean approved = yourResponse.equals("Y") || yourResponse.equals("y");
        if (approved) {
            System.out.println("Do you have a red car?");
            System.out.print("(Y/N): ");
            String carResponse = keyboard.next();
        }
        else {
            System.exit(0);
        }
        //pet name
        System.out.println("What is the name of your pet?");
        String petName = keyboard.next();
        System.out.printf("My pet name is: %s!\n", petName);

        //pet age
        System.out.println("What is the age of their favorite pet?");
        int petAge = keyboard.nextInt();
        System.out.printf("it is: %d old\n", petAge);

        //lucky number
        System.out.println("What is your lucky number?");
        int luckyNumber = keyboard.nextInt();

        //Do they have a favorite quarterback?  If so what is their jersey number?
        System.out.println("Do you any favorite quarterback?");
        System.out.print("(Y/N): ");
        String qb = keyboard.next();
        boolean picked = qb.equals("Y") || qb.equals("y");
        if (picked) {
            System.out.println("What is the jersey number?");
            int jerseyNumber = keyboard.nextInt();
        }
        else {
            keyboard.nextLine();
        }

        //What is two-digit model year of their car?
        System.out.println("What is the two-digit model year of your car?");
        int twoDigit = keyboard.nextInt();

        //What is the first name of the their favorite actor or actress?
        System.out.println("Who is your favorite actor & actress?");
        String actor = keyboard.next();

        //Enter a random number between 1 and 50.
        System.out.println("Pick any random number between 1-50");
        int x = keyboard.nextInt();
*/
//        Generating output

        // 5 random numbers between 1-65

            Random objGenerator = new Random();
            for (int iCount = 0; iCount < 5; iCount++) {
                int randomNumber = objGenerator.nextInt(65);
                System.out.println("Random No : " + randomNumber);
            }

        // power ball between 1 and 75
            int magicBall = keyboard.nextInt(bound: 75);
        }
    }

