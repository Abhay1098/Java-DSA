public class Main {
    public static void main(String[] args) {
        byte b=2;
        char c='a';
        int i=24;
        float f=24.2f;
        short s=23456;
        double d= 1234.6789;
        double result=(b*f)+(i+c)-(d*s);
        //float+integer-double
        System.out.println((b*f)+" "+(i+c)+" "+(d*s));
        System.out.println(result);
    }
}