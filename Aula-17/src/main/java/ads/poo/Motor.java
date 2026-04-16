package ads.poo;

public class Motor {

    private boolean ligado;
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }
    public boolean ligarDesligar(){
        ligado = !ligado;
        return ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getTipo() {
        return tipo;
    }

}
