/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cancion.CancionArchivo;
import Model.Radioemisora.RadioEmisora;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kenne
 */
public class InformacionCancionArchivo extends javax.swing.JFrame {

    CancionArchivo cancion;
    RadioEmisora emisora;
    
    DefaultComboBoxModel cancionArchivoComboBoxModel;
    
    
    /**
     * Creates new form InformacionCancion
     */
    public InformacionCancionArchivo(CancionArchivo pCancion,
            DefaultComboBoxModel pCancionArchivoComboBoxModel,
            RadioEmisora pEmisora) {
        this.cancion = pCancion;
        this.cancionArchivoComboBoxModel = pCancionArchivoComboBoxModel;
        this.emisora = pEmisora;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        informacionCancionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancionNombreLabel = new javax.swing.JLabel();
        cancionDuracionLabel = new javax.swing.JLabel();
        cancionCantanteLabel = new javax.swing.JLabel();
        cancionGeneroLabel = new javax.swing.JLabel();
        cancionDiscoLabel = new javax.swing.JLabel();
        nombreCancionShowLabel = new javax.swing.JLabel();
        cancionAlbumLabel = new javax.swing.JLabel();
        cancionPathLabel = new javax.swing.JLabel();
        duracionCancionInput = new javax.swing.JTextField();
        cantanteCancionInput = new javax.swing.JTextField();
        generoCancionInput = new javax.swing.JTextField();
        albumCancionInput = new javax.swing.JTextField();
        pathCancionInput = new javax.swing.JTextField();
        botonActualizarCancion = new javax.swing.JButton();
        botonEliminarCancion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informacionCancionLabel.setText("Información de canción:");

        cancionNombreLabel.setText("Nombre:");

        cancionDuracionLabel.setText("Duración:");

        cancionCantanteLabel.setText("Cantante:");

        cancionGeneroLabel.setText("Género:");

        nombreCancionShowLabel.setText(this.cancion.getNombre());

        cancionAlbumLabel.setText("Album:");

        cancionPathLabel.setText("PATH:");

        duracionCancionInput.setText(String.valueOf(this.cancion.getDuracion()));
        duracionCancionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                duracionCancionInputKeyTyped(evt);
            }
        });

        cantanteCancionInput.setText(this.cancion.getCantante());

        generoCancionInput.setText(this.cancion.getGenero());

        albumCancionInput.setText(this.cancion.getAlbum());

        pathCancionInput.setText(this.cancion.getPath());

        botonActualizarCancion.setText("Actualizar Datos");
        botonActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarCancionActionPerformed(evt);
            }
        });

        botonEliminarCancion.setText("Eliminar Canción");
        botonEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informacionCancionLabel)
                            .addComponent(cancionDiscoLabel)
                            .addComponent(cancionPathLabel))
                        .addGap(280, 295, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancionNombreLabel)
                                    .addComponent(cancionDuracionLabel)
                                    .addComponent(cancionCantanteLabel)
                                    .addComponent(cancionGeneroLabel)
                                    .addComponent(cancionAlbumLabel))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(duracionCancionInput)
                                    .addComponent(cantanteCancionInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(generoCancionInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(albumCancionInput)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombreCancionShowLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pathCancionInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonActualizarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(botonEliminarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacionCancionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionNombreLabel)
                    .addComponent(nombreCancionShowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionDuracionLabel)
                    .addComponent(duracionCancionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionCantanteLabel)
                    .addComponent(cantanteCancionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionGeneroLabel)
                    .addComponent(generoCancionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionAlbumLabel)
                    .addComponent(albumCancionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancionPathLabel)
                    .addComponent(pathCancionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarCancion)
                    .addComponent(botonEliminarCancion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(cancionDiscoLabel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Actualiza los datos de la cancion
     * @param evt 
     */
    private void botonActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarCancionActionPerformed
        String album = this.albumCancionInput.getText();
        String genero = this.generoCancionInput.getText();
        String cantante = this.cantanteCancionInput.getText();
        String duracion = this.duracionCancionInput.getText();
        String path = this.pathCancionInput.getText();
        
        // Validaciones 
        if (album.isEmpty() || cantante.isEmpty() || duracion.isEmpty() || 
                genero.isEmpty() || path.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Datos Invalidos...", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int duracionInt = Integer.parseInt(duracion);
        
        // Cambia la información de la cancion
        this.cancion.setAlbum(album);
        this.cancion.setGenero(genero);
        this.cancion.setCantante(cantante);
        this.cancion.setDuracion(duracionInt);
        this.cancion.setPath(path);
        
        // Cierra la ventana
        this.dispose();
    }//GEN-LAST:event_botonActualizarCancionActionPerformed
    
    /**
     * Solo permite que se digiten digitos
     * @param evt 
     */
    private void duracionCancionInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duracionCancionInputKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_duracionCancionInputKeyTyped

    private void botonEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCancionActionPerformed
        
        String nombre = this.cancion.getNombre();
        
        this.cancionArchivoComboBoxModel.removeElement(nombre);
        this.emisora.getCancionesArchivo().remove(nombre);
        
        this.dispose();
    }//GEN-LAST:event_botonEliminarCancionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField albumCancionInput;
    private javax.swing.JButton botonActualizarCancion;
    private javax.swing.JButton botonEliminarCancion;
    private javax.swing.JLabel cancionAlbumLabel;
    private javax.swing.JLabel cancionCantanteLabel;
    private javax.swing.JLabel cancionDiscoLabel;
    private javax.swing.JLabel cancionDuracionLabel;
    private javax.swing.JLabel cancionGeneroLabel;
    private javax.swing.JLabel cancionNombreLabel;
    private javax.swing.JLabel cancionPathLabel;
    private javax.swing.JTextField cantanteCancionInput;
    private javax.swing.JTextField duracionCancionInput;
    private javax.swing.JTextField generoCancionInput;
    private javax.swing.JLabel informacionCancionLabel;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreCancionShowLabel;
    private javax.swing.JTextField pathCancionInput;
    // End of variables declaration//GEN-END:variables
}