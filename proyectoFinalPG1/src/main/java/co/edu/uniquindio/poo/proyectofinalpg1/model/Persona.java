package co.edu.uniquindio.poo.proyectofinalpg1.model;

public class Persona {
    private String nombre;
    private String id;
    private Prestamo thePrestamo;


    /**
     * Creación método constructor de la clase Persona
     * @param nombre
     * @param id
     */
     public Persona(String nombre, String id){
         this.nombre = nombre;
         this.id = id;
     }


    /**
     * Métodos getter y setter de la clase Persona
     * @return
     */
    
    public Prestamo getThePrestamo() {
        return thePrestamo;
    }

    public void setThePrestamo(Prestamo thePrestamo) {
        this.thePrestamo = thePrestamo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
