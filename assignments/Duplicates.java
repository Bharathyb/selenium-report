package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
			System.out.println("Given List is"+lst);
			for (int j = 0; j < lst.size(); j++) {
				for(int k=i+1;k<lst.size();k++) {if(lst.get(j)==lst.get(k)) {
					System.out.println(lst.get(j));
				}
			}
		}
		
	}

}}
