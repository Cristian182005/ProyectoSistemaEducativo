package ejemplos;

import java.util.Arrays;

public class ArreglosUnid02 {
    private int[] arreglo1;
    private int[] arreglo2;

    public ArreglosUnid02(int[] arreglo1, int[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    public boolean comparar() {
        return Arrays.equals(arreglo1, arreglo2);
    }

    public int[] clonarArreglo1() {
        return arreglo1.clone();
    }

    public int[] fusionar() {
        int[] fusion = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, fusion, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, fusion, arreglo1.length, arreglo2.length);
        return fusion;
    }

    public String mostrarArreglo(int[] arr) {
        return Arrays.toString(arr);
    }

    public void setArreglo1(int[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public void setArreglo2(int[] arreglo2) {
        this.arreglo2 = arreglo2;
    }    
}
