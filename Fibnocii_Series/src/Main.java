import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0,b=1,fs;
        int count=2;


        System.out.print("Series- "+a+" "+b);

        while(count<=n)
        {
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(" "+b);
            count++;

        }
        System.out.println();
        System.out.println("Sum-"+b);
    }
}