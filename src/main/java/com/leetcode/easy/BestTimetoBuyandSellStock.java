package com.leetcode.easy;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }

        }
        return profit;

    }
}
