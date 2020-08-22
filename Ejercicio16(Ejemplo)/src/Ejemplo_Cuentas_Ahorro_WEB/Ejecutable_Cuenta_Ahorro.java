package Ejemplo_Cuentas_Ahorro_WEB;
import java.util.*;

import Ejemplo_Cuenta_Ahorro.*;

public class Ejecutable_Cuenta_Ahorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cajero caj = new Cajero();
		System.out.println(caj.toString("1-1"));
		caj.abono("1-1", 10000);
		System.out.println(caj.toString("1-1"));
	}

}
