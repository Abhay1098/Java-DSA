import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextLine())
        {
            String a=sc.next();
            String b=sc.next();
            System.out.println(a+b);
        }
    }
}
