package utp.SistemaEducativo.Unid03.Tema08_ChatVirtual;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que representa la cola de atención de clientes en el asistente virtual
 * del restaurante. Utiliza una estructura FIFO (First-In, First-Out) basada en
 * {@link java.util.LinkedList}.
 *
 * Permite agregar, atender, consultar y vaciar clientes de la cola.
 *
 * Esta clase es utilizada por la interfaz gráfica para modelar el flujo de
 * atención al cliente en orden de llegada.
 *
 * @author Jhair
 * @version 1.0
 */
public class ColaClientes {

    /**
     * Estructura interna que almacena la cola de clientes
     */
    private Queue<Cliente> cola = new LinkedList<>();

    /**
     * Agrega un nuevo cliente al final de la cola.
     *
     * @param cliente Cliente a agregar
     */
    public void agregarCliente(Cliente cliente) {
        cola.add(cliente);
    }

    /**
     * Atiende (elimina y retorna) al cliente que está al frente de la cola.
     *
     * @return Cliente atendido o {@code null} si la cola está vacía
     */
    public Cliente atenderCliente() {
        return cola.poll();
    }

    /**
     * Retorna el cliente que está al frente de la cola sin removerlo.
     *
     * @return Cliente en turno o {@code null} si la cola está vacía
     */
    public Cliente clienteActual() {
        return cola.peek();
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return {@code true} si no hay clientes en la cola, {@code false} en caso
     * contrario
     */
    public boolean estaVacia() {
        return cola.isEmpty();
    }

    /**
     * Retorna la cantidad de clientes actualmente en la cola.
     *
     * @return Número de clientes en espera
     */
    public int tamaño() {
        return cola.size();
    }

    /**
     * Devuelve una copia de la cola actual para visualizarla sin alterar el
     * orden ni el contenido original.
     *
     * @return Cola de clientes como copia
     */
    public Queue<Cliente> obtenerCola() {
        return new LinkedList<>(cola);
    }

    /**
     * Elimina todos los clientes de la cola.
     */
    public void vaciarCola() {
        cola.clear();
    }
}
