package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {

    private HashMap<String, String> dados;
    private static final String TELEFONE_REGEX = "^\\d{10,11}$";

    public Telefone(){
        this.dados = new HashMap<>();
    }

    private boolean isTelefoneValido(String telefone){
        return telefone.matches(TELEFONE_REGEX);
    }

    public boolean add(String rotulo, String valor){
        if (isTelefoneValido(valor) && !dados.containsKey(rotulo)) {
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
        if(isTelefoneValido(valor) && dados.containsKey(rotulo)){
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        dados.forEach((rotulo, valor) -> {
            String mascara = (valor.length() == 11) ? "(##) #####-####" : "(##) ####-####";
            String valorFormatado = formata(mascara, valor);
            sb.append(rotulo).append(": ").append(valorFormatado).append("\n");
        });

        return sb.toString().trim();
    }

}
