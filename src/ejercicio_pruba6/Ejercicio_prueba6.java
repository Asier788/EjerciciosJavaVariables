package ejercicio_pruba6;

import java.util.Scanner;

public class Ejercicio_prueba6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int num1 = input.nextInt();
		
		System.out.println("introduce un segundo numero");
		int num2 = input.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("La suma es : " + suma);
		
		System.out.println("La resta es : " + (num1 - num2));
		
		System.out.println("La multiplicacion es :" + (num1*num2));
		
		if(num2 != 0); {
			
		System.out.println("la division es :" + (num1/num2));
		
		}else {
			System.out.println("no se puede dividir entre 0");
		}
		
		input.close();

	}

}
