
package utp.SistemaEducativo.Unid02.Class;

//Tema 07: Listas doblemente enlazadas: Operaciones básicas. Listas circulares: Operaciones básicas.

import utp.SistemaEducativo.Unid02.Class.Tema07p1_LDE_NodoContacto;


public class Tema07p2_LDE_ListaContacto {
    private Tema07p1_LDE_NodoContacto cabeza;
    private Tema07p1_LDE_NodoContacto cola;
    private Tema07p1_LDE_NodoContacto actual;

    public Tema07p2_LDE_ListaContacto() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void agregarContacto(String nombre, String telefono, String correo) {
    Tema07p1_LDE_NodoContacto nuevo = new Tema07p1_LDE_NodoContacto(nombre, telefono, correo);
    
    if (cabeza == null) {
        cabeza = nuevo;
        cola = nuevo;
        actual = nuevo;  // Actual es el nuevo nodo cuando la lista está vacía
    } else {
        cola.setSiguiente(nuevo);
        nuevo.setAnterior(cola);
        cola = nuevo;
        actual = nuevo;  // Siempre establecemos actual al nuevo nodo agregado
    }
}

    public String mostrarTodos() {
    StringBuilder sb = new StringBuilder();
    Tema07p1_LDE_NodoContacto actual = cabeza;
    int contador = 1;
    
    if (cabeza == null) {
        return "No hay contactos en la agenda";
    }
    
    sb.append("LISTA COMPLETA DE CONTACTOS:\n\n");
    
    while (actual != null) {
        sb.append(contador).append(". ")
          .append("Nombre: ").append(actual.getNombre()).append(", ")
          .append("Teléfono: ").append(actual.getTelefono()).append(", ")
          .append("Correo: ").append(actual.getCorreo()).append("\n");
        
        actual = actual.getSiguiente();
        contador++;
    }
    
    return sb.toString();
}
    
    public void eliminarActual() {
        if (actual == null) return;
        
        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza) {
            cabeza = actual.getSiguiente();
            cabeza.setAnterior(null);
            actual = cabeza;
        } else if (actual == cola) {
            cola = actual.getAnterior();
            cola.setSiguiente(null);
            actual = cola;
        } else {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
            actual = actual.getSiguiente();
        }
    }

    public void siguiente() {
        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
    }

    public void anterior() {
        if (actual != null && actual.getAnterior() != null) {
            actual = actual.getAnterior();
        }
    }

    public Tema07p1_LDE_NodoContacto getActual() {
        return actual;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
}