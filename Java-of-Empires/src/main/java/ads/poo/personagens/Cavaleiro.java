package ads.poo.personagens;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando com força: " + ataque;
    }

    @Override
    public String mover() {
        return "Cavaleiro " + super.mover() + " com velocidade: " + velocidade;
    }
}
