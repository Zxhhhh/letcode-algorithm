package com.zxh.letcode_algorithm.codeTran.easyCode.array.t122;


/**
 * 股票最大利润
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 
 *    在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *    随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * @author Administrator
 *
 */
public class MaxProfit {
	
	/**
	 * 正解：峰谷法
	 * 需要考虑到紧跟谷的每一个峰值以最大化利润。
	 * 如果我们试图跳过其中一个峰值来获取更多利润，那么我们最终将失去其中一笔交易中获得的利润，从而导致总利润的降低
	 * @param prices
	 * @return
	 */
    public int maxProfit(int[] prices) {
    	int valley = prices[0]; // 谷底金额
    	int peak = prices[0]; // 峰顶金额
    	int maxProfit = 0; //最大利益
    	int i = 0;
    	while(i < prices.length -1) {
    		
    	}
    }

}
