package co.edu.uniquindio.poo.proyectofinalpg1.model;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contenedora Biblioteca
 */

public class Biblioteca {
    private String nombre;
    private String id;
    private String direccion;
    List<Prestamo> listPrestamos;
    List<Empleado> listEmpleados;
    List<Libro> listLibros;


    /**
     * Metodo constructor de la clase Biblioteca
     */

    public Biblioteca(String nombre, String id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.listPrestamos = new ArrayList<>();
        this.listEmpleados = new ArrayList<>();
        this.listLibros = new ArrayList<>();
    }
    /**
     * CRUD EMPLEADO
     */

    public void agregarEmpleado(Empleado empleado) {
        this.listEmpleados.add(empleado);
    }
    public String visualizarEmpleado(Empleado empleado) {
        return empleado.toString();
    }
    public void actualizarEmpleado(Empleado empleado, String nombre, String id, String correo, String usuario, String contrasenia) {
        empleado.setNombre(nombre);
        empleado.setId(id);
        empleado.setCorreo(correo);
        empleado.setUsuario(usuario);
        empleado.setContrasenia(contrasenia);
    }
    public void eliminarEmpleado(Empleado empleado) {
        this.listEmpleados.remove(empleado);
    }

    /**
     * CRUD PRESTAMOS
     */

    public void agregarPrestamo(Prestamo prestamo) {
        this.listPrestamos.add(prestamo);
    }

    public String visualizarPrestamo(Prestamo prestamo) {
        return prestamo.toString();
    }

    public void actualizarPrestamo(Prestamo prestamo, String id, String fechaInicio, String fechaFin, String estado, Libro libroPrestado, Usuario usuario) {
        prestamo.setId(id);
        prestamo.setFechaInicio(fechaInicio);
        prestamo.setFechaFin(fechaFin);
        prestamo.setEstado(estado);
        prestamo.setLibroPrestado(libroPrestado);
        prestamo.setUsuario(usuario);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        this.listPrestamos.remove(prestamo);
    }


    /**
     * CRUD LIBROS
     */

    public void agregarLibro(Libro libro) {
        this.listLibros.add(libro);
    }

    public String visualizarLibro(Libro libro) {
        return libro.toString();
    }

    public void actualizarLibro(Libro libro, String titulo, String autor, String isbn, String editorial, int anioPublicacion) {
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setIsbn(isbn);
        libro.setEditorial(editorial);
        libro.setAnioPublicacion(anioPublicacion);
    }

    public void eliminarLibro(Libro libro) {
        this.listLibros.remove(libro);
    }





}
