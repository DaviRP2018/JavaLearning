package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a altura do triângulo: ");
        double alt_str = teclado.nextDouble();

        System.out.print("Digite a base do triângulo: ");
        double base_str = teclado.nextDouble();
        teclado.close();

        double area = (base_str * alt_str) / 2;
        System.out.printf("A área é: %.3f", area);
    }
}
