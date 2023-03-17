package Exercises;

import java.util.ArrayList;
import java.util.List;

public class LaDeuda {
	public static void main(String[] args) {
		List<Long> listDays = new ArrayList<>();
		listDays.add(15L);
		listDays.add(16L);
		listDays.add(45L);
		List<Long> listDays1 = calcularDias(listDays);
	}

	public static List<Long> calcularDias(List<Long> prestamo) {
		List<Long> listDays = new ArrayList<>();
		Long counterDays = 0L;
		int expo = 0;
		for (Long deuda : prestamo) {
			while(deuda > 0) {
				long valorLong = Math.round(Math.pow(2, expo));
				System.out.println("ValorLong"+valorLong);
				deuda = deuda - valorLong;
				System.out.println("deuda"+deuda);
				counterDays +=1;
				expo+=1;
			}
			listDays.add(counterDays);
			counterDays =0L;
			expo=0;
		}
		System.out.println(listDays);
		return listDays;

	}
}
