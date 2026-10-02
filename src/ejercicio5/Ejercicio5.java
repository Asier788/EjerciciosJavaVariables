package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área de la circunferencia: " + area);

        teclado.close();
    }
}


