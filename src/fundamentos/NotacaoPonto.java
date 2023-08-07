package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";

        s = s.toUpperCase();

        s = s.replace("X", "Senhora");

        s = s.concat("?");

        System.out.println(s);

        System.out.println("Boukron".contains("f"));

        System.out.println("Boukron".toUpperCase().contains("o"));

        System.out.println("Caldin".length());

        // Tipos primitivos nao tem o operador "."
        int b = 3;
        System.out.println(b);
    }
}
