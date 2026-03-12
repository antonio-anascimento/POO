package ads.poo;

public class Disciplina {

    private String nomeDisciplpina;
    private int cargaHoraria;
    private String codigo;
    private String nomeProfessor;

    public String getNomeDisciplpina(){
        return nomeDisciplpina;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public void setNomeDisciplpina(String nome){nomeDisciplpina = nome;}
    public void setCargaHoraria(int carga){ cargaHoraria = carga;}
    public void setCodigo(String cod){codigo = cod;}
    public void setNomeProfessor(String nome){nomeProfessor = nome;}
}
