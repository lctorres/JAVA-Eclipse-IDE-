package PositivoNegativoCero;

import java.util.*;

public class PositivoNegativoCero {

	/*Programa Java que guarda en una coleccion(Array) 10 numeros
	 * enteros que se leen por teclado. A continuacion se recorre el array
	 * y calcula:
	 * Cuantos numeros son positivos
	 * Cuantos numeros son negativos
	 * Cuantos numeros son ceros
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList numeros = new ArrayList();
		
			
		for (int i = 0; i < 10; i++) {
			numeros.add(leeNumero("Ingresa un numero"));
		}
		escribir(numeros.toString());
		
		int cuentaPositivo=0;
		int cuentaNegativo=0;
		int cuentaCero=0;
		
		for (Object numero : numeros) {
			if ((int) numero>0) {
				cuentaPositivo++;
			} else {
				if ((int) numero<0) {
				cuentaNegativo++;
			}else {
				cuentaCero++;
			}
		}
	}
		escribir("Los numeros positivos son: "+ cuentaPositivo);
		escribir("Los numeros negativos son: "+ cuentaNegativo);
		escribir("Los numeros cero son: "+ cuentaCero);
		}
		
		public static int leeNumero(String mensaje) {
			escribir(mensaje);
			Scanner entrada = new Scanner(System.in);
			return entrada.nextInt();
		}
		
		public static void escribir(String mensaje) {
			System.out.println(mensaje);
		}
}
