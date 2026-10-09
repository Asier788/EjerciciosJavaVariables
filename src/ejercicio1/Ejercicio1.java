package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    int numero = teclado.nextInt();

    int num = 10;

    num = num + 77;
    System.out.println("Después de incrementar en 77: " + num);

    num = num - 3;
    System.out.println("Después de decrementar en 3: " + num);

    num = num * 2;
    System.out.println("Después de duplicar su valor: " + num);

    teclado.close();
}

}

