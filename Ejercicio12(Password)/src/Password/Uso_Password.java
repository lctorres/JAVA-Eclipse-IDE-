package Password;
import java.util.*;

/*Ahora, crea una clase ejecutable:
 * - Crea un array de Passwords con el tama�o que tu le indiques por teclado.
 * - Crea un bucle que cree un objeto para cada posicion del array.
 * - Indica tambien por teclado la longitud de los Passwords (Antes de bucle).
 * - Crea otro array de booleanos donde se almacene si el Password del array de
 * Password es o no fuerte (Usa el bucle anterior.)
 * - Al final, muestra la contrase�a y si es o no fuerte (Usa el bucle anterior)
 * Usa este simple formato:
 * 
 * contrase�a1 valor_booleano1
 * contrase�a2 valor_booleano2
 * 
 */

public class Uso_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Password p = new Password();
		//p.getContrasena();
		//System.out.println(p.getContrasena());
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese cantidad de contrase�a:");
		int cantidadPassword = entrada.nextInt();
		System.out.println("Ingrese largo de contrase�a:");
		int largoPassword = entrada.nextInt();
		
		Password[] claves = new Password[cantidadPassword];
		
		for (int i = 0; i < claves.length; i++) {
			claves[i] = new Password(largoPassword);
			System.out.println(claves[i].getContrasena() + " " + claves[i].esFuerte());
		}
	}

}
