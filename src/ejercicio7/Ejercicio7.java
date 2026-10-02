package ejercicio7;


		import java.util.Scanner;

		public class Ejercicio7 {

		    public static void main(String[] args) {

		        Scanner teclado = new Scanner(System.in);

		        System.out.print("Introduce una frase: ");
		        String texto = teclado.nextLine();

		        String textoSinEspacios = texto.replace(" ", "");

		        System.out.println("Texto sin espacios: " + textoSinEspacios);

		        teclado.close();
		    }

	}

