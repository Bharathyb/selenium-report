package week4.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,5,4,7,6,8};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			lst.add(num[i]);
		}System.out.println("Given List"+lst);
		Collections.sort(lst);
		System.out.println("After Sort"+lst);
		for(int i=lst.get(0);i<lst.size();i++) {
		if(i!=lst.get(i-1)) {
		System.out.println("Missing Num is"+i);
		break;
	}
		}
}
}