package ejercicio8;

		import java.util.Scanner;

		public class Ejercicio8 {

		    public static void main(String[] args) {

		        Scanner teclado = new Scanner(System.in);

		        System.out.print("Introduce un número entero de 5 cifras: ");
		        int numero = teclado.nextInt();

		        // Parte 1: utilizando división de enteros
		        System.out.println("Cifras utilizando división de enteros:");

		        int cifra1 = numero / 10000;
		        int cifra2 = (numero / 1000) % 10;
		        int cifra3 = (numero / 100) % 10;
		        int cifra4 = (numero / 10) % 10;
		        int cifra5 = numero % 10;

		        System.out.println(cifra1);
		        System.out.println(cifra2);
		        System.out.println(cifra3);
		        System.out.println(cifra4);
		        System.out.println(cifra5);

		        // Parte 2: utilizando String
		        System.out.println("Cifras utilizando String:");

		        String numeroString = String.valueOf(numero);

		        for (int i = 0; i < numeroString.length(); i++) {
		            System.out.println(numeroString.charAt(i));
		        }

		        teclado.close();
		    }

	}

