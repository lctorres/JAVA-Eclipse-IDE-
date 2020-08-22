package SumPromCant;

import java.util.*;

public class SumPromCant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList numeros = new ArrayList();
		
		for (int i = 1; i < 101; i++) {
			numeros.add(i);
		}
		escribir(numeros.toString());
		
		//Sumar todos los numeros del ArrayList
		int sumatoria = 0;
		for (Object num : numeros) {
			sumatoria += (int)num;
		}
		escribir("La sumatoria es:" + sumatoria);
		
		//Determinamos promedio
		int promedio = sumatoria/numeros.size();
		
		//Determinamos multiplos de 3
		int cantidadDeMultiplos = 0;
		for (Object numero : numeros) {
			if (((int)numero)%3 == 0) {
				cantidadDeMultiplos++;
			}
		}
		escribir("La cantidad de Multiplos de 3 es " + cantidadDeMultiplos);
	}
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
