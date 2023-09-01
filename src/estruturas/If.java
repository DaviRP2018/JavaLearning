package estruturas;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = teclado.nextDouble();
        teclado.close();

        if (10 >= media && media >= 7) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        if (7 > media && media >= 4.5)
            System.out.println("Recuperação");

        boolean criterioReprovacaoAtingido = 4.5 > media && media >= 0;
        if (criterioReprovacaoAtingido)
            System.out.println("Reprovado");
    }
}
