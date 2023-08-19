package fundamentos;

import java.util.Scanner;

public class LeitorCelsiusFahrenheit {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        String entrada = teclado.nextLine();
        teclado.close();

        float temp_fah = ConversorTemperatura.celtofah(Float.parseFloat(entrada));

        System.out.printf("Temperatura em Fahrenheit: %.0f", temp_fah);
    }
}
