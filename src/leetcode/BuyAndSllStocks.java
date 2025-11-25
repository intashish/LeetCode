package leetcode;

import java.util.Map;

public class BuyAndSllStocks {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

//        int buy = prices[0];
//        int diff = 0;
//        for(int i=1;i<prices.length;i++){
//            if(prices[i] < buy){
//                buy = prices[i];
//                continue;
//            }
//            int tempDiff = prices[i] - buy;
//            if(tempDiff > diff){
//                diff = tempDiff;
//            }
//        }
//        return diff;
        int buy = prices[0];
        int profit = 0;

        for(int price : prices){
            if(price < buy){
                buy = price;
            } else {
                profit = Math.max(profit, price-buy);
            }
        }
        return profit;
    }
}
