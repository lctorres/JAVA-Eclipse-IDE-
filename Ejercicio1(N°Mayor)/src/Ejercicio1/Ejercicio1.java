package Ejercicio1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero:");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		
		int mayor;		
		if (n1>n2 && n1>n3){
			mayor=n1;
		}
		if (n2>n1 && n2>n1) {
			mayor=n2;
		}
		else {
			mayor=n3;
		}
		System.out.println("El numero mayor es: " +mayor);
	}

}
