package JavaProject;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:  ");
        String name = scan.next();// asks for response
        System.out.println("Hello " + name
                + " do you wish to continue to the interactive portion? \nEnter 'yes' or 'y', continue:");// ask
                                                                                                          // question
        String response = scan.next();// response

        switch (response) {
            case "yes":
            case "y":
                break;// if response to string is y or yes then continue

            default:
                System.out.println("Thank you for visiting, I will see you all later bye!");// otherwise get out
                System.exit(0);// kicks them out of system

        }

        String playAgain;
        do {
            // our question program
            // System.out.println("Do you have a red car? (yes, no):");
            // String car = scan.next();
            System.out.println("What is the name of your favorite pet? :  ");
            String pet = scan.next();
            System.out.println("what is the age of your favorite pet.");
            int petAge = scan.nextInt();
            System.out.println("What is your lucky number?");
            int lucky = scan.nextInt();
            System.out.println("Do you have a favorite quarterback?");
            String jersey = scan.next();

            int jerseyNum;// saves jersey number so that it stays in main scope
            switch (jersey) {
                case "yes":
                case "y":
                    System.out.println("What is their jersey number?");
                    jerseyNum = scan.nextInt(); // gets the jersey number, assigning jerseyNum value from uer input
                    break;
                case "no":
                    break;
                default:
                    break;
            }
            System.out.println("What is the two-digit model year of your car?  ");
            int modelYear = scan.nextInt();
            System.out.println("What is the first name of the your favorite actor or actress?  ");
            String act = scan.next();
            System.out.println("Enter a random number between 1 and 50:  ");
            int userRandomNum = scan.nextInt();

            Random rand = new Random();// instance of random class
            int upperbound = 76; // generate random values from 0-75
            int int_random = rand.nextInt(upperbound);// random num 1
            int int_random1 = rand.nextInt(upperbound);// random num 2
            int int_random2 = rand.nextInt(upperbound);// random num 3

            int magicBall = (int_random * lucky);// random num * user lucky num
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            } // makes sure the num is not larger than 75
            System.out.println(magicBall);

            int favPetNum = pet.charAt(2);// Find the 3rd letter of their favorite pet.
            while (favPetNum > 65) {
                favPetNum = favPetNum - 65;
            } // Convert that character value to an integer value.
            int value = 42;// Use the value 42.
            int random = userRandomNum - int_random1;// Use the random number between 1 and 50, subtracting one of the
                                                     // generated random numbers.
            // if (random >65){random = random - 65;}
            if (random < 1) {
                random = random + 64;
            }
            int luckcar = lucky + modelYear;// Use the age of their favorite pet + their car model year
            int lastnum = petAge + modelYear;// Use the age of their favorite pet + their car model year.
            System.out.println("Lottery Numbers: " + magicBall + ", " + favPetNum + ", " + value + ", " + random + ", "
                    + luckcar + " " + lastnum);// prints lottery string
            System.out.println("Do you want to play again? :  ");// do they want to play again if used a do while loop
                                                                 // to accomplish this
            playAgain = scan.next();

        } while (playAgain.equals("yes") || playAgain.equals("y"));
        System.out.print("Thanks for Playing!");
        System.exit(0);

    }

}

    
