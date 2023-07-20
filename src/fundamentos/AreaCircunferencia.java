package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        // No Java as coisas sao tipadas, pra declarar precisa dizer o tipo, nome e valor

        final double PI = 3.14159;
        // "final" indica uma variavel imutavel, que não pode ser reatribuida
        // pi = 1;

        // posso declarar como no javascript tbm
        double raio;
        raio = 3.4;
        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
