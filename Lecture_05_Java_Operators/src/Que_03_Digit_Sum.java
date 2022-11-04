import java.util.Scanner;

public class Que_03_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,y=0;
        while (a>0)
        {
            y=a%10;
            sum+=y;
            a=a/10;
        }
        System.out.println(sum);
    }
}
