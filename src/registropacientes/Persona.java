package registropacientes;

public class Persona {
    String nombre_completo;
    String numero_documento;
    int edad_paciente;
    String motivo_consulta;
    String telefonos;
    String tipo_paciente;
    String estado_paciente;

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(int edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    /*public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }*/

    public String getEstado_paciente() {
        return estado_paciente;
    }

    /*public void setEstado_paciente(String estado_paciente) {
        this.estado_paciente = estado_paciente;
    }*/

    public Persona(String nombre_completo, String numero_documento, int edad_paciente, String motivo_consulta, String telefonos) {
        this.nombre_completo = nombre_completo;
        this.numero_documento = numero_documento;
        this.edad_paciente = edad_paciente;
        this.motivo_consulta = motivo_consulta;
        this.telefonos = telefonos;
        this.tipo_paciente = categoriaPaciente();
        //this.estado_paciente = atencionPaciente();
    }

    String categoriaPaciente(){
        if (edad_paciente >= 18 || edad_paciente <=30 ) {
            System.out.println("Paciente Adulto Joven");
        } else if (edad_paciente >30 || edad_paciente >= 60){
            System.out.println("Paciente Adulto");
        } else if (edad_paciente >60){
            System.out.println("Paciente Adulto Mayor");
        } else {
            System.out.println("Paciente Menor de Edad");
        }
    }