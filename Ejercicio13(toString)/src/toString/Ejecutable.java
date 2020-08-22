package toString;
import java.util.*;

/*Nos piden que gestionemos una serie de productos. Los productos tienen los siguientes atributos:
- Nombre
- Precio
Tenemos dos tipos de productos:
- Perecedero: tiene un atributo llamado días a caducar
- No perecedero: tiene un atributo llamado tipo
Crea sus constructores, getters, setters y toString.
Tendremos una función llamada calcular, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos.
- En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
- En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a caducar:
- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
- En NoPerecedero, hace lo mismo que en producto
Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5 productos de cada uno.
Crea tú mismo los elementos del array.
 * 
 */

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto[] productos = new Producto[5];
		productos[0] = new Producto("Pan", 100, true, 2);
		productos[1] = new Producto("Queso", 125, true, 3);
		productos[2] = new Producto("Jamon", 150, true, 5);
		productos[3] = new Producto("Lechuga", 80, true, 10);
		productos[4] = new Producto("Ketchup", 112, false, 0);
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i].toString() + " precio actualizado: " + 
			productos[i].calcular(5));
		}
	}

}
