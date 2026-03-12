package ads.poo;


public class Main {
    static void main() {

        Contador contador = new Contador();

        contador.setValorAtual(10);
        IO.println(contador.getValorAtual());
        contador.incrementar();
        IO.println(contador.getValorAtual());
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        IO.println(contador.getValorAtual());

        Batedeira batedeira = new Batedeira();
        IO.println(batedeira.getLigada());
        batedeira.ligarDesligar();
        batedeira.setVelocidade(1);
        batedeira.ligarDesligar();
        IO.println(batedeira.getLigada());

        Disciplina Poo = new Disciplina();
        Poo.setCodigo("Poo");
        Poo.setCargaHoraria(80);
        Poo.setNomeDisciplpina("Programação Orientada a objetos");
        Poo.setNomeProfessor("Mello");
        IO.println(Poo.getCodigo());
        IO.println(Poo.getCargaHoraria());
        IO.println(Poo.getNomeDisciplpina());
        IO.println(Poo.getNomeProfessor());


        Personagem personagem = new Personagem();
        personagem.setClasse("barbaro");
        personagem.setHp(100);
        personagem.setForca(5);
        personagem.atacar();
        personagem.receberGolpe(30);
        IO.println(personagem.getHp());
        IO.println(personagem.getClasse());


    }
}
