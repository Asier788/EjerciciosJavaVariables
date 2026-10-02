package ejercicio2;

		public class Ejercicio2 {

		    public static void main(String[] args) {

		        int variableA = 10;
		        int variableB = 20;
		        int variableC = 30;
		        int variableD = 40;

		        System.out.println("Valores iniciales:");
		        System.out.println("A = " + variableA);
		        System.out.println("B = " + variableB);
		        System.out.println("C = " + variableC);
		        System.out.println("D = " + variableD);

		        int auxiliar = variableA;

		        variableA = variableB;
		        variableB = variableC;
		        variableC = variableD;
		        variableD = auxiliar;

		        System.out.println("Valores después de las asignaciones:");
		        System.out.println("A = " + variableA);
		        System.out.println("B = " + variableB);
		        System.out.println("C = " + variableC);
		        System.out.println("D = " + variableD);

	}

}
