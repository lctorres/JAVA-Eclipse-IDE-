package CuentaBanco;
import java.util.*;

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
 * titular y cantidad (puede tener decimales).
-El titular será obligatorio y la cantidad es opscional. 
Crea dos constructoresque cumpla lo anterior.
- Crea sus métodos get, set y to String.

Tenddrá dos métodos especiales:
-ingresar (double cantidad): se ingresa una cantidad a la cuenta, 
si la cantidad introducida es negativa, no se hará nada.
- Retirar (double cantidad): se retira una cantidad a la cuenta, 
si restando la cantidad actual a la que nos pasan es negativa, la cantidad 
de la cuenta  pasa a ser 0.

Crear una clase ejecutable que valide el funcionamiento correcto de los 
métodos, constructores, get y sets.
 * 
 */

public class Ejecutable_Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta("Brian");
		System.out.println(c1.toString());
		
		Cuenta c2 = new Cuenta("Carolina", 1000);
		System.out.println(c2.toString());
		
		c1.ingresar(1200);
		System.out.println(c1.toString());
		
		c2.retirar(800);
		System.out.println(c2.toString());
		
		c1.ingresar(-1000);
		System.out.println(c1.toString());
		
		c2.retirar(500);
		System.out.println(c2.toString());
	}

}
