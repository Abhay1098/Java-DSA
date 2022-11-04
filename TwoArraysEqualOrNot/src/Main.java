import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1={3,5,7,2,5};
        int[] arr2={5,3,7,2};
        if(arrayEqual(arr1,arr2))
        {
            System.out.println("Two Arrays are Equal");
        }
        else
        {
            System.out.println("Two Arrays are not Equal");
        }
    }
    public static boolean arrayEqual(int[] arr1,int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] new_arr = new int[n];
        if (n != m)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}