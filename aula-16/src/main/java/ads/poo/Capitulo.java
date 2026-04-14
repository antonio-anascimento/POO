package ads.poo;

public class Capitulo {

    private String titulo;

    Capitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n";
    }
}
