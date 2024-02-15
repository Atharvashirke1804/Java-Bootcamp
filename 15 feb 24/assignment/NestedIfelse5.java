 class Nestedifelse5 {

    public static void main(String[] args) {

        int num1 = 45, num2 = 55, num3 = 50;

        if (num1 <= num2) {

            if (num3 <= num1) {
                System.out.println("num1 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }

        } else {

            if (num2 <= num3) {
                System.out.println("num2 is the Smallest.");
            } else {
                System.out.println("num3 is the Smallest.");
            }
        }
    }
}
