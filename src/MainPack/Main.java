package MainPack;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RelojPulseraElectrico relojPulsera = new
                RelojPulseraElectrico(LocalTime.now(),
                3334422141234L,
                "Modelo 666AZ4",
                LocalDate.now());

        RelojPared relojPared = new
                RelojPared(LocalTime.now(),
                34341234L,
                "Modelo 1899");

        RelojFit relojFit = new RelojFit(LocalTime.now(), 222333L, "Modelo Fitness", LocalDate.now());

        Persona persona = new Persona("Juan",
                "Pepe",
                34,
                1.80F,
                relojPulsera,relojFit);

        Scanner input = new Scanner(System.in);
        boolean salir = false;

       while (!salir){
           if(Menu.menuPrincipalRelojes(relojPulsera,relojPared,persona,input,relojFit)==1){
               salir = true;
           }
       }

    }
}
