package filereader;

import com.gembox.spreadsheet.*;
import java.util.ArrayList;
import Model.Cancion.Cancion;

/**
 * Clase para leer archivos Excel y cargarlos a memoria
 * @author Andres
 */
public class ExcelReader {
    
    private String path;
    private ArrayList<Cancion> fileData;
    
    /**
     * Constructor que inicializa el path del archivo que se desea leer
     * @param path Un string con el path absoluto del archivo
     */
    public ExcelReader(String path) {
        // Set license
        SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
        this.path = path;
        this.fileData = new ArrayList<>();
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
                
                String nombre = filaActual.getCell(0).getStringValue();
                String cantante = filaActual.getCell(1).getStringValue();
                int duracion = Integer.parseInt(filaActual.getCell(2).getStringValue());
                String generoMusical = filaActual.getCell(3).getStringValue();
                // Guardar cancion nueva
                Cancion cancionNueva = new Cancion(nombre, duracion, cantante, generoMusical);
                this.fileData.add(cancionNueva);
            }
            return true;
        } catch(Exception e) {
            System.out.println("Error de path...");
            return false;
        }
    }
    
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    public ArrayList<Cancion> getFileData() {
        return this.fileData;
    }
}
