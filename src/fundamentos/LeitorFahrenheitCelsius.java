package fundamentos;

import java.util.Scanner;

public class LeitorFahrenheitCelsius {

    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a temperatura em Fahrenheit: ");
        String entrada = teclado.nextLine();
        teclado.close();

        float temp_fah = Float.parseFloat(entrada);
        float temp_cel = (temp_fah - 32) * ((float) 5 / 9);

        System.out.printf("Temperatura em Celsius: %.0f°", temp_cel);
    }
}
