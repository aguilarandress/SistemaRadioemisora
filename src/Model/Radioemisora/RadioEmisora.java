/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Radioemisora;

import Model.Locutor.Locutor;
import Model.Programa.Programa;
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
    
    private ArrayList<Programa> programas;
    
    public RadioEmisora(String nombre, String direccionFisica,
            String frecuencia, String urlSitioWeb){
        this.nombre = nombre;
        this.direccionFisica = direccionFisica;
        this.frecuencia = frecuencia;
        this.urlSitioWeb = urlSitioWeb;
        this.locutores = new ArrayList<Locutor>();
        this.programas = new ArrayList<Programa>();
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
     * Se obtiene la lista de locutores
     * @return la lista de locutores
     */
    public ArrayList getLocutores(){
        return locutores;
    }
    /**
     * Agrega un nuevo locutor a la radio emisora
     * @param locutorNuevo El nuevo locutor que se desea agregar
     */
    public void agregarLocutor(Locutor locutorNuevo) {
        if(locutorNuevo != null) {
            locutores.add(locutorNuevo);
        }
    }
    
    /**
     * Remueve a un locutor de la emisora
     * @param locutorQuitar 
     */
    public void removerLocutor(Locutor locutorQuitar) {
        locutores.remove(locutorQuitar);
    }
    /**
     * Verfica si ya existe un locutor con dicha cedula
     * @param cedula Cedula del locutor que se desea ingresar
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
        
    /**
     * Obtiene el locutor que se busca por su Id
     * @param pId
     * @return 
     */
    public Locutor obtenerPorId(String pId) {
        for (int i = 0; i < locutores.size(); i++) {
            if (locutores.get(i).getId().equals(pId)) {
                return locutores.get(i);
            }
        }
        return null;
    }
    
        /**
         * Agrega un programa nuevo a la radioemisora
         * @param programaNuevo Programa nuevo que se desea agregar
         */
    public void agregarPrograma(Programa programaNuevo){
        this.programas.add(programaNuevo);
        for(Locutor e : locutores){
            System.out.println(e.getNombre());
        }
    }
}