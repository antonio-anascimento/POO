package ads.poo;

public enum ValorCartas {

    ÁS(1, "Ás"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    VALETE(11, "Valete"),
    DAMA(12, "Dama"),
    REI(13, "Rei");

    public final int valor;
    public final String nome;

    ValorCartas(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }
}