package Exercises;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		List<Integer> miArray = List.of(-4,3,-9,0,4,1);
		plusMinus(miArray);
		
	}
	
    public static void plusMinus(List<Integer> arr) {
    	   
    	Double negative = 0D;
    	Double positive = 0D;
    	Double zeros = 0D;
    
    for(Integer number : arr){
        if(number == 0){
            zeros += 1;
        }else if(number < 0){
            negative += 1;
        }
        else{
            positive += 1;
        }
    }
   
    zeros = zeros/arr.size();
    positive = positive/arr.size();
    negative = negative/arr.size();

    System.out.println(String.format("%.6f", negative));
    System.out.println(String.format("%.6f", positive));
    System.out.println(String.format("%.6f", zeros));
    }

}
