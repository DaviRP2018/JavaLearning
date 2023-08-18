package fundamentos;

import java.util.List;
import java.util.Scanner;

public class CaixaEletronico3 {

    public static void main(String[] args) {

        List<Integer> notas = List.of(50, 20, 10, 5, 1);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digita ai: ");
        String entrada = teclado.nextLine();
        teclado.close();

        int valor = Integer.parseInt(entrada);
        int contagem;
        StringBuilder mensagem = new StringBuilder();

        for (int nota : notas) {
            DivMod divmoded = MathUtils.divmod(valor, nota);
            contagem = divmoded.div;
            valor = divmoded.mod;
            mensagem.append(String.format("\nNota de %d: %d", nota, contagem));
        }
        System.out.println(mensagem);
    }
}
