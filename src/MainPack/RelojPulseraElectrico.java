package MainPack;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojPulseraElectrico extends Reloj {
    private LocalDate dia;

    public RelojPulseraElectrico(LocalTime hora, long numSerie, String modelo, LocalDate dia) {
        super(hora, numSerie, modelo);
        this.dia = dia;
    }

     public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void incrementarDia(){
        this.dia.plusDays(1);
    }

    @Override
    public void incrementarHora(long cantidad_tiempo, char opcion) {
        switch (opcion){
            case 's':
                hora=hora.plusSeconds(cantidad_tiempo);
                break;
            case 'm':
                hora=hora.plusMinutes(cantidad_tiempo);
                break;
            case 'h':
                hora=hora.plusHours(cantidad_tiempo);
                break;

        }
    }

    public void cambiarFecha(long cantidad_tiempo, char opcion) {
        switch (opcion){
            case 'd':
                dia=dia.plusDays(cantidad_tiempo);
                break;
            case 'm':
                dia=dia.plusMonths(cantidad_tiempo);
                break;
            case 'a':
                dia=dia.plusYears(cantidad_tiempo);
                break;
        }
    }

    public String toString(){
        return "Hora: "+hora+" Dia: "+dia+" Modelo: "+modelo+" Numero de serie: "+numSerie;
    }
}
