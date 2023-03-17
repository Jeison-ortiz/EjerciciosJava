package Exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RobotNasa {
	
	public static void main(String[] args) {
		List<String> instruccion = new ArrayList<>();
		instruccion.add("UUU");
		instruccion.add("RUULLLDDDR");
		
		List<Integer> rts = calcularMaximoRetorno(instruccion);
	}
	
	public static List<Integer> calcularMaximoRetorno(List<String> instructions) {
		List<Integer> evaluations = new ArrayList<>();
//		List<Integer> evaluationsForInstruction = new ArrayList<>();
		int horizontal = 0;
		int vertical = 0;
		int maxDistance = 0;
		for (String instruction : instructions) {
			List<Integer> evaluationsForInstruction = new ArrayList<>();
			vertical = 0;
			horizontal=0;
			for (int i = 0 ;i<instruction.length();i++) {
//				System.out.println("infe " +instruction.charAt(i));
				if(instruction.charAt(i)=='U') {
					horizontal +=1;
				}
				if(instruction.charAt(i)=='D') {
					horizontal -=1;
				}
				
				if(instruction.charAt(i)=='R') {
					System.out.println("entre R");
					vertical +=1;
				}
				if(instruction.charAt(i)=='L') {
					vertical -=1;
				}
				maxDistance = Math.abs(horizontal) + Math.abs(vertical);
				evaluationsForInstruction.add(maxDistance);
			}
			
			System.out.println("evaluationsForInstruction" +evaluationsForInstruction);
			int max = Collections.max(evaluationsForInstruction);
//			System.out.println("max" + max);
			evaluations.add(max);
		}
		return evaluations;

	}
}
