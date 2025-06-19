package CLASES;

public class Tema03_Matriz {

    private int[][] matriz;
    private int[][] inversa;
    private int tamaño;

    public Tema03_Matriz(int tamaño) {
        this.tamaño = tamaño;
        this.matriz = new int[tamaño][tamaño];
        this.inversa = new int[tamaño][tamaño];
    }

    public void llenar(int[][] datos) {
        this.matriz = datos;
         calcularTranspuesta();
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

    public int[][] getInversa() {
        return inversa;
    }
    
     private void calcularTranspuesta() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                inversa[i][j] = matriz[j][i];
            }
        }
    }
}
