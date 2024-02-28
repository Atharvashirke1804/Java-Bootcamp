class Example1 {
    public static void main(String[] args) {
        int range = 20;
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 1; i <= range; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
            sum += next; 
        }

        System.out.println(" The sum of Fibonacci numbers is :" + range + sum);
    }
}
