package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        String entrada1 = teclado.nextLine();
        double num1 = Double.parseDouble(entrada1);

        System.out.print("Escreva outro número: ");
        String entrada2 = teclado.nextLine();
        double num2 = Double.parseDouble(entrada2);

        System.out.print("Escolha um operador: [+ - * / %]: ");
        String operador = teclado.nextLine();
        teclado.close();

        var resultado =
            operador.equals("+") ?
                num1 + num2 : operador.equals("-") ?
                    num1 - num2 : operador.equals("*") ?
                        num1 * num2 : operador.equals("/") ?
                            num1 / num2 : operador.equals("%") ?
                                num1 % num2 : "vai cagar";

        System.out.println("Tá aqui o que você quer:");
        System.out.printf("%s %s %s = %s", num1, operador, num2, resultado);
    }
}
