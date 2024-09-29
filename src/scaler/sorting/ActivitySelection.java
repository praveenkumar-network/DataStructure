package scaler.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
	// https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/
	// https://www.youtube.com/watch?v=V0ZrLuIVzaY
	static class Activity{
		int startTime;
		int finisTime;
		
		public Activity(int startTime, int finisTime) {
			super();
			this.startTime = startTime;
			this.finisTime = finisTime;
		}
		
		public int getStartTime() {
			return startTime;
		}
		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}
		public int getFinisTime() {
			return finisTime;
		}
		public void setFinisTime(int finisTime) {
			this.finisTime = finisTime;
		}
		
	}
	public static void main(String[] args) {
		
		int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        List<Activity> list = new ArrayList<>();
        for(int i = 0 ; i < s.length ; i++) {
        	Activity activity = new Activity(s[i], f[i]);
        	list.add(activity);
        }
        System.out.println(calculateTotalActivity(list));
        
	}
	private static int calculateTotalActivity(List<Activity> list){
		Comparator<Activity> comparator = (o1 , o2)-> o1.getFinisTime() - o2.getFinisTime();
		Collections.sort(list , comparator);
		
		int totalActivity = 1;
		int lastAcitivityIndex = 0;
		for(int i = 1 ; i < list.size() ; i++) {
			if(list.get(i).startTime >= list.get(lastAcitivityIndex).getFinisTime()) {
				totalActivity++;
				lastAcitivityIndex = i;
			}
		}
		return totalActivity;
	}

}
