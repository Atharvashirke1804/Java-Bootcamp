class Break5 {

    public static void main(String[] args) {

        int x = 1;
        int y = 0;
        do {
            if (y % 2 == 0) { 
                x += y; 
                break; 
            }

            y++;

        } while (y <= 20);

        System.out.println("Sum of odd numbers : " + x);
    }
}