package Exercises;

import java.util.ArrayList;
import java.util.List;

public class EstimacionPerdida {

	public static void main(String[] args) {
		List<List<Integer>> matriz = new ArrayList<>();
		List<Integer> listReport1 = new ArrayList<>();
		listReport1.add(2);
		listReport1.add(4);
		listReport1.add(2);
		List<Integer> listReport2 = new ArrayList<>();
		listReport2.add(3); //numero de tarea
		listReport2.add(16); // promedio aritmetico de la tareas
		listReport2.add(8);	// menor tiempo estimado
		matriz.add(listReport2);
		matriz.add(listReport1);
		List<Integer> listRep = maximoNumeroHoras(matriz);

	}
	
	public static List<Integer> maximoNumeroHoras(List<List<Integer>> equipos) {
		List<Integer> listReport = new ArrayList<>();
		int task = 0;
		int average = 0;
		int minimunTime = 0;
		int totalHours =0;
		int maxHours = 0;
		for (List team : equipos) {
			task =  (int) team.get(0);
			average = (int) team.get(1);
			minimunTime = (int) team.get(2);
			totalHours = task*average;
			task=task-1;
			maxHours = totalHours - minimunTime*task;
		
			System.out.println(team);
			listReport.add(maxHours);
			
		}
		System.out.println(listReport);
		return listReport;

	}

}
