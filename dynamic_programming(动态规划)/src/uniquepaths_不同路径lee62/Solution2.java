package uniquepaths_不同路径lee62;

public class Solution2 {

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        //初始化第一行的数据，只能往右，所以全为1
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }
}
