package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro salário");
        String valor1 = teclado.nextLine().replace(",", ".");

        System.out.println("Digite o segundo salário");
        String valor2 = teclado.nextLine().replace(",", ".");

        System.out.println("Digite o terceiro salário");
        String valor3 = teclado.nextLine().replace(",", ".");

        teclado.close();

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        Double[] array_salarios = {salario1, salario2, salario3};

        double soma = salario1 + salario2 + salario3;

        System.out.printf("Soma é: R$%.2f\n", soma);
        System.out.printf("Média é: R$%.2f\n", soma / array_salarios.length);
    }
}
