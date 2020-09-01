package Model Driven Development;


/**
* @generated
*/
public class Persona {
    
    /**
    * @generated
    */
    private String tipoIdentificacion;
    
    /**
    * @generated
    */
    private int NroIdentifiacion;
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String apellido;
    
    /**
    * @generated
    */
    private String sexo;
    
    /**
    * @generated
    */
    private int nroTelefono;
    
    /**
    * @generated
    */
    private String fechaNacimiento;
    
    /**
    * @generated
    */
    private String direccion;
    
    /**
    * @generated
    */
    private String correo;
    
    
    /**
    * @generated
    */
    private Set<Solicitud> solicitud;
    
    

    /**
    * @generated
    */
    public String getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }
    
    /**
    * @generated
    */
    public String setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
    
    
    /**
    * @generated
    */
    public int getNroIdentifiacion() {
        return this.NroIdentifiacion;
    }
    
    /**
    * @generated
    */
    public int setNroIdentifiacion(Integer NroIdentifiacion) {
        this.NroIdentifiacion = NroIdentifiacion;
    }
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public String setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
    * @generated
    */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @generated
    */
    public String setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    /**
    * @generated
    */
    public String getSexo() {
        return this.sexo;
    }
    
    /**
    * @generated
    */
    public String setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    /**
    * @generated
    */
    public int getNroTelefono() {
        return this.nroTelefono;
    }
    
    /**
    * @generated
    */
    public int setNroTelefono(Integer nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
    
    
    /**
    * @generated
    */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
    * @generated
    */
    public String setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public String setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    /**
    * @generated
    */
    public String getCorreo() {
        return this.correo;
    }
    
    /**
    * @generated
    */
    public String setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Solicitud> getSolicitud() {
        if (this.solicitud == null) {
            this.solicitud = new HashSet<Solicitud>();
        }
        return this.solicitud;
    }
    
    /**
    * @generated
    */
    public Set<Solicitud> setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    
    
}
