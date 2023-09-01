package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        int notasValidas = 0;
        double nota = 0;
        double somaNotas = 0;
        boolean notaValida;

        Scanner teclado = new Scanner(System.in);

        while(nota != -1) {
            System.out.print("Digite uma nota: ");
            nota = teclado.nextDouble();
            notaValida = 10 >= nota && nota >= 0;

            if (notaValida) {
                somaNotas += nota;
                notasValidas++;
            } else System.out.println("Nota inválida");
        }

        double media = somaNotas / notasValidas;
        System.out.printf("\nA soma das notas é: %.1f", somaNotas);
        System.out.printf("\nA média das notas é: %.1f", media);
        System.out.printf("\nA quantidade de notas válidas: %d", notasValidas);

        teclado.close();
    }
}
