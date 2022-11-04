import java.util.Scanner;

public class Que_03_Operators_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Without Using Assignment Operators-"+(((a+8)/3)%5)*5);
        a+=8;
        a/=3;
        a%=5;
        a*=5;
        System.out.println("By using Assignment Operators-"+a);
    }
}
