package ads.poo.cartas;

public enum Naipes {

    OUROS(1, "Ouros", "o"),
    ESPADAS(2, "Espadas", "e"),
    COPAS(3, "Copas", "c"),
    PAUS(4, "Paus", "p");

    public final int valor;
    public final String nome;
    public final String sigla;

    Naipes(int valor, String nome,String sigla) {
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
