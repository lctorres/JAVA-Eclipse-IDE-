package Enero30;

import java.util.*;

public class Enero30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hola Mundo");

int edad;

Scanner entrada = new Scanner(System.in);

System.out.println("Ingresa tu edad:");
edad = entrada.nextInt();

System.out.println("Tu edad es de "+ edad);

/*Si edad>65 Entonces
 * Escribir "Que tak tus años dorados";
 * SiNo
 * Escribir "Aguante!!!";
 * FinSi
 */
if (edad > 65){
System.out.println("Que tal tus años dorados...");
}
else {
	System.out.println("Aguante!!!");
}
entrada.close();
	}

}