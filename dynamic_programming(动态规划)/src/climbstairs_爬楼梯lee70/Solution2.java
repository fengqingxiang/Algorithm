package climbstairs_爬楼梯lee70;


/**
 * 其实本题是典型的斐波那契数列问题
 */
public class Solution2 {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * @param n 台阶数
     * @return 方法数
     */
    static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    /**
     * 最优解  上面的方法递归会产生重复的数据。
     * @param n
     * @return
     */
    static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs2(3));
        System.out.println(climbStairs2(2));
    }
}
