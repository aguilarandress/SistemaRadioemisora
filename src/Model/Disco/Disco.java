/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Disco;
import Model.Cancion.Cancion;
import java.util.ArrayList;

/**
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 */
public class Disco {
    private String nombre;
    private String cantante;
    private String genero;
    private String ubicacionFisica;
    private int anio;
   private String imagen;
   private ArrayList<Cancion> canciones;
    
    public Disco(String nombre, String cantante, String genero, int anio,
            String ubicacionFisica, String imagen){
        
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.anio = anio;
        this.ubicacionFisica = ubicacionFisica;
        this.imagen = imagen;
        this.canciones = new ArrayList<Cancion>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacionFisica() {
        return ubicacionFisica;
    }

    public void setUbicacionFisica(String ubicacionFisica) {
        this.ubicacionFisica = ubicacionFisica;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    public void agregarCancion(Cancion cancionNueva){
        this.canciones.add(cancionNueva);
    }
    
    @Override
    public String toString(){
        return (this.nombre + " - " +  this.genero + " - " + this.cantante);
    }
}
