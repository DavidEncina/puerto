
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // Almacena una coleccion de alquileres
    private Alquiler[] alquileres;
    // Almacena el numero de amarres que hay en el puerto
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Añade un alquiler a la coleccion de alquileres
     * Devuelve la posicion del barco o -1 si no lo puede añadir
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {        
        int posicion = -1;
        int i = 0;
        while (i < alquileres.length && posicion == -1) {
            if (alquileres[i] == null) {
                alquileres[i] = new Alquiler(numeroDias, cliente, barco);
                posicion = i;
            }
            i++;
        }
        return posicion;
    }
    
    /**
     * Imprime el precio del alquiler si el amarre esta ocupado o te informa de si esta vacio
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] == null) {
                System.out.println("El amarre " + i + " esta vacio");
            }
            else {
                System.out.println("Precio del alquiler del amarre " + i + ": " + alquileres[i].getCosteAlquiler());
            }            
        }        
    }
    
    /**
     * Devuelve el coste del alquiler de un amarre y lo elimina de la coleccion
     */
    public float liquidarAlquiler(int posicion)
    {
        float coste = -1;
        if (posicion < NUMERO_AMARRES || posicion >= 0) {
            if (alquileres[posicion] != null) {
                coste = alquileres[posicion].getCosteAlquiler();
                alquileres[posicion] = null;
            }             
        }        
        return coste;
    }
}
