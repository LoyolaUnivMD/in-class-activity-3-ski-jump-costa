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
        //Initilize scanner and explain what the program does
        Scanner input = new Scanner(System.in);
        System.out.println("This will calculate your ski jump score based on the type of hill and speed");

        //Ask the user what kind of hill they are skiing on
        System.out.println("What type of hill are you skiing on? (Normal Hill or Large Hill)");
        String hillType = input.nextLine();

        //Make sure that the user selects a valid choice
        while(!(hillType.equals("Normal Hill")) && !(hillType.equals("Large Hill")))
        {
            System.out.println("Please input either Normal Hill or Large Hill");
            hillType = input.nextLine();
        }

        //set variables needed for calculations based on the hill that was chosen
        int hillHeight = (hillType.equals("Normal Hill"))? 46:70;
        int par = (hillType.equals("Normal Hill"))? 90:120;
        double ppm = (hillType.equals("Normal Hill"))? 2:1.8;

        //Ask the user how fast they went in m/s
        System.out.println("How fast did you go (in m/s)?");
        double jumperSpeed = input.nextDouble();

        //Make sure the speed isn't 0 or below
        while(jumperSpeed <= 0)
        {
            System.out.println("Please input a number greater than 0");
            jumperSpeed = input.nextDouble();
        }

        //calculations for time in the air, distance travelled, and points. output that info
        double timeInAir = Math.sqrt((2*hillHeight)/9.8);
        double distanceTravelled = jumperSpeed * timeInAir;
        double points = 60 + (distanceTravelled - par) * ppm;
        System.out.println("You went " + distanceTravelled + " meters");
        System.out.println("You earned " + points + " points");

        //decide what to output based on how many points the user got
        if(points >= 61)
        {
            System.out.println("Great job doing better than par!");
        }
        else if(points < 10)
        {
            System.out.println("What happened?!");
        }
        else
        {
            System.out.println("You didn't go very far.");
        }
    }
}
