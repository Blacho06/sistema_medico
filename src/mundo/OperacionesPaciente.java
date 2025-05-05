
package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesPaciente {
    private static int indice = 0;
    public static LinkedList<Paciente> listaPacientes = new LinkedList<>();

    public static void guardar(Paciente p) {
        listaPacientes.add(p);
        indice++;
        System.out.println("-----------------------------------");
        System.out.println(" ID_Paciente: " + p.getID_Paciente());
        System.out.println(" Nombre: " + p.getNombre_Paciente());
        System.out.println(" Edad: " + p.getEdad());
        System.out.println(" Teléfono: " + p.getTelefono());
        System.out.println(" Dirección: " + p.getDireccion());
        System.out.println("-----------------------------------");
    }

    public static boolean buscar(String ID_Paciente) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (ID_Paciente.equals(listaPacientes.get(i).getID_Paciente())) {
                indice = i;
                return true;
            }
        }
        return false;
    }

public static boolean Modificar(String ID_Paciente, String nuevoID, String nuevoNombre, String edad, String direccion, String telefono) {
    for (Paciente p : listaPacientes) {
        if (p.getID_Paciente().equalsIgnoreCase(ID_Paciente)) {
            p.setID_Paciente(nuevoID);
            p.setNombre_Paciente(nuevoNombre);
            p.setEdad(edad);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            return true;
        }
    }
    return false;
}


    public static boolean eliminarPacientePorID(String ID_Paciente) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).getID_Paciente().equals(ID_Paciente)) {
                listaPacientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public static JTable crearTablaPacientes() {
        String[] columnas = {"Cédula", "Nombre", "Edad", "Teléfono", "Dirección"};
        Object[][] datos = new Object[listaPacientes.size()][5];

        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente p = listaPacientes.get(i);
            datos[i][0] = p.getID_Paciente();
            datos[i][1] = p.getNombre_Paciente();
            datos[i][2] = p.getEdad();
            datos[i][3] = p.getTelefono();
            datos[i][4] = p.getDireccion();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabla.setAutoCreateRowSorter(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(250);

        return tabla;
    }

    public static Paciente obtenerPacientePorID(String ID_Paciente) {
        for (Paciente p : listaPacientes) {
            if (p.getID_Paciente().equals(ID_Paciente)) {
                return p;
            }
        }
        return null;
    }

 
 
}
