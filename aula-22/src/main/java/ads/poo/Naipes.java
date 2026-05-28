package ads.poo;

public enum Naipes {

    OUROS(1, "Ouros"),
    ESPADAS(2, "Espadas"),
    COPAS(3, "Copas"),
    PAUS(4, "Paus");

    public final int valor;
    public final String nome;

    Naipes(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

}
