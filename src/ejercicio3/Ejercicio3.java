package ejercicio3;

public class Ejercicio3 {

		    public static void main(String[] args) {

		        int variableA = 100;

		        // Comprobar si es múltiplo de 5
		        if (variableA % 5 == 0) {
		            System.out.println("A es múltiplo de 5.");
		        } else {
		            System.out.println("A no es múltiplo de 5.");
		        }

		        // Comprobar si es múltiplo de 10
		        if (variableA % 10 == 0) {
		            System.out.println("A es múltiplo de 10.");
		        } else {
		            System.out.println("A no es múltiplo de 10.");
		        }

		        // Comparar con 100
		        if (variableA > 100) {
		            System.out.println("A es mayor que 100.");
		        } else if (variableA < 100) {
		            System.out.println("A es menor que 100.");
		        } else {
		            System.out.println("A es igual a 100.");
		        }

		        // Comprobar si es positivo o cero
		        if (variableA >= 0) {
		            System.out.println("Se cumplen las condiciones.");
		        } else {
		            System.out.println("No se cumplen las condiciones.");
		        }
	}

}
