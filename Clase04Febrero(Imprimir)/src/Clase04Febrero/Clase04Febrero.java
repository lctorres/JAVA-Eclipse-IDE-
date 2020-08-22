package Clase04Febrero;
import java.util.*;

public class Clase04Febrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList numeros = new ArrayList();
		
		numeros.add(8);
		numeros.add(3);
		numeros.add(5);
		
		escribir(numeros.toString());
		
		escribir(numeros.get(2).toString());
		numeros.set(1,68);
		escribir(numeros.toString());
	}
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
  }
}

	
