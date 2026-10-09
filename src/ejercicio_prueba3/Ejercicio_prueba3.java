package ejercicio_prueba3;

import java.util.Scanner;

public class Ejercicio_prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("como te llamas?");
		
		String nombre = input.nextLine();
		
		System.out.println("hola"+ nombre);
		
		System.out.println("introduce otro nombre");
		nombre = input.nextLine();
		
		System.out.println("hola" + nombre);
		
		input.close();
		

	}

}
