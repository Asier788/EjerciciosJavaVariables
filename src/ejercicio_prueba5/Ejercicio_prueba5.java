package ejercicio_prueba5;

import java.util.Scanner;

public class Ejercicio_prueba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce la ciudad");
		
		String ciudad = input.nextLine();
		
		System.out.println("vives en " + ciudad);
		
		input.close();
	}

}
