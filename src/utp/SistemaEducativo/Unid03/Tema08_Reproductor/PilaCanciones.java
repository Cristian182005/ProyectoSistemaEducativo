package utp.SistemaEducativo.Unid03.Tema08_Reproductor;

/**
 * Implementa una pila de canciones utilizando nodos enlazados. Esta estructura
 * permite almacenar el historial de canciones reproducidas y controlar su
 * reproducción usando una lógica LIFO (último en entrar, primero en salir).
 *
 * Se puede apilar una canción, desapilar, ver la cima, vaciar la pila, contar
 * elementos y reproducir la última canción.
 *
 * @author Jhair
 * @version 1.0
 */
public class PilaCanciones {

    /**
     * Nodo que representa la cima de la pila
     */
    private NodoCancion cima;

    /**
     * Constructor que inicializa la pila vacía.
     */
    public PilaCanciones() {
        this.cima = null;
    }

    /**
     * Agrega una nueva canción a la cima de la pila.
     *
     * @param cancion La canción a apilar
     */
    public void apilar(Cancion cancion) {
        NodoCancion nuevoNodo = new NodoCancion(cancion);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
    }

    /**
     * Elimina la canción en la cima de la pila y la retorna.
     *
     * @return La canción eliminada, o null si la pila está vacía
     */
    public Cancion desapilar() {
        if (estaVacia()) {
            return null;
        }
        Cancion cancion = cima.getCancion();
        cima = cima.getSiguiente();
        return cancion;
    }

    /**
     * Devuelve la canción que está en la cima de la pila, sin eliminarla.
     *
     * @return La canción en la cima, o null si la pila está vacía
     */
    public Cancion cima() {
        if (estaVacia()) {
            return null;
        }
        return cima.getCancion();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si no hay canciones en la pila, false en caso contrario
     */
    public boolean estaVacia() {
        return cima == null;
    }

    /**
     * Devuelve el número total de canciones en la pila.
     *
     * @return Cantidad de canciones apiladas
     */
    public int size() {
        int contador = 0;
        NodoCancion actual = cima;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    /**
     * Elimina todas las canciones de la pila.
     */
    public void vaciar() {
        cima = null;
    }

    /**
     * Muestra por consola el historial completo de canciones reproducidas. Se
     * imprime desde la más reciente hasta la más antigua.
     */
    public void mostrarHistorial() {
        if (estaVacia()) {
            System.out.println("No hay canciones en el historial.");
            return;
        }
        System.out.println("Historial de canciones:");
        NodoCancion actual = cima;
        while (actual != null) {
            System.out.println("- " + actual.getCancion());
            actual = actual.getSiguiente();
        }
    }

    /**
     * Reproduce la canción que se encuentra en la cima de la pila utilizando
     * una instancia del {@link Reproductor}.
     *
     * @param reproductor El objeto reproductor encargado de ejecutar la canción
     */
    public void reproducirCima(Reproductor reproductor) {
        Cancion actual = cima();
        if (actual != null) {
            System.out.println("Reproduciendo: " + actual);
            reproductor.reproducir(actual.getRuta());
        } else {
            System.out.println("La pila está vacía. No hay canción para reproducir.");
        }
    }
}
