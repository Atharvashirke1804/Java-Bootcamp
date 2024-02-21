// Develop a Java program that displays a simple menu to the user with options (e.g., 1. Add, 2. Subtract, 3. Multiply, 4. Divide). Based on the user's choice, perform the corresponding arithmetic operation using a switch case statement.

import java.util.Scanner;

class Example4 {

    public static void main (String[] args){

      

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice : ");
        char user = input.next().charAt(0);

        int a = 45;
        int b = 54; 

        switch(user){
             case '+':
                System.out.println( "Ans :" + (a + b));
                break;
            
            case '-':
                System.out.println("Ans :" + (a - b));
                break;

            case '*':
                System.out.println("Ans :" + (a * b));
                break;

            case '/':
                System.out.println("Ans :" + (a / b));
                break;

            default:
                System.out.println("Invalid operation Choice");
        }
    }
}