package utp.SistemaEducativo.Unid04.Class;

import utp.SistemaEducativo.Unid04.Class.Tema13p1_AAVL_NodoAVL;

public class Tema13p2_AAVL_AVLTree {

    private Tema13p1_AAVL_NodoAVL raiz;

    int altura(Tema13p1_AAVL_NodoAVL N) {
        return (N == null) ? 0 : N.altura;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Tema13p1_AAVL_NodoAVL rotarDerecha(Tema13p1_AAVL_NodoAVL y) {
        Tema13p1_AAVL_NodoAVL x = y.izquierda;
        Tema13p1_AAVL_NodoAVL T2 = x.derecha;

        x.derecha = y;
        y.izquierda = T2;

        y.altura = max(altura(y.izquierda), altura(y.derecha)) + 1;
        x.altura = max(altura(x.izquierda), altura(x.derecha)) + 1;

        return x;
    }

    public Tema13p1_AAVL_NodoAVL getRaiz() {
        return raiz;
    }

    Tema13p1_AAVL_NodoAVL rotarIzquierda(Tema13p1_AAVL_NodoAVL x) {
        Tema13p1_AAVL_NodoAVL y = x.derecha;
        Tema13p1_AAVL_NodoAVL T2 = y.izquierda;

        y.izquierda = x;
        x.derecha = T2;

        x.altura = max(altura(x.izquierda), altura(x.derecha)) + 1;
        y.altura = max(altura(y.izquierda), altura(y.derecha)) + 1;

        return y;
    }

    int obtenerBalance(Tema13p1_AAVL_NodoAVL N) {
        return (N == null) ? 0 : altura(N.izquierda) - altura(N.derecha);
    }

    Tema13p1_AAVL_NodoAVL insertar(Tema13p1_AAVL_NodoAVL nodo, int clave) {
        if (nodo == null) {
            return new Tema13p1_AAVL_NodoAVL(clave);
        }

        if (clave < nodo.dato) {
            nodo.izquierda = insertar(nodo.izquierda, clave);
        } else if (clave > nodo.dato) {
            nodo.derecha = insertar(nodo.derecha, clave);
        } else {
            return nodo;
        }

        nodo.altura = 1 + max(altura(nodo.izquierda), altura(nodo.derecha));

        int balance = obtenerBalance(nodo);

        if (balance > 1 && clave < nodo.izquierda.dato) {
            return rotarDerecha(nodo);
        }

        if (balance < -1 && clave > nodo.derecha.dato) {
            return rotarIzquierda(nodo);
        }

        if (balance > 1 && clave > nodo.izquierda.dato) {
            nodo.izquierda = rotarIzquierda(nodo.izquierda);
            return rotarDerecha(nodo);
        }

        if (balance < -1 && clave < nodo.derecha.dato) {
            nodo.derecha = rotarDerecha(nodo.derecha);
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    Tema13p1_AAVL_NodoAVL eliminar(Tema13p1_AAVL_NodoAVL raiz, int clave) {
        if (raiz == null) {
            return raiz;
        }

        if (clave < raiz.dato) {
            raiz.izquierda = eliminar(raiz.izquierda, clave);
        } else if (clave > raiz.dato) {
            raiz.derecha = eliminar(raiz.derecha, clave);
        } else {
            if ((raiz.izquierda == null) || (raiz.derecha == null)) {
                Tema13p1_AAVL_NodoAVL temp = (raiz.izquierda != null) ? raiz.izquierda : raiz.derecha;
                raiz = (temp == null) ? null : temp;
            } else {
                Tema13p1_AAVL_NodoAVL temp = minValorNodo(raiz.derecha);
                raiz.dato = temp.dato;
                raiz.derecha = eliminar(raiz.derecha, temp.dato);
            }
        }

        if (raiz == null) {
            return raiz;
        }

        raiz.altura = max(altura(raiz.izquierda), altura(raiz.derecha)) + 1;

        int balance = obtenerBalance(raiz);

        if (balance > 1 && obtenerBalance(raiz.izquierda) >= 0) {
            return rotarDerecha(raiz);
        }

        if (balance > 1 && obtenerBalance(raiz.izquierda) < 0) {
            raiz.izquierda = rotarIzquierda(raiz.izquierda);
            return rotarDerecha(raiz);
        }

        if (balance < -1 && obtenerBalance(raiz.derecha) <= 0) {
            return rotarIzquierda(raiz);
        }

        if (balance < -1 && obtenerBalance(raiz.derecha) > 0) {
            raiz.derecha = rotarDerecha(raiz.derecha);
            return rotarIzquierda(raiz);
        }

        return raiz;
    }

    Tema13p1_AAVL_NodoAVL minValorNodo(Tema13p1_AAVL_NodoAVL nodo) {
        Tema13p1_AAVL_NodoAVL actual = nodo;
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }
        return actual;
    }

    public void insertar(int clave) {
        raiz = insertar(raiz, clave);
    }

    public void eliminar(int clave) {
        raiz = eliminar(raiz, clave);
    }

    public String imprimir() {
        return imprimir(raiz, "", true);
    }

    private String imprimir(Tema13p1_AAVL_NodoAVL nodo, String prefijo, boolean esIzquierdo) {
        if (nodo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo);
        sb.append(esIzquierdo ? "├── " : "└── ");
        sb.append(nodo.dato).append("\n");
        sb.append(imprimir(nodo.izquierda, prefijo + (esIzquierdo ? "│   " : "    "), true));
        sb.append(imprimir(nodo.derecha, prefijo + (esIzquierdo ? "│   " : "    "), false));
        return sb.toString();
    }

    public void limpiar() {
        raiz = null;
    }
}
