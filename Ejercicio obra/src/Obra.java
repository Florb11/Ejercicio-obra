import javax.swing.*;
import java.util.LinkedList;
public class Obra {
    //Atributos
    private String nombre;
    private LinkedList<Recursos> recursosObra = new LinkedList<Recursos>();
    private int cantidadObreros;
    private int cantidadIngenieros;

    //Constructor

    public Obra(String nombre, LinkedList<Recursos> recursosObra, int cantidadObreros, int cantidadIngenieros) {
        this.nombre = nombre;
        this.recursosObra = recursosObra;
        this.cantidadObreros = cantidadObreros;
        this.cantidadIngenieros = cantidadIngenieros;
    }

    public Obra(String nombre) {
        this.nombre = nombre;
    }
    //get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Recursos> getRecursosObra() {
        return recursosObra;
    }

    public void setRecursosObra(LinkedList<Recursos> recursosObra) {
        this.recursosObra = recursosObra;
    }

    public int getCantidadObreros() {
        return cantidadObreros;
    }

    public void setCantidadObreros(int cantidadObreros) {
        this.cantidadObreros = cantidadObreros;
    }

    public int getCantidadIngenieros() {
        return cantidadIngenieros;
    }

    public void setCantidadIngenieros(int cantidadIngenieros) {
        this.cantidadIngenieros = cantidadIngenieros;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "nombre='" + nombre + '\'' +
                ", recursosObra=" + recursosObra +
                ", cantidadObreros=" + cantidadObreros +
                ", cantidadIngenieros=" + cantidadIngenieros +
                '}';
    }

    public void agregarMaterial() {
        String nombreMaterial = JOptionPane.showInputDialog("Ingrese el nombre del material");
        int cantidadMaterial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        double precioMaterial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por unidad"));

        Recursos nuevo = new Recursos(nombreMaterial, cantidadMaterial, precioMaterial);

        for (Recursos item : recursosObra) {
            if (item.getNombre().equals(nuevo.getNombre())) {
                item.setCantidad(item.getCantidad() + nuevo.getCantidad());
                return;
            }
        }
        recursosObra.add(nuevo);
    }

    public void asignarPersonal() {
        this.cantidadObreros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de obreros que se va a necesitar"));
        this.cantidadIngenieros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ingenieros"));

    }
}






