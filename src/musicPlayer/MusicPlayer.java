/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicPlayer;

import View.MenuPrincipal;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


/**
 *
 * @since 1.0
 * @author Kenneth Sanchez
 * @version 1.0
 */
public class MusicPlayer {
    
    /**
     * Reproduce el audio siempre y cuando el path sea valido. No puede reproducir .mp3, se
     * recomienda utilizar archivos .wav
     * @param pPath PATH del archivo de la cancion
     */
    public void playMusic(String pPath) {
        try {
            // Crea un file con el path ingresado
            File pathCancion = new File(pPath);
            
            // Revisa si el archivo existe
            if (pathCancion.exists()) {
                
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(pathCancion);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
                JOptionPane.showMessageDialog(null, "Presione OK para dejar de reproducir la canción...");
                clip.close();
            } else {
                // Muestra un mensaje de error si no existe
                JOptionPane.showMessageDialog(null, "Esa cancion no tiene un path valido...", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (Exception ex) {
            
            ex.printStackTrace();
        }
    }
    
}
