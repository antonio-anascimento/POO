package ads.poo.cartas;

public enum ValorCartas {

    AS(1, "Ás", "1"),
    DOIS(2, "Dois", "2"),
    TRES(3, "Três", "3"),
    QUATRO(4, "Quatro", "4"),
    CINCO(5, "Cinco", "5"),
    SEIS(6, "Seis", "6"),
    SETE(7, "Sete", "7"),
    OITO(8, "Oito", "8"),
    NOVE(9, "Nove", "9"),
    DEZ(10, "Dez", "10"),
    VALETE(11, "Valete", "j"),
    DAMA(12, "Dama", "q"),
    REI(13, "Rei", "k");

    public final int valor;
    public final String nome;
    public final String sigla;

    ValorCartas(int valor, String nome, String sigla) {
        this.valor = valor;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}