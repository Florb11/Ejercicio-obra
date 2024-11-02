abstract class Trabajador {
    //Atributos
    private String nombre;
    private double salario;

    //Constructor

    public Trabajador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Get y sett

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
