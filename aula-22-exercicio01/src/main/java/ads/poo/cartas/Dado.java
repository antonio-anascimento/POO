package ads.poo.cartas;

import java.util.Random;

public class Dado {
    Random gerador = new Random();

    protected int face = 1;
    protected int[] estatisticas = new int[6];

    public int jogar() {
        int numeroDado = 1 + gerador.nextInt(6);
        face = numeroDado;
        estatisticas[numeroDado - 1]++;
        return numeroDado;
    }

    public int[] getEstatisticas() {
        return estatisticas;
    }
}