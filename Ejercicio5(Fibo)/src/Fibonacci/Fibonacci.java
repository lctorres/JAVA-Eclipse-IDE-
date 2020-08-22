package Fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int serie=5;
		int num1=0;
		int num2=1;
		int suma=1;
		
		System.out.println(num1);
		for(int i = 1; i < serie; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}
		
}

