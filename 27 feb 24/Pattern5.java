class Pattern5  {
    public static void main(String[] args){

        for(int i = 0 ; i < 6 ; i++){

            for(int j = 6 ; j >= 6 - i ; j--) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}