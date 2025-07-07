package utp.SistemaEducativo.Unid01.Class;

import java.util.Arrays;

//Tema 01: Operaciones con arreglos unidimensionales: inserción, actualización, eliminación, recorrido, copia.

public class Tema01_ArregloUnidimensional {
    private int[] arreglo;
    private int elementos;

    public Tema01_ArregloUnidimensional(int tamaño) {
        arreglo = new int[tamaño];
        elementos = 0;
    }

    public boolean insertar(int valor) {
        if (elementos < arreglo.length) {
            arreglo[elementos++] = valor;
            return true;
        }
        return false;
    }

    public boolean actualizar(int pos, int nuevoValor) {
        if (pos >= 0 && pos < elementos) {
            arreglo[pos] = nuevoValor;
            return true;
        }
        return false;
    }

    public boolean eliminar(int pos) {
        if (pos >= 0 && pos < elementos) {
            for (int i = pos; i < elementos - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            arreglo[--elementos] = 0;
            return true;
        }
        return false;
    }

    public String recorrer() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < elementos; i++) {
        sb.append("[").append(i).append("]=").append(arreglo[i]).append("  ");
    }
    return sb.toString().trim();
    }

    public String copiar() {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elementos; i++) {
            sb.append("[").append(i).append("] = ").append(copia[i]).append("\n");
        }
        return sb.toString();
    }
}
