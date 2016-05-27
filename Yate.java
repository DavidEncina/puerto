
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // Almacena el numero de camarotes del yate
    private int numeroCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate()
    {
    }
    
    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, float eslora, int anoFabricacion, int potencia, int numeroCamarotes)
    {
        super(matricula, eslora, anoFabricacion, potencia);
        this.numeroCamarotes = numeroCamarotes;
    }

    /**
     * Devuelve el numero de camarotes del yate
     * @return
     */
    public int sampleMethod(int y)
    {
        return numeroCamarotes;
    }
    
    /**
     * Devuelve las caracteristicas de la embarcacion a motor
     * @return
     */
    @Override
    public String toString()
    {
        super.toString();
        return "\nNumero de camarotes: " + numeroCamarotes;
    }
}
