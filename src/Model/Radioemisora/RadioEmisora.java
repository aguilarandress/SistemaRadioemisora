/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Radioemisora;

/**
 *
 * @author fabia
 */
public class RadioEmisora {
    
    private String nombre;
    private String direccionFisica;
    private String frecuencia;
    private String urlSitioWeb;
    
    public RadioEmisora(String nombre, String direccionFisica,
            String frecuencia, String urlSitioWeb){
        this.nombre = nombre;
        this.direccionFisica = direccionFisica;
        this.frecuencia = frecuencia;
        this.urlSitioWeb = urlSitioWeb;
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
}
