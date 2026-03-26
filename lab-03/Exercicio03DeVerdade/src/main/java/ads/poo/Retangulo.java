package ads.poo;

public class Retangulo {

    private int largura;
    private int altura;
    private String codificao;

    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        this.codificao = "ASCII";
    }

    public Retangulo(int largura, int altura, String codificao){
        this.largura = (largura>0) ? largura : 4;
        this.altura = (altura>0) ? altura : 3;

        this.codificao = (codificao.equalsIgnoreCase("ASCII")  || codificao.equalsIgnoreCase("utf8")) ? this.codificao = codificao : "ASCII";

    }

    public boolean setLargura(int largura) {
        if(largura>0){
            this.largura = largura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAltura(int altura) {
        if(altura>0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setCodificao(String codificao) {
        if(codificao.equalsIgnoreCase("ASCII") || codificao.equalsIgnoreCase("utf8")){
            this.codificao = codificao;
            return true;
        } else {
            return false;
        }
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public String getCodificao() {
        return codificao;
    }

    public int calcularArea(){
        int area = this.largura * this.altura;
        return area;
    }

    public int calcularPerimetro(){
        int perimetro = 2 * (this.largura + this.altura);
        return perimetro;
    }

    public String toString() {
        if (codificao.equalsIgnoreCase("ASCII")) {

        } else {

        }
    }
}

