package ads.poo;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int velocidade){
        propulsor.acelerar(velocidade);
    }

    public void trocarMotor(Motor motor){
        this.propulsor = motor;
    }

}
