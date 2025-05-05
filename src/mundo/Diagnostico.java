
package mundo;

/**
 *
 * @author Janus
 */
public class Diagnostico {
    public String ID_Diagnostico;
    public String ID_Historia;
    public String Diagnostico;

    public Diagnostico(String ID_Diagnostico, String ID_Historia, String Diagnostico) {
        this.ID_Diagnostico = ID_Diagnostico;
        this.ID_Historia = ID_Historia;
        this.Diagnostico = Diagnostico;
    }

    public String getID_Diagnostico() {
        return ID_Diagnostico;
    }

    public void setID_Diagnostico(String ID_Diagnostico) {
        this.ID_Diagnostico = ID_Diagnostico;
    }

    public String getID_Historia() {
        return ID_Historia;
    }

    public void setID_Historia(String ID_Historia) {
        this.ID_Historia = ID_Historia;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
   

    
}
