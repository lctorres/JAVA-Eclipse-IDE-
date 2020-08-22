package Persona;
import java.util.*;

/*Haz una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: id, nombre, edad, rut, genero (H hombre, M mujer, O otro), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir alg�n atributo puedes hacerlo.
Por defecto, todos los atributos menos el id ser�n valores por defecto seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). genero ser� otro por defecto, usa constantes para ello.
Se implantaran varios constructores:
- Un constructor por defecto.
- Un constructor con el nombre, rut, edad y genero, el resto por defecto.
- Un constructor con todos los atributos como par�metro.
Los m�todos que se implementaran son:
- calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)). Si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
- esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
- comprobarGenero(char genero): comprueba que el genero introducido es correcto. Si no es correcto, ser� O. No ser� visible al exterior.
- toString(): devuelve toda la informaci�n del objeto.
- generaId(): genera un n�mero aleatorio de 8 cifras. Este m�todo ser� invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior.
- M�todos set de cada par�metro, excepto de id.
Ahora, crea una clase ejecutable que haga lo siguiente:
Crea 3 objetos de la clase anterior, el primer objeto obtendr� sus atributos pidi�ndolas por teclado, el segundo objeto los obtendr� de igual forma, menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a los atributos un valor.
Luego:
- Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
- Indicar para cada objeto si es mayor de edad.
- Por �ltimo, mostrar la informaci�n de cada objeto.
Puedes usar m�todos en la clase ejecutable, para que os sea m�s f�cil.
 * 
 */

public class Ejecucion_Persona {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String nombre = leerTexto("Ingrese un nombre:");
	int edad = leerNumero("Ingrese su edad:");
	String rut = leerTexto("Ingresa el RUT:");
	char genero = leerTexto("Ingresa el genero: (M/F/O)").charAt(0);
	float peso = leerNumero("Ingrese peso:");
	float altura = leerNumero("Ingrese la altura:");
	Persona claudia = new Persona(nombre, rut, edad, genero, peso, altura);
	
	nombre = leerTexto("Ingrese un nombre:");
	edad = leerNumero("Ingrese su edad:");
	rut = leerTexto("Ingresa el RUT:");
	genero = leerTexto("Ingresa el genero: (M/F/O)").charAt(0);
	Persona juliano = new Persona(nombre, rut, edad, genero);
	
	Persona noelia = new Persona();
	noelia.setNombre(leerTexto("Ingresa un nombre"));
	noelia.setEdad(leerNumero("Ingresa la edad"));
	noelia.setRut(leerTexto("Ingresa el RUT"));
	noelia.setGenero(leerTexto("Ingresa el genero").charAt(0));
	noelia.setAltura(leerNumero("Ingresa la altura"));
	noelia.setPeso(leerNumero("Ingresa el peso"));
	
	Persona[] perso = new Persona[3];
	perso[0] = claudia;
	perso[1] = juliano;
	perso[2] = noelia;
	
	for (Persona persona : perso) {
		if (persona.calcularIMC()==Persona.PESO_BAJO) {
			escribir("Pongale sus buenas cazuelas");
		}else {
			if (persona.calcularIMC()==Persona.PESO_IDEAL) {
				escribir("Estamos tiki taka");
			}else {
				escribir("Menos coffe break!");
			}
		}
		//Mayor de edad
		escribir("La persona " + persona.getNombre() + " es mayor de edad? " + persona.esMayorDeEdad());
		//Mostrar el toString()
		escribir(persona.toString());
	  }
	}
		
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
		
	public static int leerNumero(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	public static String leerTexto(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}

}
