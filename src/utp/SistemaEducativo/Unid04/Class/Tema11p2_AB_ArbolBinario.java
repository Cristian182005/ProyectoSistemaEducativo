package utp.SistemaEducativo.Unid04.Class;

public class Tema11p2_AB_ArbolBinario {

    public Tema11p1_AB_Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Tema11p1_AB_Nodo insertarRec(Tema11p1_AB_Nodo actual, int valor) {
        if (actual == null) {
            return new Tema11p1_AB_Nodo(valor);
        }
        if (actual.izquierda == null) {
            actual.izquierda = insertarRec(actual.izquierda, valor);
        } else if (actual.derecha == null) {
            actual.derecha = insertarRec(actual.derecha, valor);
        }
        return actual;
    }

    public void inorden(Tema11p1_AB_Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            inorden(nodo.izquierda, sb);
            sb.append(nodo.valor).append(" ");
            inorden(nodo.derecha, sb);
        }
    }

    public boolean buscar(Tema11p1_AB_Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (nodo.valor == valor) {
            return true;
        }
        return buscar(nodo.izquierda, valor) || buscar(nodo.derecha, valor);
    }

    // Método simple: elimina el nodo si es la raíz (solo ejemplo)
    public void eliminarRaiz() {
        raiz = null; // para simplificar: vaciamos el árbol
    }
}
