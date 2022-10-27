import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principle:- ");
        float p=sc.nextFloat();

        System.out.println("Enter Rate:- ");
        float r=sc.nextFloat();

        System.out.println("Enter Time:- ");
        float t=sc.nextFloat();

        System.out.println("Principle:- "+p);
        System.out.println("Rate:- "+r);
        System.out.println("Time:- "+t);
         float SI=(p*r*t)/100;
        System.out.println("Simple Interest:- "+SI);

    }
}
