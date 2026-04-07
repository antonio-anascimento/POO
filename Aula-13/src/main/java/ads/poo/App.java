package ads.poo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> cadastrar();
            case 2 -> listarTodas();
            case 3 -> depositar();
            case 4 -> sacar();
            case 5 -> sair();
        }
    }

    void cadastrar(){

        String nrConta = IO.readln("Número da conta: ");
        String nome = IO.readln("Nome do titular: ");
        double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        Conta contaNova = new Conta(nrConta, nome, saldo);
        this.contas.add(contaNova);
    }

    void listarTodas(){
        IO.println(contas.toString());
        return;
    }

    void depositar(){

        String nrConta = IO.readln("Número da conta: ");
        double valorDeposito = Double.parseDouble(IO.readln("Valor Desejado: "));
        if(valorDeposito>0){

            for(Conta conta : contas){
                if(conta.getNrConta().equals(nrConta)){
                    conta.depositar(valorDeposito);
                    IO.println("Deposito Realizado com sucesso");
                    return;
                }
            }
        } else {
            IO.println("Não foi possivel realizar o Deposito");
        }
    }

    void sacar(){
        String nrContaDesejada = IO.readln("Número da conta: ");
        double valorSaque = Double.parseDouble(IO.readln("Valor Desejado: "));

        if(valorSaque>0){
            for(Conta conta : contas){
                if(conta.getNrConta().equals(nrContaDesejada)){
                    if(conta.getSaldo() >= valorSaque){
                        conta.sacar(valorSaque);
                        IO.println( "Saque realizado com sucesso");
                        return;
                    } else {
                        IO.println("Não foi possível realizar o saque, saldo insuficiente");
                        return;
                    }
                }
            }
        } else {
            IO.println("Não foi possível realizar o saque");
        }
    }

    void sair(){
        return;
    }

    static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            IO.println("   Menu\n" +
                    "        1- Cadastrar Contas\n" +
                    "        2- Listar todas Contas\n" +
                    "        3- Depositar em uma Conta\n" +
                    "        4- Sacar de uma Conta\n" +
                    "        5- Sair");

            IO.println("Entre com uma Opção");
            opcao =  sc.nextInt();
            app.menu(opcao);
        } while (opcao!=5);

    }
}
