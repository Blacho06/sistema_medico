package mundo;

import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesHistoriaClinica {
    public static LinkedList<HistoriaClinica> listaHistorias = new LinkedList<>();
    private static int indice = 0;

    public static boolean Guardar(HistoriaClinica h) {
        if (OperacionesPaciente.obtenerPacientePorID(h.getID_Paciente()) != null) {
            listaHistorias.add(h);
            indice++;
            System.out.println("-----------------------------------");
            System.out.println(" ID_Historia: " + h.getID_Historia());
            System.out.println("-----------------------------------");
            return true;
        }
        return false;
    }

    public static boolean buscar(String ID_Historia) {
        for (int i = 0; i < listaHistorias.size(); i++) {
            if (ID_Historia.equals(listaHistorias.get(i).getID_Historia())) {
                indice = i;
                return true;
            }
        }
        return false;
    }

    public static boolean eliminar(String ID_Historia) {
        for (int i = 0; i < listaHistorias.size(); i++) {
            if (listaHistorias.get(i).getID_Historia().equals(ID_Historia)) {
                listaHistorias.remove(i);
                return true;
            }
        }
        return false;
    }

    public static JTable crearTabla() {
        String[] columnas = {"ID Historia", "ID Paciente"};
        Object[][] datos = new Object[listaHistorias.size()][2];

        for (int i = 0; i < listaHistorias.size(); i++) {
            HistoriaClinica h = listaHistorias.get(i);
            datos[i][0] = h.getID_Historia();
            datos[i][1] = h.getID_Paciente();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        return new JTable(modelo);
    }

    public static HistoriaClinica obtenerHistoriaPorID(String ID_Historia) {
        for (HistoriaClinica h : listaHistorias) {
            if (h.getID_Historia().equals(ID_Historia)) {
                return h;
            }
        }
        return null;
    }

    public static void Modificar(String nuevoID_Historia, String nuevoID_Diagnostico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
