package Model Driven Development;


/**
* @generated
*/
public class Miembro extends Persona {
    
    /**
    * @generated
    */
    private int idMiembro;
    
    /**
    * @generated
    */
    private String fechaInicio;
    
    
    /**
    * @generated
    */
    private Set<Pago> pago;
    
    /**
    * @generated
    */
    private Club club;
    
    

    /**
    * @generated
    */
    public int getIdMiembro() {
        return this.idMiembro;
    }
    
    /**
    * @generated
    */
    public int setIdMiembro(Integer idMiembro) {
        this.idMiembro = idMiembro;
    }
    
    
    /**
    * @generated
    */
    public String getFechaInicio() {
        return this.fechaInicio;
    }
    
    /**
    * @generated
    */
    public String setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Pago> getPago() {
        if (this.pago == null) {
            this.pago = new HashSet<Pago>();
        }
        return this.pago;
    }
    
    /**
    * @generated
    */
    public Set<Pago> setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    /**
    * @generated
    */
    public Club getClub() {
        return this.club;
    }
    
    /**
    * @generated
    */
    public Club setClub(Club club) {
        this.club = club;
    }
    
    
    
}
