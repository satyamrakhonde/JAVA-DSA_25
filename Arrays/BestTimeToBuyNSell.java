package Arrays;

public class BestTimeToBuyNSell {
    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // Update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Check profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maxProfit
            if (profit > maxProfit)
                maxProfit = profit;

        }
        System.out.println(maxProfit);
    }
}
