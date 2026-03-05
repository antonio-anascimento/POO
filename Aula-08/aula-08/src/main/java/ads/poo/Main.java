package ads.poo;

public class Main {
    static void main() {

      lampada a = new lampada();

      a.ligarEDesligar();
      IO.println(a.isLigada());
      a.ligarEDesligar();
      IO.println(a.isLigada());
    }
}
