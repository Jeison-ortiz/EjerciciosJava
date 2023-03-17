package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class ProgramadorPerfeccionista {

	public static void main(String[] args) {
		List<List<Integer>> matriz = new ArrayList<>();
		List<Integer> listReport1 = new ArrayList<>();
		listReport1.add(2);
		listReport1.add(40);
		listReport1.add(20);
		listReport1.add(5);
		List<Integer> listReport2 = new ArrayList<>();
		listReport2.add(5); //numero de tarea
		listReport2.add(110); // promedio aritmetico de la tareas
		listReport2.add(30);	// menor tiempo estimado
		listReport2.add(10);
		matriz.add(listReport2);
//		matriz.add(listReport1);
		List<Boolean> listRep = podraCumplir(matriz);

	}

	
	public static List<Boolean> podraCumplir(List<List<Integer>> caso) {
		List<Boolean> rtaFinal = new ArrayList<>();
		int deadLine = 0;
		int functionsToDo =0;
		int functionsDoRicardo =0;
		int functionsDeleteRicardo =0;
		boolean answer = false;
		for (List day : caso) {
			deadLine = (int) day.get(0);
			functionsToDo = (int) day.get(1);
			functionsDoRicardo = (int) day.get(2);
			functionsDeleteRicardo = (int) day.get(3);
			System.out.println("dead" + deadLine);
			System.out.println("functionsToDo " + functionsToDo);
			System.out.println("functionsDoRicardo "+ functionsDoRicardo);
			System.out.println("functionsDeleteRicardo" + functionsDeleteRicardo);
			int functionsTotal = (functionsDoRicardo-functionsDeleteRicardo)*(deadLine-1);
			System.out.println("ft1->" + functionsTotal);
			functionsTotal = functionsTotal + functionsDoRicardo;
			System.out.println("ft" + functionsTotal);
			if(functionsToDo-functionsTotal<=0) {
				answer = true;
			}else {
				answer = false;
			}
			rtaFinal.add(answer);
			System.out.println("answer" + answer);
		}
		return rtaFinal;
	}
}
