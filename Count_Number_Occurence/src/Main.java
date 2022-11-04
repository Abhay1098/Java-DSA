import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int count=0;
        System.out.println("Enter target number: ");
        int target=sc.nextInt();

        while(num>0)
        {
            int rem=num%10;
            if(rem==target)
                count++;
            num/=10;
        }
        System.out.println("Occurence of "+num+" in a integer is:- " +count);
    }
}