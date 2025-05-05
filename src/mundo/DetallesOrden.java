
package mundo;

/**
 *
 * @author Janus
 */
public class DetallesOrden {
    public String ID_Detalles;
    public String ID_Orden;
    public String Descripcion;

    public DetallesOrden(String ID_Detalles, String ID_Orden, String Descripcion) {
        this.ID_Detalles = ID_Detalles;
        this.ID_Orden = ID_Orden;
        this.Descripcion = Descripcion;
    }

    public String getID_Detalles() {
        return ID_Detalles;
    }

    public void setID_Detalles(String ID_Detalles) {
        this.ID_Detalles = ID_Detalles;
    }

    public String getID_Orden() {
        return ID_Orden;
    }

    public void setID_Orden(String ID_Orden) {
        this.ID_Orden = ID_Orden;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
   

}
