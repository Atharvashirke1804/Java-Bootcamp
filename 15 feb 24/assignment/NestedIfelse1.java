 class Nestedifelse1 {

    public static void main(String[] args) {

        int num1 = 20, num2 = 30, num3 = 25;

        if (num1 >= num2) {

            if (num1 >= num3) {
                System.out.println("num1 is the largest.");
            } else {
                System.out.println("num3 is the largest.");
            }

        } else {

            if (num2 >= num3) {
                System.out.println("num2 is the largest.");
            } else {
                System.out.println("num3 is the largest.");
            }
        }
    }
}
