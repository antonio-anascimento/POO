package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return telefones.update(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor){
        return emails.update(rotulo, valor);
    }

    @Override
    public String toString() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        StringBuilder sb = new StringBuilder();

        sb.append("Contato: ").append(nome).append(" ").append(sobrenome).append("\n");
        sb.append("Data de Nascimento: ").append(dataNasc.format(dtf)).append("\n");

        sb.append("--- Lista de Telefones ---\n");
        sb.append(telefones.toString()).append("\n");

        sb.append("--- Lista de Emails ---\n");
        sb.append(emails.toString());

        return sb.toString();
    }

}
