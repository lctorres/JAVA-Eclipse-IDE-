package Password;

/*Haz una clase llamada Password que siga las siguientes condiciones:
 * - Que tenga los atributos longitud y contraseña.
 * Por defecto, la longitud sera de 8.
 * - Los constructores seran los siguientes:
 * )Un constructor por defecto.
 * )Un constructor con la longitud que nosotros le pasemos.
 * Generara una contraseña aleatoria con esa longitud.
 * - Los metodos que implemena seran:
 * esFerte(): devulve un booleano si es fuerte o no, para que sea fuerte debe tener al menos 2 mayusculas,
 *al menos 1 minuscula y al menos 5 numeros.
 *generarPassword(): genera la contraseña del objeto con la longitud que tenga.
 *
 * - Metodo get para contraseña y longitud.
 * - Metodo set para longitud.
 * 
 * Crear una clase ejecutable...
 */

public class Password {

	private int longitud;
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	private String contrasena;
	
	public Password() {
		this.longitud = 8;
		generaPassword();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		generaPassword();
	}
	
	public boolean esFuerte() {
		boolean valida = false;
		int cuentaMayusculas = 0;
		int cuentaMinusculas = 0;
		int cuentaNumeros = 0;
		int aux;
		for (int i = 0; i < contrasena.length(); i++) {
			aux = (int)contrasena.charAt(i);
			if (aux >= 65 && aux <= 90) {
				cuentaMayusculas++;
			}
			if (aux >= 97 && aux <= 122) {
				cuentaMinusculas++;
			}
			if (aux >= 48 && aux <= 57) {
				cuentaNumeros++;
			}
		}
		if (cuentaMayusculas>=2 && cuentaMinusculas>=1 && cuentaNumeros>=5) {
			valida = true;
		}
		return valida;
	}
	
	public void generaPassword() {
		String claveTransitoria = "";
		for (int i = 0; i < this.longitud; i++) {
			claveTransitoria += (char)((int)(Math.random()*74)+48);
		}
		this.contrasena = claveTransitoria;
	}
}
