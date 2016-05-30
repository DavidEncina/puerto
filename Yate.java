
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // Almacena el numero de camarotes del yate
    private int camarotes;
    
    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, float eslora, int anoFabricacion, int potencia, int camarotes)
    {
        super(matricula, eslora, anoFabricacion, potencia);
        this.camarotes = camarotes;
    }
    
    /**
     * Coeficiente necesario para calcular el alquiler de los amarres
     */
    @Override
    public int getCoeficienteBernua()
    {
        return getCoeficienteBernua() + camarotes;
    }
    
    /**
     * Devuelve las caracteristicas de la embarcacion a motor
     * @return
     */
    @Override
    public String toString()
    {
        super.toString();
        return "\nNumero de camarotes: " + camarotes;
    }   
}
