package Exercises.maxminarray;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SumOfMaxAndMinOfArray {
	
	public static void main(String[] args) {
		
		Vector<Integer> arreglo = new Vector<Integer>();
		arreglo.add(156873294);
		arreglo.add(719583602);
		arreglo.add(581240736  );
		arreglo.add(605827319  );
		arreglo.add(895647130);
		Collections.sort(arreglo);
		
	    List<Integer> subListMin = arreglo.subList(0, 4);
	    List<Integer> subListMax = arreglo.subList(1, 5);
	    
	    BigInteger sumMin = sumar(subListMin);
	    BigInteger sumMax = sumar(subListMax);
	    System.out.println(sumMin + " " +sumMax);
	    
//	    sumMin = sumar(subListMin);
//	    sumMax = sumar(subListMax);
	    
//	    Integer sumMin = subListMin.stream().mapToInt(Integer::valueOf).sum();
//	    Integer sumMax = subListMax.stream().mapToInt(Integer::valueOf).sum();
	   
		
//		List<Integer> sublista = arreglo.subList(0, 4);
//		int sumMin = sublista.stream().mapToInt(Integer::valueOf).sum();
//		System.out.println(arreglo + " -- "+ sumMin);
//		Collections.reverse(arreglo);
//		System.out.println(sublista);
	}
	
	public static BigInteger sumar(List<Integer> arr) {
		BigInteger suma = BigInteger.ZERO;
		for (Integer integer : arr) {
			suma = suma.add(BigInteger.valueOf(integer));
		}
		return suma;
	}
    public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr);
    List<Integer> subListMin = arr.subList(0, 4);
    List<Integer> subListMax = arr.subList(1, 5);
    int sumMax = subListMax.stream().mapToInt(Integer::valueOf).sum();
    int sumMin = subListMin.stream().mapToInt(Integer::valueOf).sum();
    System.out.println(sumMin + " " +sumMax);
    }

}
