package utp.SistemaEducativo.Unid04.Class;

public class Tema12p2_ABB_ArbolBusqueda {

    public Tema12p1_ABB_Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Tema12p1_ABB_Nodo insertarRec(Tema12p1_ABB_Nodo nodo, int valor) {
        if (nodo == null) {
            return new Tema12p1_ABB_Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierda = insertarRec(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRec(nodo.derecha, valor);
        }
        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Tema12p1_ABB_Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (nodo.valor == valor) {
            return true;
        }
        return valor < nodo.valor ? buscarRec(nodo.izquierda, valor) : buscarRec(nodo.derecha, valor);
    }

    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Tema12p1_ABB_Nodo eliminarRec(Tema12p1_ABB_Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = eliminarRec(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminarRec(nodo.derecha, valor);
        } else {
            // Nodo con un hijo o sin hijos
            if (nodo.izquierda == null) {
                return nodo.derecha;
            }
            if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            // Nodo con dos hijos: obtener el mínimo del subárbol derecho
            nodo.valor = encontrarMin(nodo.derecha);
            nodo.derecha = eliminarRec(nodo.derecha, nodo.valor);
        }
        return nodo;
    }

    private int encontrarMin(Tema12p1_ABB_Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo.valor;
    }

    public void inorden(Tema12p1_ABB_Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            inorden(nodo.izquierda, sb);
            sb.append(nodo.valor).append(" ");
            inorden(nodo.derecha, sb);
        }
    }
}
