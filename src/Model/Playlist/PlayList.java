/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Playlist;

import Model.Cancion.Cancion;
import java.util.ArrayList;

/**
 * Clase responsable de crear Playlists
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class PlayList {
    private int duracion;
    private String genero;
    private String nombre;
    private ArrayList<Cancion> canciones;
    
    /**
     * Constructor de PlayList
     * @param pNombre Nombre que va a tener la PlayList
     * @param pGenero Genero de la PlayList
     */
    public PlayList(String pNombre, String pGenero){
        this.nombre = pNombre;
        this.genero = pGenero;
        this.canciones = new ArrayList<Cancion>();
        this.duracion = 0;
    }
    
    /**
     * Obtiene el nombre de la instancia de PlayList
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre de la instancia de PlayList
     * @param pNombre Nuevo nombre de Playlist
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    /**
     * Obtiene las canciones de la instancia de PlayList en forma de ArrayList
     * @return canciones
     */
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    /**
     * Cambia las canciones de la instancia de PlayList
     * @param pCanciones Nuevas canciones de la PlayList
     */
    public void setCanciones(ArrayList<Cancion> pCanciones) {
        this.canciones = pCanciones;
    }
    
    /**
     * Obtiene la duracion de la instancia de PlayList
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Cambia la duracion de la instancia de PlayList
     * @param pDuracion Nueva duracion de la PlayList
     */
    public void setDuracion(int pDuracion) {
        this.duracion = pDuracion;
    }

    /**
     * Obtiene el genero de la instancia de PlayList
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Cambia el genero de la instancia de PlayList
     * @param pGenero Nuevo genero de la PlayList
     */
    public void setGenero(String pGenero) {
        this.genero = pGenero;
    }
    
    /**
     * Añade una cancion a las canciones de la instancia de PlayList
     * @param pCancion Nueva Cancion de la Playlist
     */
    public void addCancion(Cancion pCancion) {
        this.canciones.add(pCancion);
    }
}
