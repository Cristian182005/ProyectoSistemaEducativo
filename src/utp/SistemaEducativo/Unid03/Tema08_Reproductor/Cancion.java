package utp.SistemaEducativo.Unid03.Tema08_Reproductor;

/**
 * Representa una canción que puede ser reproducida por el reproductor de
 * música. Contiene información básica como el nombre, el artista y la ruta del
 * archivo de audio.
 *
 * Esta clase es utilizada como elemento en la pila del reproductor de música,
 * permitiendo almacenar y gestionar el historial de canciones reproducidas.
 *
 * @author Jhair
 * @version 1.0
 */
public class Cancion {

    /**
     * Nombre de la canción
     */
    private String nombre;

    /**
     * Nombre del artista o banda
     */
    private String artista;

    /**
     * Ruta del archivo de audio (.mp3) en el sistema de archivos
     */
    private String ruta;

    /**
     * Constructor que inicializa una nueva canción con los datos especificados.
     *
     * @param nombre Nombre de la canción
     * @param artista Nombre del artista o banda
     * @param ruta Ruta del archivo de audio en el sistema
     */
    public Cancion(String nombre, String artista, String ruta) {
        this.nombre = nombre;
        this.artista = artista;
        this.ruta = ruta;
    }

    /**
     * Obtiene el nombre de la canción.
     *
     * @return Nombre de la canción
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el nombre del artista.
     *
     * @return Nombre del artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Obtiene la ruta del archivo de la canción.
     *
     * @return Ruta del archivo de audio
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Devuelve una representación en texto de la canción, con formato: "Nombre
     * - Artista".
     *
     * @return Representación textual de la canción
     */
    @Override
    public String toString() {
        return nombre + " - " + artista;
    }
}
