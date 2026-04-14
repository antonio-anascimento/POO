package ads.poo;

public class Motor {

    private int hp;
    private int giroAtual;
    private int cilindros;

    Motor(){

    }

    public void acelerar(int velocidade){
        if(velocidade >0){
            giroAtual ++;
        }
    }
}
