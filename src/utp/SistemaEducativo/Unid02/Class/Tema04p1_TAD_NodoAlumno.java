package utp.SistemaEducativo.Unid02.Class;

public class Tema04p1_TAD_NodoAlumno {

    private String id;
    private String nombre;
    private String apellido;
    private int grado;
    private String nivel;
    private Tema04p1_TAD_NodoAlumno siguiente;

    public Tema04p1_TAD_NodoAlumno(String id, String nombre, String apellido, int grado, String nivel) {
        if (id == null || nombre == null || apellido == null || nivel == null) {
            throw new IllegalArgumentException("Ningún campo puede ser nulo");
        }

        this.id = id;
        this.nombre = nombre.trim();
        this.apellido = apellido.trim();
        this.grado = grado;
        this.nivel = nivel.toUpperCase();
        this.siguiente = null;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getGrado() {
        return grado;
    }

    public String getNivel() {
        return nivel;
    }

    public Tema04p1_TAD_NodoAlumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tema04p1_TAD_NodoAlumno siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " " + apellido + " | Grado " + grado + " (" + nivel + ")";
    }

}
