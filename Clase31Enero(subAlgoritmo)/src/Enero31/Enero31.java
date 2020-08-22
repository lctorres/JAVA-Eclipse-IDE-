package Enero31;

import java.util.*;

public class Enero31 {

	public static long calcularTotalNeto(float[][] caja) {
		long total = 0;
		for(int i = 0; i < caja.length; i++) {
			total += caja[i][2];
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad = leerNumero("Cuantos productos desea comprar: ");
		//escribir("Elegiste comprar estos productos: " + cantidad);
	
		String[] productos = new String[cantidad];
		
		float [][] caja = new float[cantidad][3];
		
		for (int i = 0; i < productos.length; i++) {
			productos[i] = leerCadena("Ingresa el nombre del producto");
			caja[i][0] = leerNumero("Ingrese precio unitario: ");
			caja[i][1] = leerNumero("Ingresa la cantidad: ");
			caja[i][2] = caja[i][0] * caja[i][1];
		}
		
		muestraCanasta(productos, caja);
		
		float totalNeto = calcularTotalNeto(caja);
		escribir("Total Neto: " + totalNeto);
		float iva = totalNeto * (float)0.19;
		escribir("IVA: " + iva);
		escribir("Total a Pagar: " + (totalNeto+iva));
	}
	
	public static float calcularTotalNeto(long[][] caja) {
		
		long total = 0;
		for(int i = 0; i <caja.length; i++) {
			total+=caja[i][2];
		}
		return total;
	}
	
	public static void muestraCanasta(String[] productos, float[][] caja) {
		for (int i = 0; i < productos.length; i++) {
			escribir(" - " + productos[i] + ": $" + caja[i][0] + " * " + caja[i][1] + " = $" + caja[i][2]);
		}	
	}
	
	public static String leerCadena(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.next();
	}
	
	/* subAlgoritmo retorno <- leerNumero(mensaje);
	 * Definir retorno Como Entero;
	 * FinSubAlgoritmo
	 */
	
	public static int leerNumero(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
		
		/*subAlgoritmo Escribir(Mensaje)
		 * FinSubAlgoritmo
		 */
		public static void escribir(String mensaje) {
			System.out.println(mensaje);
		}
	}

