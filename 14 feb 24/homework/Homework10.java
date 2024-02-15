class Homework10 {
    
    public static void main (String[] args){

        int a = 86;
        long b = 65;
        float c = 32.4f;
        double d = 5654;

        a += c;
        b -= a;
        c *= b;
        d %= a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    
    }
}