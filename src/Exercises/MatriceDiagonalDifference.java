package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatriceDiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> matriz = new ArrayList<>();
		List<Integer> fila1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Integer> fila2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		List<Integer> fila3 = new ArrayList<Integer>(Arrays.asList(9,8,9));
//		List<Integer> fila4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		matriz.add(fila1);
		matriz.add(fila2);
		matriz.add(fila3);
//		matriz.add(fila4);
		System.out.println(matriz);
		int rta = diagonalDifference(matriz);
		System.out.println(rta);

	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
			int diagonal1 = 0;
			int diagonal2 = 0;
			for (int i = 0; i < arr.size(); i++) {
				int num1 = arr.get(i).get(i);
				diagonal1 += num1;
				int ultimaPos = arr.get(i).size()-1-i;
				int num2 = arr.get(i).get(ultimaPos);
				diagonal2 += num2;
				System.out.println(num1 + "num2" + num2);
				
			}
			System.out.println(diagonal1 + "d2: " + diagonal2);
	        return Math.abs(diagonal2-diagonal1);
	    }

}
