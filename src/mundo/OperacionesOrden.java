package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesOrden {
    private static int indice = 0;
    public static LinkedList<Orden> listaOrdenes = new LinkedList<>();

    public static void guardar(Orden o) {
        listaOrdenes.add(o);
        indice++;
        System.out.println("-----------------------------------");
        System.out.println(" ID_Orden: " + o.ID_Orden);
        System.out.println(" Fecha: " + o.Fecha_Orden);
        System.out.println(" ID_Cita: " + o.ID_Cita);
        System.out.println(" Tipo de Orden: " + o.Tipo_Orden);
        System.out.println("-----------------------------------");
    }

    public static boolean buscar(String ID_Orden) {
        for (int i = 0; i < listaOrdenes.size(); i++) {
            if (ID_Orden.equals(listaOrdenes.get(i).ID_Orden)) {
                indice = i;
                return true;
            }
        }
        return false;
    }

 public static boolean Modificar(String idOriginal, String nuevoID, String nuevaFecha, String nuevoTipo) {
    for (Orden o : listaOrdenes) {
        if (o.getID_Orden().equalsIgnoreCase(idOriginal)) {
            o.setID_Orden(nuevoID);
            o.setFecha_Orden(nuevaFecha);
            o.setTipo_Orden(nuevoTipo);
            return true;
        }
    }
    return false;
}


    public static boolean eliminarOrdenPorID(String ID_Orden) {
        for (int i = 0; i < listaOrdenes.size(); i++) {
            if (listaOrdenes.get(i).ID_Orden.equals(ID_Orden)) {
                listaOrdenes.remove(i);
                return true;
            }
        }
        return false;
    }

    public static JTable crearTablaOrdenes() {
        String[] columnas = {"ID Orden", "Fecha", "ID Cita", "Tipo de Orden"};
        Object[][] datos = new Object[listaOrdenes.size()][4];

        for (int i = 0; i < listaOrdenes.size(); i++) {
            Orden o = listaOrdenes.get(i);
            datos[i][0] = o.ID_Orden;
            datos[i][1] = o.Fecha_Orden;
            datos[i][2] = o.ID_Cita;
            datos[i][3] = o.Tipo_Orden;
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabla.setAutoCreateRowSorter(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(120);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(200);

        return tabla;
    }

    public static Orden obtenerOrdenPorID(String ID_Orden) {
        for (Orden o : listaOrdenes) {
            if (o.ID_Orden.equals(ID_Orden)) {
                return o;
            }
        }
        return null;
    }

}
