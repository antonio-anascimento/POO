package ads.poo.produtos;

public class TelefoneSemFio extends Telefone {

    private double frequencia;
    private int canais;
    private double distanciaOperacao;


    public TelefoneSemFio(int codigo, int numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distanciaOperacao=" + distanciaOperacao +
                '}';
    }

    public double getFrequencia() {
        return frequencia;
    }
}
