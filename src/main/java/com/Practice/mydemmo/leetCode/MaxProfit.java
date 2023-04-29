package com.Practice.mydemmo.leetCode;
//买卖股票的最佳时机 II
//给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
//
//在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
//
//返回 你能获得的 最大 利润。
//--------------------------------------------------------------------------------------------------------------------------------------------
//思路:动态规划解决
/*定义dp[i][0]表示第i天交易完之后手里没有股票的最大利润，dp[i][1]表示第i天交易完之后手里持有股票的最大利润。

当天交易完之后手里没有股票可能有两种情况，一种是当天没有进行任何交易，又因为当天手里没有股票，所以当天没有股票的利润只能取前一天手里没有股票的利润。
 一种是把当天手里的股票给卖了，既然能卖，说明手里是有股票的，所以这个时候当天没有股票的利润要取前一天手里有股票的利润加上当天股票能卖的价格。
 这两种情况我们取利润最大的即可，所以可以得到

dp[i][0]=max(dp[i-1][0],dp[i-1][1]+prices[i]);

当天交易完之后手里持有股票也有两种情况，一种是当天没有任何交易，又因为当天手里持有股票，所以当天手里持有的股票其实前一天就已经持有了。还一种是当天买入了股票，
 当天能买股票，说明前一天手里肯定是没有股票的，我们取这两者的最大值，所以可以得到

dp[i][1]=max(dp[i-1][1],dp[i-1][0]-prices[i]);

动态规划的递推公式有了，那么边界条件是什么，就是第一天

如果买入：dp[0][1]=-prices[0];

如果没买：dp[0][0]=0;*/

import org.junit.jupiter.api.Test;

public class MaxProfit {
    @Test
    public void test01() {
        int[] nums = {1, 2, 3, 4, 5};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    @Test
    public void test02() {
        int[] nums = {7, 5, 8, 13, 7};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2){
            return 0;
        }
        int[][] stockEarnings = new int[prices.length][2];
        //第一天不持有股票的收益
        stockEarnings[0][0] = 0;
        //第一天持有股票的收益,花钱出去了
        stockEarnings[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            //第i+1天手里没有股票,要用前一天手里没有股票和这一天卖出去股票得到钱做对比,取最大值
            stockEarnings[i][0] = Math.max(stockEarnings[i - 1][0], stockEarnings[i-1][1] + prices[i]);
            //第i+1天手里有股票,要用前一天
            stockEarnings[i][1] = Math.max(stockEarnings[i - 1][1], stockEarnings[i-1][0] - prices[i]);
            //最后一天一定是卖掉股票,所以返回stockEarnings[length-1][0]
        }
        return stockEarnings[stockEarnings.length - 1][0];
    }

    @Test
    public void test03() {
        //测试多维数组
        int[][] nums = {{1, 2, 3, 4}, {1, 2, 3}, {1, 2}, {1}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
