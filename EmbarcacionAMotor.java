
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    // Almacena la potencia de la embarcacion a motor
    private int potencia;
    
    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, float eslora, int anoFabricacion, int potencia)
    {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }
    
    /**
     * Coeficiente necesario para calcular el alquiler de los amarres
     */
    @Override
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
    /**
     * Devuelve las caracteristicas de la embarcacion a motor
     */
    @Override
    public String toString()
    {
        super.toString();
        return "\nPotencia: " + potencia;
    }
}
