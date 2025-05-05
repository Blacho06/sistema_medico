package mundo;

import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacionesCita {
    public static LinkedList<Cita> listaCitas = new LinkedList<>();
    private static int indice = 0;

   
    public static boolean guardar(Cita C) {
        if (OperacionesPaciente.obtenerPacientePorID(C.getID_Paciente()) == null) {
            System.out.println(" El paciente no existe.");
            return false;
        } else if (OperacionesMedico.obtenerMedicoPorID(C.getID_Medico()) == null) {
            System.out.println(" El médico no existe.");
            return false;
        } else if (OperacionesHistoriaClinica.obtenerHistoriaPorID(C.getID_Historia()) == null) {
            System.out.println(" La historia clínica no existe.");
            return false;
        } else {
            listaCitas.add(C);
            indice = listaCitas.size() - 1;
            System.out.println(" Cita guardada correctamente.");
            
                System.out.println("------------------------------");
                System.out.println("ID Cita: " + C.getID_Cita());
                System.out.println("Fecha: " + C.getFechaCita());
                System.out.println("Hora: " + C.getHoraCita());
                System.out.println("ID Paciente: " + C.getID_Paciente());
                System.out.println("ID Médico: " + C.getID_Medico());
                System.out.println("ID Historia: " + C.getID_Historia());
                System.out.println("------------------------------");
            return true;
        }
    }


    public static boolean buscar(String ID_Cita) {
        for (int i = 0; i < listaCitas.size(); i++) {
            if (ID_Cita != null && ID_Cita.equalsIgnoreCase(listaCitas.get(i).getID_Cita())) {
                indice = i;
                return true;
            }
        }
        return false;
    }


    public static boolean eliminar(String ID_Cita) {
        for (int i = 0; i < listaCitas.size(); i++) {
            if (listaCitas.get(i).getID_Cita().equalsIgnoreCase(ID_Cita)) {
                listaCitas.remove(i);
                return true;
            }
        }
        return false;
    }



    public static JTable crearTabla() {
        String[] columnas = {"ID Cita", "Fecha", "Hora", "ID Paciente", "ID Médico", "ID Historia"};
        Object[][] datos = new Object[listaCitas.size()][6];

        for (int i = 0; i < listaCitas.size(); i++) {
            Cita C = listaCitas.get(i);
            datos[i][0] = C.getID_Cita();
            datos[i][1] = C.getFechaCita();
            datos[i][2] = C.getHoraCita();
            datos[i][3] = C.getID_Paciente();
            datos[i][4] = C.getID_Medico();
            datos[i][5] = C.getID_Historia();
        }

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        return new JTable(modelo);
    }

 
    public static Cita obtenerCitaPorID(String ID_Cita) {
        for (Cita C : listaCitas) {
            if (C.getID_Cita() != null && C.getID_Cita().equalsIgnoreCase(ID_Cita.trim())) {
                return C;
            }
        }
        return null;
    }
public static boolean Modificar(String ID_Cita, String nuevoID, String nuevaFecha, String nuevaHora) {
    for (Cita c : listaCitas) {
        if (c.getID_Cita().equalsIgnoreCase(ID_Cita)) {
            c.setID_Cita(nuevoID);
            c.setFechaCita(nuevaFecha);
            c.setHoraCita(nuevaHora);
            return true;
        }
    }
    return false;
}





}
