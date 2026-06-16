package ads.poo;

import java.util.ArrayList;

public class Pessoas {

    public String nome;
    public String cpf;
    public ArrayList<Livro> livroEmprestados;

    public Pessoas(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro){
        livroEmprestados.add(livro);
    }
    public void removerLivro(Livro livro){
        livroEmprestados.remove(livro);
    }
}
