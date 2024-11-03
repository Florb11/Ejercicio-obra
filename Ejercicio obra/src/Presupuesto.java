import javax.swing.*;
public class Presupuesto {
    private Obra obra;
    //Constructor
    public Presupuesto(Obra obra) {
        this.obra = obra;
    }
    //get y sett
    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void calcularCostoObra(Ingeniero ingeniero, Obrero obrero){
        if(this.obra != null) {
            double costoMateriales = 0;
            double salarioIng = ingeniero.getSalario() * ingeniero.getCantidadIng();
            double salarioObreros = obrero.getSalario() * obrero.getCantidadObreros();
            double manoDeobra = salarioObreros + salarioIng;
            for (Recursos recurso : this.obra.getRecursosObra()) {
                costoMateriales += recurso.getCantidad() * recurso.getPrecio();
            }
            double costoTotalObra = manoDeobra + costoMateriales;
            JOptionPane.showMessageDialog(null, "Costo total de la obra: $" + costoTotalObra);
            JOptionPane.showMessageDialog(null, "Costo de mano de obra: $" + manoDeobra);
            JOptionPane.showMessageDialog(null, "Costo de materiales: $" + costoMateriales);
        }else{
            JOptionPane.showMessageDialog(null,"No hay obra en marcha");
        }

    }
}
