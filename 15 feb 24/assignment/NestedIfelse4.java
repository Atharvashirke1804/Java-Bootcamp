 class Nestedifelse4 {

    public static void main(String[] args) {

        int num1 = 20, num2 = 30, num3 = 25;

        if (num1 >= num2) {

            if (num1 >= num3) {
                System.out.println("num1 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }

        } else {

            if (num2 >= num3) {
                System.out.println("num2 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }
        }
    }
}
