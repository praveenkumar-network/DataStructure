package array;

public class GasStationProblem {
//https://www.youtube.com/watch?v=PX7wYSqDIMQ
//https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
	public static void main(String[] args) {
		int gasStation[]= {1,2,3,4,5};
		int distance[] = {3,4,5,1,2};
		
		int startIndex = 0;
		int totalFuel = 0 ;
		int fuel = 0;
		for(int i =0 ; i < gasStation.length ; i++) {
			int diff =   gasStation[i] - distance[i];
			totalFuel = totalFuel + diff;
			fuel = fuel  + diff;
			if(fuel < 0) {
				fuel = 0;
				startIndex = i + 1;
			}
		}
		int ans =  totalFuel >= 0 ? startIndex : -1;
		System.out.println(ans);
	}

}
