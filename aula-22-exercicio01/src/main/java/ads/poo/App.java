package ads.poo;


import ads.poo.cartas.*;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {

        private Draw draw;
        private ArrayList<IElementos> elementos;

        public App(){
            this.draw = new Draw();
            this.draw.setTitle("Jogo de Cartas");
            this.draw.setCanvasSize(1200, 600);
            this.draw.setXscale(0,1200);
            this.draw.setYscale(0,600);
            this.draw.setDefaultCloseOperation(3);
            this.draw.enableDoubleBuffering();
            this.draw.addListener(this);


            int x = 35;
            int y = 300;

            this.elementos = new ArrayList<>();
            for(Naipes n : Naipes.values()){
                for (ValorCartas v : ValorCartas.values()){
                    CartaGrafica carta = new CartaGrafica(
                            n,
                            v,
                            true,
                            (double) x,
                            (double) y
                    );

                    elementos.add(carta);
                    x+=23;
                }
            }

            this.elementos.add(new DadosGui(100, 400));
            this.elementos.add(new DadosGui(200, 400));


            for (IElementos e : elementos){
                e.desenhar(this.draw);
            }
            draw.show();
        }

    @Override
    public void mouseClicked(double x, double y) {
        for (IElementos e : elementos) {
            if (e.clicouDentro(x, y)) {
                break;
            }
        }
        for (IElementos e : elementos){
            e.desenhar(this.draw);
        }
        draw.show();
    }

    static void main() {
        App app = new App();
    }
}
