package Ejemplo_Cuenta_Ahorro;
import java.util.*;

public class Cajero {

	private Cuentas[] cuentas;
	
	public Cajero() {
		cuentas = new Cuentas[3];
		cuentas[0] = new Cuentas("Segismundo", "1-1", 2543988);
		cuentas[1] = new Cuentas("Filomena", "2-2", 987423);
		cuentas[2] = new Cuentas("Rodolfo", "3-3", 1500);
	}
	
	private Cuentas buscar(String rut) {
		Cuentas cuentaEncontrada = new Cuentas();
		
		for (Cuentas cuentas2 : cuentas) {
			if(cuentas2.getRut()==rut) {
				cuentaEncontrada = cuentas2;
			}
		}
		return cuentaEncontrada;
	}
	
	public void abono(String rut, double monto) {
		Cuentas cta = buscar(rut);
		cta.ingresar(monto);
	}
	
	public void cargo(String rut, double monto) {
		Cuentas cta = buscar(rut);
		cta.retirar(monto);
	}
	
	public String toString(String rut) {
		Cuentas cta = buscar(rut);
		return cta.toString();
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//}

}
