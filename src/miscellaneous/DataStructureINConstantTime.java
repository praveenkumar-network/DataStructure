package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataStructureINConstantTime {
// https://www.geeksforgeeks.org/design-a-data-structure-that-supports-insert-delete-search-and-getrandom-in-constant-time/
	
	static List<Integer> list = new ArrayList<>();
	static Map<Integer , Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		insert(1);
		insert(10);
		insert(25);
		insert(15);
		System.out.println(search(10));
		remove(10);
		System.out.println(randomNo());

	}
	private static void insert(int no) {
		if(!map.containsKey(no)) {
			int index = list.size();
			list.add(no);
			map.put(no, index);
		}
	}
	private static int search(int no) {
		int index = map.get(no);
		return list.get(index);
	}
	private static void remove(int no) {
		if(map.containsKey(no)) {
			int index = map.get(no);
			map.remove(no);
			if(index != list.size()-1 ) {
				int lastIndex = list.size() - 1;
				Collections.swap(list, index, lastIndex);
				if(lastIndex != index) {
					map.put(list.get(index), index);	
				}
				
			}
			list.remove(list.size() - 1);
		}
		
		
	}
	private static int randomNo() {
		Random random = new Random();
		int index = random.nextInt(list.size());
		return list.get(index);
	}

}
