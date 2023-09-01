package controle;

public class DesafioFor {

    public static void main(String[] args) {

        /*String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }*/

        // Desafio
        // Não pode usar valor numérico para controlar o laço!

        /*String fim = "######";
        String valor = "#";
        while (!valor.equalsIgnoreCase(fim)) {
            System.out.println(valor);
            valor += "#";
        }*/

        String fim = "######";
        for (String valor = "#"; !valor.equalsIgnoreCase(fim); valor += "#")
            System.out.println(valor);

    }
}
