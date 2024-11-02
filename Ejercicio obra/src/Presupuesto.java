import javax.swing.*;
import java.util.LinkedList;

public class Presupuesto {
    //Atributos
    private LinkedList<Recursos> recursosObra = new LinkedList<Recursos>();

    //Constructor


    public Presupuesto(LinkedList<Recursos> recursosObra) {
        this.recursosObra = recursosObra;
    }
    // Get y set

    public LinkedList<Recursos> getrecursosObra() {
        return recursosObra;
    }

    public void setrecursosObra(LinkedList<Recursos> recursosObra) {
        this.recursosObra = recursosObra;
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "recursosObra=" + recursosObra +
                '}';
    }
    public void calcularCostoObra(Ingeniero ingeniero, Obrero obrero){
        double costoMateriales = 0;
        double salarioIng = ingeniero.getSalario() * ingeniero.getCantidadIng();
        double salarioObreros = obrero.getSalario() * obrero.getCantidadObreros();
        double manoDeobra= salarioObreros + salarioIng;
        for (Recursos recurso : recursosObra) {
            costoMateriales += recurso.getCantidad() * recurso.getPrecio();
        }
        double costoTotalObra = manoDeobra + costoMateriales;
        JOptionPane.showMessageDialog(null, "Costo total de la obra: $" + costoTotalObra);
        JOptionPane.showMessageDialog(null, "Costo de mano de obra: $" + manoDeobra);
        JOptionPane.showMessageDialog(null, "Costo de materiales: $" + costoMateriales);

    }
}
