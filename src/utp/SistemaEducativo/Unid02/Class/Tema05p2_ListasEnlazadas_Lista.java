package utp.SistemaEducativo.Unid02.Class;

import utp.SistemaEducativo.Unid02.Class.Tema05p1_ListasEnlazadas_Nodo;

public class Tema05p2_ListasEnlazadas_Lista {

    Tema05p1_ListasEnlazadas_Nodo cabeza;

    public void insertar(int dato) {
        
        Tema05p1_ListasEnlazadas_Nodo nuevo = new Tema05p1_ListasEnlazadas_Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Tema05p1_ListasEnlazadas_Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void eliminarInicio() {
        
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        }
    }

    public String mostrar() {
        
        StringBuilder resultado = new StringBuilder();
        Tema05p1_ListasEnlazadas_Nodo actual = cabeza;
        while (actual != null) {
            resultado.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        }
        resultado.append("null");
        return resultado.toString();
    }
}
