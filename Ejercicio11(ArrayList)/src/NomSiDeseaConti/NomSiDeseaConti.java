package NomSiDeseaConti;

import java.util.*;

public class NomSiDeseaConti {

	/*Elabore un algoritmo que, utilizando ArrayList, registre una lista de nombres
	 * ingresadas por el usuario. Debe preguntar, cada vez que registre un nombre, si desea continuar.
	 * 
	 * Una vez que finalice, ordene por abecedario y muestre por pantalla la lista final.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList nombres = new ArrayList();
		
		boolean seguir;
		
		do {
			nombres.add(leeTexto("Ingresa un nombre:"));
			if (leeTexto("Deseas Continuar? (s/n)").equals("s")) {
				seguir = true;
			}else {
				seguir = false;
			}
		} while (seguir);
		escribir(nombres.toString());
		
		//Ordenamos el ArrayList
		nombres.sort(null);
		escribir(nombres.toString());
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
