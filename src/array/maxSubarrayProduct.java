package array;

public class maxSubarrayProduct {
//https://www.youtube.com/watch?v=hnswaLJvr6g
	//https://www.geeksforgeeks.org/maximum-product-subarray/
	public static void main(String[] args) {
		//int array[] =  { 1, -2, -3, 0, 7, -8, -2 };
		int array[] = {-1, -3, -10, 0, 60};
		int leftProductSoFar = 1 , rightProductSoFar = 1;
		int left_Product_till_here = 1, right_Product_till_here = 1;
		for(int i = 0 , j = array.length - 1 ; i < array.length ; i++ , j--) {
			
			left_Product_till_here = left_Product_till_here * array[i];
			leftProductSoFar =  Math.max(leftProductSoFar, left_Product_till_here);
			 if(left_Product_till_here == 0 ) {
				 left_Product_till_here = 1;
			 }
			 
			 right_Product_till_here = right_Product_till_here * array[j];
			 rightProductSoFar = Math.max(rightProductSoFar, right_Product_till_here);
			 if(right_Product_till_here == 0) {
				 right_Product_till_here =1;
			 }
		}
		int ans = Math.max(rightProductSoFar, leftProductSoFar);
		System.out.println(ans);

	}

}
