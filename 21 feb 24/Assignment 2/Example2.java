//Write a Java program that takes an integer representing a month number (1 for January, 2 for February, etc.) and prints the corresponding month name using a switch case statement.

import java.util.Scanner;

class Example2 {

    public static void main (String[] args){
 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Grade: ");
        int a = input.nextInt();

        switch(a / 10){

            case 9:
                System.out.println("A Grade");
                break;
            case 8:
                System.out.println("B Grade");
                break;
            case 7:
                System.out.println("C Grade");
                break;
            case 6:
                System.out.println("D Grade");
                break;
            default:
                System.out.println("F Grade");
        }
    }
}