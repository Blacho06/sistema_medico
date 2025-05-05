
package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesMedico {

    private static final LinkedList<Medico> listaMedicos = new LinkedList<>();

    public static void guardar(Medico m) {
        String ID_Medico = m.getID_Medico().trim();
        if (buscar(ID_Medico)) return;
        listaMedicos.add(m);
        System.out.println("-----------------------------------");
        System.out.println(" ID_Medico: " + m.getID_Medico());
        System.out.println(" Nombre: " + m.getNombre_Medico());
        System.out.println("-----------------------------------");
    }

    public static boolean buscar(String ID_Medico) {
        return listaMedicos.stream()
            .anyMatch(m -> m.getID_Medico() != null &&
                           m.getID_Medico().trim().equalsIgnoreCase(ID_Medico.trim()));
    }

public static boolean Modificar(String ID_Medico, String nuevoID, String nuevoNombre) {
    for (Medico m : listaMedicos) {
        if (m.getID_Medico().equalsIgnoreCase(ID_Medico)) {
            m.setID_Medico(nuevoID);
            m.setNombre_Medico(nuevoNombre);
            return true;
        }
    }
    return false;
}


    public static boolean eliminarMedicoPorID(String ID_Medico) {
        return listaMedicos.removeIf(
            m -> m.getID_Medico() != null &&
                 m.getID_Medico().trim().equalsIgnoreCase(ID_Medico.trim()));
    }

    // Obtener tabla de médicos
    public static JTable crearTablaMedicos() {
        String[] columnas = {"ID_Medico", "Nombre_Medico", "ID_Especialidad"};
        Object[][] datos = new Object[listaMedicos.size()][3];

        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico m = listaMedicos.get(i);
            datos[i][0] = m.getID_Medico();
            datos[i][1] = m.getNombre_Medico();
            datos[i][2] = m.getID_Especialidad();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabla.setAutoCreateRowSorter(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(150);

        return tabla;
    }

    public static Medico obtenerMedicoPorID(String ID_Medico) {
        for (Medico m : listaMedicos) {
            if (m.getID_Medico() != null &&
                m.getID_Medico().trim().equalsIgnoreCase(ID_Medico.trim())) {
                return m;
            }
        }
        return null;
    }

}
