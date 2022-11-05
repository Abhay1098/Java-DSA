public class Find_Numbers_with_Even_Numbers_of_Digits {
    public static void main(String[] args) {
       int[] arr={10,89,98,9897,9};
       System.out.println(findNumbers(arr));
//        System.out.println(countDigit(1345));
//        System.out.println(even(253));
    }
    /*static int FindNumbers(int arr[])
    {
        int count=0;
        int rem, ans=0;
        int l=arr.length;
        for(int i = 0;i < l; i++)
        {
            while(arr[i]!=0)
            {
                rem=arr[i]%10;
                count++;
                arr[i]/=10;
            }
            if(count%2==0)
            {
                ans++;
            }
        }
        return ans;
    }*/


    static int findNumbers(int[] nums) {
        int count=0;
        for (int num: nums) 
        {
            if (even(num))
            count++;
        }
        return count;
    }

    //to check digit is Even or Not
    static boolean even(int num)
    {
        int numberOfDigits = countDigit(num);
        return numberOfDigits % 2 == 0;
    }

    //to check the digits of number
    static int countDigit(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
}
