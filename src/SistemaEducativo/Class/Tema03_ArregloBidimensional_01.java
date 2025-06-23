package SistemaEducativo.Class;

//Tema 03: Arreglo Bidimensional - Matrices cuadradas poco densas: Matriz triangular inferior, Matriz triangular superior, Matriz tridiagonal.

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tema03_ArregloBidimensional_01 {

    private JTable tablaEntrada;
    private JTable tablaResultado;

    public static int[][] triangularSuperior(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                resultado[i][j] = matriz[i][j];
            }
        }
        return resultado;
    }

    public static int[][] triangularInferior(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                resultado[i][j] = matriz[i][j];
            }
        }

        return resultado;
    }

    public static int[][] tridiagonal(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= 1) {
                    resultado[i][j] = matriz[i][j];
                }
            }
        }

        return resultado;
    }

    public static void mostrarResultado(JTable tabla, int[][] resultado) {
        int n = resultado.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabla.setValueAt(resultado[i][j], i, j);
            }
        }
    }
    
        public void setTablaEntrada(JTable tablaEntrada) {
        this.tablaEntrada = tablaEntrada;
    }

    public void setTablaResultado(JTable tablaResultado) {
        this.tablaResultado = tablaResultado;
    }


    public static DefaultTableModel crearModeloTabla(int n) {
        String[] columnas = new String[n];
        for (int i = 0; i < n; i++) {
            columnas[i] = "Col " + (i + 1);
        }
        Object[][] datos = new Object[n][n];
        return new DefaultTableModel(datos, columnas);
    }

    public void convertirTridiagonal() {
        int[][] matriz = leerMatriz(tablaEntrada);
        int[][] resultado = tridiagonal(matriz);
        mostrarResultado(tablaResultado, resultado);
    }
    public void convertirInferior() {
        int[][] matriz = leerMatriz(tablaEntrada);
        int[][] resultado = triangularInferior(matriz);
        mostrarResultado(tablaResultado, resultado);
    }
    public void convertirSuperior() {
        int[][] matriz = leerMatriz(tablaEntrada);
        int[][] resultado = triangularSuperior(matriz);
        mostrarResultado(tablaResultado, resultado);
    }
    
    
    public static int[][] leerMatriz(JTable tabla) {
        int filas = tabla.getRowCount();
        int columnas = tabla.getColumnCount();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String texto = tabla.getValueAt(i, j).toString().trim();
                matriz[i][j] = Integer.parseInt(texto);
            }
        }
        return matriz;
    }
    
}

