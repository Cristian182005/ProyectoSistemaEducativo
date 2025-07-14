
package utp.SistemaEducativo.Unid04.Class;


public class Tema13p1_AAVL_NodoAVL {
    int dato, altura;
    Tema13p1_AAVL_NodoAVL izquierda,derecha;

    public Tema13p1_AAVL_NodoAVL(int dato) {
        this.dato = dato;
        this.altura = 1;
    }

    public int getValor() {
        return dato;
    }

    public Tema13p1_AAVL_NodoAVL getIzquierda() {
        return izquierda;
    }

    public Tema13p1_AAVL_NodoAVL getDerecha() {
        return derecha;
    }
}