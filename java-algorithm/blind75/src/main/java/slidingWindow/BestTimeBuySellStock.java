package slidingWindow;

public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int maxStock = 0;
        int l = 0, r = 1;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                maxStock = Math.max(maxStock, (prices[r] - prices[l]));
            } else {
                l = r;
            }
            r++;
        }
        return maxStock;
    }

    public static void main(String [] args){
        int[] pricesArray = {5,1,5,6,7,1,10};
        System.out.println(maxProfit(pricesArray));
    }
}
