package MainPack;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojFit extends RelojPulseraElectrico{
    private int distancia;
    private int frecuenciaCardiaca;

    public RelojFit(LocalTime hora, long numSerie, String modelo, LocalDate dia) {
        super(hora, numSerie, modelo, dia);

    }

    public void cuentaPasos(int pasos){
        this.distancia+=pasos;
    }

    public int frecuenciaAleatoria(){
        this.frecuenciaCardiaca=60 + (int)(Math.random() * ((150 - 60) + 1));
        return frecuenciaCardiaca;
    }

}
