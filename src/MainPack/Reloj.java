package MainPack;

import java.time.LocalTime;

public abstract class Reloj {
    protected LocalTime hora;
    protected long numSerie;
    protected String modelo;

    public Reloj(LocalTime hora, long numSerie, String modelo) {
        this.hora = hora;
        this.numSerie = numSerie;
        this.modelo = modelo;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public abstract void incrementarHora(long horas, char opcion);
}
