package cl.awakelab;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
		this.nombre = "Sin definir";
		this.apellido = "Sin definir";
		this.edad = -1;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void caminar() {
		System.out.println("Estoy caminando!!");
	}
	public void dormir() {
		System.out.println("Estoy durmiendo #$%!!");
	}
}
