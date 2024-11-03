import javax.swing.*;
import java.util.LinkedList;
public class Obra {
    //Atributos
    private String nombre;
    private LinkedList<Recursos> recursosObra = new LinkedList<Recursos>();


    //Constructor

    public Obra(String nombre, LinkedList<Recursos> recursosObra) {
        this.nombre = nombre;
        this.recursosObra = recursosObra;
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



    @Override
    public String toString() {
        return "Obra{" +
                "nombre='" + nombre + '\'' +
                ", recursosObra=" + recursosObra +
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

    public void asignarPersonal(Ingeniero ingeniero,Obrero obrero) {
        obrero.setCantidadObreros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de obreros que se va a necesitar")));
        ingeniero.setCantidadIng(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ingenieros")));

    }
    public void mostrarMateriales() {
        if (recursosObra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay materiales");
            return;
        }

        String mensaje = "Lista de materiales:\n";
        for (Recursos recurso : recursosObra) {
            mensaje += "Nombre: " + recurso.getNombre() + ", Cantidad: " + recurso.getCantidad() + ", Precio por unidad: $" + recurso.getPrecio() + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

}






