package Model.Programa;

import Model.Locutor.Locutor;
import Model.Playlist.PlayList;
import Model.Cancion.Cancion;
import mailer.Correo;

/**
 *
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 */
public class Programa {

    private String nombre;
    private String horario;
    private int duracion;
    private String genero;
    private Locutor locutor;
    private PlayList playlist;
    
    public Programa(String nombre, String horario, int duracion, String genero) {
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
        
        System.out.println(emailBody);
        
        // Enviar correo
        Correo correoPlayList = new Correo("Playlist para programa " + this.nombre, emailBody);
        correoPlayList.enviarCorreo(this.locutor.getCorreo());
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
    
    public void setLocutor(Locutor locutor) {
        this.locutor = locutor;
    }
    
    public Locutor getLocutor() {
        return this.locutor;
    }
    
    @Override
    public String toString() {
        return this.getNombre()
                + " |Genero: " + this.getGenero()
                + (this.locutor != null ? " |Locutor: " + this.getLocutor().getNombre() : " |Locutor: SIN ASIGNAR");
    }
    
}
