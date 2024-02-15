 class Nestedifelse6 {

    public static void main(String[] args) {

        int num1 = 40, num2 = 50, num3 = 65;

        if (num1 <= num2) {

            if (num1 <= num3) {
                System.out.println("num1 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }

        } else {

            if (num3 >= num2) {
                System.out.println("num2 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }
        }
    }
}