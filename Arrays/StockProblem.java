// Problem: Maximize profit by choosing one day to buy and another to sell

package Arrays;

public class StockProblem {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = findMaxProfit(prices);
        System.out.println(result);
    }

    private static int findMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){    
            if(price<minPrice)    
                minPrice = price; 
            else if(price - minPrice > maxProfit) 
                maxProfit = price - minPrice;    
        }

        return maxProfit;
    }
}
