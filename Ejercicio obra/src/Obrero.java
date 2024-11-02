public class Obrero extends Trabajador {
    //Atributo
    private String cargo;
    private int cantidadObreros;

    //Constructor

    public Obrero(String nombre, double salario, String cargo, int cantidadObreros) {
        super(nombre, salario);
        this.cargo = cargo;
        this.cantidadObreros = cantidadObreros;
    }

    //Get y set

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCantidadObreros() {
        return cantidadObreros;
    }

    public void setCantidadObreros(int cantidadObreros) {
        this.cantidadObreros = cantidadObreros;
    }

    @Override
    public String toString() {
        return "Obrero{" +
                "cargo='" + cargo + '\'' +
                "} " + super.toString();
    }

}
