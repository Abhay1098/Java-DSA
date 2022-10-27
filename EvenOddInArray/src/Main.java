public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,2,7,4,8,9};
        evenOdd(arr);
    }

    public static void evenOdd(int[] arr)
    {
        int n=arr.length;
        int index=0;
        int[] arr1=new int[n];

        //to find out the EVEN numbers
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[index]=arr[i];
                index++;
            }
        }

        //to find out the odd numbers
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                arr1[index]=arr[i];
                index++;
            }
        }

        //to print the final array(i.e. first EVEN afte that ODD)
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+",");
        }

    }
}