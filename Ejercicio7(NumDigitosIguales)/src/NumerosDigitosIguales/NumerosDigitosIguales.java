package NumerosDigitosIguales;

import java.util.*;
import java.math.*;

/*Desarrolle un array de números de un tamaño pasado por teclado, el Array contendrá
 * números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un dígito
 * que nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
 * estos deben guardarse en un nuevo Array.
Por ejemplo: En un array de 10 posiciones e indicamos mostrar los números acabados en 5, 
podría salir 155, 25, etc.
*/

public class NumerosDigitosIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int largo = leerNumero("Ingresa el largo del arreglo:");
		
		int[] arreglo = llenarArreglo(largo, 1, 299);
		escribir("Arreglo Original", true);
		muestraArreglo(arreglo);
		int buscado = leerNumero("Ingresa el digito que buscaras:");
		int[] ocurrencias = buscarPorUltimoDigito(arreglo, buscado);
		escribir("Arreglo Ocurrencias", true);
		muestraArreglo(ocurrencias);
	}
	public static int[] buscarPorUltimoDigito(int[] original, int buscado) {
		int cantidadOcurrencias = 0;
		
		for (int i : original) {
			if (i%10==buscado) {
				cantidadOcurrencias++;
			}
		}
		int aux = 0;
		int[] nuevo = new int[cantidadOcurrencias];
		for (int i : original) {
			if (i%10==buscado) {
				nuevo[aux] = i;
				aux++;
			}
		}
		return nuevo;
	}
	
	public static void muestraArreglo(int[] arreglo) {
		for(int i : arreglo) {
			escribir("[" + i + "]", false);
		}
		escribir("", true);
	}
	
	public static int[] llenarArreglo(int largo, int desde, int hasta) {
		int[] arreglo = new int[largo];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = numeroAleatorio(desde, hasta);
		}
		//for (int i : arreglo) {
		//	i = numeroAleatorio(desde, hasta);
		return arreglo;
	}
	
	public static int numeroAleatorio(int desde, int hasta) {
		return (int)(Math.random()*hasta + desde);
	}
	
	public static int leerNumero(String mensaje) {
		escribir(mensaje, true);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static void escribir(String mensaje, boolean salto){
		if (salto) {
			System.out.println(mensaje);
		}else {
			System.out.print(mensaje);
		}
	}
}
