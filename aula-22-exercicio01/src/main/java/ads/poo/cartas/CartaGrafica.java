package ads.poo.cartas;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Cartas implements IElementos{

    private boolean estaParaCima;
    private Double x;
    private Double y;

    public CartaGrafica(Naipes naipe, ValorCartas valor, boolean estaParaCima, Double x, Double y) {
        super(naipe, valor);
        this.estaParaCima = estaParaCima;
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        if(estaParaCima){
            d.picture(x, y, "cartas/" +  super.getValorSigla() + getNaipeSigla()+".png");
        } else{
            d.picture(x, y, "cartas/" + "fundoa.png");
        }
    }

    public boolean clicouDentro(double x, double y) {
        if (x >= this.x - 36 && x <= this.x + 36 &&
                y >= this.y - 48 && y <= this.y + 48) {
            this.estaParaCima = !this.estaParaCima;
            return true;
        }
        return false;
    }

}
