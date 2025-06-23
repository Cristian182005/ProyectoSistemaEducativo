
package SistemaEducativo.Unid02.Class;

//Tema 07: Listas doblemente enlazadas: Operaciones básicas. Listas circulares: Operaciones básicas.

public class Tema07p1_ListaDoblementeEnlazada_Nodo {
    private String nombre;
    private String telefono;
    private String correo;
    private Tema07p1_ListaDoblementeEnlazada_Nodo siguiente;
    private Tema07p1_ListaDoblementeEnlazada_Nodo anterior;

    public Tema07p1_ListaDoblementeEnlazada_Nodo(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Tema07p1_ListaDoblementeEnlazada_Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tema07p1_ListaDoblementeEnlazada_Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Tema07p1_ListaDoblementeEnlazada_Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Tema07p1_ListaDoblementeEnlazada_Nodo anterior) {
        this.anterior = anterior;
    }


}