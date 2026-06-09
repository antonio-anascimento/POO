package ads.poo;


import ads.poo.cartas.CartaGrafica;
import ads.poo.cartas.Naipes;
import ads.poo.cartas.ValorCartas;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {

        private Draw draw;
        private ArrayList<CartaGrafica> baralho;

        public App(){
            this.draw = new Draw();
            this.draw.setTitle("Jogo de Cartas");
            this.draw.setCanvasSize(1200, 600);
            this.draw.setXscale(0,1200);
            this.draw.setYscale(0,600);
            this.draw.setDefaultCloseOperation(3);
            this.draw.enableDoubleBuffering();
            this.draw.addListener(this);

//            this.carta = new CartaGrafica(Naipes.ESPADAS, ValorCartas.AS, true, 100.0, 100.0);
//            this.carta.desenhar(this.draw);

            int x = 100;
            int y = 100;

            this.baralho = new ArrayList<>();
            for(Naipes n : Naipes.values()){
                for (ValorCartas v : ValorCartas.values()){
                    CartaGrafica carta = new CartaGrafica(
                            n,
                            v,
                            true,
                            (double) x,
                            (double) y
                    );

                    baralho.add(carta);
                    x+=20;
                }
            }

            for (CartaGrafica c : baralho){
                c.desenhar(this.draw);
            }
        }
//
//    @Override
//    public void mouseClicked(double x, double y) {
//        if(this.carta.clicouDentro(x, y)){
//            this.carta.desenhar(this.draw);
//        }
//
//    }

    static void main() {
        App app = new App();
    }
}
