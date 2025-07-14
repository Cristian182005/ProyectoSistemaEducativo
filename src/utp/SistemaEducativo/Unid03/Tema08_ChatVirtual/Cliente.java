package utp.SistemaEducativo.Unid03.Tema08_ChatVirtual;

/**
 * Representa a un cliente que solicita atención en el asistente virtual del
 * restaurante. Cada cliente tiene un nombre, un pedido y un número de turno que
 * indica el orden en la cola de atención.
 *
 * Esta clase es utilizada en estructuras de tipo cola (FIFO) para modelar el
 * flujo de atención de clientes.
 *
 * @author Jhair
 * @version 1.0
 */
public class Cliente {

    /**
     * Nombre del cliente
     */
    private String nombre;

    /**
     * Descripción del pedido del cliente
     */
    private String pedido;

    /**
     * Número de turno asignado al cliente
     */
    private int numeroTurno;

    /**
     * Constructor que inicializa un nuevo cliente con nombre, pedido y número
     * de turno.
     *
     * @param nombre Nombre del cliente
     * @param pedido Pedido realizado por el cliente
     * @param numeroTurno Número de turno asignado (orden en la cola)
     */
    public Cliente(String nombre, String pedido, int numeroTurno) {
        this.nombre = nombre;
        this.pedido = pedido;
        this.numeroTurno = numeroTurno;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del pedido del cliente.
     *
     * @return Pedido del cliente
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * Obtiene el número de turno del cliente.
     *
     * @return Turno del cliente en la cola
     */
    public int getNumeroTurno() {
        return numeroTurno;
    }

    /**
     * Devuelve una representación textual del cliente, que incluye su número de
     * turno, nombre y pedido.
     *
     * @return Representación en texto del cliente
     */
    @Override
    public String toString() {
        return "Turno #" + numeroTurno + ": " + nombre + " - Pedido: " + pedido;
    }
}
