/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Playlist;

/**
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 */
public class PlayList {
    private int duracion;
    private String genero;
    
    public PlayList(int duracion, String genero){
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
