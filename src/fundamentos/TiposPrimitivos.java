package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        /*
        Tipos primitivos
        8 tipos

        Quer dizer os tipos mais basicos que compoem por
        fim algum tipo mais complexo como por exemplo uma data
        onde é composta de inteiros

        6 são numéricos
        2 são numéricos diferentes (char e bool)

        Tipos:
        ** Inteiros
        - byte  (1) -> -128 até +127
        - short (2) -> +- 32.767
        - int   (4) ======> (Padrao pra inteiro)
        - long  (8)

        ** Flutuantes
        - float     (4)
        - double    (8) ======> (Padrao pra flutuante)

        ** Diferentes
        - char      -> 1 único caractere
        - boolean   -> "false" / "true"
        Pelo que entendi não existe no Java como usar "" pra false ou 1 pra true
        Obrigatoriamente precisa ser um bool false ou true



        -------------------
        converter um tipo de capacidade menor pra um maior é tranquilo
        agora o contrario perde-se dados

         */

        // Informações do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 5____4_2;  // what tha hail!?
        System.out.println(numeroDeVoos);
        int id = 56_789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        // float arf = 0.00F;  // Java não analisa o valor, e sim o tipo
        double vendasAcumuladas = 2_991_797_103.01;  // caraio

        // Tipo booleano
        boolean estaDeFerias = false;  // true

        // Tipo caractere
        char status = 'A';
        // char uni = '\u0001';
        // char arr = "o";  nao pode

        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // Número de viagens
        System.out.println("Número de viagens: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        var adendo = "";
        if (!estaDeFerias) {
            adendo = " - Que triste";
        } else {
            adendo = "";
        }
        System.out.println("Férias? " + estaDeFerias + adendo);
        System.out.println("Status: " + status);
    }
}
