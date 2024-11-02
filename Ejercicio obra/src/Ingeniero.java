public class Ingeniero extends Trabajador {
    //Atributos
    private String especialidad;
    private int cantidadIng;

    //Constructor
    public Ingeniero(String nombre, double salario, String especialidad, int cantidadIng) {
        super(nombre, 1000);
        this.especialidad = especialidad;
        this.cantidadIng = cantidadIng;
    }
    //Get y sett

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantidadIng() {
        return cantidadIng;
    }

    public void setCantidadIng(int cantidadIng) {
        this.cantidadIng = cantidadIng;
    }

    @Override
    public String toString() {
        return "Ingeniero{" +
                "especialidad='" + especialidad + '\'' +
                "} " + super.toString();
    }

}
