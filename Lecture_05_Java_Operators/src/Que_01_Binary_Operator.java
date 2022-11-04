import java.util.Scanner;

public class Que_01_Binary_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        y=((((x+8)/3)%5)*5);
        System.out.println(y);
    }
}
