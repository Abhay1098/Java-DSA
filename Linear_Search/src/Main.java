import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,target;
        System.out.println("Enter array number of element");
        n=sc.nextInt();

        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }

        System.out.println("Enter the target value");
        target=sc.nextInt();

        System.out.println(LinearSearch(arr,target));

    }
    static int LinearSearch(int arr[],int target)
    {
        if(arr.length==0)
            return -1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}