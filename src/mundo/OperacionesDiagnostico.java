package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesDiagnostico {
    private static int indice = 0;
    public static LinkedList<Diagnostico> listaDiagnosticos = new LinkedList<>();

    public static void guardar(Diagnostico d) {
        listaDiagnosticos.add(d);
        indice++;
        System.out.println("-----------------------------------");
        System.out.println(" ID Diagnóstico: " + d.ID_Diagnostico);
        System.out.println(" ID Historia: " + d.ID_Historia);
        System.out.println(" Diagnóstico: " + d.Diagnostico);
        System.out.println("-----------------------------------");
    }

    public static boolean buscar(String ID_Diagnostico) {
        for (int i = 0; i < listaDiagnosticos.size(); i++) {
            if (ID_Diagnostico.equals(listaDiagnosticos.get(i).ID_Diagnostico)) {
                indice = i;
                return true;
            }
        }
        return false;
    }

 public static boolean Modificar(String ID_Diagnostico, String nuevoID, String idHistoria, String nuevoTexto) {
    for (Diagnostico d : listaDiagnosticos) {
        if (d.getID_Diagnostico().equalsIgnoreCase(ID_Diagnostico)) {
            d.setID_Diagnostico(nuevoID);
            d.setID_Historia(idHistoria); // Esto normalmente no se cambia, pero por si acaso
            d.setDiagnostico(nuevoTexto);
            return true;
        }
    }
    return false;
}



    public static boolean eliminarDiagnosticoPorID(String ID_Diagnostico) {
        for (int i = 0; i < listaDiagnosticos.size(); i++) {
            if (listaDiagnosticos.get(i).ID_Diagnostico.equals(ID_Diagnostico)) {
                listaDiagnosticos.remove(i);
                return true;
            }
        }
        return false;
    }

    public static JTable crearTablaDiagnosticos() {
        String[] columnas = {"ID Diagnóstico", "ID Historia", "Diagnóstico"};
        Object[][] datos = new Object[listaDiagnosticos.size()][3];

        for (int i = 0; i < listaDiagnosticos.size(); i++) {
            Diagnostico d = listaDiagnosticos.get(i);
            datos[i][0] = d.ID_Diagnostico;
            datos[i][1] = d.ID_Historia;
            datos[i][2] = d.Diagnostico;
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabla.setAutoCreateRowSorter(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(200);

        return tabla;
    }

    public static Diagnostico obtenerDiagnosticoPorID(String ID_Diagnostico) {
        for (Diagnostico d : listaDiagnosticos) {
            if (d.ID_Diagnostico.equals(ID_Diagnostico)) {
                return d;
            }
        }
        return null;
    }
    

}
