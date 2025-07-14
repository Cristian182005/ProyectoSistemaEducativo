package utp.SistemaEducativo.Unid03.Tema08_ChatVirtual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Ventana principal del Asistente Virtual para atención en un restaurante.
 * Utiliza una interfaz gráfica construida con Swing y una estructura de cola
 * (FIFO) para gestionar clientes en espera.
 *
 * Funcionalidades:
 * <ul>
 * <li>Agregar clientes a una cola</li>
 * <li>Atender clientes uno por uno</li>
 * <li>Confirmar si el pedido fue recibido</li>
 * <li>Reagregar clientes no satisfechos al final de la cola</li>
 * <li>Enviar mensajes y obtener respuestas automáticas</li>
 * </ul>
 *
 * Este proyecto demuestra el uso de la estructura de datos **Cola** junto con
 * interfaces gráficas en Java.
 *
 * @author Jhair
 * @version 1.0
 */
public class VentanaChat extends JFrame {

    // Componentes de interfaz
    private JTextArea areaChat;
    private JTextField campoEntrada;
    private JButton btnEnviar;

    // Lista de clientes visibles
    private DefaultListModel<String> modeloClientes = new DefaultListModel<>();
    private JList<String> listaClientes = new JList<>(modeloClientes);

    // Estructura de cola para atención
    private Queue<String> colaClientes = new LinkedList<>();
    private String clienteActual = null;

    /**
     * Constructor de la ventana. Inicializa la interfaz gráfica y todos los
     * componentes necesarios para el chat.
     */
    public VentanaChat() {
        setTitle("Chat Virtual - Atención Restaurante");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        Font fuentePrincipal = new Font("Segoe UI", Font.PLAIN, 15);

        // Panel izquierdo: clientes en espera
        JPanel panelClientes = new JPanel(new BorderLayout(5, 5));
        panelClientes.setBorder(BorderFactory.createTitledBorder(" Clientes"));
        listaClientes.setFont(fuentePrincipal);
        JScrollPane scrollClientes = new JScrollPane(listaClientes);
        panelClientes.add(scrollClientes, BorderLayout.CENTER);

        // Controles para manipular la cola
        JPanel panelControles = new JPanel(new GridLayout(5, 1, 5, 5));
        JTextField campoNombre = new JTextField();
        campoNombre.setFont(fuentePrincipal);
        JButton btnAgregar = new JButton("Agregar Cliente");
        JButton btnVerActual = new JButton("Ver Actual");
        JButton btnAtender = new JButton("Atender Siguiente");
        JButton btnVaciar = new JButton(" Vaciar Cola");

        btnAgregar.setFont(fuentePrincipal);
        btnVerActual.setFont(fuentePrincipal);
        btnAtender.setFont(fuentePrincipal);
        btnVaciar.setFont(fuentePrincipal);

        panelControles.add(campoNombre);
        panelControles.add(btnAgregar);
        panelControles.add(btnVerActual);
        panelControles.add(btnAtender);
        panelControles.add(btnVaciar);

        panelClientes.add(panelControles, BorderLayout.SOUTH);
        add(panelClientes, BorderLayout.WEST);

        // Panel central: área de chat
        JPanel panelChat = new JPanel(new BorderLayout(5, 5));
        panelChat.setBorder(BorderFactory.createTitledBorder("Chat de Atención"));
        areaChat = new JTextArea();
        areaChat.setFont(fuentePrincipal);
        areaChat.setEditable(false);
        JScrollPane scrollChat = new JScrollPane(areaChat);
        panelChat.add(scrollChat, BorderLayout.CENTER);

        // Panel de entrada de mensajes
        JPanel panelEntrada = new JPanel(new BorderLayout(5, 5));
        campoEntrada = new JTextField();
        campoEntrada.setFont(fuentePrincipal);
        btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(fuentePrincipal);
        panelEntrada.add(campoEntrada, BorderLayout.CENTER);
        panelEntrada.add(btnEnviar, BorderLayout.EAST);
        panelChat.add(panelEntrada, BorderLayout.SOUTH);

        add(panelChat, BorderLayout.CENTER);

        // Acciones de botones
        btnAgregar.addActionListener(e -> {
            String nombre = campoNombre.getText().trim();
            if (!nombre.isEmpty()) {
                agregarCliente(nombre);
                campoNombre.setText("");
            }
        });

        btnVerActual.addActionListener(e -> {
            if (clienteActual != null) {
                JOptionPane.showMessageDialog(this, "Cliente actual: " + clienteActual);
            } else {
                JOptionPane.showMessageDialog(this, "No hay cliente en atención.");
            }
        });

        btnAtender.addActionListener(e -> atenderCliente());

        btnVaciar.addActionListener(e -> {
            colaClientes.clear();
            modeloClientes.clear();
            JOptionPane.showMessageDialog(this, "Cola vaciada correctamente.");
        });

        btnEnviar.addActionListener(e -> enviarMensaje());
        campoEntrada.addActionListener(e -> enviarMensaje());
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * Agrega un nuevo cliente a la cola y a la lista visual.
     *
     * @param nombre Nombre del cliente
     */
    private void agregarCliente(String nombre) {
        colaClientes.add(nombre);
        modeloClientes.addElement(nombre);
    }

    /**
     * Atiende al siguiente cliente en la cola. Pregunta si el pedido fue
     * recibido correctamente. Si no, lo reubica al final de la cola.
     */
    private void atenderCliente() {
        if (clienteActual != null) {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "¿El cliente recibió correctamente su pedido?",
                    "Confirmación de atención",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.NO_OPTION) {
                colaClientes.add(clienteActual);
                modeloClientes.addElement(clienteActual);
                JOptionPane.showMessageDialog(this,
                        "El cliente ha sido puesto nuevamente en la cola para recibir una mejor atención.");
                System.err.println("⚠ Cliente no atendido correctamente: " + clienteActual);
            }
        }

        if (!colaClientes.isEmpty()) {
            clienteActual = colaClientes.poll();
            modeloClientes.remove(0);
            areaChat.setText(" Hola " + clienteActual + "! ¿En qué podemos ayudarte hoy?\n");
        } else {
            clienteActual = null;
            JOptionPane.showMessageDialog(this, "No hay más clientes en espera.");
        }
    }

    /**
     * Envia un mensaje del cliente actual y genera una respuesta automática.
     */
    private void enviarMensaje() {
        if (clienteActual == null) {
            JOptionPane.showMessageDialog(this, "Primero debes atender a un cliente.");
            return;
        }

        String mensaje = campoEntrada.getText().trim();
        if (!mensaje.isEmpty()) {
            areaChat.append("" + clienteActual + ": " + mensaje);
            campoEntrada.setText("");
            responderAutomaticamente(mensaje);
        }
    }

    /**
     * Genera una respuesta automática basada en palabras clave del mensaje.
     *
     * @param mensaje Texto ingresado por el cliente
     */
    private void responderAutomaticamente(String mensaje) {
        String respuesta;
        mensaje = mensaje.toLowerCase();

        if (mensaje.contains("hamburguesa")) {
            respuesta = " Perfecto, le enviaremos una hamburguesa recién hecha.";
        } else if (mensaje.contains("gracias")) {
            respuesta = "¡Con gusto, estamos para atenderte!";
        } else if (mensaje.contains("bebida") || mensaje.contains("gaseosa")) {
            respuesta = " Enseguida le llevamos su bebida favorita.";
        } else if (mensaje.contains("adiós") || mensaje.contains("nos vemos")) {
            respuesta = "¡Hasta pronto!";
        } else {
            respuesta = "Nuestro asistente está procesando tu pedido.";
        }

        areaChat.append("Asistente: " + respuesta + "\n");
    }

    /**
     * Método principal que inicia la aplicación gráfica del asistente virtual.
     *
     * @param args Argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaChat().setVisible(true));
    }
}
