package Unidad02;

import Unidad02.nodoAlumno;
import javax.swing.table.DefaultTableModel;

public class listaAlumno {

    private static listaAlumno instance;
    private nodoAlumno cabeza;
    private nodoAlumno cola;
    private int size;
    private int ultimoIdInicial;
    private int ultimoIdPrimaria;
    private int ultimoIdSecundaria;

    listaAlumno() {
        cabeza = null;
        cola = null;
        size = 0;
        ultimoIdInicial = 0;
        ultimoIdPrimaria = 0;
        ultimoIdSecundaria = 0;
    }

    public static synchronized listaAlumno getInstance() {
        if (instance == null) {
            instance = new listaAlumno();
        }
        return instance;
    }

    public String generarNuevoId(String nivel) {
        if (nivel == null) {
            throw new IllegalArgumentException("Nivel no puede ser nulo");
        }

        switch (nivel.toUpperCase()) {
            case "INICIAL" -> {
                return "I" + (++ultimoIdInicial);
            }
            case "PRIMARIA" -> {
                return "P" + (++ultimoIdPrimaria);
            }
            case "SECUNDARIA" -> {
                return "S" + (++ultimoIdSecundaria);
            }
            default ->
                throw new IllegalArgumentException("Nivel no válido: " + nivel);
        }
    }

    public void agregarAlumno(String nombre, String apellido, int grado, String nivel) {
        String id = generarNuevoId(nivel);
        
        nodoAlumno nuevoAlumno = new nodoAlumno(id, nombre, apellido, grado, nivel);

        if (cabeza == null) {
            cabeza = nuevoAlumno;
            cola = nuevoAlumno;
        } else {
            cola.setSiguiente(nuevoAlumno);
            cola = nuevoAlumno;
        }
        size++;
    }

    public boolean eliminarAlumno(String nombre, String apellido) {
        if (cabeza == null) return false;

    if (cabeza.getNombre().equalsIgnoreCase(nombre) 
            && cabeza.getApellido().equalsIgnoreCase(apellido)) {
        cabeza = cabeza.getSiguiente();
        if (cabeza == null) {
            cola = null;
        }
        size--;
        return true;
    }

    nodoAlumno actual = cabeza;
    while (actual.getSiguiente() != null) {
        if (actual.getSiguiente().getNombre().equalsIgnoreCase(nombre)
                && actual.getSiguiente().getApellido().equalsIgnoreCase(apellido)) {
   
            if (actual.getSiguiente() == cola) {
                cola = actual;
            }
            
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            size--;
            return true;
        }
        actual = actual.getSiguiente();
    }
    
    return false; 
    }

    public nodoAlumno buscarPorNombreCompleto(String nombreCompleto) {
    if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
        return null;
    }

    String busqueda = nombreCompleto.trim().toLowerCase();

    String[] partes = busqueda.split("\\s+");
    
    if (partes.length < 2) {
        return null;
    }
    
    nodoAlumno actual = cabeza;
    while (actual != null) {
        String nombreAlumno = actual.getNombre().toLowerCase();
        String apellidoAlumno = actual.getApellido().toLowerCase();
        
        boolean todosTerminosCoinciden = true;
        boolean hayCoincidenciaNombre = false;
        boolean hayCoincidenciaApellido = false;
        
        for (String termino : partes) {
            boolean enNombre = nombreAlumno.contains(termino);
            boolean enApellido = apellidoAlumno.contains(termino);
            
            if (!enNombre && !enApellido) {
                todosTerminosCoinciden = false;
                break;
            }
            
            if (enNombre) hayCoincidenciaNombre = true;
            if (enApellido) hayCoincidenciaApellido = true;
        }
        
        if (todosTerminosCoinciden && hayCoincidenciaNombre && hayCoincidenciaApellido) {
            return actual;
        }
        
        actual = actual.getSiguiente();
    }
    
    return null;
}

    public Object[][] obtenerDatosParaTabla(String nivel) {
        if (nivel == null) {
            return new Object[0][0];
        }

        int count = 0;
        nodoAlumno actual = cabeza;
        while (actual != null) {
            if (actual.getNivel().equalsIgnoreCase(nivel)) {
                count++;
            }
            actual = actual.getSiguiente();
        }

        Object[][] datos = new Object[count][4];
        actual = cabeza;
        int i = 0;

        while (actual != null) {
            if (actual.getNivel().equalsIgnoreCase(nivel)) {
                datos[i][0] = actual.getId();
                datos[i][1] = actual.getNombre();
                datos[i][2] = actual.getApellido();
                datos[i][3] = actual.getGrado();
                i++;
            }
            actual = actual.getSiguiente();
        }
        return datos;
    }

    public DefaultTableModel getModeloTabla(String nivel) {
        String[] columnNames = {"ID", "Nombre", "Apellido", "Grado"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[][] datos = obtenerDatosParaTabla(nivel);
        for (Object[] fila : datos) {
            model.addRow(fila);
        }

        return model;
    }

    public int getSize() {
        return size;
    }
}
