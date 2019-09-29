package filereader;

import com.gembox.spreadsheet.*;
import java.util.ArrayList;
import Model.Cancion.CancionArchivo;
import Model.Cancion.Cancion;

/**
 * Clase para leer archivos Excel y cargarlos a memoria
 * @author Andres
 */
public class ExcelReader {
    
    private String path;
    private ArrayList<CancionArchivo> cancionesArchivoCargadas;
    private ArrayList<Cancion> cancionesDiscoCargadas;
    
    /**
     * Constructor que inicializa el path del archivo que se desea leer
     * @param path Un string con el path absoluto del archivo
     */
    public ExcelReader(String path) {
        // Set license
        SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
        this.path = path;
        this.cancionesArchivoCargadas = new ArrayList<>();
        this.cancionesDiscoCargadas = new ArrayList<>();
    }
    
    /**
     * Carga el archivo excel a memoria
     * @return Un booleano que determina si la carga del archivo fue exitosa
     */
    public boolean cargarArchivoExcel() {
        try {
            // Cargar archivo
            ExcelFile workBook = ExcelFile.load(this.path);
            ExcelWorksheet workSheet = workBook.getWorksheet(0);
            int numeroFilas = workSheet.getRows().size();
            for(int i = 1; i < numeroFilas; i++) {
                ExcelRow filaActual = workSheet.getRow(i);
                
                String album = filaActual.getCell(0).getStringValue();
                String nombre = filaActual.getCell(1).getStringValue();
                String cantante = filaActual.getCell(2).getStringValue();
                int duracion = filaActual.getCell(3).getIntValue();
                String genero = filaActual.getCell(4).getStringValue();
                String path = filaActual.getCell(5).getStringValue();

                // Guardar cancion nueva
                CancionArchivo cancionNueva = new CancionArchivo(nombre, duracion, cantante, genero, album, path);
                this.cancionesArchivoCargadas.add(cancionNueva);
            }
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    /**
     * Carga el archivo excel a memoria con canciones de disco
     * @return Un booleano que determina si la carga del archivo fue exitosa
     */
    public boolean cargarArchivoExcelDisco() {
        try {
            // Cargar archivo
            ExcelFile workBook = ExcelFile.load(this.path);
            ExcelWorksheet workSheet = workBook.getWorksheet(0);
            int numeroFilas = workSheet.getRows().size();
            for(int i = 1; i < numeroFilas; i++) {
                ExcelRow filaActual = workSheet.getRow(i);
                
                String nombre = filaActual.getCell(0).getStringValue();
                String cantante = filaActual.getCell(1).getStringValue();
                int duracion = filaActual.getCell(2).getIntValue();
                String genero = filaActual.getCell(3).getStringValue();
                // Guardar canciones
                Cancion cancionNueva = new Cancion(nombre, duracion, cantante, genero);
                this.cancionesDiscoCargadas.add(cancionNueva);
            }
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    public ArrayList<CancionArchivo> getCancionesArchivoCargadas() {
        return this.cancionesArchivoCargadas;
    }
    
    public ArrayList<Cancion> getCancionesDiscoCargadas() {
        return this.cancionesDiscoCargadas;
    }
}
