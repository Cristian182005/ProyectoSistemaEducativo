/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEMA6;

public class NodoEstudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;
    private NodoEstudiante siguiente;

    // Constructor
    public NodoEstudiante(String nombre, String apellido, String curso, double nota) {
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


    public NodoEstudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }
}