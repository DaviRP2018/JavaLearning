package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Boa tarde!");

        System.out.println("Boa noite!");


        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f\n", 1234.5678);
        System.out.printf("Wat?%n");
        System.out.printf("Waat?%n");


        // input
        Scanner input = new Scanner(System.in);

        System.out.println("vai, escreve ai: ");
        String escrita = input.nextLine();

        System.out.println("Escreve mais: ");
        String mais = input.nextLine();

        System.out.println("Escreve um numero: ");
        // int numero = Integer.parseInt(input.nextLine());
        int numero = input.nextInt();

        System.out.printf("Vc escreveu '%s' e '%s' e '%d'%n", escrita, mais, numero);

        input.close();
        /*
        E ai, pessoal. Beleza?

        Passando para esclarecer uma particularidade dos métodos nextInt() e
        nextDouble(). Ambos os métodos têm a mesma particularidade, mas
        vou explicá-la através do nextInt() com o exemplo abaixo.
        */

        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = teclado.nextInt();

        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();*/

        /*
        À primeira vista, parece que está tudo bem com este código.
        Mas quando o rodamos, o que é impresso no console (contendo os inputs)
        é o seguinte:

        Qual a sua idade? 25
        Qual o seu nome? Qual o seu sobrenome? Silva

        Isso acontece devido à maneira como o nextInt() faz a leitura dos valores.

        Esse método faz a leitura de um único número, por exemplo,
        58 ou 958. Mas quando digitamos os inputs, além do valor que
        deve ser lido, também apertamos enter, o que gera um caracter
        "\n" no buffer de entrada (fila de coisas que devem ser lidas),
        que é uma representação do enter.

        Então, o que acontece é: "Qual a sua idade?" é impresso, digitamos
        o valor e apertamos enter. Quando fazemos isso, o buffer de entrada
        fica com o conteúdo "25\n", e quando o nextInt() faz a leitura,
        ele lê apenas o 25, deixando o "\n" para trás. Depois disso, "Qual
        o seu nome?" é impresso, e o método nextLine() vai ler tudo que
        estiver no buffer de entrada até encontrar um "\n". Como o nextInt()
        deixou um "\n" para trás, é esse o valor que o nextLine() lê.
        Isso conclui a leitura e a próxima linha de código, que é "Qual o
        seu sobrenome?", é impressa.

        Para resolver esse problema, precisamos "pegar" o "\n" que o
        nextInt() não lê. Isso pode ser feito colocando um comando
        nextLine() depois do nextInt(), de modo que o código abaixo vai
        funcionar da maneira como queríamos.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine();  // Lê o "\n" que o teclado.nextInt() deixa no buffer.

        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();
    }
}
