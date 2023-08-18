package fundamentos;

class MathUtils {
    public static DivMod divmod(int dividendo, int divisor) {
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        return new DivMod(quociente, resto);
    }
}

class DivMod {
    int div;
    int mod;

    DivMod(int v1, int v2) {
        div = v1;
        mod = v2;
    }
}
