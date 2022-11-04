import java.util.Scanner;

public class Que_01_Square_or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();

        if(length==breadth)
            System.out.println("It is a SQUARE");
        else
            System.out.println("It is a Rectangle");
    }
}
