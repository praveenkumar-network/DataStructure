package array;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStockWithKTransaction {
	//https://www.youtube.com/watch?v=0STXF9IXhnA

	Map<String, Integer> map = new HashMap<>();;
	
	public static void main(String[] args) {
	//	int array[] = {2, 30, 15, 10, 8, 25, 80};
	//	int k = 2;
		//int array[] = {3, 3, 5, 0, 0, 3, 1 , 4}; o/p = 6
		//int k = 2;
		int array[] = {1 , 2, 3, 4, 5};
		int k = 2;
		BestTimeToBuyAndSellStockWithKTransaction  c= new  BestTimeToBuyAndSellStockWithKTransaction();
		int maxProfit = c.buyAndSell(array , true  , k , 0);
		System.out.println(maxProfit);
		

	}
	public int  buyAndSell(int[] array ,boolean buyOrSell , int k,  int i  ) {
		if(i>= array.length || k == 0) {
			return 0;
		}
		String key = i+"code"+buyOrSell+"value"+k;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		int profit ;
		if(buyOrSell) {
			int buy = buyAndSell(array, false, k, i+1 ) - array[i];
			int notBuy = buyAndSell(array, true, k, i+1 );
			profit = Math.max(buy, notBuy);
		}else {
			int sell = buyAndSell(array, true, k - 1, i+1 ) + array[i];
			int notSell = buyAndSell(array, false, k, i+1 );
			profit = Math.max(sell, notSell);
		}
		 map.put(key, profit);
		 return profit;
	}

}
