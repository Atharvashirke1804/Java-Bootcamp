class Example5 {
    public static void main(String[] args) {
        int size = 5; // Change the size of the triangle as needed

        // Outer loop for rows
        for (int i = size; i > 0; i--) {
            // Inner loop for columns
            for (int j = 0; j < i; j++) {
                // Print star for each column
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
