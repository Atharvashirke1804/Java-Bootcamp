 class ElseifDemo6 {

    public static void main(String[] args) {

        int num1 = 544, num2 = 745,num3 = 123;

        if (num1 <= num2 && num1 >= num3) {
            System.out.println("num1 is the Smallest.");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is the Smallest.");

        } else {
            System.out.println("num3 is the Smallest.");
        }
    }
}
