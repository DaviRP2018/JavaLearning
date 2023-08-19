package fundamentos;

import java.util.Scanner;

public class SegundoGrau {

    public static void main(String[] args) {

        System.out.println("Sabendo que ax²+bx+c=0");
        System.out.print("Digite valor de A: ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.print("Digite valor de B: ");
        double b = teclado.nextDouble();
        System.out.print("Digite valor de C: ");
        double c = teclado.nextDouble();
        teclado.close();

        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.printf("Delta: %.2f", delta);

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nRaíz positiva: %.2f", raiz1);
        System.out.printf("\nRaíz negativa: %.2f", raiz2);
    }
}
