import java.util.Scanner;

public class TLinesOfSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
//        while(testcases>0)
//        {
//            int num1=sc.nextInt();
//            int num2= sc.nextInt();
//            int sum= num1+num2;
//            System.out.println("Sum is:-"+sum);
//            testcases--;
//        }

        for(int i=0;i<testcases;i++)
        {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.println(sum);
        }
    }
}
