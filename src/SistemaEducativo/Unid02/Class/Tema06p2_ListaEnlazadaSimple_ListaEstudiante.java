
package SistemaEducativo.Unid02.Class;

//Tema 06: Lista enlazada simple. Operaciones básicas: recorrido, búsqueda, ordenamiento.

import SistemaEducativo.Unid02.Class.Tema06p1_ListaEnlazadaSimple_NodoEstudiante;
import javax.swing.table.DefaultTableModel;

public class Tema06p2_ListaEnlazadaSimple_ListaEstudiante {
    private Tema06p1_ListaEnlazadaSimple_NodoEstudiante cabeza;
    private DefaultTableModel modeloTabla;

    public Tema06p2_ListaEnlazadaSimple_ListaEstudiante(DefaultTableModel modeloTabla) {
        this.cabeza = null;
        this.modeloTabla = modeloTabla;
    }

    public void agregarEstudiante(String nombre, String apellido, String curso, double nota) {
    Tema06p1_ListaEnlazadaSimple_NodoEstudiante nuevoNodo = new Tema06p1_ListaEnlazadaSimple_NodoEstudiante(nombre, apellido, curso, nota);
    
    // Insertar al inicio de la lista
    nuevoNodo.setSiguiente(cabeza);
    cabeza = nuevoNodo;
    
    // Actualizar la tabla (se mostrará en orden de inserción)
    modeloTabla.insertRow(0, new Object[]{nombre, apellido, curso, nota});
}

    public void ordenarPorNota() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Tema06p1_ListaEnlazadaSimple_NodoEstudiante actual = cabeza;
            Tema06p1_ListaEnlazadaSimple_NodoEstudiante anterior = null;
            Tema06p1_ListaEnlazadaSimple_NodoEstudiante siguiente = cabeza.getSiguiente();

            while (siguiente != null) {
                if (actual.getNota() < siguiente.getNota()) {
                    // Realizar intercambio
                    if (anterior == null) {
                        cabeza = siguiente;
                    } else {
                        anterior.setSiguiente(siguiente);
                    }
                    actual.setSiguiente(siguiente.getSiguiente());
                    siguiente.setSiguiente(actual);
                    
                    intercambio = true;
                    anterior = siguiente;
                    siguiente = actual.getSiguiente();
                } else {
                    anterior = actual;
                    actual = siguiente;
                    siguiente = siguiente.getSiguiente();
                }
            }
        } while (intercambio);
        
        // Actualizar la tabla después de ordenar
        actualizarTabla();
    }
    
    public void ordenarPorNombre() {
    if (cabeza == null || cabeza.getSiguiente() == null) {
        return;
    }

    boolean intercambio;
    do {
        intercambio = false;
        Tema06p1_ListaEnlazadaSimple_NodoEstudiante actual = cabeza;
        Tema06p1_ListaEnlazadaSimple_NodoEstudiante anterior = null;
        Tema06p1_ListaEnlazadaSimple_NodoEstudiante siguiente = cabeza.getSiguiente();

        while (siguiente != null) {
            // Comparación alfabética ignorando mayúsculas/minúsculas
            if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                // Realizar intercambio
                if (anterior == null) {
                    cabeza = siguiente;
                } else {
                    anterior.setSiguiente(siguiente);
                }
                actual.setSiguiente(siguiente.getSiguiente());
                siguiente.setSiguiente(actual);
                
                intercambio = true;
                anterior = siguiente;
                siguiente = actual.getSiguiente();
            } else {
                anterior = actual;
                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
        }
    } while (intercambio);
    
    actualizarTabla();
}

    private void actualizarTabla() {
        // Limpiar la tabla
        modeloTabla.setRowCount(0);
        
        // Llenar la tabla con los datos ordenados
        Tema06p1_ListaEnlazadaSimple_NodoEstudiante actual = cabeza;
        while (actual != null) {
            modeloTabla.addRow(new Object[]{
                actual.getNombre(),
                actual.getApellido(),
                actual.getCurso(),
                actual.getNota()
            });
            actual = actual.getSiguiente();
        }
        
    }
    
}