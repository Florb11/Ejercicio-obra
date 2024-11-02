public class Ingeniero extends Trabajador {
    //Atributos
    private String especialidad;

    //Constructor
    public Ingeniero(String nombre, double salario, String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }
    //Get y sett
}
