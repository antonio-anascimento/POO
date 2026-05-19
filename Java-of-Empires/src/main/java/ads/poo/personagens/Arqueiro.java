package ads.poo.personagens;

public class Arqueiro extends Personagem implements Guerreiro {

    public Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com a flecha e força: " + ataque;
    }

    @Override
    public String mover() {
        return "Arqueiro " + super.mover() + " com velocidade: " + velocidade;
    }
}
