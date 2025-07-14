package utp.SistemaEducativo.Unid03.Tema08_Reproductor;

/**
 * Representa un nodo dentro de una pila de canciones. Cada nodo contiene una
 * instancia de {@link Cancion} y una referencia al siguiente nodo en la pila.
 *
 * Esta estructura permite implementar el historial de canciones reproducidas
 * mediante el uso de una pila enlazada (estructura tipo LIFO).
 *
 * @author Jhair
 * @version 1.0
 */
public class NodoCancion {

    /**
     * Canción contenida en este nodo
     */
    private Cancion cancion;

    /**
     * Referencia al siguiente nodo en la pila
     */
    private NodoCancion siguiente;

    /**
     * Crea un nuevo nodo que contiene una canción dada.
     *
     * @param cancion La canción que se almacenará en el nodo
     */
    public NodoCancion(Cancion cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }

    /**
     * Obtiene la canción almacenada en este nodo.
     *
     * @return La canción de este nodo
     */
    public Cancion getCancion() {
        return cancion;
    }

    /**
     * Obtiene la referencia al siguiente nodo en la pila.
     *
     * @return El siguiente nodo
     */
    public NodoCancion getSiguiente() {
        return siguiente;
    }

    /**
     * Establece la referencia al siguiente nodo en la pila.
     *
     * @param siguiente El nodo que será el siguiente en la pila
     */
    public void setSiguiente(NodoCancion siguiente) {
        this.siguiente = siguiente;
    }
}
