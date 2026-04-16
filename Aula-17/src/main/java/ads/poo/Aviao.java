package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private int quantidadeMotores;
    private boolean ligado;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, int quantidadeMotores, String tipoMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.quantidadeMotores = quantidadeMotores;

        this.motores = new ArrayList<>();
        for(int i = 0; i<quantidadeMotores; i++){
            Motor motor = new Motor(tipoMotor);
            motores.add(motor);
        }
    }

    public boolean ligarDesligar(){
        ligado = !ligado;

        if(ligado){
            for (Motor motor : this.motores) {
                if (motor.isLigado()) {
                    motor.ligarDesligar();
                }
            }
        } else {
            for (Motor motor : this.motores) {
                if (!motor.isLigado()) {
                    motor.ligarDesligar();
                }
            }
        }
        return ligado;
    }

    public boolean ligarDesligarMotores(int numeroMotor){
        return motores.get(numeroMotor).ligarDesligar();
    }
}
