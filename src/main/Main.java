package main;

import Controller.Radioemisora.ControllerRadioemisora;
import Model.Radioemisora.RadioEmisora;
import View.FormularioRadioEmisora;
import View.MenuPrincipal;

/**
 *
 * @author Andres
 */
public class Main {

    public static void main(String[] args) {
        // Crear formulario para radioemisora
        RadioEmisora emisora = new RadioEmisora("INDEFINIDO", "INDEFINIDO", "INDEFINIDO", "INDEFINIDO");
        MenuPrincipal guiEmisora = new MenuPrincipal(emisora);
       guiEmisora.setVisible(true);
    }
}
