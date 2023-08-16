package MainPack;

import java.time.LocalTime;

public class RelojPared extends Reloj{
    public RelojPared(LocalTime hora, long numSerie, String modelo) {
        super(hora, numSerie, modelo);
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
}
