
package utp.SistemaEducativo.Unid03.Class;

public class Tema09_Colas_ColaClientexPelicula {

    private final int MAX;
    private final String[] Cola;
    private int frente;
    private int fin;
    private int tamaño;

    public Tema09_Colas_ColaClientexPelicula() {
        this.MAX = 5;
        this.Cola = new String[MAX + 1];
        this.frente = 0;
        this.fin = 0;
        this.tamaño = 0;
    }

    public boolean isColaVacia() {
        return frente == fin;
    }

    public boolean isColaLlena() {
        return fin == MAX;
    }

    public void insertarCola(String elem) {
        if (!isColaLlena()) {
            fin++;
            Cola[fin] = elem;
        }
    }

    public void eliminarCola() {
        if (!isColaVacia()) {
            for (int i = frente; i < fin; i++) {
                Cola[i] = Cola[i + 1];
            }
            fin--;
        }
    }

    public void vaciarCola() {
        frente = 0;
        fin = 0;
        tamaño = 0;
    }

    public String primeroCola() {
        return isColaVacia() ? "Cola vacía" : Cola[frente + 1];
    }

    public String mostrarCola() {
        if (isColaVacia()) {
            return "Cola vacía";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = frente + 1; i <= fin; i++) {
            sb.append((i - frente) + ". " + Cola[i]).append("\n");
        }
        return sb.toString();
    }

    public int cantidadElementos() {
        return fin - frente;
    }

    public int getMAX() {
        return MAX;
    }
}
