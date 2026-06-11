package ads.poo.cartas;

import edu.princeton.cs.algs4.Draw;

public class DadosGui extends Dado implements IElementos {
    private double x;
    private double y;

    public DadosGui(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
            d.picture(x, y, "dados/" + face +".png");
    }

    public boolean clicouDentro(double x, double y) {
        if (x >= this.x - 25 && x <= this.x + 25 &&
                y >= this.y - 25 && y <= this.y + 25) {
            jogar();
            return true;
        }
        return false;
    }
}
