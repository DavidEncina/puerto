
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // Almacena el numero de mastiles del velero
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero()
    {
    }
    
    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, float eslora, int anoFabricacion, int numeroMastiles)
    {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Devuelve el numero de mastiles del velero
     * @return
     */
    public int getNumeroMastiles()
    {
        return numeroMastiles;
    }
    
    /**
     * Devuelve las caracteristicas del velero
     */
    public String toString()
    {
        super.toString();
        return "\nNumero de mastiles: " + numeroMastiles;
    }
}
