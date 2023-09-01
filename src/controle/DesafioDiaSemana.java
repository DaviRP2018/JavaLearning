package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        // Domingo -> 1
        // Segunda -> 2
        // ...

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaSemana = teclado.nextLine().toLowerCase();
        teclado.close();

        int diaNumero;
        if (diaSemana.contains("domingo"))
            diaNumero = 1;
        else if (diaSemana.contains("segunda"))
            diaNumero = 2;
        else if (diaSemana.contains("terça"))
            diaNumero = 3;
        else if (diaSemana.contains("quarta"))
            diaNumero = 4;
        else if (diaSemana.contains("quinta"))
            diaNumero = 5;
        else if (diaSemana.contains("sexta"))
            diaNumero = 6;
        else
            diaNumero = 7;

        System.out.printf("O número do dia é %s", diaNumero);
    }
}
