/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Cancion;

/**
 * Clase responsable de crear canciones
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class Cancion {
    protected String nombre;
    protected int duracion;
    protected String genero;
    protected String cantante;
    
    /**
     * Constructor de Cancion
     * @param pNombre Nombre de la cancion 
     * @param pDuracion Duracion de la cancion 
     * @param pCantante Nombre del cantante 
     * @param pGenero Genero de la cancion 
     */
    public Cancion(String pNombre, int pDuracion, String pCantante, String pGenero){
        this.nombre = pNombre;
        this.duracion = pDuracion;
        this.cantante = pCantante;
        this.genero = pGenero;
    }
    
    /**
     * Constructor de Cancion por defecto
     */
    public Cancion(){
        this.nombre = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.cantante = "Desconocido";
    }
    
    /**
     * Obtiene el nombre de la instancia de Cancion
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la instancia de Cancion
     * @param pNombre Nuevo nombre de Cancion
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    /**
     * Obtiene la duracion de la instancia de Cancion
     * @return duracion 
     */
    public int getDuracion() {
        return duracion;
    }
    
    /**
     * Cambia la duracion de la instancia de Cancion
     * @param pDuracion Nueva duracion de Cancion
     */
    public void setDuracion(int pDuracion) {
        this.duracion = pDuracion;
    }

    /**
     * Obtiene le genero de la instancia de Cancion
     * @return genero 
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Cambia el genero de la instancia de Cancion
     * @param genero Nuevo genero de Cancion
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**
     * Obtiene el cantante de la instancia de Cancion
     * @return cantante 
     */
    public String getCantante() {
        return cantante;
    }

    /**
     * Cambia el cantante de la instancia de Cancion
     * @param pCantante Nuevo cantante de Cancion
     */
    public void setCantante(String pCantante) {
        this.cantante = pCantante;
    }

}
