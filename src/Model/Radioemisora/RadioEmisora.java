package Model.Radioemisora;

import Model.Cancion.CancionArchivo;
import Model.Locutor.Locutor;
import Model.Programa.Programa;
import Model.Disco.Disco;
import Model.Playlist.PlayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import musicPlayer.MusicPlayer;

/**
 * Clase responsable de crear radioemisoras
 * 
 * @since 1.0
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class RadioEmisora {

    private String nombre;
    private String direccionFisica;
    private String frecuencia;
    private String urlSitioWeb;

    private ArrayList<Locutor> locutores;

    private ArrayList<Programa> programas;

    private ArrayList<Disco> discos;
    
    private ArrayList<CancionArchivo> cancionesArchivo;

    /**
     * Constructor de RadioEmisora
     * @param pNombre Nombre de la RadioEmisora
     * @param pDireccionFisica Direccion de dónde está ubicada la RadioEmisora
     * @param pFrecuencia Frecuencia por la cual transimitirá la RadioEmisora
     * @param pUrlSitioWeb Url del sitio web de la RadioEmisora
     */
    public RadioEmisora(String pNombre, String pDireccionFisica,
            String pFrecuencia, String pUrlSitioWeb) {
        this.nombre = pNombre;
        this.direccionFisica = pDireccionFisica;
        this.frecuencia = pFrecuencia;
        this.urlSitioWeb = pUrlSitioWeb;
        this.locutores = new ArrayList<Locutor>();
        this.programas = new ArrayList<Programa>();
        this.discos = new ArrayList<Disco>();
        this.cancionesArchivo = new ArrayList<CancionArchivo>();
    }
    
    /**
     * Obtiene le nombre de la instancia de RadioEmisora
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la instancia de RadioEmisora
     * @param pNombre Nuevo nombre de la RadioEmisora
     */
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    /**
     * Obtiene la direccion fisica de la instancia de RadioEmisora
     * @return direccionFisica
     */
    public String getDireccionFisica() {
        return direccionFisica;
    }

    /**
     * Cambia la direccion fisica de la instancia de RadioEmisora
     * @param pDireccionFisica Nueva dirección física de la RadioEmisora
     */
    public void setDireccionFisica(String pDireccionFisica) {
        this.direccionFisica = pDireccionFisica;
    }

    /**
     * Obtiene la frecuencia de la instancia de RadioEmisora
     * @return frecuencia
     */
    public String getFrecuencia() {
        return frecuencia;
    }

    /**
     * Cambia la frecuencia de la instancia de RadioEmisora
     * @param pFrecuencia Nueva frecuencia de la RadioEmisora
     */
    public void setFrecuencia(String pFrecuencia) {
        this.frecuencia = pFrecuencia;
    }

    /**
     * Obtiene el url del sitio web de la instancia de RadioEmisora
     * @return urlSitioWeb
     */
    public String getUrlSitioWeb() {
        return urlSitioWeb;
    }

    /**
     * Cambia el url del sitio web de la instancia de RadioEmisora
     * @param pUrlSitioWeb Nuevo url de la RadioEmisora
     */
    public void setUrlSitioWeb(String pUrlSitioWeb) {
        this.urlSitioWeb = pUrlSitioWeb;
    }
    
    /**
     * Obtiene los locutores de la instancia de RadioEmisora en forma de ArrayList
     * @return locutores
     */
    public ArrayList getLocutores() {
        return locutores;
    }

    /**
     * Obtiene los programas de la instancia de RadioEmisora en forma de ArrayList
     * @return programas
     */
    public ArrayList getProgramas() {
        return programas;
    }
    
    /**
     * Obtiene los discos de la instancia de RadioEmisora en forma de ArrayList
     * @return discos
     */
    public ArrayList<Disco> getDiscos() {
        return this.discos;
    }
    
    /**
     * Obtiene las canciones de archivo de la instancia de RadioEmisora en forma 
     * de ArrayList
     * @return cancionesArchivo
     */
    public ArrayList<CancionArchivo> getCancionesArchivo() {
        return this.cancionesArchivo;
    }

    /**
     * Agrega un nuevo locutor a la radio emisora
     *
     * @param locutorNuevo El nuevo locutor que se desea agregar
     */
    public void agregarLocutor(Locutor locutorNuevo) {
        if (locutorNuevo != null) {
            locutores.add(locutorNuevo);
        }
    }

    /**
     * Remueve a un locutor de la emisora
     *
     * @param locutorQuitar El objeto del locutor que se desea eliminar
     */
    public void removerLocutor(Locutor locutorQuitar) {
        locutores.remove(locutorQuitar);
    }

    /**
     * Verifica si el nombre del programa se encuentra repetido
     *
     * @param nombrePrograma El nombre del programa que se desea verificar
     * @return Un valor booleano que determina si el programa se encontro o no
     */
    public boolean verificarNombreProgramaRepetido(String nombrePrograma) {
        if (this.programas.isEmpty()) return false;
        for (Programa programaActual : programas) {
            if (programaActual.getNombre().equals(nombrePrograma)) return true;
        }
        return false;
    }
    
    /**
     * Verifica si el nombre del programa se encuentra repetido
     * 
     * @param nombreCancion El nombre de la cancion que se deasea verificar
     * @return true si la cancion es repetida, false si no lo es
     */
    public boolean verificarCancionArchivoRepetida(String nombreCancion) {
        if (this.cancionesArchivo.isEmpty()) return false;
        for (CancionArchivo cancionActual : cancionesArchivo) {
            if (cancionActual.getNombre().equals(nombreCancion)) return true;
        }
        return false;
    }
    
    /**
     * Verfica si ya existe un locutor con dicha cedula
     *
     * @param cedula Cedula del locutor que se desea ingresar
     * @return true si ya existe un locutor con ese ID, false de lo contrario
     */
    public boolean verificarCedulaRepetida(String cedula) {
        if (this.locutores.isEmpty()) {
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
     *
     * @param pId Un string con el ID del locutor
     * @return El locutor encontrado con el ID o un valor null en caso de no
     * encontrarlo
     */
    public Locutor getLocutorPorId(String pId) {
        for (int i = 0; i < locutores.size(); i++) {
            if (locutores.get(i).getId().equals(pId)) {
                return locutores.get(i);
            }
        }
        return null;
    }

    /**
     * Obtiene un disco nuevo de acuerdo a su nombre
     *
     * @param nombre Un string con el nombre del disco
     * @return El disco encontrado o un valor null en caso de no encontrarlo
     */
    public Disco obtenerDisco(String nombre) {
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i).getNombre().equals(nombre)) {
                return discos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Obtiene una playlist buscandola por nombre
     * 
     * @param pNombre Nombre de la playlist que se está buscando
     * @return PlayList si se encuentra una con el nombre, null de lo contrario
     */
    public PlayList obtenerPlaylist(String pNombre) {
        
        for (Programa programaActual : this.programas) {
            
            if (programaActual.getPlaylist().getNombre().equals(pNombre)) {
                return programaActual.getPlaylist();
            }
        }
        
        return null;
    }
    
    /**
     * Obtiene una cancion de archivo por nombre
     * @param pNombre
     * @return La cancion de archivo encontrada, null si no lo encuentra
     */
    public CancionArchivo obtenerCancionArchivo(String pNombre) {
        for(CancionArchivo cancionActual : this.cancionesArchivo) {
            if (cancionActual.getNombre().equals(pNombre)) {
                return cancionActual;
            }
        }
        return null;
    }
    
    /**
     * Agrega un programa nuevo a la radioemisora
     *
     * @param pProgramaNuevo Programa nuevo que se desea agregar
     */
    public void agregarPrograma(Programa pProgramaNuevo) {
        this.programas.add(pProgramaNuevo);
    }
    
    /**
     * Agrega una cancion a la radioemisora
     * 
     * @param pCancion Cancion que se va a añadir
     */
    public void agregarCancionArchivo(CancionArchivo pCancion) {
        this.cancionesArchivo.add(pCancion);
    }
    
    
    /**
     * Agrega un nuevo disco a la lista de discos
     *
     * @param pDiscoNuevo El disco nuevo que se desea agregar
     */
    public void agregarDisco(Disco pDiscoNuevo) {
        this.discos.add(pDiscoNuevo);
    }

    /**
     * Obtiene un programa de acuerdo a su nombre
     *
     * @param pNombre Un string con el nombre del programa
     * @return El objeto del programa o un valor null en caso de no encontrarlo
     */
    public Programa obtenerProgramaPorNombre(String pNombre) {
        for (int i = 0; i < this.programas.size(); i++) {
            if (this.programas.get(i).getNombre().equals(pNombre)) {
                return this.programas.get(i);
            }
        }
        return null;
    }
    
    /**
     * Reproduce la cancion seleccionada
     * @param pPlayer Player en el cual se va a reproducir la cancion
     * @param pCancionSelected Cancion que se quiere reproducir
     */
    public void reproducirCancion(MusicPlayer pPlayer,CancionArchivo pCancionSelected) {
        
        pPlayer.playMusic(pCancionSelected.getPath());
    }
}
