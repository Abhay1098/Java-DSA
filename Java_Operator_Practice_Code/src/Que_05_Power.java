import java.util.Scanner;
import java.lang.Math;

public class Que_05_Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
//        int p=a^b;
        System.out.println("Power of a to b is- "+Math.pow(a,b));
    }
}
