package week4.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			lst.add(data[i]);
		}System.out.println("Given List"+lst);
		Collections.sort(lst);
		System.out.println("After Sort"+lst);
		int size=lst.size();
		System.out.println("Second Largest Num"+lst.get(size-2));
		

	}

}
