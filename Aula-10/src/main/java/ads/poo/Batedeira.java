package ads.poo;

import static java.lang.String.valueOf;

public class Batedeira {

    private boolean ligada;
    private int velocidade;


    public boolean getLigada(){
        return ligada;
    }
    public void ligarDesligar(){
        ligada = !ligada;
    }

    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int v){
        velocidade = v;
    }


}
