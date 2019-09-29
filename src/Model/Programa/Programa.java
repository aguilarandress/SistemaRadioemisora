/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Programa;
import Model.Locutor.Locutor;
import Model.Playlist.PlayList;

/**
 *
 * @author fabia
 */
public class Programa {
    private String nombre;
    private String horario;
    private int duracion;
    private String genero;
    private Locutor locutor;
    private PlayList playlist;
    
    public Programa(String nombre, String horario, int duracion, String genero){
        this.nombre = nombre;
        this.horario = horario;
        this.duracion = duracion;
        this.genero = genero;
        this.playlist = null;
        locutor = null;
    }

    public PlayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlayList playlist) {
        this.playlist = playlist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
    
    public void setLocutor(Locutor locutor){
        this.locutor = locutor;
    }
    
    public Locutor getLocutor(){
        return this.locutor;
    }
    
    @Override
    public String toString(){
        return this.getNombre()
                + " |Genero: " + this.getGenero() + 
                (this.locutor != null ? " |Locutor: " + this.getLocutor().getNombre() : " |Locutor: SIN ASIGNAR");
    }
    
    
}
