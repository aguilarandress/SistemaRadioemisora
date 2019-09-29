package Model.Radioemisora;

import Model.Cancion.CancionArchivo;
import Model.Locutor.Locutor;
import Model.Programa.Programa;
import Model.Disco.Disco;
import Model.Playlist.PlayList;
import java.util.ArrayList;

/**
 *
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
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

    public RadioEmisora(String nombre, String direccionFisica,
            String frecuencia, String urlSitioWeb) {
        this.nombre = nombre;
        this.direccionFisica = direccionFisica;
        this.frecuencia = frecuencia;
        this.urlSitioWeb = urlSitioWeb;
        this.locutores = new ArrayList<Locutor>();
        this.programas = new ArrayList<Programa>();
        this.discos = new ArrayList<Disco>();
        this.cancionesArchivo = new ArrayList<CancionArchivo>();
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

    public ArrayList getLocutores() {
        return locutores;
    }

    public ArrayList getProgramas() {
        return programas;
    }

    public ArrayList<Disco> getDiscos() {
        return this.discos;
    }
    
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
     * @return 
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
     * @param pNombre
     * @return 
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
     * 
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
     * @param programaNuevo Programa nuevo que se desea agregar
     */
    public void agregarPrograma(Programa programaNuevo) {
        this.programas.add(programaNuevo);
    }
    
    /**
     * Agrega una cancion a la radioemisora
     * 
     * @param pCancion 
     */
    public void agregarCancionArchivo(CancionArchivo pCancion) {
        this.cancionesArchivo.add(pCancion);
    }
    
    
    /**
     * Agrega un nuevo disco a la lista de discos
     *
     * @param discoNuevo El disco nuevo que se desea agregar
     */
    public void agregarDisco(Disco discoNuevo) {
        this.discos.add(discoNuevo);
    }

    /**
     * Obtiene un programa de acuerdo a su nombre
     *
     * @param nombre Un string con el nombre del programa
     * @return El objeto del programa o un valor null en caso de no encontrarlo
     */
    public Programa obtenerProgramaPorNombre(String nombre) {
        for (int i = 0; i < this.programas.size(); i++) {
            if (this.programas.get(i).getNombre().equals(nombre)) {
                return this.programas.get(i);
            }
        }
        return null;
    }
}
