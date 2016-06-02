import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // Almacena una coleccion de alquileres
    private ArrayList<Alquiler> alquileres;
    // Almacena el numero de amarres que hay en el puerto
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }

    /**
     * Añade un alquiler a la coleccion de alquileres
     * Devuelve la posicion del barco o -1 si no lo puede añadir
     */
    public int addAlquiler(int posicionGuardar, int numeroDias, Cliente cliente, Barco barco)
    {        
        int posicion = -1;
        if (posicionGuardar - 1 >= 0 && posicionGuardar -1 < NUMERO_AMARRES) {
            if (alquileres.size() == 0) {
                alquileres.add(new Alquiler(posicionGuardar, numeroDias, cliente, barco));
                posicion = posicionGuardar;
            }
            else {
                boolean coincideElAmare = false;
                int i = 0;
                while (i < alquileres.size()) {
                    if (alquileres.get(i).getAmarre() == posicionGuardar) {
                        coincideElAmare = true;
                    }
                    i++;
                }
                if (!coincideElAmare) {
                    alquileres.add(new Alquiler(posicionGuardar, numeroDias, cliente, barco));
                    posicion = posicionGuardar;
                }
            }
        }
        else {
            System.out.println("El amarre intyroducido debe estar entre 1 y " + NUMERO_AMARRES);
        }
        return posicion;
    }

    /**
     * Devuelve el precio del alquiler si el amarre esta ocupado o te informa de si esta vacio
     */
    public void verEstadoAmarres()
    {
        String estado[] = {"El amarre 1 esta vacio","El amarre 2 esta vacio","El amarre 3 esta vacio","El amarre 4 esta vacio"};
        String cadena = null;
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getAmarre() > 0) {
                 estado[alquileres.get(i).getAmarre() - 1]= "Precio del alquiler del amarre " + alquileres.get(i).getAmarre() + ": " + alquileres.get(i).getCosteAlquiler();                
            }           
        }
        for (int i = 0; i < estado.length; i++) {
            System.out.println(estado[i]);
        }
    }

    /**
     * Devuelve el coste del alquiler de un amarre y lo elimina de la coleccion
     */
    public float liquidarAlquiler(int posicion)
    {
        float coste = -1;
        if (posicion <= NUMERO_AMARRES && posicion > 0) {
            boolean alquilerLiquidado = false;
            int i = 0;
            while (i < alquileres.size() && !alquilerLiquidado) {
                if (alquileres.get(i).getAmarre() == posicion) {
                    coste = alquileres.get(posicion - 1).getCosteAlquiler();
                    alquileres.remove(posicion - 1);
                    alquilerLiquidado = true;
                }
                i++;
            }                 
        }
        else {
            System.out.println("El amarre intyroducido debe estar entre 1 y " + NUMERO_AMARRES);
        }
        return coste;
    }
}
