package ads.poo;

public class lampada {

    private boolean ligada;

    boolean ligarEDesligar(){
        ligada = !ligada;
        return ligada;
    }

    boolean isLigada(){
        return ligada;
    }
}
