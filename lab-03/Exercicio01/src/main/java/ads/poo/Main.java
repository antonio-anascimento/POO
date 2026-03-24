package ads.poo;


public class Main {
    static void main() {

        Ponto a = new Ponto(3, 6);
        Ponto b = new Ponto(7, 9);

        IO.println(a.calcularDistancia(b));

        IO.println(b.toString());


    }
}
