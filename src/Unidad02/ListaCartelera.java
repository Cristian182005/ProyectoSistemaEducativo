package Unidad02;

public class ListaCartelera {

    NodoPelicula cabeza;

    public void agregarPelicula(int id, String titulo, String genero, int duracion, String[] horarios) {
        NodoPelicula nuevaPelicula = new NodoPelicula(id, titulo, genero, duracion, horarios);
        if (cabeza == null) {
            cabeza = nuevaPelicula;
        } else {
            NodoPelicula temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevaPelicula);
        }
    }

    public void eliminarPelicula(int id) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.getId() == id) {
            cabeza = cabeza.getSiguiente();
            return;
        }
        NodoPelicula temp = cabeza;
        while (temp.getSiguiente() != null && temp.getSiguiente().getId() != id) {
            temp = temp.getSiguiente();
        }
        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
        }
    }

    public int obtenerUltimoId() {
        if (cabeza == null) {
            return 0;
        }
        NodoPelicula temp = cabeza;
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        return temp.getId();
    }
    
    public NodoPelicula getCabeza() {
        return cabeza;
    }
}
