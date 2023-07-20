package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // O Java é que vai atribuir o tipo baseado no valor dado usando o "var"
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        c = "Outro texto";
        System.out.println(c);

        //c = 4.5;  // Nao pode mudar o tipo

        double d;  // declarada
        d = 123.65;  // inicializada
        System.out.println(d);  // usada

        // var e;  // Nao pode usar var sem inicializar
        // e = 123.45;
    }
}
