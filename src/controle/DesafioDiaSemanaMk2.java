package controle;

import java.util.HashMap;
import java.util.Scanner;

public class DesafioDiaSemanaMk2 {

    public static void main(String[] args) {

        // Domingo -> 1
        // Segunda -> 2
        // ...

        HashMap<String, Integer> semana = new HashMap<>();
        semana.put("domingo", 1);
        semana.put("segunda", 2);
        semana.put("terça", 3);
        semana.put("quarta", 4);
        semana.put("quinta", 5);
        semana.put("sexta", 6);
        semana.put("sábado", 7);

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaSemana = teclado.nextLine().toLowerCase();
        teclado.close();

        System.out.printf("O número do dia é %s", semana.get(diaSemana));
    }
}
