package Model.Programa;

import Model.Locutor.Locutor;
import Model.Playlist.PlayList;
import Model.Cancion.Cancion;
import mailer.Correo;

/**
 * Clase responsable de crear Programas
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class Programa {

    private String nombre;
    private String horario;
    private int duracion;
    private String genero;
    private Locutor locutor;
    private PlayList playlist;
    
    /**
     * Constructor de Programa
     * @param pNombre Nombre del Programa
     * @param pHorario Tiempo designado en el que se llevará a cabo el programa
     * @param pDuracion Tiempo designado a la ejecución del programa
     * @param pGenero Genero del programa
     */
    public Programa(String pNombre, String pHorario, int pDuracion, String pGenero) {
        this.nombre = pNombre;
        this.horario = pHorario;
        this.duracion = pDuracion;
        this.genero = pGenero;
        this.playlist = null;
        this.locutor = null;
    }
    
    /**
     * Obtiene la playlist de la instancia de Programa
     * @return playlist
     */
    public PlayList getPlaylist() {
        return playlist;
    }
    
    /**
     * Cambia la playlist de la instancia de Programa
     * @param pPlaylist Nueva PlayList del programa
     */
    public void setPlaylist(PlayList pPlaylist) {
        this.playlist = pPlaylist;
    }
    
    /**
     * Obtiene el nombre de la instancia de Programa
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre de la instancia de Programa
     * @param pNombre Nuevo nombre del Programa
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    /**
     * Obtiene el horario de la instancia de Programa
     * @return horario
     */
    public String getHorario() {
        return horario;
    }
    
    /**
     * Cambia el horario de la instancia de Programa
     * @param pHorario Nuevo horario del Programa
     */
    public void setHorario(String pHorario) {
        this.horario = pHorario;
    }
    
    /**
     * Obtiene la duracion de la instancia de Programa
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }
    
    /**
     * Cambia la duracion de la instancia de Programa
     * @param pDuracion Nueva duracion del Programa
     */
    public void setDuracion(int pDuracion) {
        this.duracion = pDuracion;
    }
    
    /**
     * Obtiene el genero de la instancia de Programa
     * @return genero
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     * Cambia el genero de la instancia de Programa
     * @param pGenero Nuevo genero del programa
     */
    public void setGenero(String pGenero) {
        this.genero = pGenero;
    }
    
    /**
     * Cambia el locutor de la instancia de Programa
     * @param pLocutor Nuevo Locutor del programa
     */
    public void setLocutor(Locutor pLocutor) {
        this.locutor = pLocutor;
    }
    
    /**
     * Obtiene el locutor de la instancia de Programa
     * @return locutor
     */
    public Locutor getLocutor() {
        return this.locutor;
    }
    
    @Override
    /**
     * Muestra la informacion del Programa en forma de String
     * @return
     */
    public String toString() {
        return this.getNombre()
                + " |Genero: " + this.getGenero()
                + (this.locutor != null ? " |Locutor: " + this.getLocutor().getNombre() : " |Locutor: SIN ASIGNAR");
    }
    
    /**
     * Envia un correo con la informacion de la playlist generada
     */
    public void enviarCorreoPlayList() {
        // Crear cuerpo del correo
        String emailBody = "<p>El locutor " + this.locutor.getNombre() + " deberá transmitir la playlist " + this.playlist.getNombre() + "</p>"
                + "<h2>Playlist: " + this.playlist.getNombre() + "</h2>"
                + "<ul>";
        // Agregar informacion de la cancion
        for (Cancion cancion : this.playlist.getCanciones()) {
            String cancionInfo = "<li>" + cancion.getNombre() + " de " + cancion.getCantante() + "</l1>";
            emailBody += cancionInfo;
        }
        emailBody += "</ul>";
        
        // Enviar correo
        Correo correoPlayList = new Correo("Playlist para programa " + this.nombre, emailBody);
        correoPlayList.enviarCorreo(this.locutor.getCorreo());
    }
}
