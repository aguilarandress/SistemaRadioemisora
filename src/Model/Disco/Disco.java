/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Disco;
import Model.Cancion.Cancion;
import java.util.ArrayList;

/**
 * Clase responsable de crear Discos
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class Disco {
    private String nombre;
    private String cantante;
    private String genero;
    private String ubicacionFisica;
    private int anio;
    private String imagen;
    private ArrayList<Cancion> canciones;
    
    /**
     * Constructor de disco
     * @param pNombre Nombre de Disco
     * @param pCantante Nombre de cantante de Disco
     * @param pGenero Nombre de Genero de Disco
     * @param pAnio Numero de año de disco
     * @param pUbicacionFisica Ubicación de dónde se encuentra el disco
     * @param pImagen PATH de la imagen del disco en el ordenador
     */
    public Disco(String pNombre, String pCantante, String pGenero, int pAnio,
            String pUbicacionFisica, String pImagen){
        
        this.nombre = pNombre;
        this.cantante = pCantante;
        this.genero = pGenero;
        this.anio = pAnio;
        this.ubicacionFisica = pUbicacionFisica;
        this.imagen = pImagen;
        this.canciones = new ArrayList<Cancion>();
        
    }
    
    /**
     * Busca una cancion de la instancia de Disco de acuerdo a su nombre
     * @param pNombre Nombre de cancion a buscar
     * @return cancion (Si se encuentra una cancion), null (Si
     * no se encuentra la cancion)
     */
    public Cancion obtenerCancionPorNombre(String pNombre) {
        for(Cancion cancion : this.canciones) {
            if(cancion.getNombre().equals(pNombre)) {
                return cancion;
            }
        }
        return null;
    }
    
    /**
     * Obtiene el nombre de la instancia de Disco
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la instancia de Disco
     * @param pNombre Nuevo nombre de Disco
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    /**
     * Obtiene el cantante de la instancia de Disco
     * @return cantante
     */
    public String getCantante() {
        return cantante;
    }
    
    /**
     * Cambia el cantante de la instancia de Disco
     * @param pCantante Nuevo cantante de Disco
     */
    public void setCantante(String pCantante) {
        this.cantante = pCantante;
    }
    
    /**
     * Obtiene el genero de la instancia de Disco
     * @return genero 
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     * Cambia el genero de la instancia de Disco
     * @param pGenero Nuevo genero de Disco
     */
    public void setGenero(String pGenero) {
        this.genero = pGenero;
    }
    
    /**
     * Obtiene la ubicacion fisica de la instacia de Disco
     * @return ubicacionFisica
     */
    public String getUbicacionFisica() {
        return ubicacionFisica;
    }
    
    /**
     * Cambia la ubicacion fisica de la instancia de Disco
     * @param pUbicacionFisica Nueva dirección de dónde se encuentra el Disco
     */
    public void setUbicacionFisica(String pUbicacionFisica) {
        this.ubicacionFisica = pUbicacionFisica;
    }
    
    /**
     * Obtiene el año de la instancia de Disco
     * @return anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Cambia el año de la instancia de Disco
     * @param pAnio Nuevo año de Disco
     */
    public void setAnio(int pAnio) {
        this.anio = pAnio;
    }

    /**
     * Obtiene la imagen de la instancia de Disco
     * @return imagen
     */
    public String getImagen() {
        return imagen;
    }
    
    /**
     * Cambia la imagen de la instancia de Disco
     * @param pImagen Nuevo PATH de la imagen dentro del ordenador
     */
    public void setImagen(String pImagen) {
        this.imagen = pImagen;
    }
    
    /**
     * Obtiene las canciones que están dentro la instancia de Disco
     * en forma de ArrayList
     * @return canciones
     */
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    /**
     * Añade una cancion al disco.
     * @param cancionNueva Cancion a añadir
     */
    public void agregarCancion(Cancion cancionNueva){
        this.canciones.add(cancionNueva);
    }
    
}
