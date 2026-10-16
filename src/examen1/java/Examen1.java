package examen1.java;

import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos :");
		
		int total = input.nextInt();
		
		if (total <0) {
			
			System.out.println("La cantidad no puede ser negtiva");
		}else {
			int horas = total /3600;
			int minutos =(total % 3600) /60 ;
			int segundos =total %60;
			System.out.println(total + " segundos son : "+ horas + " horas " + minutos + " minutos y " + segundos + " segundos ");
		}
		
		
		
		
		

	}

}
