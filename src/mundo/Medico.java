package mundo;


/**
 *
 * @author Jimmer
 */
public class Medico {

    
    public String ID_Medico;
    public String Nombre_Medico;
    public String ID_Especialidad;

    public Medico(String ID_Medico, String Nombre_Medico, String ID_Especialidad) {
        this.ID_Medico = ID_Medico;
        this.Nombre_Medico = Nombre_Medico;
        this.ID_Especialidad = ID_Especialidad;
        
    }

    public String getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(String ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public String getNombre_Medico() {
        return Nombre_Medico;
    }

    public void setNombre_Medico(String Nombre_Medico) {
        this.Nombre_Medico = Nombre_Medico;
    }

    public String getID_Especialidad() {
        return ID_Especialidad;
    }

    public void setID_Especialidad(String ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }
    

   
}
