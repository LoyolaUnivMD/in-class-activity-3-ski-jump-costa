// Programmers: Constantinos Marmaras
// Course: CS 212 02
// Due Date: 2/1/24
// Assignment: In class assignment ski jump
// Problem Statement: Calculate how far a skier would jump on the ski jump and how much they would score
// Data In: What type of hill and how fast the skier is going
// Data Out: The score based on the type of hill and a statement about how they scored
// Credits:

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This will calculate your ski jump score based on the type of hill and speed");


        System.out.println("What type of hill are you skiing on? (Normal Hill or Large Hill)");
        String hillType = input.nextLine();
        while(!(hillType.equals("Normal Hill")) && !(hillType.equals("Large Hill")))
        {
            System.out.println("Please input either Normal Hill or Large Hill");
            hillType = input.nextLine();
        }
        int hillHeight = (hillType.equals("Normal Hill"))? 46:70;

        System.out.println("How fast did you go (in m/s)?");
        double jumperSpeed = input.nextDouble();
        while(jumperSpeed <= 0)
        {
            System.out.println("Please input a number greater than 0");
            jumperSpeed = input.nextDouble();
        }

        double timeInAir = Math.sqrt((2*hillHeight)/9.8);
        System.out.println(timeInAir);
    }
}
