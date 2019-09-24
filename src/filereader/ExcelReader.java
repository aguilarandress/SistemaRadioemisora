package filereader;

import com.gembox.spreadsheet.*;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ExcelReader {
    
    private String path;
    private ArrayList<ArrayList<String>> fileData;
    
    /**
     * Constructor que inicializa el path del archivo que se desea leer
     * @param path Un string con el path absoluto del archivo
     */
    public ExcelReader(String path) {
        // Set license
        SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
        this.path = path;
        this.fileData = new ArrayList<ArrayList<String>>();
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
                
                // Agregar un array list con la fila del excel
                this.fileData.add(new ArrayList<String>());
                
                int numeroCeldas = filaActual.getAllocatedCells().size();
                for(int j = 0; j < numeroCeldas; j++) {
                    ExcelCell celdaActual = filaActual.getCell(j);
                    // Obtener valor de la celda y guardar
                    String valorCelda = celdaActual.getStringValue();
                    this.fileData.get(i).add(valorCelda);
                }
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
    
    public ArrayList<ArrayList<String>> getFileData() {
        return this.fileData;
    }
}
