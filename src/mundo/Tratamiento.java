
package mundo;

/**
 *
 * @author Janus
 */
public class Tratamiento {
    
    public String ID_Tratamiento;
    public String ID_Historia;
    public String Tratamiento;

    public Tratamiento(String ID_Tratamiento, String ID_Historia, String Tratamiento) {
        this.ID_Tratamiento = ID_Tratamiento;
        this.ID_Historia = ID_Historia;
        this.Tratamiento = Tratamiento;
    }

    public String getID_Tratamiento() {
        return ID_Tratamiento;
    }

    public void setID_Tratamiento(String ID_Tratamiento) {
        this.ID_Tratamiento = ID_Tratamiento;
    }

    public String getID_Historia() {
        return ID_Historia;
    }

    public void setID_Historia(String ID_Historia) {
        this.ID_Historia = ID_Historia;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    
    
    
}
