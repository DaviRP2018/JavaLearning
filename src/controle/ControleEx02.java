package controle;

import java.util.Scanner;

public class ControleEx02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();
        teclado.close();

        int mod = ano % 4;

        if (mod == 0) System.out.println("O ano é bissexto");
        else System.out.println("Não é bissexto");
    }
}
