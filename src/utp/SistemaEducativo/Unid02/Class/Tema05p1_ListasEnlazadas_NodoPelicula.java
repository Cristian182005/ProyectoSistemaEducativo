package utp.SistemaEducativo.Unid02.Class;

public class Tema05p1_ListasEnlazadas_NodoPelicula {
    private int id;
    private String titulo;
    private String genero;
    private int duracion;
    private String[] horarios;
    private Tema05p1_ListasEnlazadas_NodoPelicula siguiente;

    public Tema05p1_ListasEnlazadas_NodoPelicula(int id, String titulo, String genero, int duracion, String[] horarios) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.horarios = horarios;
        this.siguiente =null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    public Tema05p1_ListasEnlazadas_NodoPelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tema05p1_ListasEnlazadas_NodoPelicula siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoPelicula{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", horarios=" + horarios + ", siguiente=" + siguiente + '}';
    }
}
