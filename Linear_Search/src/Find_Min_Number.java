import java.util.Scanner;

public class Find_Min_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //declaring the size of the array
        System.out.println("Enter size of array- ");
        int n=sc.nextInt();

        //declaring the array
        int[] arr=new int[n];

        //reading the arrays elements from user
        System.out.println("Enter array elements- ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //calling min function

        System.out.println(FindMin(arr));
    }

    static int FindMin(int arr[])
    {
        int min=arr[0];
        if(arr.length==0)
        {
            System.out.println("Array has no elements");
            return 0;
        }

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
