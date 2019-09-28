/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Cancion;

/**
 *
 * @author fabia
 */
public class CancionArchivo extends Cancion {
    private String album;
    private String path;
    
    public CancionArchivo(String nombre, int duracion, String cantante, String genero, String album, String path){
        super(nombre, duracion, cantante, genero);
        this.album = album;
        this.path = path;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
