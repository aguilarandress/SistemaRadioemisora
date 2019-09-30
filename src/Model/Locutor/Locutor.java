/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Locutor;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

/**
 * Clase responsable de crear locutores
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class Locutor {
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private String fecha;
    
    /**
     * Constructor de Locutor
     * @param pId ID de locutor, puede ser cualquier String, sin formato específico
     * @param pNombre Nombre del Locutor
     * @param pCorreo Correo electrónico del Locutor (Necesita un formato válido)
     * @param pTelefono Numero telefónico del Locutor (8 Dígitos)
     * @param pDireccion Dirección dónde reside el Locutor
     * @param pSexo Sexo de Locutor
     * @param pFecha Fecha de nacimiento del Locutor
     */
    public Locutor(String pId, String pNombre, String pCorreo, String pTelefono,
            String pDireccion, String pSexo, String pFecha){
        this.id = pId;
        this.nombre = pNombre;
        this.correo = pCorreo;
        this.telefono = pTelefono;
        this.direccion = pDireccion;
        this.sexo = pSexo;
        this.fecha = pFecha;
    }

    /**
     * Obtiene el id de la instancia de Locutor
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Cambia el id de la instancia de Locutor
     * @param pId Nuevo id del Locutor
     */
    public void setId(String pId) {
        this.id = pId;
    }

    /**
     * Obtiene el nombre de la instancia de Locutor
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la instancia de Locutor
     * @param pNombre Nuevo nombre del Locutor
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    /**
     * Obtiene el correo de la instancia de Locutor
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Cambia el correo de la instancia de Locutor
     * @param pCorreo Nuevo correo del Locutor
     */
    public void setCorreo(String pCorreo) {
        this.correo = pCorreo;
    }

    /**
     * Obtiene el telefono de la instancia de Locutor
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Cambia el telefono de la instancia de Locutor
     * @param pTelefono Nuevo número telefónico del Locutor
     */
    public void setTelefono(String pTelefono) {
        this.telefono = pTelefono;
    }

    /**
     * Obtiene la direccion de la instancia de Locutor
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Cambia la direccion de la instancia de Locutor
     * @param pDireccion Nueva dirección dónde reside el Locutor
     */
    public void setDireccion(String pDireccion) {
        this.direccion = pDireccion;
    }

    /**
     * Obtiene el sexo de la instancia de Locutor
     * @return sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    /**
     * Cambia el sexo de la instancia de Locutor
     * @param pSexo Nuevo sexo del Locutor
     */
    public void setSexo(String pSexo) {
        this.sexo = pSexo;
    }

    /**
     * Obtiene la fecha de nacimiento de la instancia de Locutor
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Cambia la fecha de nacimiento de la instancia de Locutor
     * @param pFecha Nueva fecha de nacimiento del Locutor
     */
    public void setFecha(String pFecha) {
        this.fecha = pFecha;
    }
    
    /**
     * Verifica si el telefono tiene un formato valido
     * @return true si el telefono es valido, false si no lo es
     */
    public boolean validarTelefono() {
        if(this.telefono.length() != 8) {
            return false;
        }
        try {
            Integer.parseInt(this.telefono);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    /**
     * Mediante una expresion regular se encarga de verificar que el correo
     * tenga el formato adecuado
     * @return true si el correo es valido, false de lo contrario 
     */
    public boolean validarCorreo() {
       String emailRegex =  "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
       Pattern pat = Pattern.compile(emailRegex); 
        if (this.correo.isEmpty()){
            return false;
        } 
        return pat.matcher(this.correo).matches(); 
    }
    
    @Override
    /**
     * Enseña la informacion de la instancia de Locutor en forma de String
     * @return 
     */
    public String toString(){
        return (this.nombre + " - " + this.id);
    }
    
    
}
