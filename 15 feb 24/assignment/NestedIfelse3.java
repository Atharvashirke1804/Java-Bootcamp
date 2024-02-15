 class Nestedifelse3 {

    public static void main(String[] args) {

        int num1 = 40, num2 = 50, num3 = 65;

        if (num1 <= num2) {

            if (num1 <= num3) {
                System.out.println("num1 is the largest.");
            } else {
                System.out.println("num3 is the largest.");
            }

        } else {

            if (num3 >= num2) {
                System.out.println("num2 is the largest.");
            } else {
                System.out.println("num3 is the largest.");
            }
        }
    }
}
