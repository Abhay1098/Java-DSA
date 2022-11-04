import java.util.Scanner;

public class Que_02_Swapping_without_third_Variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        num_1=num_1+num_2;
        num_2=num_1-num_2;
        num_1=num_1-num_2;
        System.out.println("After Swapping:- "+num_1+" "+num_2);
    }
}
