package NumeroAleatorios;

import java.util.*;
import java.math.*;

/* Estructure un Array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con numero aleatorios entre 0 y 9, al final muestra por
pantalla el valor de cada posicion y la suma de todos los valores, Haz un metodo
para rellenar el array (que tenga como parametros los numeros entre los que tenga
que generar), para mostrar el contenido y la suma del array y un metodo privado para
generar números aleatorio(lo puedes usar para otros ejercicios)
 */

public class NumeroAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad = leerNumero("Cuantos numeros quieres generar");
		int[] arreglo = generaNumeros(cantidad, 0, 9);
		muestraArreglo(arreglo);
		escribir("La suma de los numeros es: " + sumarArreglo(arreglo), true);
	}
	//Muestra contenido del arreglo.
	public static void muestraArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			escribir("[" + arreglo[i] + "]", false);
		}
	}
	public static int sumarArreglo(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return suma;
	}
	
	//Genera un arreglo con numero aleatorios.
	public static int[] generaNumeros(int dimension, int desde, int hasta) {
		int[] arreglo = new int[dimension];
		
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = generaAleatorio(desde, hasta);
		}
		return arreglo;
	}
	//Genera un numero aleatorio.
	public static int generaAleatorio(int desde, int hasta) {
		return (int)(Math.random() * hasta + desde);
	}
		
	public static int leerNumero(String mensaje) {
		escribir(mensaje, true);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static void escribir(String mensaje, boolean saltoLinea) {
		if (saltoLinea) {
			System.out.println(mensaje);
		}else {
			System.out.print(mensaje);
		}
	}
}
