package fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10_000;
        System.out.println(num1.toString().length());

        int num2 = 10_000_000;
        System.out.println(Integer.toString(num2).length());

        Long.toString(1);

        System.out.println(("" + num1).length());  // Gambis
        System.out.println(("" + num2).length());  // Gambis
    }
}
