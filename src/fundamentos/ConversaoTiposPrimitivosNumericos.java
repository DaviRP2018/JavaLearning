package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 1;  // implícita
        System.out.println(a);

        float b = (float) 1.0;  // explícita (CAST)
        System.out.println(b);

        double c = 1.1234567890123456890;  // Não é conversão porque o literal padrão é double
        System.out.println(c);

        float d = (float) 1.1234567890123456890;
        System.out.println(d);


        // Apesar de o número 4 caber no byte, o Java não analisa o valor e sim o tipo
        int e = 4;
        byte f = (byte) e;  // explícita (CAST)
        System.out.println(f);

        double g = 1.99999999_999;
        int h = (int) g;  // explícita (CAST)
        System.out.println(h);
    }
}
