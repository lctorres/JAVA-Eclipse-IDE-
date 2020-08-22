package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero:");
		n1 = entrada.nextInt();
		
		if (n1%2==0){
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
	}

}
