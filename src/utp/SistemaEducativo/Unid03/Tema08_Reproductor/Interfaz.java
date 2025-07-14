package utp.SistemaEducativo.Unid03.Tema08_Reproductor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Interfaz gráfica del reproductor de música basado en pilas. Permite al
 * usuario seleccionar canciones, reproducirlas, pausar, reanudar, retroceder, y
 * visualizar el historial de canciones reproducidas.
 *
 * Integra los componentes {@link Reproductor}, {@link PilaCanciones} y
 * {@link Cancion} para simular el funcionamiento de una pila en el contexto de
 * reproducción de música.
 *
 * Las canciones se cargan desde una carpeta local llamada "canciones".
 *
 * @author Jhair
 * @version 1.0
 */
public class Interfaz extends JFrame {

    private DefaultListModel<Cancion> modeloLista = new DefaultListModel<>();
    private JList<Cancion> listaCanciones = new JList<>(modeloLista);
    private PilaCanciones pila = new PilaCanciones();
    private Reproductor reproductor = new Reproductor();
    private JLabel labelActual = new JLabel("🎵 Canción actual: -");
    private JTextArea areaHistorial = new JTextArea(10, 25);
    private JSlider volumenSlider = new JSlider(0, 100, 50);

    /**
     * Constructor. Inicializa la interfaz gráfica, carga las canciones y
     * configura los componentes visuales y sus eventos.
     */
    public Interfaz() {
        setTitle("🎧 Reproductor de Música - Unidad 3: Pilas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(950, 550);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        cargarCanciones();

        labelActual.setFont(new Font("Segoe UI", Font.BOLD, 16));
        labelActual.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelActual, BorderLayout.NORTH);

        listaCanciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaCanciones.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JScrollPane scrollLista = new JScrollPane(listaCanciones);
        scrollLista.setPreferredSize(new Dimension(250, 450));
        add(scrollLista, BorderLayout.WEST);

        areaHistorial.setEditable(false);
        areaHistorial.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollHistorial = new JScrollPane(areaHistorial);
        scrollHistorial.setPreferredSize(new Dimension(250, 450));
        add(scrollHistorial, BorderLayout.EAST);

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Font botonFont = new Font("Segoe UI", Font.PLAIN, 13);
        Dimension botonSize = new Dimension(120, 35);

        JButton btnPlay = crearBoton("Play", botonFont, botonSize);
        JButton btnPausar = crearBoton("Pausar", botonFont, botonSize);
        JButton btnReanudar = crearBoton("Reanudar", botonFont, botonSize);
        JButton btnAnterior = crearBoton("Anterior", botonFont, botonSize);
        JButton btnEliminar = crearBoton("Eliminar", botonFont, botonSize);
        JButton btnHistorial = crearBoton("Historial", botonFont, botonSize);
        JButton btnLimpiar = crearBoton("Limpiar", botonFont, botonSize);

        // Asignar acciones a los botones
        btnPlay.addActionListener(e -> reproducir());
        btnPausar.addActionListener(e -> pausar());
        btnReanudar.addActionListener(e -> reanudar());
        btnAnterior.addActionListener(e -> anterior());
        btnEliminar.addActionListener(e -> eliminar());
        btnHistorial.addActionListener(e -> mostrarHistorial());
        btnLimpiar.addActionListener(e -> limpiarPila());

        panelBotones.add(btnPlay);
        panelBotones.add(btnPausar);
        panelBotones.add(btnReanudar);
        panelBotones.add(btnAnterior);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnHistorial);

        JPanel panelVolumen = new JPanel();
        panelVolumen.setLayout(new BoxLayout(panelVolumen, BoxLayout.X_AXIS));
        JLabel labelVolumen = new JLabel("🔊 Volumen: ");
        volumenSlider.addChangeListener(e -> {
            double valor = volumenSlider.getValue() / 100.0;
            reproductor.setVolumen(valor);
        });
        panelVolumen.add(labelVolumen);
        panelVolumen.add(volumenSlider);

        panelCentral.add(panelBotones);
        panelCentral.add(Box.createVerticalStrut(15));
        panelCentral.add(panelVolumen);
        panelCentral.add(Box.createVerticalStrut(15));
        panelCentral.add(btnLimpiar);

        add(panelCentral, BorderLayout.CENTER);
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * Crea un botón con el texto, fuente y tamaño especificado.
     *
     * @param texto Texto del botón
     * @param fuente Fuente usada en el botón
     * @param dimension Dimensiones del botón
     * @return Instancia del botón creado
     */
    private JButton crearBoton(String texto, Font fuente, Dimension dimension) {
        JButton boton = new JButton(texto);
        boton.setFont(fuente);
        boton.setPreferredSize(dimension);
        return boton;
    }

    /**
     * Carga todas las canciones .mp3 encontradas en la carpeta "canciones" y
     * las agrega a la lista visual.
     */
    private void cargarCanciones() {
        File carpeta = new File("canciones");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        File[] archivos = carpeta.listFiles();
        if (archivos == null || archivos.length == 0) {
            return;
        }

        for (File archivo : archivos) {
            if (archivo.getName().toLowerCase().endsWith(".mp3")) {
                modeloLista.addElement(new Cancion(
                        archivo.getName().replace(".mp3", ""),
                        "Artista desconocido",
                        archivo.getAbsolutePath()
                ));
            }
        }
    }

    /**
     * Reproduce la canción seleccionada en la lista y la apila si no es la
     * misma que la última reproducida.
     */
    private void reproducir() {
        Cancion seleccionada = listaCanciones.getSelectedValue();
        if (seleccionada == null) {
            JOptionPane.showMessageDialog(this, "Selecciona una canción.");
            return;
        }
        Cancion actual = pila.cima();
        if (actual == null || !actual.getRuta().equals(seleccionada.getRuta())) {
            pila.apilar(seleccionada);
        }
        labelActual.setText("Reproduciendo: " + seleccionada);
        reproductor.reproducir(seleccionada.getRuta());
    }

    /**
     * Pausa la canción actual y actualiza la etiqueta
     */
    private void pausar() {
        reproductor.pausar();
        labelActual.setText("Reproducción en pausa");
    }

    /**
     * Reanuda la canción actual y actualiza la etiqueta
     */
    private void reanudar() {
        reproductor.reanudar();
        labelActual.setText("Reanudando reproducción");
    }

    /**
     * Desapila la canción actual y reproduce la anterior si existe. Si no hay
     * canciones restantes, detiene la reproducción.
     */
    private void anterior() {
        pila.desapilar();
        Cancion anterior = pila.cima();
        if (anterior != null) {
            labelActual.setText("Volviendo a: " + anterior);
            reproductor.reproducir(anterior.getRuta());
        } else {
            labelActual.setText("Canción actual: -");
            reproductor.detener();
        }
    }

    /**
     * Elimina la canción seleccionada de la lista de reproducción.
     */
    private void eliminar() {
        Cancion seleccionada = listaCanciones.getSelectedValue();
        if (seleccionada != null) {
            modeloLista.removeElement(seleccionada);
            JOptionPane.showMessageDialog(this, "Canción eliminada de la lista.");
        }
    }

    /**
     * Muestra en el área de historial todas las canciones apiladas en la pila.
     * Se hace una copia temporal para mantener el orden original.
     */
    private void mostrarHistorial() {
        if (pila.estaVacia()) {
            areaHistorial.setText("No hay canciones en el historial.");
            return;
        }

        StringBuilder sb = new StringBuilder("Historial de canciones:\n");
        PilaCanciones copia = new PilaCanciones();

        while (!pila.estaVacia()) {
            Cancion c = pila.desapilar();
            sb.append("- ").append(c).append("\n");
            copia.apilar(c);
        }

        while (!copia.estaVacia()) {
            pila.apilar(copia.desapilar());
        }

        areaHistorial.setText(sb.toString());
    }

    /**
     * Vacía completamente la pila, detiene la reproducción y limpia el
     * historial.
     */
    private void limpiarPila() {
        pila.vaciar();
        reproductor.detener();
        labelActual.setText("Canción actual: -");
        areaHistorial.setText("");
        JOptionPane.showMessageDialog(this, "Historial borrado y reproducción detenida.");
    }

    /**
     * Método principal para lanzar la aplicación Swing.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz().setVisible(true));
    }
}
