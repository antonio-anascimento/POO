package ads.poo;

public class Contador {

    private int valorAtual;

    public void setValorAtual(int valorInicial){
        valorAtual = valorInicial;
    }

    public int getValorAtual(){
        return valorAtual;
    }

    public void incrementar(){
        valorAtual++;
    }

}
