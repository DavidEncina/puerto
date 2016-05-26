
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco
{
    // Almacena la matriculacula del barco
    private String matricula;
    // Almacena la eslora del barco
    private float eslora;
    // Almacena el año fabricacion del barco
    private int anoFabricacion;    

    /**
     * Constructor for objects of class Barco
     */
    public Barco()
    {
    }
    
    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * Devuelve la matricula del barco
     * @return
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * Devuelve la eslora del barco
     * @return
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * Devuelve el año de fabricacion del barco
     * @return
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * Devuelve las caracteristicas del barco
     * @return
     */
    public String toString()
    {
        return "Matricula: " + matricula + "\nEslora; " + eslora + "\nAño de fabricacion: " + anoFabricacion;
    }
}
