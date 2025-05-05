package mundo;

import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesTratamiento {
    public static LinkedList<Tratamiento> listaTratamientos = new LinkedList<>();
    private static int indice = 0;

    // Guardar un nuevo tratamiento si la historia clínica existe
    public static boolean guardar(Tratamiento t) {
        // Verificar si la historia clínica existe antes de guardar el tratamiento
        if (OperacionesHistoriaClinica.obtenerHistoriaPorID(t.getID_Historia()) == null) {
            System.out.println(" La historia clínica no existe.");
            return false;
        } else {
            listaTratamientos.add(t);
            indice = listaTratamientos.size() - 1;
            System.out.println(" Tratamiento guardado correctamente.");
            
            System.out.println("------------------------------");
            System.out.println("ID Tratamiento: " + t.getID_Tratamiento());
            System.out.println("Tratamiento: " + t.getTratamiento());
            System.out.println("ID Historia: " + t.getID_Historia());
            System.out.println("------------------------------");
            return true;
        }
    }

    // Buscar tratamiento por ID
    public static boolean buscar(String ID_Tratamiento) {
        for (int i = 0; i < listaTratamientos.size(); i++) {
            if (ID_Tratamiento != null && ID_Tratamiento.equalsIgnoreCase(listaTratamientos.get(i).getID_Tratamiento())) {
                indice = i;
                return true;
            }
        }
        return false;
    }

    // Eliminar tratamiento por ID
    public static boolean eliminar(String ID_Tratamiento) {
        for (int i = 0; i < listaTratamientos.size(); i++) {
            if (listaTratamientos.get(i).getID_Tratamiento().equalsIgnoreCase(ID_Tratamiento)) {
                listaTratamientos.remove(i);
                return true;
            }
        }
        return false;
    }
public static boolean Modificar(String ID_Tratamiento, String nuevoID, String nuevoTexto) {
    for (Tratamiento t : listaTratamientos) {
        if (t.getID_Tratamiento().equalsIgnoreCase(ID_Tratamiento)) {
            t.setID_Tratamiento(nuevoID); 
            t.setTratamiento(nuevoTexto); 
            return true;
        }
    }
    return false;
}




    // Crear tabla visual de tratamientos
    public static JTable crearTabla() {
        String[] columnas = {"ID Tratamiento", "Tratamiento", "ID Historia"};
        Object[][] datos = new Object[listaTratamientos.size()][3];

        for (int i = 0; i < listaTratamientos.size(); i++) {
            Tratamiento t = listaTratamientos.get(i);
            datos[i][0] = t.getID_Tratamiento();
            datos[i][1] = t.getTratamiento();
            datos[i][2] = t.getID_Historia();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        return new JTable(modelo);
    }

    // Obtener tratamiento específico por ID
    public static Tratamiento obtenerTratamientoPorID(String ID_Tratamiento) {
        for (Tratamiento t : listaTratamientos) {
            if (t.getID_Tratamiento() != null && t.getID_Tratamiento().equalsIgnoreCase(ID_Tratamiento.trim())) {
                return t;
            }
        }
        return null;
    }

}


