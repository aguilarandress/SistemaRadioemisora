/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disco;

/**
 *
 * @author fabia
 */
public class Disco {
    private String nombre;
    private String cantante;
    private String genero;
    private String ubicacionFisica;
    private int año;
   //  Falta agregar imagen.
    
    public Disco(String nombre, String cantante, String genero, int año,
            String ubicacionFisica){
        
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.año = año;
        this.ubicacionFisica = ubicacionFisica;
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
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
