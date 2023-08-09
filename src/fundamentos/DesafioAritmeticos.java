package fundamentos;

public class DesafioAritmeticos {

    public static void main(String[] cachorro) {

        double part1;
        double part2;
        double part3;

        double part1_a = 3 + 2;
        double part1_b = part1_a * 6;
        double part1_c = Math.pow(part1_b, 2);
        part1 = part1_c / (3 * 2);
        if (part1 != 150) {
            System.out.println("Lixo");
        } else {
            System.out.println("Gudo");
        }

        double part2_a = 1 - 5;
        double part2_b = 2 - 7;
        part2 = Math.pow((part2_a * part2_b) / 2, 2);
        if (part2 != 100) {
            System.out.println("Lixo");
        } else {
            System.out.println("Gudo");
        }

        double part3_a = part1 - part2;
        part3 = Math.pow(part3_a, 3) / Math.pow(10, 3);
        if (part3 != 125) {
            System.out.println("Lixo");
        } else {
            System.out.println("Gudo");
        }

        System.out.println("Parts: " + (int) part3);

        double unique =
                Math.pow(
                                ((Math.pow(6 * (3 + 2), 2) / (3 * 2)))
                                        - (Math.pow(((1 - 5) * (2 - 7)) / (double) 2, 2)),
                                3)
                        / Math.pow(10, 3);
        System.out.println("Unique: " + (int) unique);
    }
}
