
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // Almacena el numero de dias que se alquila un amarre
    private int numeroDias;
    // Almacena el cliente del amarre
    private Cliente cliente;
    // Almacena el barco del amarre
    private Barco barco;
    // Almacena el valor del alquiler
    private static final float VALOR_FIJO_ALQUILER = 300;
    // Almacena el valor multiplicador
    private static final float MULTIPLICADOR_ESLORA = 10;    

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numeroDias, Cliente cliente, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * Devuelve el coste del alquiler en €
     * @return
     */
    public float getCosteAlquiler()
    {
        return numeroDias * (MULTIPLICADOR_ESLORA * barco.getEslora()) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve las caracteristicas del alquiler
     */
    public String toString()
    {
        return "Cliente: " + cliente + "\nBarco: " + barco + "\nNumero de dias de alquiler: " + numeroDias + "\nCoste alquiler: " + getCosteAlquiler();
    }
}
