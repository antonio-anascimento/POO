package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Email {

    private HashMap<String, String> dados;
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public Email(){
        this.dados = new HashMap<>();
    }

    private boolean isEmailValido(String email){
        return email.matches(EMAIL_REGEX);
    }


    public boolean add(String rotulo, String valor){
        if (isEmailValido(valor) && !dados.containsKey(rotulo)) {
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo){
        if(dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String valor){
        if(isEmailValido(valor) && dados.containsKey(rotulo)){
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dados.forEach((rotulo, valor) -> {
            sb.append(rotulo).append(": ").append(valor).append("\n");
        });
        return sb.toString().trim();
    }
}
