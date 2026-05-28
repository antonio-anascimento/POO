package ads.poo;

public enum Planetas {

    MERCURIO(1,"Mercúrio"),
    VENUS(2,"Vênus"),
    TERRA(3,"Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "JUPITER"),
    SATURNO(6, "SATURNO"),
    URANO(7, "URANO"),
    NETUNO(8, "NETUNO");

    public final int posição;
    public final String nome;

    Planetas(int posição, String nome) {
        this.posição = posição;
        this.nome = nome;
    }

    public Planetas getByPosicao(int posição){
        for(Planetas p : Planetas.values()){
            if(p.posição == posição){
                return p;
            }
        }
        throw new IllegalArgumentException("posição inválida");
    }

    @Override
    public String toString() {
        return nome;
    }
}
