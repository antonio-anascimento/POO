package ads.poo;

import java.util.Random;
import java.util.Scanner;

public class exercicio02 {
    public void main() {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int numeroAleatorio = r.nextInt(100) + 1;

        IO.println("Tente acertar um numero de 1 a 100");

        int tentativa = sc.nextInt();

        int i = 0;
        while (tentativa != numeroAleatorio) {
            if (tentativa > numeroAleatorio){
                IO.println("o Número gerado é menor, tente novamente");
                tentativa = sc.nextInt();
                i++;
            } else {
                IO.println("o Número gerado é maior, tente novamente");
                tentativa = sc.nextInt();
                i++;
            }
        }
        i++;
        IO.print("Acertou " + "em " + i +" tentativas!!");
    }
}