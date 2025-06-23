package SistemaEducativo.Unid02.Class;

import SistemaEducativo.Unid02.Class.Tema05p1_ListasEnlazadas_NodoPelicula;

public class Tema05p2_ListasEnlazadas_ListaCartelera {

    Tema05p1_ListasEnlazadas_NodoPelicula cabeza;

    public void agregarPelicula(int id, String titulo, String genero, int duracion, String[] horarios) {
        Tema05p1_ListasEnlazadas_NodoPelicula nuevaPelicula = new Tema05p1_ListasEnlazadas_NodoPelicula(id, titulo, genero, duracion, horarios);
        if (cabeza == null) {
            cabeza = nuevaPelicula;
        } else {
            Tema05p1_ListasEnlazadas_NodoPelicula temp = cabeza;
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
        Tema05p1_ListasEnlazadas_NodoPelicula temp = cabeza;
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
        Tema05p1_ListasEnlazadas_NodoPelicula temp = cabeza;
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        return temp.getId();
    }
    
    public Tema05p1_ListasEnlazadas_NodoPelicula getCabeza() {
        return cabeza;
    }
}
