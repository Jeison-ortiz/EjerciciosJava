package ExerciseConversorOfHours12To24Hours;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;

public class ConversorHours12To24Hours{
	
    public static void main(String[] args) throws IOException {
        String result = timeConversion("01:45:45Pm");
        System.out.println(result);

    }

		public static String timeConversion(String s) {
			String cadena = s.toLowerCase();
			int hours = Integer.parseInt(cadena.substring(0, 2));
			if (cadena.endsWith("pm")) {
				cadena = cadena.substring(0, cadena.length() - 2);
				if (hours != 12) {
					hours = hours + 12;
				}
				String newHora = Integer.toString(hours) + cadena.substring(2, cadena.length());
				return newHora;
			} else if (cadena.endsWith("am") && hours == 12) {
				return "00" + cadena.substring(2, cadena.length() - 2);
			}
			return cadena.substring(0, cadena.length() - 2);
		}
	
}
