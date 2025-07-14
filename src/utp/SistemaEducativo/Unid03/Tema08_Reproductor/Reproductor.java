package utp.SistemaEducativo.Unid03.Tema08_Reproductor;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import java.io.File;

/**
 * Clase encargada de gestionar la reproducción de archivos de música (.mp3)
 * utilizando la librería externa BasicPlayer.
 *
 * Ofrece funcionalidades para reproducir, pausar, reanudar, detener y ajustar
 * el volumen de una canción.
 *
 * Es utilizada por la clase {@link PilaCanciones} para reproducir canciones
 * apiladas en el historial.
 *
 * @author Jhair
 * @version 1.0
 */
public class Reproductor {

    /**
     * Instancia del reproductor BasicPlayer
     */
    private BasicPlayer player;

    /**
     * Ruta del archivo actualmente en reproducción
     */
    private String rutaActual;

    /**
     * Constructor. Inicializa una nueva instancia del reproductor.
     */
    public Reproductor() {
        player = new BasicPlayer();
    }

    /**
     * Reproduce una canción a partir de su ruta en el sistema de archivos. Si
     * hay una canción reproduciéndose, la detiene primero.
     *
     * @param ruta Ruta absoluta del archivo .mp3
     */
    public void reproducir(String ruta) {
        try {
            detener(); // Siempre detenemos la anterior primero
            File cancion = new File(ruta);
            rutaActual = ruta;
            player.open(cancion);
            player.play();
        } catch (BasicPlayerException e) {
            System.out.println("🎵 Error al reproducir: " + e.getMessage());
        }
    }

    /**
     * Pausa temporalmente la reproducción de la canción actual.
     */
    public void pausar() {
        try {
            player.pause();
        } catch (BasicPlayerException e) {
            System.out.println("⏸ Error al pausar: " + e.getMessage());
        }
    }

    /**
     * Reanuda la reproducción de la canción pausada.
     */
    public void reanudar() {
        try {
            player.resume();
        } catch (BasicPlayerException e) {
            System.out.println("🔄 Error al reanudar: " + e.getMessage());
        }
    }

    /**
     * Detiene completamente la reproducción en curso.
     */
    public void detener() {
        try {
            player.stop();
        } catch (BasicPlayerException e) {
            System.out.println("⏹ Error al detener: " + e.getMessage());
        }
    }

    /**
     * Ajusta el volumen de la reproducción.
     *
     * @param nivel Nivel de volumen entre 0.0 (silencio) y 1.0 (máximo)
     */
    public void setVolumen(double nivel) {
        try {
            if (nivel < 0.0) {
                nivel = 0.0;
            }
            if (nivel > 1.0) {
                nivel = 1.0;
            }
            player.setGain(nivel);
        } catch (BasicPlayerException e) {
            System.out.println("🔊 Error al cambiar volumen: " + e.getMessage());
        }
    }
}
