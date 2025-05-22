package co.edu.uniquindio.poo.proyectofinalpg1.model;

public class LibroDigital extends Libro {

    private String linkDescarga;
    private TipoFormato tipoFormato;

    /**
     * Metodo constructor de la clase hija Libro digital
     * @param nombre
     * @param autor
     * @param anioPublicacion
     * @param disponibilidad
     * @param linkDescarga
     */
    public LibroDigital(String nombre, String autor, int anioPublicacion, boolean disponibilidad, String linkDescarga, TipoFormato tipoFormato) {
        super(nombre, autor, anioPublicacion, disponibilidad);
        this.linkDescarga = linkDescarga;
        this.tipoFormato = tipoFormato;
    }


}
