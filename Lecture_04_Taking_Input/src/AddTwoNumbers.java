import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int num_1=sc.nextInt();

        System.out.print("Enter Second number:- ");
        int num_2=sc.nextInt();

        int sum=num_1+num_2;
        System.out.println();
        System.out.println("Sum of Two integer number is:- "+sum);
    }
}
