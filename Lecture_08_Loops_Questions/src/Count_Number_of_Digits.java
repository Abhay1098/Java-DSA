import java.util.Scanner;

public class Count_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        while(num!=0)
        {
            num/=10;
            count++;
        }
        System.out.println("Number of digits- " +count);
    }
}
