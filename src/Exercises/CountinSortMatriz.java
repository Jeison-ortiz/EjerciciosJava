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
	   
	   
	    public static void findZigZagSequence(int [] a, int n){
	        Arrays.sort(a);
	      
	        int mid = (n + 1)/2;
	        int temp = a[mid-1];
	        a[mid-1] = a[n - 1];
	        a[n - 1] = temp;
	     //   System.out.println("Mid: "+mid +"temp: " + temp);
	    
	        int st = mid;
	        int ed = n - 2;
	      //  System.out.println("st: "+st +"ed: " + ed);
	        for(int i = 0; i < n; i++){    
	      //      System.out.print(a[i]);
	        }
	      //  System.out.println("melo");
	        while(st <= ed){
	            temp = a[st];
	            a[st] = a[ed];
	            a[ed] = temp;
	            st = st + 1;
	            ed = ed - 1;
	       //     System.out.println("--");
	       //     System.out.println("st: "+st +"ed: " + ed);
	        }
	     //   System.out.println("st: "+st +"ed: " + ed);
	        for(int i = 0; i < n; i++){
	            if(i > 0) System.out.print(" ");
	            System.out.print(a[i]);
	        }
	        System.out.println();
	    }

}
