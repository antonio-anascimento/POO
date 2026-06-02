package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

//        Caixa<String> c = new Caixa<>("Olá mundo!");
//        Caixa<Pessoa> p = new Caixa<>(new Pessoa("João"));
//
//        String s = c.getConteudo();
////        String errado = p.getConteudo();
//
//        ArrayList<Caixa> caixas = new ArrayList<>();
//        HashMap<String, String> map = new HashMap();


        Scanner ler = new Scanner(System.in);
        int a, b;

        try {
            System.out.println("Entre com o número:");
            a = ler.nextInt();
            System.out.println("Entre com o número:");
            b = ler.nextInt();

            int res = a / b;
            System.out.println(a + " dividido por " + b + " = " + res);

        } catch (InputMismatchException e) {
            System.err.println("Só é permitido entrar com números inteiros");
            ler.nextLine();
        } catch (ArithmeticException e) {
            System.err.println("Não é possível dividir por zero");
            ler.nextLine();
        } catch (Exception ex) {
            System.err.println("Comportamento inesperado");
            ler.nextLine();
        }
        System.out.println("Fim do programa");
    }
}
