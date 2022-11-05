public class LeetCod_Max_Wealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,4},
                {2,3,4}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max=0;

        for (int cust = 0; cust < accounts.length; cust++) {
            int rowsum=0;
            for (int accnt = 0; accnt < accounts[cust].length; accnt++) {
                rowsum+=accounts[cust][accnt];
            }
            if(rowsum>max)
                max=rowsum;
        }
        
        return max;
    }
}
