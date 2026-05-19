package ads.poo;


import ads.poo.produtos.Dimensao;
import ads.poo.produtos.Telefone;
import ads.poo.produtos.TelefoneSemFio;

public class Main {
    static void main() {


        Dimensao dimensao = new Dimensao(20,12,33);
        Telefone t = new Telefone(11, 1234, "s24", 130,dimensao);
        System.out.println(t.toString());

        TelefoneSemFio sf = new TelefoneSemFio(20,11,"s25",22,dimensao,2.4,12,33.3);
        System.out.println(sf.toString());


        Telefone a = new TelefoneSemFio(20,11,"s26",22,dimensao,2.4,12,33.3);

//        System.out.println(sf.getFrequencia());
//        System.out.println(((TelefoneSemFio)t).getFrequencia());

        Telefone[] vetor = new Telefone[3];
        vetor[0] = t;
        vetor[1] = sf;
        vetor[2] = a;

        for (Telefone aux : vetor){
            if(aux instanceof TelefoneSemFio novo){
                IO.println(novo.getFrequencia());
            }
        }

    }
}
