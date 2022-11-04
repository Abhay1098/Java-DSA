import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {

        /*
            Syntax for FOR loop
                for(initialization ; condition ; increment/decrement)
                {
                    //body
                }

         */

        //Q- print table of number num
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=1;
        for (int i = 1; i <= 10; i++) {
            int r= num*i;
            System.out.println(num+ " x "+ n +" = " + r);
            n++;
        }


    }
}
