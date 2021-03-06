# ClimbStairs(爬楼梯leeCode70题)

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/climbing-stairs
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶

解题步骤：

第一步：定义数组的含义，即保存了什么样的记录。

本题定义数组为dp[n]表示爬到第i个台阶共有dp[i]种方法。

第二步：找出关系式，即历史记录之间的联系。

本题要求爬上第n阶楼梯有多少种方法，题目规定每次只能爬一阶或两阶楼梯，所以只能从n-1或n-2的楼梯爬到第n阶。
因此，所有的可能就是从开始爬到n-1层和爬到n-2层的所有情况，即dp[n]=dp[n-1]+dp[n-2]



第三步：确定初始值和边界。
dp[n]=dp[n-1]+dp[n-2]  所以使用该式子时n应该大于等于2。所以应该确定n=0,1时的情况。
当n=0时，没有台阶，但可以理解为已达,dp[0]=1; （这种初始值可以根据实际的运算（数学归纳）去推一下，不然有时候跟现实的理解有些出入）
当n=1时，只能跳一个台阶到达，dp[1]=1;
或者也可使dp[0]=0，同时指定dp[2]=2这样在使用式子时指定n>2就可以了。
另外注意因为n为第n个台阶,最后返回dp[n]为了不使数组越界，应该初始数组大小为n+1

PS:本题的最优解法不是动态规划，只是用本题比较好理解动态规划的思维。
动态规划题解请参考Solution1
最优解法请参考Solution2
