package ads.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome){
        ArrayList<Contato> resultado = new ArrayList<>();

        contatos.forEach(c -> {
            if (c.getNome().equals(nome) && c.getSobrenome().equals(sobreNome)) {
                resultado.add(c);
            }
        });

        return resultado;
    }

    public boolean addContato(Contato c){
        return contatos.add(c);
    }
    public boolean removeContato(int indice){
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indice){
        if(indice>0 && indice<=contatos.size()){
            Contato c = contatos.get(indice);
            return c.addTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indice){
        if(indice >=0 && indice< contatos.size()){
            Contato c = contatos.get(indice);
            return c.addEmail(rotulo, valor);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor, int indice){
        if(indice >=0 && indice< contatos.size()){
            Contato c = contatos.get(indice);
            return c.updateTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor, int indice){
        if(indice >=0 && indice< contatos.size()){
            Contato c = contatos.get(indice);
            return c.updateEmail(rotulo, valor);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, String valor, int indice){
        if(indice >=0 && indice< contatos.size()){
            Contato c = contatos.get(indice);
            return c.removeTelefone(rotulo);
        }
        return false;
    }

    public boolean removeEmail(String rotulo, String valor, int indice){
        if(indice >=0 && indice< contatos.size()){
            Contato c = contatos.get(indice);
            return c.removeEmail(rotulo);
        }
        return false;
    }

    @Override
    public String toString() {
        if (contatos.isEmpty()) {
            return "A agenda está vazia.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== AGENDA DE CONTATOS ===\n");

        for (int i = 0; i < contatos.size(); i++) {
            sb.append("Índice: ").append(i).append("\n");
            sb.append(contatos.get(i).toString());
            sb.append("\n--------------------------\n");
        }

        return sb.toString();
    }
}
