package SistemaEducativo.Class;

import java.util.Arrays;

//Tema 02: Operaciones con Arreglos Unidimensionales: comparación, clonación, fusión.

public class Tema02_ArregloUnidimensional {
    private int[] arreglo;
    private int elementos;

    public boolean crearArreglo(int tamaño) {
        if (tamaño > 0) {
            arreglo = new int[tamaño];
            elementos = 0;
            return true;
        }
        return false;
    }

    public boolean insertar(int valor) {
        if (arreglo != null && elementos < arreglo.length) {
            arreglo[elementos++] = valor;
            return true;
        }
        return false;
    }

    public int insertarVarios(String valoresSeparadosPorComa) {
        if (arreglo == null) return 0;

        String[] partes = valoresSeparadosPorComa.split(",");
        int insertados = 0;

        for (String parte : partes) {
            try {
                int valor = Integer.parseInt(parte.trim());
                if (insertar(valor)) {
                    insertados++;
                }
            } catch (NumberFormatException e) {

            }
        }
        return insertados;
    }

    public void borrarArreglo() {
        arreglo = null;
        elementos = 0;
    }

    public int[] clonar() {
        if (arreglo == null) return null;
        return Arrays.copyOf(arreglo, elementos); 
    }

    public boolean comparar(int[] otro) {
        if (arreglo == null || otro == null) return false;
        return Arrays.equals(Arrays.copyOf(arreglo, elementos), otro);
    }

    public int[] fusionar(int[] otro) {
        if (arreglo == null || otro == null) return null;
        int[] fusion = new int[elementos + otro.length];
        System.arraycopy(arreglo, 0, fusion, 0, elementos);
        System.arraycopy(otro, 0, fusion, elementos, otro.length);
        return fusion;
    }

    public String mostrar() {
        if (arreglo == null || elementos == 0) return "Arreglo vacío";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elementos; i++) {
            sb.append("[").append(i).append("]=").append(arreglo[i]).append("  ");
        }
        return sb.toString().trim();
    }

    public int[] getArregloActual() {
        return arreglo == null ? null : Arrays.copyOf(arreglo, elementos);
    }

    public int getCapacidad() {
        return arreglo == null ? 0 : arreglo.length;
    }

    public int getElementos() {
        return elementos;
    }  
}
