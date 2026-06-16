package ads.poo;

import java.util.Date;

public class Livro {

    private String isbn;
    private String nomeAutor;
    private Date dataLançamento;
    private boolean estaEmprestado = false;
    private Pessoas pessoaComLivro;

    public Livro(String isbn, String nomeAutor, Date dataLançamento) {
        this.isbn = isbn;
        this.nomeAutor = nomeAutor;
        this.dataLançamento = dataLançamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public Date getDataLançamento() {
        return dataLançamento;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setDataLançamento(Date dataLançamento) {
        this.dataLançamento = dataLançamento;
    }

    public void setEstaEmprestado() {
        this.estaEmprestado = !estaEmprestado;
    }

    public Pessoas getPessoaComLivro() {
        return pessoaComLivro;
    }

    public void setPessoaComLivro(Pessoas pessoaComLivro) {
        this.pessoaComLivro = pessoaComLivro;
    }
}
