public class Que_07_Sum_of_1st_and_2nd_Last_Digit {
    public static void main(String[] args) {
        int a=12345;

        int first=a/10000;
        a=a%10000;

        int second=a/1000;
        a=a%1000;

        int third=a/100;
        a=a%100;

        int fourth=a/10;

        int fifth=a%10;
        
        int sum=first+fourth;
        System.out.println("Sum of First and Fourth number is- " +sum);
    }
}
