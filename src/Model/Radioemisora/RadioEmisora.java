/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Radioemisora;

import Model.Locutor.Locutor;
import java.util.ArrayList;

/**
 * 
 * @author fabia
 */
public class RadioEmisora {
    
    private String nombre;
    private String direccionFisica;
    private String frecuencia;
    private String urlSitioWeb;
    
    private ArrayList<Locutor> locutores;
    
    public RadioEmisora(String nombre, String direccionFisica,
            String frecuencia, String urlSitioWeb){
        this.nombre = nombre;
        this.direccionFisica = direccionFisica;
        this.frecuencia = frecuencia;
        this.urlSitioWeb = urlSitioWeb;
        this.locutores = new ArrayList<Locutor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionFisica() {
        return direccionFisica;
    }

    public void setDireccionFisica(String direccionFisica) {
        this.direccionFisica = direccionFisica;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getUrlSitioWeb() {
        return urlSitioWeb;
    }

    public void setUrlSitioWeb(String urlSitioWeb) {
        this.urlSitioWeb = urlSitioWeb;
    }
    
    /**
     * Agrega un nuevo locutor a la radio emisora
     * @param locutorNuevo 
     */
    public void agregarLocutor(Locutor locutorNuevo) {
        if(locutorNuevo != null) {
            locutores.add(locutorNuevo);
        }
    }
    /**
     * Verfica si ya existe un locutor con dicha cedula
     * @param cedula
     * @return true si ya existe un locutor con ese ID, false de lo contrario
     */
    public boolean verificarCedulaRepetida(String cedula) {
        if(this.locutores.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.locutores.size(); i++) {
            if (this.locutores.get(i).getId().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
}
