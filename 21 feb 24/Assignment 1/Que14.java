
import java.util.Scanner;
 class Que14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean a = num > 1 ? true : false;

        for (int i = 2; i <= num * num; i++) {
            a = num % i != 0 ? a : false;
        }
        
        System.out.println(num + (a ? " is a prime number." : " is not a prime number."));
    }

 }