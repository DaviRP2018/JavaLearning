package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final int CONST = 32;
        final double MULTIPLICADOR = (double) 5 / 9;

        double farenheit = 90;
        double celsius;

        celsius = (farenheit - CONST) * MULTIPLICADOR;

        System.out.println(celsius);

        // Resposta do prof
        // Eu posso colocar 5.0 / 9 que o result vai ser double
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double result = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + result + "°C.");

        fahrenheit = 32;
        result = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + result + "°C.");
    }
}
