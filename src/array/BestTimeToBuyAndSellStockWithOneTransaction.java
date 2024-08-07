package array;

public class BestTimeToBuyAndSellStockWithOneTransaction {
//https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
//	https://www.youtube.com/watch?v=2FROyvnnrrM&t=1721s
	public static void main(String[] args) {
		//int array[] = {7, 6, 4, 3, 1};
		int array[] = {7, 1, 5, 6, 4 };
		int minBuy = array[0], maxProfit = 0;
		for(int i = 1 ; i < array.length ; i++) {
			if(array[i] < minBuy) {
				minBuy = array[i];
			}else if(array[i] - minBuy > maxProfit) {
				maxProfit = array[i] - minBuy;
			}
		}
		System.out.println(maxProfit);

	}

}
