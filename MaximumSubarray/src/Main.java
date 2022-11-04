
//O[N^3] Solution of to find the sum of max sub array.

public class Main {
    public static int maxsubarray(int arr[])
    {
        int max=0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                int sum=0;
                for(int k=i;k<j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>max)
                    max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int  max=maxsubarray(arr);
        System.out.println("The sum of maximum Subarray is- "+max);
    }
}