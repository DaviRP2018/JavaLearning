package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Boa tarde!");

        System.out.println("Boa noite!");


        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f\n", 1234.5678);
        System.out.printf("Wat?%n");
        System.out.printf("Waat?%n");


        // input
        Scanner input = new Scanner(System.in);

        System.out.println("vai, escreve ai: ");
        String escrita = input.nextLine();

        System.out.println("Escreve mais: ");
        String mais = input.nextLine();

        System.out.println("Escreve um numero: ");
        // int numero = Integer.parseInt(input.nextLine());
        int numero = input.nextInt();

        System.out.printf("Vc escreveu '%s' e '%s' e '%d'%n", escrita, mais, numero);

        input.close();
    }
}
