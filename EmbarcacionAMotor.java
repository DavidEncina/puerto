
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
    public EmbarcacionAMotor()
    {
    }
    
    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, float eslora, int anoFabricacion, int potencia)
    {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    /**
     * Devuelve la potencia de la embarcacion a motor
     * @return 
     */
    public int getPotencia()
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
