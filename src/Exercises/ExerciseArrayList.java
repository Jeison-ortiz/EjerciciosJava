package Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ExerciseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> listaPrueba = new ArrayList<>();
		listaPrueba.add(42);
		listaPrueba.add(234);	
		listaPrueba.add(26);
		listaPrueba.add(12);
		System.out.println(listaPrueba);
		Collections.sort(listaPrueba);
		System.out.println(listaPrueba);

	}

}
