package MainPack;

import java.util.Scanner;

public class Menu {

    //MainPack.Menu Principal
    public static byte menuPrincipalRelojes( RelojPulseraElectrico relojPulsera, RelojPared relojPared, Persona persona, Scanner input,RelojFit relojFit){

        int opcion;
        char opcion_str;

        System.out.println("Menu:");
        System.out.println("1. Ver opciones del reloj de pulsera");
        System.out.println("2. Ver opciones del reloj de pared");
        System.out.println("3. Ver opciones del reloj fit");
        System.out.println("4.Salir");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                Menu.menuOpcionesRelojPulsera(relojPulsera, persona, input);
                break;
            case 2:
                Menu.menuOpcionesRelojPared( relojPared, persona, input);
                break;
            case 3:
                Menu.menuOpcionesRelojFit(relojFit, persona,input);
                break;
            case 4:
                System.out.println("Saliendo del menu..");
                return 1;
    }
    return 0;

    }

    private static void menuOpcionesRelojPared(RelojPared relojPared, Persona persona, Scanner input){
        int opcion;
        System.out.println("1. Ver hora");
        System.out.println("2. Modificar hora");

        opcion=input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println(persona.getRelojPulsera().getHora());
                break;
            case 2:
                Menu.menuCambiarHoraPared(relojPared, input);
                break;
        }
    }

    private static void menuOpcionesRelojPulsera(RelojPulseraElectrico relojPulsera, Persona persona, Scanner input){
        int opcion;
        System.out.println("1. Ver hora");
        System.out.println("2. Modificar hora");
        System.out.println("3. Ver fecha");
        System.out.println("4. Modificar fecha");
        opcion=input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println(persona.getRelojPulsera().getHora());
                break;
            case 2:
                Menu.menuCambiarHora(relojPulsera, persona, input);
                break;
            case 3:
                System.out.println("Fecha: ");
                System.out.println(persona.getRelojPulsera().getDia());
                break;
            case 4:
                Menu.menuCambiarFechaReloj(relojPulsera, persona, input);
                break;

        }
    }

    private static void menuCambiarHora(RelojPulseraElectrico relojPulseraOPared, Persona persona, Scanner input){
        char opcion;
        long opcion_numerica;
        System.out.println("Cambiar segundos(s), minutos(m) u horas(h)");
        opcion=input.next().charAt(0);
        System.out.println("Cantidad a cambiar: ");
        opcion_numerica = input.nextInt();
        persona.getRelojPulsera().incrementarHora(opcion_numerica, opcion);
        System.out.println("Hora incrementada en"+opcion);
        System.out.println("Nueva hora: "+persona.getRelojPulsera().getHora());
    }

    private static void menuCambiarFechaReloj(RelojPulseraElectrico relojPulseraOPared, Persona persona, Scanner input){
        char opcion;
        long opcion_numerica;
        System.out.println("Cambiar dias(d), meses(m) o años(a)");
        opcion=input.next().charAt(0);
        System.out.println("Cantidad a cambiar: ");
        opcion_numerica = input.nextInt();
        persona.getRelojPulsera().cambiarFecha(opcion_numerica,opcion);
        System.out.println("Fecha incrementada");
        System.out.println("Nueva fecha: "+persona.getRelojPulsera().getDia());
    }

    private static void menuCambiarHoraPared(RelojPared relojPared, Scanner input){
        char opcion;
        long opcion_numerica;
        System.out.println("Cambiar segundos(s), minutos(m) u horas(h)");
        opcion=input.next().charAt(0);
        System.out.println("Cantidad a cambiar: ");
        opcion_numerica = input.nextInt();
        relojPared.incrementarHora(opcion_numerica, opcion);
        System.out.println("Hora incrementada en"+opcion);
        System.out.println("Nueva hora: "+relojPared.getHora());
    }

    private static void menuOpcionesRelojFit(RelojFit relojFit, Persona persona, Scanner input){
        int opcion;
        System.out.println("1. Ver hora");
        System.out.println("2. Modificar hora");
        System.out.println("3. Ver fecha");
        System.out.println("4. Modificar fecha");
        System.out.println("5. Caminar");
        System.out.println("6. Mostrar frecuencia cardiaca");
        opcion=input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println(persona.getRelojFit().getHora());
                break;
            case 2:
                Menu.menuCambiarHoraRelojFit(relojFit, persona, input);
                break;
            case 3:
                System.out.println("Fecha: ");
                System.out.println(persona.getRelojFit().getDia());
                break;
            case 4:
                Menu.menuCambiarFechaRelojFit(relojFit, persona, input);
                break;
            case 5:
                System.out.println("Distancia a caminar: ");
                relojFit.cuentaPasos(input.nextInt());
                break;
            case 6:
                System.out.println("Frecuencia cardiaca actual: "+relojFit.frecuenciaAleatoria());

        }
    }

    private static void menuCambiarHoraRelojFit(RelojFit relojFit, Persona persona, Scanner input){
        char opcion;
        long opcion_numerica;
        System.out.println("Cambiar segundos(s), minutos(m) u horas(h)");
        opcion=input.next().charAt(0);
        System.out.println("Cantidad a cambiar: ");
        opcion_numerica = input.nextInt();
        persona.getRelojFit().incrementarHora(opcion_numerica, opcion);
        System.out.println("Hora incrementada en"+opcion);
        System.out.println("Nueva hora: "+persona.getRelojPulsera().getHora());
    }


    private static void menuCambiarFechaRelojFit(RelojFit relojFit, Persona persona, Scanner input){
        char opcion;
        long opcion_numerica;
        System.out.println("Cambiar dias(d), meses(m) o años(a)");
        opcion=input.next().charAt(0);
        System.out.println("Cantidad a cambiar: ");
        opcion_numerica = input.nextInt();
        persona.getRelojFit().cambiarFecha(opcion_numerica,opcion);
        System.out.println("Fecha incrementada");
        System.out.println("Nueva fecha: "+persona.getRelojFit().getDia());
    }

}
