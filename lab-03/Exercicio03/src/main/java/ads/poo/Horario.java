package ads.poo;

public class Horario {

    private int horas;
    private int minutos;
    private int segundos;

    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Horario(int horas) {
        this.horas = horas;
    }

    public Horario(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Horario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public boolean setHora(int horas){
        if(horas<=23 && horas>=0){
            this.horas = horas;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinutos(int minutos){
        if(minutos<=60 && minutos>=0){
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundos(int segundos){
        if(segundos<=60 && segundos>=0){
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String horario = String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
        return horario;
    }

    private String converterParaExtenso(int valor){
        return switch (valor){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public String porExtenso(){
        //TODO pegar dezenas e unidades antes de invocar os metodos abaixo


        String horas = converterParaExtenso(this.horas); // um ou uma? use o ternario
        String minutos = converterParaExtenso(this.minutos);
        String segundos = converterParaExtenso(this.segundos);

        return horas + " " + minutos + " " + segundos;
    }


    public long horarioEmSegundos(){
        int horasEmMinutos = this.horas * 60;
        int minutosTotais = horasEmMinutos + this.minutos;
        long segundosTotais = (minutosTotais * 60) + this.segundos;
        return segundosTotais;
    }

    public long diferencaEmSegundos(Horario b){
        long segundos = this.horarioEmSegundos() - b.horarioEmSegundos();
        return segundos;
    }

}
