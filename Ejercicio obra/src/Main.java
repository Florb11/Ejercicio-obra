import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Obra edificio = new Obra("edificio buena vida");



        String[] menu = {
                "Asignar Personal","Ver perfil","Sacar pasaje","Salir"
        };
        int opcion;
        do {
            opcion= JOptionPane.showOptionDialog(null, "Menu", null, 0, 0, null, menu, menu[0]);
            switch (opcion) {
                case 0:
                    edificio.asignarPersonal();
                    JOptionPane.showMessageDialog(null, "La cantidad de ingenieros para la obra son: " + edificio.getCantidadIngenieros()+ "\n" + "La cantidad de obreros: "+edificio.getCantidadObreros());
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
            }

        } while (opcion!=3);

    }
}





