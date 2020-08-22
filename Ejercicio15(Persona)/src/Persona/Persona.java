package Persona;

public class Persona {
	
	private long id;
	private String nombre;
	private int edad;
	private String rut;
	private char genero;
	private float peso;
	private float altura;
	
	public static final char MASCULINO = 'M';
	public static final char FEMENINO = 'F';
	public static final char OTRO = 'O';
	
	public static final byte PESO_BAJO = -1;
	public static final byte PESO_IDEAL = 0;
	public static final byte PESO_ALTO = 1;
	
	public Persona() {
		generaId();
		this.nombre = "";
		this.edad = 0;
		this.rut = "";
		this.genero = OTRO;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, String rut, int edad, char genero) {
		this();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		comprobarGenero(genero);
		//this.genero = genero;
	}
	
	public Persona(String nombre, String rut, int edad, char genero, float peso, float altura) {
		this(nombre, rut, edad, genero);
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		float imc = this.peso/(this.altura*this.altura);
		if(imc<20) {
			return PESO_BAJO;
		}else {
		if(imc>=20 && imc<=25) {
			return PESO_IDEAL;
		}else {
			return PESO_ALTO;
			}
		  }
	}
	
	public boolean esMayorDeEdad() {
        if (this.edad > 18) {
            return true;
        }else {
            return false;
        }
    }
	
	public void comprobarGenero(char genero) {
		if(genero != MASCULINO && genero != FEMENINO && genero != OTRO) {
			this.genero = OTRO;
		}else {
			this.genero = genero;			
		}
	}
	
	private void generaId() {
		this.id = (long)(Math.random()*89999999+10000000);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Persona [id= " + id + ", nombre= " + nombre + ", edad= " + edad + ", rut= " + rut + ", genero= " + genero
				+ ", peso= " + peso + ", altura= " + altura + ", esMayorDeEdad()= " + esMayorDeEdad() + "]";
	}
	
}
