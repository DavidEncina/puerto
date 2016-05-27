
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // Almacena el nombre del cliente
    private String nombre;
    // Almacena el dni del cliente
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente()
    {
    }
    
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve el nombre del cliente
     * @return
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve el dni del cliente
     * @return
     */
    public String getDni()
    {
        return dni;
    }
    
    /**
     * Devuelve las caracteristicas del cliente
     */
    public String toString()
    {
        return "Nombre: " + nombre + "|nDNI: " + dni;
    }
}
