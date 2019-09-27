package filereader;

import com.gembox.spreadsheet.*;
import java.util.ArrayList;
import Model.Cancion.CancionArchivo;

/**
 * Clase para leer archivos Excel y cargarlos a memoria
 * @author Andres
 */
public class ExcelReader {
    
    private String path;
    private ArrayList<CancionArchivo> fileData;
    
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
                System.out.println(i);
                ExcelRow filaActual = workSheet.getRow(i);
                
                String album = (String) filaActual.getCell(0).getValue();
                
                String nombre = filaActual.getCell(1).getStringValue();
                String cantante = filaActual.getCell(2).getStringValue();
                int duracion = filaActual.getCell(3).getIntValue();
                String genero = filaActual.getCell(4).getStringValue();
                String path = filaActual.getCell(5).getStringValue();

                // Guardar cancion nueva
                CancionArchivo cancionNueva = new CancionArchivo(nombre, duracion, cantante, genero, album, path);
                this.fileData.add(cancionNueva);
            }
        } catch(Exception e) {
            System.out.println(e.toString());
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
    
    public ArrayList<CancionArchivo> getFileData() {
        return this.fileData;
    }
}
