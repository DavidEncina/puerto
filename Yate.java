
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // Almacena el numero de camarotes del yate
    private int camarotes;
    
    /**
     * Constructor for objects of class Yate
     */
    public Yate(int potencia, int camarotes, String matricula, float eslora, int anoFabricacion)
    {
        super(potencia, matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }
    
    /**
     * Coeficiente necesario para calcular el alquiler de los amarres
     */
    @Override
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * Devuelve las caracteristicas de la embarcacion a motor
     * @return
     */
    @Override
    public String toString()
    {
        String data = super.toString();
        data += "\nNumero de camarotes: " + camarotes;
        return data;
    }   
}
