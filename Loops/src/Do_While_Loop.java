import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();

        /*
            DO...WHILE Loop Syntax

            do
            {
                //code
            }while(condition);
         */

        //Q-

        do {
            System.out.println(num1);
            num1++;
        }while (num1<=10);

    }
}
