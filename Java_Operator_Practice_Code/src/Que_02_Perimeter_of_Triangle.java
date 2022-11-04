import java.util.Scanner;

public class Que_02_Perimeter_of_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int p=l+b+h;
        System.out.println("Perimeter of Triangle is-"+p);
    }
}
