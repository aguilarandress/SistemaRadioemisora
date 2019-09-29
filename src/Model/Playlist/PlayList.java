/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Playlist;

import Model.Cancion.Cancion;
import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class PlayList {
    private int duracion;
    private String genero;
    private String nombre;
    private ArrayList<Cancion> canciones;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public PlayList(String pNombre, String pGenero){
        this.nombre = pNombre;
        this.genero = pGenero;
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
    
    public void addCancion(Cancion pCancion) {
        this.canciones.add(pCancion);
    }
}
