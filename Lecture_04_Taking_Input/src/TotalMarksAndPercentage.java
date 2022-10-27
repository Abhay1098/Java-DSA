import java.util.Scanner;

public class TotalMarksAndPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int total_marks=num1+num2+num3;
        float percentage=(total_marks/3);

        System.out.println("Total Marks:-" +total_marks);
        System.out.println("Percentage:- "+percentage+"%");
    }
}
