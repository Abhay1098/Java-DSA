import java.util.Scanner;

public class Que_06_Convert_F_to_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextInt();
        float c=((f-32)*5)/9;
        System.out.println(c);
    }
}
