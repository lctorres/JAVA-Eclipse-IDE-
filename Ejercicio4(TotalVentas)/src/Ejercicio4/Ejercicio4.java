package Ejercicio4;

import java.util.Scanner;
import java.math.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero de ventas: ");
		int cantidad = entrada.nextInt();
		
		int ventas=0;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese valor de las ventas: ");
			ventas += entrada.nextInt();
		}
		entrada.close();
		System.out.println("La venta total es: " +ventas);
	}
}
