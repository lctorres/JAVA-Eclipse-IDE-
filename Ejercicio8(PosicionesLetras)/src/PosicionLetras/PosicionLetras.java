package PosicionLetras;

import java.util.*;

import java.util.Scanner;

/*Crea un array que contenga de la 'A' a la 'Z' (Solo las mayusculas).
 * Despues, ve pidiendo posiciones del array por teclado y si la posicion
 * es correcta, se añadira a una cadena que se mostrara al final, se dejara
 * de insertar cuando se introduzca un -1.
 * 
 * Por ejemplo, si escribo los siguientes numeros
 * 0 //Añadira la 'A'
 * 5 //Añadira la 'F'
 * 25 //Añadira la 'Z'
 * 50 //Error, iserte otro numero -1//fin
 * 
 * Cadena resultante: AFZ
 */

public class PosicionLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList abecedario = llenaABC();
		escribir(abecedario.toString());	
		String cadena = "";
		
		int posicion;
		do {
			posicion = leeNumero("Ingrese una posicion del arreglo:");
			if (posicion < abecedario.size()&&posicion>-1) {
				cadena += abecedario.get(posicion).toString();
			}else {
				if (posicion > -1) {
				escribir("Debe ingresar una posicion valida: ");
				}
			}
		} while (posicion != -1);
		escribir(cadena);		
	}

	public static ArrayList llenaABC() {
		ArrayList abc = new ArrayList();
		for (int i = 65; i < 91; i++) {
			abc.add((char)i);
		}
		return abc;
	}
	
	public static String leeTexto(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
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
