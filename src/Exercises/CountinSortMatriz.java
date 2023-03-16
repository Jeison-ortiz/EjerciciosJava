package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountinSortMatriz {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(1);
		myList.add(3);
		myList.add(2);
		myList.add(1);
		
		List<Integer> myListRta = countingSort(myList);
		System.out.println(myListRta);
		
	}
	
	   public static List<Integer> countingSort(List<Integer> arr) {
		   Collections.sort(arr);
		   Integer arreglo[] = new Integer[5];
		   Arrays.fill(arreglo, 0);
		   System.out.println();
		   for(Integer i = 0; i<arr.size();i++) {
			   arreglo[arr.get(i)] += 1;
			   
		   }
		   return Arrays.asList (arreglo);
		   
	   }

}
