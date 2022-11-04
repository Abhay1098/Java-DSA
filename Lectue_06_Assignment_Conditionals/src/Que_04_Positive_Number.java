import java.util.Scanner;

public class Que_04_Positive_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The entered number is positive- "+num);
        }
        else
            System.out.println("The entered number is negative and skipped");
    }
}
