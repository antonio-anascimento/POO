package ads.poo;

public class Horario {

    private int horas;
    private int minutos;
    private int segundos;

    public Horario() {
        this(0, 0, 0);
    }

    public Horario(int horas) {
        this(horas, 0, 0);
    }

    public Horario(int horas, int minutos) {
        this(horas, minutos, 0);
    }

    public Horario(int horas, int minutos, int segundos) {
        setHora(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public boolean setHora(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
            return true;
        }
        return false;
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }

    private String converterParaExtenso(int valor) {
        if (valor == 0) return "zero";

        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta"};

        if (valor < 20) {
            return unidades[valor];
        } else if (valor < 30) {
            return "vinte e " + unidades[valor - 20];
        } else if (valor < 40) {
            return "trinta e " + unidades[valor - 30];
        } else if (valor < 50) {
            return "quarenta e " + unidades[valor - 40];
        } else if (valor < 60) {
            return "cinquenta e " + unidades[valor - 50];
        } else {
            return "";
        }
    }

    public String porExtenso() {
        String extensoHoras = converterParaExtenso(this.horas);
        String extensoMinutos = converterParaExtenso(this.minutos);
        String extensoSegundos = converterParaExtenso(this.segundos);

        return String.format("%s hora%s, %s minuto%s e %s segundo%s",
                extensoHoras,
                this.horas != 1 ? "s" : "",
                extensoMinutos,
                this.minutos != 1 ? "s" : "",
                extensoSegundos,
                this.segundos != 1 ? "s" : "");
    }

    public long horarioEmSegundos() {
        int horasEmMinutos = this.horas * 60;
        int minutosTotais = horasEmMinutos + this.minutos;
        return (minutosTotais * 60) + this.segundos;
    }

    public long diferencaEmSegundos(Horario b) {
        return Math.abs(this.horarioEmSegundos() - b.horarioEmSegundos());
    }
}