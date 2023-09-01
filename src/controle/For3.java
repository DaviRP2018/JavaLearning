package controle;

public class For3 {

    public static void main(String[] args) {

        // disponível fora do for
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Saiu do for...");
        System.out.println(i);

        // disponível apenas dentro do for
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // posso declarar "novamente"
        int j = 15;
        System.out.println("Saiu do for...");
        System.out.println(j);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.printf("[%d %d]\n", x, y);
            }
        }
    }
}
