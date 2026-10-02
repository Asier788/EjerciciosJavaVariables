package ejercicio6;

		import java.util.Scanner;

		public class Ejercicio6 {

		    public static void main(String[] args) {

		        Scanner teclado = new Scanner(System.in);

		        System.out.print("Introduce el día de nacimiento: ");
		        int dia = teclado.nextInt();

		        teclado.nextLine();

		        System.out.print("Introduce el mes de nacimiento: ");
		        String mes = teclado.nextLine();

		        System.out.print("Introduce el año de nacimiento: ");
		        int anio = teclado.nextInt();

		        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);

		        teclado.close();
		    }

	}
