// Write a program to find sum of first 'n' numbers.

 class Que9 {

    public static void main(String[] args) {

        int sum = 0;
        int n = 12 ;
        for (int a = 1; a <= n; a++) {
            sum += a;
        }
        
        System.out.println("Sum of the first n number is: " + sum);
    }
}
