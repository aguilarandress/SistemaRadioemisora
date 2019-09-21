/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Locutor;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

/**
 *
 * @author fabia
 */
public class Locutor {
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private String fecha;
    
    public Locutor() {
        
    }
    
    public Locutor(String id, String nombre, String correo, String telefono,
            String direccion, String sexo, String fecha){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Verifica si el telefono tiene un formato valido
     * @return true si el telefono es valido 
     */
    public boolean telefonoValido() {
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
    public boolean correoValido() {
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
    
}
