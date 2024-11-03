public class Ingeniero extends Trabajador {
    //Atributos
    private int cantidadIng;

    //Constructor
    public Ingeniero(String nombre) {
        super(nombre, 1000);

    }
    //Get y sett


    public int getCantidadIng() {
        return cantidadIng;
    }

    public void setCantidadIng(int cantidadIng) {
        this.cantidadIng = cantidadIng;
    }

    @Override
    public String toString() {
        return "Ingeniero{" +
                "} " + super.toString();
    }

}
