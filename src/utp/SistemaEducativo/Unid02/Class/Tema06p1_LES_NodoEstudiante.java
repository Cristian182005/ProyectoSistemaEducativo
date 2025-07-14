
package utp.SistemaEducativo.Unid02.Class;

//Tema 06: Lista enlazada simple. Operaciones básicas: recorrido, búsqueda, ordenamiento.

public class Tema06p1_LES_NodoEstudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;
    private Tema06p1_LES_NodoEstudiante siguiente;

    // Constructor
    public Tema06p1_LES_NodoEstudiante(String nombre, String apellido, String curso, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota = nota;
        this.siguiente = null;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public Tema06p1_LES_NodoEstudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tema06p1_LES_NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }
}