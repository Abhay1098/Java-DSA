import java.util.Scanner;

public class Que_02_Absolute_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(num<0)
            System.out.println(num*-1);
    }
}
