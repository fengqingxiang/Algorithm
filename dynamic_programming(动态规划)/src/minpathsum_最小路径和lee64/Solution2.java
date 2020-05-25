package minpathsum_最小路径和lee64;

public class Solution2 {

    public static int minPathSum(int[][] grid) {
        if (grid==null){
            throw new IllegalArgumentException();
        }
        int m = grid.length;
        int n = grid[0].length;
        //用该数组每次保存本行的数据即可。
        int[] dp = new int[n];
        dp[0]=grid[0][0];
        for(int i=1;i<n;i++){
            dp[i]=dp[i-1]+grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            //每次更新dp[0]的值为上次的值（从首行累加到dp[i]的值）+当前行的首列值
            dp[0]=dp[0]+grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

}
