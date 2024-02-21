//Implement a Java program that takes an integer representing a day number (1 for Sunday, 2 for Monday, etc.) and prints the corresponding day of the week using a switch case statement.

import java.util.Scanner;

class Example5 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = input.nextInt();

        switch(a){

        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;      
        case 3:
            System.out.println("Wenseday");
            break;   
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;   
        case 7:
            System.out.println("Sunday");
            break;
        default :
        System.out.println("Invalid Day number");
    }
}
}