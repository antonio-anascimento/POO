package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private HashMap<String, Livro> colecao;
    private ArrayList<Pessoas> clientes;

    public Biblioteca(){
        this.colecao = new HashMap<>();
        this.clientes = new ArrayList<>();
    }

    public boolean emprestarLivro(Livro livro,Pessoas cliente) throws EmprestadoException, LimiteException {
        if(livro.isEstaEmprestado()){
            throw new EmprestadoException("o Livro está emprestado");
        } else if(cliente.livroEmprestados.size()>=3){
            throw new LimiteException("O cliente já possui 3 livros emprestados");
        }else {
            livro.setEstaEmprestado();
            livro.setPessoaComLivro(cliente);
            cliente.adicionarLivro(livro);
            return true;
        }
    }
    public boolean devolverLivro(Livro livro,Pessoas cliente) throws DevolverException {
        if(livro.isEstaEmprestado() == false){
            throw new DevolverException("O livro não está emprestado");
        }else {
            livro.setEstaEmprestado();
            livro.setPessoaComLivro(null);
            cliente.removerLivro(livro);
            return true;
        }
    }

}
