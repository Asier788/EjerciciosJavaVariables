package ejercicio_prueba4;

import java.util.Scanner;

public class Ejercicio_prueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		
		int num= input.nextInt();
		
		System.out.println("El triple de " + num + "es" + (num*3));
		
		input.close();
		

	}

}
