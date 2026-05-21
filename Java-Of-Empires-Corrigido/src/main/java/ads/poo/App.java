package ads.poo;

import ads.poo.personagens.Aldeao;
import ads.poo.personagens.Arqueiro;
import ads.poo.personagens.Cavaleiro;
import ads.poo.personagens.Personagem;

import java.util.ArrayList;

public class App {
    static void main() {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Arqueiro());
        personagens.add(new Aldeao());
        personagens.add(new Cavaleiro());

        for(Personagem p : personagens){
            IO.println(p.mover()); //polimorfismo
        }
    }
}
