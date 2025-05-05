package mundo;

/**
 *
 * @author Janus
 */
public class Cita {
    
    public String FechaCita;
    public String HoraCita;
    public String ID_Cita;
    public String ID_Paciente;
    public String ID_Medico;
    public String ID_Historia;

    public Cita(String FechaCita, String HoraCita, String ID_Cita, String ID_Paciente, String ID_Medico, String ID_Historia) {
        this.FechaCita = FechaCita;
        this.HoraCita = HoraCita;
        this.ID_Cita = ID_Cita;
        this.ID_Paciente = ID_Paciente;
        this.ID_Medico = ID_Medico;
        this.ID_Historia = ID_Historia;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String FechaCita) {
        this.FechaCita = FechaCita;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }

    public String getID_Cita() {
        return ID_Cita;
    }

    public void setID_Cita(String ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(String ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public String getID_Historia() {
        return ID_Historia;
    }

    public void setID_Historia(String ID_Historia) {
        this.ID_Historia = ID_Historia;
    }

   
    
}
