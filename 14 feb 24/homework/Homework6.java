class Homework6 {
    
    public static void main (String[] args){

        char a = '2';
        char b = '6';

        a %= b;
        b *= a;

        System.out.println(a);
        System.out.println(b);
    
    }
}