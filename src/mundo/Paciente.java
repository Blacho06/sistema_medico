package mundo;

/**
 *
 * @author zasca
 */
public class Paciente {
    
    public String ID_Paciente;
    public String Nombre_Paciente;
    public String Edad;
    public String Telefono;
    public String Direccion;

    public Paciente(String ID_Paciente, String Nombre_Paciente, String Edad, String Telefono, String Direccion) {
        this.ID_Paciente = ID_Paciente;
        this.Nombre_Paciente = Nombre_Paciente;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getNombre_Paciente() {
        return Nombre_Paciente;
    }

    public void setNombre_Paciente(String Nombre_Paciente) {
        this.Nombre_Paciente = Nombre_Paciente;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   
    

}