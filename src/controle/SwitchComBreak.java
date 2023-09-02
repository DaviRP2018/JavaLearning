package controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        String conceito = "";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a nota: ");
        int nota = teclado.nextInt();
        teclado.close();

        /*switch(nota) {
            case 10:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
            default:
                conceito = "não encontrado!";
        }*/
        conceito = switch (nota) {
            case 10 -> "A";
            case 8 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1, 0 -> "E";
            default -> "não encontrado!";
        };

        System.out.println("Conceito é " + conceito);
    }
}
