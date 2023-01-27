package week4.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RemoveDuplicates1 {public static void main(String[] args) {
	

	String text = "We learn java basics as part of java sessions in java week1";
	List<String>lst1=new ArrayList<String>();
	String[] words=text.split(" ");
	for(int i = 0;i<words.length;i++) {
		
		lst1.add(words[i]);}
	System.out.println(lst1);
	Collections.sort(lst1);
	for(int i=0;i<lst1.size()-1;i++) {
		if(lst1.get(i).equals(lst1.get(i+1))) {
			System.out.println(lst1.get(i));
		}
	}}
}















/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */
