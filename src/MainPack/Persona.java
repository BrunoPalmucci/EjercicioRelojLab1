package MainPack;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private RelojPulseraElectrico relojPulsera;
    private RelojFit relojFit;

    public Persona(String nombre, String apellido, int edad, double altura, RelojPulseraElectrico relojPulsera, RelojFit relojFit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.relojPulsera = relojPulsera;
        this.relojFit=relojFit;
    }

    public void usarRelojPulsera(){
        System.out.println(this.relojPulsera);
    }

    public void verHoraRelojPared(RelojPared reloj){
        System.out.println(reloj.hora);
    }

    public RelojPulseraElectrico getRelojPulsera() {
        return relojPulsera;
    }

    public void setRelojPulsera(RelojPulseraElectrico relojPulsera) {
        this.relojPulsera = relojPulsera;
    }

    public RelojFit getRelojFit() {
        return relojFit;
    }

    public void setRelojFit(RelojFit relojFit) {
        this.relojFit = relojFit;
    }
}
