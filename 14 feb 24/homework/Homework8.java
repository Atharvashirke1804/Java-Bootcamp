class Homework8 {
    
    public static void main (String[] args){

        short a = 54;
        short b = 24;
        short c = 55;

        a /= b;
        b *= c;
        c %= a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}