 class ElseifDemo4 {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 30;
        int num3 = 20;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is the Smallest.");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is the Smallest.");

        } else {
            System.out.println("num3 is the Smallest.");
        }
    }
}
