 class Nestedifelse7 {

        public static void main(String[] args) {

            int n = 44;

    if (n % 2 == 0){
 
         System.out.print("Even ");
 
            if (n % 8 == 0) {
                System.out.println("and divisible by 6");

            } else {
                System.out.println("and not divisible by 6");
            }
        } 

    else {

            System.out.println("Odd ");
 
            if (n % 5 == 0) {
                System.out.println("and divisible by 3");

            } else {
                System.out.println("and not divisible by 3");
            }
        }

    }
 }