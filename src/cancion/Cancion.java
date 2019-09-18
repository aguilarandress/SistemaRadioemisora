/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancion;

/**
 *
 * @author fabia
 */
public class Cancion {
    protected String nombre;
    protected int duracion;
    protected String genero;
    protected String cantante;
    
    public Cancion(String nombre, int duracion, String cantante, String genero){
        this.nombre = nombre;
        this.duracion = duracion;
        this.cantante = cantante;
        this.genero = genero;
    }
    
    public Cancion(){
        this.nombre = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.cantante = "Desconocido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
    
}
