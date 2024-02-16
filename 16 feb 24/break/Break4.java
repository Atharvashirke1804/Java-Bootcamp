 class Break4 {

    public static void main(String[] args) {
       
        for (int x = 1; x <= 10; x++) {
            if (x % 5 == 0) {
                
                break;
            }
            System.out.println(x);
        }
    }
}