package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        // true true -> TV de 50
        // true false -> TV de 32
        // true -> Sorvete
        // false false -> fica em casa com fome

        Scanner teclado = new Scanner(System.in);

        System.out.print("Trabalho de terça deu certo? [Y/n]: ");
        String pergunta1 = teclado.nextLine();

        System.out.print("Trabalho de quinta deu certo? [Y/n]: ");
        String pergunta2 = teclado.nextLine();

        teclado.close();

        boolean trabalho1 = !pergunta1.equalsIgnoreCase("n");
        boolean trabalho2 = !pergunta2.equalsIgnoreCase("n");

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean ice = trabalho1 || trabalho2;
        boolean casa = !(tv50 || tv32);

        String message = "";
        if (casa) {
            message += "Socorro estamos com fome de sorvete!";
        } else {
            if (tv50) {
                message += "Ai simm vamos comprar uma super TV de 50'!";
            } else {
                message += "Vamos comprar uma TV de 32'!";
            }

            // Completamente inútil em termos de lógica,
            // mas em prol do desafio vamos la né
            // Pronto, agora até o IDE ta xingando.
            if (ice) {
                message += " E vamos tomar sorvete!";
            }
        }

        System.out.println(message);
    }
}
