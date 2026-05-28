package ads.poo;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);


        IO.println("Entre com a Sigla: ");
        String sigla = sc.nextLine();
        IO.println("Entre com os dias: ");
        DiaDaSemana primeiro  = DiaDaSemana.getByCodigo(sc.nextInt());
        DiaDaSemana segundo = DiaDaSemana.getByCodigo(sc.nextInt());

        Disciplina poo = new Disciplina(sigla,new DiaDaSemana[]{primeiro, segundo});
        IO.println(poo);


    }
}
