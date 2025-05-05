
package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesEspecialidad {

    private static final LinkedList<Especialidad> lc = new LinkedList<>();

    public static void Guardar(Especialidad especialidad) {
        if (!buscar(especialidad.getID_Especialidad())) {
            lc.add(especialidad);
          
            System.out.println("-----------------------------------");
            System.out.println(" ID_Especialidad: " + especialidad.getID_Especialidad());
            System.out.println(" Nombre Especialidad: " + especialidad.getNombre_Especialidad());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("Ya existe una especialidad con ese ID.");
        }
    }

    public static boolean buscar(String ID_Especialidad) {
        return lc.stream().anyMatch(e -> e.getID_Especialidad().equals(ID_Especialidad));
    }
    
    
public static boolean Modificar(String idOriginal, String nuevoID, String nuevoNombre) {
    for (Especialidad esp : lc) {
        if (esp.getID_Especialidad().equalsIgnoreCase(idOriginal)) {
            esp.setID_Especialidad(nuevoID);
            esp.setNombre_Especialidad(nuevoNombre);
            return true;
        }
    }
    return false;
}

    public static boolean eliminarEspecialidadPorID(String ID_Especialidad) {
        return lc.removeIf(e -> e.getID_Especialidad().equals(ID_Especialidad));
    }

    public static JTable crearTablaEspecialidades() {
        String[] columnas = {"ID Especialidad", "Nombre Especialidad"};
        Object[][] datos = new Object[lc.size()][2];

        for (int i = 0; i < lc.size(); i++) {
            Especialidad esp = lc.get(i);
            datos[i][0] = esp.getID_Especialidad();
            datos[i][1] = esp.getNombre_Especialidad();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabla.setAutoCreateRowSorter(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(300);

        return tabla;
    }

    public static Especialidad obtenerEspecialidadPorID(String ID_Especialidad) {
        for (Especialidad esp : lc) {
            if (esp.getID_Especialidad().equals(ID_Especialidad)) {
                return esp;
            }
        }
        return null;
    }
}
