import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class First_n_Factorial_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;

        for (int i = 1; i <=num; i++) {
            fact *= i;
            System.out.print(fact+", ");
        }
    }
}
