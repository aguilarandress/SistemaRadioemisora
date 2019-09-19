/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Radioemisora;

import Model.Radioemisora.RadioEmisora;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author kenne
 */
public class ControllerRadioemisora {
    private MenuPrincipal emisoraGUI;
    private RadioEmisora emisora;
    
    public ControllerRadioemisora(MenuPrincipal pMenuPrincipal, RadioEmisora pRadioemisora) {
        this.emisoraGUI = pMenuPrincipal;
        this.emisora = pRadioemisora;
    }
    
    public void btnActualizarEmisoraActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        String nombre = emisoraGUI.nombreEmisoraInput.getText();
        String frecuencia = emisoraGUI.urlEmisoraInput.getText();
          if(nombre.isEmpty() ||
           frecuencia.isEmpty() ) {
            JOptionPane.showMessageDialog(emisoraGUI, "Datos invalidos...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }    
}
