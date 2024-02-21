// Write a program to print 'a' - 'z' and also 'A'-'Z'.

class Que7 {

    public static void main(String[] args) {
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        
        System.out.println(); 
        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
