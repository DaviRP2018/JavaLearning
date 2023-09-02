package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int d, int m, int a) {
        if (d > 31) System.out.println("burro");
        dia = d;
        if (m > 12) System.out.println("burro");
        mes = m;
        ano = a;
    }

    public String getData() {
        String dia = String.valueOf(this.dia);
        if (dia.length() == 1) dia = "0" + dia;

        String mes = String.valueOf(this.mes);
        if (mes.length() == 1) mes = "0" + mes;

        return dia + "/" + mes + "/" + this.ano;
    }
}
