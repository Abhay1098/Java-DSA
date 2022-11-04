import java.util.Scanner;

public class Que_03_Profit_and_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp= sc.nextInt();
        int profit,loss;


        if(sp>cp){
            profit=sp-cp;
            System.out.println("Profit is- "+ profit);
        }
        else {
            loss = cp - sp;
            System.out.println("Loss is- " + loss);
        }

    }
}
