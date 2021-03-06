package main;

import Model.Radioemisora.RadioEmisora;
import View.MenuPrincipal;
import javax.swing.UIManager;

/**
 * Corre el programa
 * 
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 * @author Fabian Vargas
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Look and feel not loaded...");
        }
        // Crear formulario para radioemisora
        RadioEmisora emisora = new RadioEmisora("INDEFINIDO", "INDEFINIDO", "INDEFINIDO", "INDEFINIDO");
        MenuPrincipal guiEmisora = new MenuPrincipal(emisora);
        
        guiEmisora.setVisible(true);
    }
}
