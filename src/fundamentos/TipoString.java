package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Bom"));
        System.out.println(s.startsWith("bom"));
        System.out.println(s.toLowerCase().startsWith("bom") + "\n");
        System.out.println();
        System.out.println(s.endsWith("dia"));

        System.out.println(s.length());

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1234.45F;

        System.out.println(
                "Nome: "
                        + nome
                        + "\nSobrenome: "
                        + sobrenome
                        + "\nIdade: "
                        + idade
                        + "\nSalário: "
                        + salario);

        System.out.printf("Nome: %s %s\nSalário: %.2f\n", nome, sobrenome, salario);

        String frase = String.format("Tiozão: %s", nome);
        System.out.println(frase);

        System.out.println(frase.substring(0, 6));
    }
}
