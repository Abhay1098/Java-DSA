
//WAP to find the total path from (0,0) to (m,n) with two constraints- Move rightwards and downwards only.
public class Main {
    public static int totalpath(int i,int j, int m, int n)
    {
        if(i==m||j==n)
        {
            return 0;
        }
        if(i==m-1&&j==n-1)
        {
            return 1;
        }
        int rightwards=totalpath(i+1,j,m,n);
        int downwards=totalpath(i,j+1,m,n);
        return rightwards+downwards;
    }
    public static void main(String[] args) {
        int n=4,m=3;
        int totalcounts;
        totalcounts=totalpath(0,0,m,n);

        System.out.println("Total counts-" +totalcounts);
    }
}