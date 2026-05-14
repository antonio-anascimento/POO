package ads.poo;


import ads.poo.produtos.Dimensao;
import ads.poo.produtos.Telefone;
import ads.poo.produtos.TelefoneSemFio;

public class Main {
    static void main() {


        Dimensao dimensao = new Dimensao(20,12,33);
        Telefone telefone = new Telefone(11, 1234, "s24", 130,dimensao);
        System.out.println(telefone.toString());

        TelefoneSemFio telefoneSemFio = new TelefoneSemFio(20,11,"s25",22,dimensao,2.4,12,33.3);
        System.out.println(telefoneSemFio.toString());

    }
}
