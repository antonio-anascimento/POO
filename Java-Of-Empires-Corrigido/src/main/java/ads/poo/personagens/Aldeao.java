package ads.poo.personagens;

public class Aldeao extends Personagem implements Guerreiro, Coletador{

    public Aldeao(){
        super(25,1,0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacando com força: " + ataque;
    }

    @Override
    public String mover() {
        return "Aldeão " + super.mover() + " com velocidade: " + velocidade;
    }

    @Override
    public String coletarMadeira() {
        return "Coletando Madeira";
    }
    @Override
    public String coletarOuro(){
        return "Coletando Ouro";
    }
}
