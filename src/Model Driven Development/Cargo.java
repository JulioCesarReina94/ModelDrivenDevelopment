package Model Driven Development;


/**
* @generated
*/
public class Cargo {
    
    /**
    * @generated
    */
    private int idCargo;
    
    /**
    * @generated
    */
    private String nombreCargo;
    
    
    /**
    * @generated
    */
    private Set<Empleado> empleado;
    
    

    /**
    * @generated
    */
    public int getIdCargo() {
        return this.idCargo;
    }
    
    /**
    * @generated
    */
    public int setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }
    
    
    /**
    * @generated
    */
    public String getNombreCargo() {
        return this.nombreCargo;
    }
    
    /**
    * @generated
    */
    public String setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Empleado> getEmpleado() {
        if (this.empleado == null) {
            this.empleado = new HashSet<Empleado>();
        }
        return this.empleado;
    }
    
    /**
    * @generated
    */
    public Set<Empleado> setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    
}
