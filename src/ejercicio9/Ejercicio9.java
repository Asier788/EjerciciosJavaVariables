package ejercicio9;

		import java.util.Scanner;

		public class Ejercicio9 {

		    public static void main(String[] args) {

		        Scanner teclado = new Scanner(System.in);

		        System.out.print("Introduce una cadena de texto: ");
		        String texto = teclado.nextLine();

		        System.out.print("Introduce un carácter: ");
		        char caracter = teclado.nextLine().charAt(0);

		        if (texto.length() > 0 && texto.charAt(0) == caracter) {
		            System.out.println("La cadena comienza por el carácter '" + caracter + "'.");
		        } else {
		            System.out.println("La cadena no comienza por el carácter '" + caracter + "'.");
		        }

		        teclado.close();
		    }
		
	}
