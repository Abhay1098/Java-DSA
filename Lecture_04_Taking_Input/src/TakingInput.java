import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);




//
//        System.out.print("Enter the Integer Number:- ");
//        //for Integer number nextInt is the method in the scanner class
//        int num_1=sc.nextInt();
//
//        System.out.println("Entered number is:-" +num_1);
//
//
//
//
//
//        System.out.println("Enter your name:- ");
//        //next method read the string only till space after that it ignores all the characters.
//        String name = sc.next();
//
//        System.out.println("Entered Name is:- "+name);




        System.out.println("Enter your name:- ");
        //nextLine method read the complete string with spaces as well.
        String name_1 = sc.nextLine();

        System.out.println("Entered Name is:- "+name_1);
    }
}
