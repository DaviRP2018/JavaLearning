package fundamentos;

import static fundamentos.ConversorTemperatura.fahtocel;

import java.util.Scanner;

public class LeitorFahrenheitCelsius2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a temperatura em Fahrenheit: ");
        String entrada = teclado.nextLine();
        teclado.close();

        float temp_cel = fahtocel(Float.parseFloat(entrada));

        System.out.printf("Temperatura em Celsius: %.0f°", temp_cel);
    }
}
