package fundamentos;

import java.util.List;
import java.util.Scanner;

public class CalculadorIMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        float peso = teclado.nextFloat();

        System.out.print("Digite a sua altura: ");
        float altura = teclado.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é : %.2f", imc);

        teclado.nextLine();
        System.out.print("\nQuer saber se é gordão? Qual seu gênero [F/M]: ");
        String genero = teclado.nextLine();
        teclado.close();

        List<Integer> f_list = List.of(19, 24, 29, 39);
        List<Integer> m_list = List.of(20, 25, 30, 40);

        List<Integer> list = null;

        if (genero.equalsIgnoreCase("f")) list = f_list;
        else if (genero.equalsIgnoreCase("m")) list = m_list;
        else {
            System.out.println("Lixo");
            System.exit(0);
        }

        if (imc < list.get(0)) System.out.println("Abaixo do peso");
        else if (list.get(0) <= imc && imc < list.get(1)) System.out.println("Normal");
        else if (list.get(1) <= imc && imc < list.get(2)) System.out.println("Obesidade leve");
        else if (list.get(2) <= imc && imc < list.get(3)) System.out.println("Obesidade moderada");
        else System.out.println("Obesidade mórbida");
    }
}
