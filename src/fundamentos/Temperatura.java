package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final int AJUSTE = 32;
        final double MULTIPLICADOR = (double) 5 / 9;

        double farenheit = 90;
        double celsius;

        celsius = (farenheit - AJUSTE) * MULTIPLICADOR;

        System.out.println(celsius);
    }
}
