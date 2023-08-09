package fundamentos.operadores;

public class Aritmeticos {

    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.println("soma: " + (x + y));
        System.out.println("subtração: " + (x - y));
        System.out.println("multiplicação: " + (x * y));
        System.out.println("divisão: " + (x / y));

        int a = 8;
        int b = 3;

        System.out.println("soma: " + (a + b));
        System.out.println("subtração: " + (a - b));
        System.out.println("multiplicação: " + (a * b));
        System.out.println("divisão: " + (a / (double) b));

        System.out.println(a % b);
        System.out.println(8 % 3);

        System.out.println((x + y) - (a * b));
    }
}
