# Dynamic_Programming(动态规划)

基本原理：把多阶段过程转化为一系列单阶段问题，利用各阶段之间的关系，逐个求解。
简单来讲就是利用历史信息（一般利用一维或二维数组来保存历史记录），避免重复计算。

一般解题步骤：

第一步：定义数组的含义，即保存了什么样的记录。

第二步：找出关系式，即历史记录之间的联系。
比如第一步定义了数组dp[n]用来表示保存历史记录，那么
dp[n]=dp[n-1]+1 或 dp[n]=dp[n-1]+dp[n-2]  这就是记录之间的关系式。
动态规划有很多应用场景，能正确找到关系式是能否正确解答问题的关键。

第三步：确定初始值和边界。
由于问题的解是根据历史记录来得出的，所以得先有一个初始值来确定第一条或前i条记录，这样我们才能利用已有的记录来求解。
比如第二步例子中的关系式，一般的初始值 dp[0] dp[1] 应该是事先确定下来的。
边界条件也是必不可少的地方。比如第二步的关系式中 n的值就不能小于1或小于2,这样会数组越界。

以上就是动态规划问题的一般求解步骤。结合具体的题就很好理解了。

src文件夹中是具体的动态规划题目，每个题的README.md文件中都有解题步骤。
