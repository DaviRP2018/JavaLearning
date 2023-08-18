package fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        List<Integer> notas = List.of(50, 20, 10, 5, 1);

        ArrayList<Integer> listaMutavel = new ArrayList<>(Arrays.asList(1, 5, 10, 20, 50));
        listaMutavel.add(100);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digita ai: ");
        String entrada = teclado.nextLine();
        teclado.close();

        int valor = Integer.parseInt(entrada);
        int contagem = 0;
        StringBuilder mensagem = new StringBuilder();

        for (int nota : notas) {
            while (valor >= nota) {
                contagem++;
                valor -= nota;
            }
            mensagem.append(String.format("\nNota de %d: %d", nota, contagem));
            contagem = 0;
        }
        System.out.println(mensagem);
    }
}
