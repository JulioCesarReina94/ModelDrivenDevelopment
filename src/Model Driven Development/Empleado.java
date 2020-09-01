package Model Driven Development;


/**
* @generated
*/
public class Empleado extends Persona {
    
    
    /**
    * @generated
    */
    private Set<Cargo> cargo;
    
    /**
    * @generated
    */
    private Club club;
    
    

    
    /**
    * @generated
    */
    public Set<Cargo> getCargo() {
        if (this.cargo == null) {
            this.cargo = new HashSet<Cargo>();
        }
        return this.cargo;
    }
    
    /**
    * @generated
    */
    public Set<Cargo> setCargo(Cargo cargo) {
        this.cargo = cargo;
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
