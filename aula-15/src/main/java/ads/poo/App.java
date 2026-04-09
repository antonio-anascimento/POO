package ads.poo;


import java.util.HashMap;
import java.util.Scanner;

public class App {

    private HashMap<String, Livro> colecao;

    public App(){
        this.colecao = new HashMap<>();

        colecao.put("1111", new Livro("1111", 2001, "Autor A", "Título A"));
        colecao.put("2222", new Livro("2222", 2002, "Autor B", "Título B"));
        colecao.put("3333", new Livro("3333", 2003, "Autor C", "Título C"));
        colecao.put("4444", new Livro("4444", 2004, "Autor D", "Título D"));
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> cadastrar();
            case 2 -> listarTodos();
            case 3 -> listarPorAno();
            case 4 -> editarLivro();
            case 5 -> sair();
        }
    }

    void sair(){
        return;
    }

    void cadastrar(){
        String isbn = IO.readln("Isbn do livro: ");
        String titulo = IO.readln("Titulo do livro: ");
        String nomeAutor = IO.readln("Nome Autor: ");
        int ano = Integer.parseInt(IO.readln("Ano de publicação: "));

        Livro livro = new Livro(isbn, ano, nomeAutor, titulo);
    }

    void listarTodos() {
        for (Object livro : colecao.values()) {
            IO.println(livro.toString());
        }
    }

    void listarPorAno(){
        int ano = Integer.parseInt(IO.readln("Ano de publicação: "));
        for (Livro livro : colecao.values()) {
            if(livro.getAno() == ano){
                IO.println(livro.toString());
            }
        }
    }

    void editarLivro(){
        String isbn = IO.readln("Isbn do livro: ");
        String titulo = IO.readln("Titulo do livro: ");
        String nomeAutor = IO.readln("Nome Autor: ");
        int ano = Integer.parseInt(IO.readln("Ano de publicação: "));

        Livro livro = colecao.get(isbn);
        livro.setTitulo(titulo);
        livro.setNomeAutor(nomeAutor);
        livro.setAno(ano);
    }

    static void main() {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            IO.println("   Menu\n" +
                    "        1- Cadastrar Livro\n" +
                    "        2- Listar coleção\n" +
                    "        3- Listar por ano\n" +
                    "        4- Editar livro\n" +
                    "        5- Sair");

            IO.println("Entre com uma Opção");
            opcao =  sc.nextInt();
            app.menu(opcao);
        } while (opcao!=5);
    }

}
