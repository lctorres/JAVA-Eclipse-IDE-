package Ejemplo_Cuenta_Ahorro;

public class Cuentas {
	
	private String titular;
	private String rut;
	private double monto;
	
	public Cuentas() {	
	}
	
	public Cuentas(String titular, String rut) {
		this.titular = titular;
		this.rut = rut;
	}
	
	public Cuentas(String titular, String rut, double monto) {
		this(titular, rut);
		this.monto = monto;
	}
	
	protected void ingresar(double cantidad) {
		if(cantidad>0) {
			this.monto += cantidad;
		}
	}
	
	protected void retirar(double cantidad) {
		this.monto -= cantidad;
		if(this.monto<0) {
			this.monto = 0;
		}
	}

	protected String getTitular() {
		return titular;
	}

	protected void setTitular(String titular) {
		this.titular = titular;
	}

	protected String getRut() {
		return rut;
	}

	protected void setRut(String rut) {
		this.rut = rut;
	}

	protected double getMonto() {
		return monto;
	}

	protected void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Cuentas [titular=" + titular + ", rut=" + rut + ", monto=" + monto + "]";
	}
	
}
