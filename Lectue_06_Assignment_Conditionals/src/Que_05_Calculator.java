import java.util.Scanner;

public class Que_05_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator(+,-,*,/): ");
        char op=sc.next().charAt(0);
        System.out.println("Enter two numbers:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("The Operator is incorrect");
                break;

        }
    }
}
