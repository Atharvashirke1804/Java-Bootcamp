// Write a Java program that takes an integer representing a month number (1 for January, 2 for February, etc.) and prints the corresponding month name using a switch case statement.

import java.util.Scanner;

class Example3 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = input.nextInt();

        switch(a){

            case 1:
                System.out.println("January");
                break;
           case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number");
            
        }
    }
}