import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {

        //Creating a scanner class object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character/String:- ");
        char ch=sc.next().charAt(0);
        System.out.println("First Character is:- "+ch);
    }
}
