package array;

public class BestTimeToBuyAndSellStockWithAnyTransaction {
//https://www.youtube.com/watch?v=2FROyvnnrrM&t=1721s
	public static void main(String[] args) {
		//int array[] = {100, 180, 260, 310, 40, 535, 695};
		int array[] = {4, 2, 2, 2, 4};
		int maxProfit = 0;
		for(int i = 1 ; i < array.length ; i++) {
			if(array[i] > array[i - 1]) {
				maxProfit = maxProfit + array[i] - array[i - 1];
			}
		}
		System.out.println(maxProfit);

	}

}
