import java.util.Scanner;
class Example4 {
      
       public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number : ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;

        while(num!=0){

            int digit = num %10;
            num = num /10;
            sum = sum + (digit* digit * digit);
        }
        System.out.println(sum);
        System.out.println((sum == temp)? "The number is armstrong" : "The number is not armstrong" ) ;
       
    }
}