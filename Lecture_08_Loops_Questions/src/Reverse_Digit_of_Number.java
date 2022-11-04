import java.util.Scanner;

public class Reverse_Digit_of_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;
        int rem;

        while(num!=0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }

        System.out.println("Reverse the digits of number is- "+ sum);
    }
}
