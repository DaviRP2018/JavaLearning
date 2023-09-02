package controle;

import java.util.Scanner;

public class ControleEx01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        teclado.close();

        if ((0 < num && num < 10) && num % 2 == 0) System.out.println("É par e está entre 0 e 10");
    }
}
