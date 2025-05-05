
package mundo;

/**
 *
 * @author Janus
 */
public class HistoriaClinica {
    
    public String ID_Historia;
    public String ID_Paciente;

    public HistoriaClinica(String ID_Historia, String ID_Paciente) {
        this.ID_Historia = ID_Historia;
        this.ID_Paciente = ID_Paciente;
    }

    public String getID_Historia() {
        return ID_Historia;
    }

    public void setID_Historia(String ID_Historia) {
        this.ID_Historia = ID_Historia;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }




}
