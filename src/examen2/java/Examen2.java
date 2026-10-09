package examen2.java;

import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe tu nombre completo:");
		String frase= sc.nextLine();
		
		System.out.println("Caracteres totales");
		char caracter = sc.next().charAt(0);
		
		if(frase.charAt(0)==caracter) {
			System.out.println("Primera letra");
		}
		
		
		sc.close();
		
		
		

	}

}
