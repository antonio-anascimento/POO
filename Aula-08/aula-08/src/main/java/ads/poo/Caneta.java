package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public String desenhar(int xA, int yA, int xB, int yB){
        if (aberta){
            double distancia = Math.sqrt(Math.pow((xB-xA),2) + Math.pow((yB-yA),2));
            if ((nivelTinta -= distancia * 0.01) >= 0) {
                return String.format("Desenhei %.2f cm na cor %s", distancia, cor);
            } else {
                return "Tinta insuficiente";
            }
        } else {
            return "A caneta está fechada";
        }
    }

    public void abrirFecharCaneta() {
        aberta = !aberta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public String getCor(){
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }


    public void setColor(String c){
        cor = c;
    }

    public void setNivelTinta(double nivel){
        nivelTinta = nivel;
    }


}
