import java.util.Scanner;

public class InputfromUserAndPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Name,Roll no., Area of Interest:- ");
        String first_name = sc.next();
        String last_name = sc.next();
        int roll_no = sc.nextInt();
        String interest = sc.next();

        System.out.println("Name:- "+first_name+" "+last_name);
        System.out.println("Roll number:- "+roll_no);
        System.out.println("Area of Interest:- "+interest);
    }
}
