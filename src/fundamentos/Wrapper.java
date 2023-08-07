package fundamentos;

import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // byte
        Byte b = 100;
        Short s = 1000;

        Integer i = 10000;
        Integer ei = Integer.parseInt(teclado.next());
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(ei * 10);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");


    }
}
