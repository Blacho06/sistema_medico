
package mundo;

/**
 *
 * @author Janus
 */
public class Orden {
    public String Fecha_Orden;
    public String ID_Orden;
    public String ID_Cita;
    public String Tipo_Orden;

    public Orden(String Fecha_Orden, String ID_Orden, String ID_Cita, String Tipo_Orden) {
        this.Fecha_Orden = Fecha_Orden;
        this.ID_Orden = ID_Orden;
        this.ID_Cita = ID_Cita;
        this.Tipo_Orden = Tipo_Orden;
    }

    public String getFecha_Orden() {
        return Fecha_Orden;
    }

    public void setFecha_Orden(String Fecha_Orden) {
        this.Fecha_Orden = Fecha_Orden;
    }

    public String getID_Orden() {
        return ID_Orden;
    }

    public void setID_Orden(String ID_Orden) {
        this.ID_Orden = ID_Orden;
    }

    public String getID_Cita() {
        return ID_Cita;
    }

    public void setID_Cita(String ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public String getTipo_Orden() {
        return Tipo_Orden;
    }

    public void setTipo_Orden(String Tipo_Orden) {
        this.Tipo_Orden = Tipo_Orden;
    }
    


   
 
}
