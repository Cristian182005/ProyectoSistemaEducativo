package CLASES;

public class Tema03_Matriz {

    private int[][] matriz;
    private int tamaño;

    public Tema03_Matriz(int tamaño) {
        this.tamaño = tamaño;
        this.matriz = new int[tamaño][tamaño];
    }

    public void llenar(int[][] datos) {
        this.matriz = datos;
    }
    
    public boolean esSimetrica() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}