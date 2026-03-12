package ads.poo;

public class Personagem {

    private String classe;
    private int hp;
    private int forca;

    public String getClasse() {
        return classe;
    }
    public int getHp(){
        return hp;
    }

    public void setClasse(String c){classe = c;}
    public void setHp(int vida){hp = vida;}
    public void setForca(int f){forca = f;}

    public String atacar(){
        int dano = forca * 2;
        return ("O dano causado foi: " + dano);
    }

    public void receberGolpe(int dano){
        hp -= dano;
    }

}
