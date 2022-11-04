import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void PrintSubArr(int arr[], int n)
    {
        int maxsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    //System.out.print(arr[k]);//To print the subarrays
                    sum+=arr[k];
                }
                maxsum=max(maxsum,sum);
                //System.out.println();//To change the line after printing each subarray
            }
        }
        System.out.println("Maximum Sum of Subarray is"+maxsum);
    }
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        PrintSubArr(arr,n);

    }
}