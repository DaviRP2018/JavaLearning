package fundamentos;

public class ConversorTemperatura {

    static float fahtocel(float temp) {
        return (temp - 32) * (5F / 9);
    }

    static float celtofah(float temp) {
        return (temp * (9F / 5)) + 32;
    }
}
