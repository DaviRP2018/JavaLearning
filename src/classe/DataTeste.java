package classe;

public class DataTeste {

    public static void main(String[] args) {

        /*
                Data d1 = new Data();
                d1.dia = 1;
                d1.mes = 9;
                d1.ano = 2023;

                System.out.printf("Data d1 é %s/%s/%s", d1.dia, d1.mes, d1.ano);
        */

        Data d2 = new Data(1, 9, 2023);
        System.out.printf("Data d2 é %s", d2.getData());
    }
}
