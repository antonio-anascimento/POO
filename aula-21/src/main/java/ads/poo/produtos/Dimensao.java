package ads.poo.produtos;

public class Dimensao {

    private int altura;
    private int largura;
    private int profundidade;


    public Dimensao(int altura, int largura, int profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setAltura(int altura) {
        if(altura>0){
            this.altura = altura;

        }
    }

    public void setLargura(int largura) {
        if(largura>0){
            this.largura = largura;
        }
    }

    public void setProfundidade(int profundidade) {

        if(profundidade>0){
            this.profundidade = profundidade;
        }
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
