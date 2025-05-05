package mundo;

import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesDetallesOrden {
    private static int indice = 0;
    public static LinkedList<DetallesOrden> listaDetallesOrden = new LinkedList<>();

    public static void guardar(DetallesOrden d) {
        listaDetallesOrden.add(d);
        indice++;
        System.out.println("-----------------------------------");
        System.out.println(" ID_Detalles: " + d.ID_Detalles);
        System.out.println(" ID_Orden: " + d.ID_Orden);
        System.out.println(" Descripción: " + d.Descripcion);
        System.out.println("-----------------------------------");
    }

    public static boolean buscar(String ID_Detalles) {
        for (int i = 0; i < listaDetallesOrden.size(); i++) {
            if (ID_Detalles.equals(listaDetallesOrden.get(i).ID_Detalles)) {
                indice = i;
                return true;
            }
        }
        return false;
    }

public static boolean Modificar(String ID_Detalles, String nuevoID, String nuevaDescripcion) {
    for (DetallesOrden d : listaDetallesOrden) {
        if (d.getID_Detalles().equalsIgnoreCase(ID_Detalles)) {
            d.setID_Detalles(nuevoID);
            d.setDescripcion(nuevaDescripcion);
            return true;
        }
    }
    return false;
}


    public static boolean eliminarDetallesOrdenPorID(String ID_Detalles) {
        for (int i = 0; i < listaDetallesOrden.size(); i++) {
            if (listaDetallesOrden.get(i).ID_Detalles.equals(ID_Detalles)) {
                listaDetallesOrden.remove(i);
                return true;
            }
        }
        return false;
    }

    public static JTable crearTablaDetallesOrden() {
        String[] columnas = {"ID Detalles", "ID Orden", "Descripción"};
        Object[][] datos = new Object[listaDetallesOrden.size()][3];

        for (int i = 0; i < listaDetallesOrden.size(); i++) {
            DetallesOrden d = listaDetallesOrden.get(i);
            datos[i][0] = d.ID_Detalles;
            datos[i][1] = d.ID_Orden;
            datos[i][2] = d.Descripcion;
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

    public static DetallesOrden obtenerDetallesOrdenPorID(String ID_Detalles) {
        for (DetallesOrden d : listaDetallesOrden) {
            if (d.ID_Detalles.equals(ID_Detalles)) {
                return d;
            }
        }
        return null;
    }

}
