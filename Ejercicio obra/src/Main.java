import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Obra edificio = new Obra("edificio buena vida");
        Presupuesto presupuesto = new Presupuesto(edificio);
        Ingeniero ingeniero = new Ingeniero("Ingeniero 1");
        Obrero obrero = new Obrero("Obrero 1", 500, "Albañil", 0);




        String[] menu = {
                "Asignar Personal","Agregar materiales","Calcular Costo","Mostrar materiales","Salir"
        };
        int opcion;
        do {
            opcion= JOptionPane.showOptionDialog(null,
                    "Menu",
                    null,
                    0,
                    0,
                    null,
                    menu,
                    menu[0]);
            switch (opcion) {
                case 0:
                    edificio.asignarPersonal(ingeniero, obrero);
                    break;
                case 1:
                    edificio.agregarMaterial();
                    break;
                case 2:
                    presupuesto.calcularCostoObra(ingeniero, obrero);
                    break;
                case 3:
                    edificio.mostrarMateriales();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }

        } while (opcion!=3);

    }
}





