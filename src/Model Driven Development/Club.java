package Model Driven Development;


/**
* @generated
*/
public class Club {
    
    /**
    * @generated
    */
    private String Nit;
    
    /**
    * @generated
    */
    private String Nombre;
    
    /**
    * @generated
    */
    private int TarifaAnual;
    
    /**
    * @generated
    */
    private int Total Cupos;
    
    
    /**
    * @generated
    */
    private Set<Empleado> empleado;
    
    /**
    * @generated
    */
    private Set<Miembro> miembro;
    
    

    /**
    * @generated
    */
    public String getNit() {
        return this.Nit;
    }
    
    /**
    * @generated
    */
    public String setNit(String Nit) {
        this.Nit = Nit;
    }
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.Nombre;
    }
    
    /**
    * @generated
    */
    public String setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    /**
    * @generated
    */
    public int getTarifaAnual() {
        return this.TarifaAnual;
    }
    
    /**
    * @generated
    */
    public int setTarifaAnual(Integer TarifaAnual) {
        this.TarifaAnual = TarifaAnual;
    }
    
    
    /**
    * @generated
    */
    public int getTotal Cupos() {
        return this.Total Cupos;
    }
    
    /**
    * @generated
    */
    public int setTotal Cupos(Integer Total Cupos) {
        this.Total Cupos = Total Cupos;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Miembro> getMiembro() {
        if (this.miembro == null) {
            this.miembro = new HashSet<Miembro>();
        }
        return this.miembro;
    }
    
    /**
    * @generated
    */
    public Set<Miembro> setMiembro(Miembro miembro) {
        this.miembro = miembro;
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
