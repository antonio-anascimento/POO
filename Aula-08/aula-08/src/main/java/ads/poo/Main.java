package ads.poo;

public class Main {
    static void main() {

      Caneta bic = new Caneta();

      bic.setColor("Azul");
      bic.setNivelTinta(100);

      String cor = bic.getCor();
      double nivel = bic.getNivelTinta();

        IO.println(bic.isAberta());
        IO.println(bic.getNivelTinta());
        bic.abrirFecharCaneta();
        bic.setNivelTinta(0.00);
        IO.println(bic.desenhar(1,1,1,2));
        IO.println(bic.getNivelTinta());
    }
}
