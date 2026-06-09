package ads.poo.cartas;

import edu.princeton.cs.algs4.Draw;

public class Cartas {
    private Naipes naipe;
    private ValorCartas  valor;

    public Cartas(Naipes naipe, ValorCartas valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

   public String getNaipeSigla(){
        return naipe.getSigla();
   }

   public String getValorSigla(){
        return valor.getSigla();
   }

}
