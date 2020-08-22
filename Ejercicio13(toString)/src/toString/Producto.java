package toString;

public class Producto {
	
	private String nombre;
	private float precio;
	private boolean perecedero;
	private int diasACaducar;
	
	public Producto() {
	}
	
	public Producto(String nombre, int precio, boolean perecedero, int diasACaducar) {
		this.nombre = nombre;
		this.precio = precio;
		this.perecedero = perecedero;
		this.diasACaducar = diasACaducar;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", perecedero=" + perecedero + ", diasACaducar="
				+ diasACaducar + "]";
	}

	public float calcular(int cantidad) {
		float calculo = 0;
		if (!this.perecedero) { //Si no es perecedero
			calculo = this.precio*cantidad;
		}else { //Es perecedero
			if (this.diasACaducar<=1) { //Si caduca en 1 dia o menos
				calculo = (this.precio*cantidad)/4; 
			}else {
				if (this.diasACaducar<=2) { //Si caduca en 2 dias o menos
					calculo = (this.precio*cantidad)/3;
				}else {
					if (this.diasACaducar<=3) { //Si caduca en 3 dias o menos
						calculo = (this.precio*cantidad)/2;
					}else {
						calculo = (this.precio*cantidad); //Si caduca despues de 3 dias
					}
				}
			}
		}
		return calculo;
	}
}
