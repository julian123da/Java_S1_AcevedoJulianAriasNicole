package hospitaljn;
public final class Pacientes {
        String nombre;
        String numero_documento;
        int edad;
        String motivo;
        String telefono;
        String tipoPaciente;
        String estado;

    public Pacientes(String nombre, String numero_documento, int edad, String motivo, String telefono, String tipoPaciente, String estado) {
        this.nombre = nombre;
        this.numero_documento = numero_documento;
        this.edad = edad;
        this.motivo = motivo;
        this.telefono = telefono;
        this.tipoPaciente = tipo_paciente_actual();
        this.estado = estado;
    }
    
    String tipo_paciente_actual(){
        if (edad > 18){
            return tipoPaciente = "Mayor";
        }else {
         return tipoPaciente  = "Menor";
    }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
        
       
    
}