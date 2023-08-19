package fundamentos;

import java.util.Scanner;

public class QuaCu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número tio: ");
        double num = teclado.nextDouble();
        teclado.close();

        double quad = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.printf("O quadrado é: %.1f", quad);
        System.out.printf("\nO cubo é: %.1f", cubo);
    }
}
