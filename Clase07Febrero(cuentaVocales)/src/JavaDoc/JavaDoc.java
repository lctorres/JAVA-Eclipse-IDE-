package JavaDoc;
import java.util.*;
public class JavaDoc {

	/*Dada una cadena. Ej: "Talento Digital", mostrar por pantalla la cantidad
	 * de vocales que tiene.
	 * 
	 * Ejemplo:
	 * Entrada: "Talento digital"
	 * Salida: La cantidad de vocales es 6. 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String fraseRomanticaDelDia = leeString("Ingresa tu frase romantica:");
	escribir("Existen" + cantidadDeVocales(fraseRomantica)+ "vocales", true);
	}
	
	public static int cantidadDeVocales(String cadena) {
		
		int cuentaVocales = 0;
		cadena = cadena.toLowerCase();
		String vocales = "aeiou";
		for (int i = 0; i < cadena.length; i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (cadena.charAt(i) == vocales.charAt(j)) {
					cuentaVocales++;
				}
			}
		}
		return cuentaVocales;	
					
		}
	
	public static String leeNumero(String mensaje) {
		escribir(mensaje, true);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
