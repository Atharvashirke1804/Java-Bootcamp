import java.util.Scanner;
class Example2 {

    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();
        int digit;
        int reverse = 0;


        while (num != 0){
            digit = num %10;
            num = num/10;
           reverse= reverse *10 +digit;


        }
        System.out.println("The reverse number is " + reverse);

        
    }
}