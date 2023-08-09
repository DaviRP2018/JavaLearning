package fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.printf("AND: %s e %s -> %s\n", condicao1, condicao2, condicao1 && condicao2);
        System.out.printf("OR: %s e %s -> %s\n", condicao1, condicao2, condicao1 || condicao2);
        System.out.printf("XOR: %s e %s -> %s\n", condicao1, condicao2, condicao1 ^ condicao2);

        System.out.println(!!!!!!!!!!!!!!!!!!!!!true);
    }
}
