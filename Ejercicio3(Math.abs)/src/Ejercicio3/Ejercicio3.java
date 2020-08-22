package Ejercicio3;

import java.util.Scanner;
import java.math.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero (Entero positivo): ");
		int n = entrada.nextInt();
		
		n = Math.abs(n);
		int contador=0;
		
		//if (n>0) {
			//int contador=0;
			do {
				//if (n/10>1) {
					contador++;
				//}
				//n=n/10;
					n=Math.round(n/10);
				} while (n>=1);
			
		System.out.println("El numero tiene: " + contador + " cifras");
	}
		}

