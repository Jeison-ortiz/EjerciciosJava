package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueNumInArray {

	public static void main(String[] args) {
		List<Integer> lista = List.of(1,2,3,4,1,2,3);
		List<Integer> miLista = new ArrayList<Integer>(Arrays.asList(1,1,2));
		int rta =  lonelyinteger(miLista);
		System.out.println(rta);
	}

	public static int lonelyinteger(List<Integer> a) {
		Collections.sort(a);
		for (int i = 0; i<a.size()-1; i++) { //  se hace para comparar de dos en dos
			System.out.println(i);
			if(a.get(i)!=a.get(i+1)) {
				return a.get(i);
			}
			i +=1;
		}
	System.out.println(a);
		return a.get(a.size()-1);
	}

}
