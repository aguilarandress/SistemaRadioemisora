/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Cancion;

/**
 * Clase responsable de generar canciones de archivo
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class CancionArchivo extends Cancion {
    private String album;
    private String path;
    
    /**
     * Constructor de CancionArchivo
     * @param pNombre Nombre de la cancion  
     * @param pDuracion Duracion de la cancion  
     * @param pCantante Cantante de la cancion  
     * @param pGenero Genero de la cancion
     * @param pAlbum Nombre del Album en el que se encuentra la cancion
     * @param pPath PATH de la cancion
     */
    public CancionArchivo(String pNombre, int pDuracion, String pCantante, String pGenero, String pAlbum, String pPath){
        super(pNombre, pDuracion, pCantante, pGenero);
        this.album = pAlbum;
        this.path = pPath;
    }
    
    /**
     * Obtiene el album de la instancia de CancionArchivo
     * @return album
     */
    public String getAlbum() {
        return album;
    }
    
    /**
     * Cambia el album de la instancia de CancionArchivo
     * @param pAlbum Nuevo album de CancionArchivo
     */
    public void setAlbum(String pAlbum) {
        this.album = pAlbum;
    }

    /**
     * Obtiene el path de la instancia de CancionArchivo
     * @return path 
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Cambia el path de la instancia de CancionArchivo
     * @param pPath Nuevo Path de CancionArchivo
     */
    public void setPath(String pPath) {
        this.path = pPath;
    }
    
}
