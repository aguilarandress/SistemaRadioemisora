/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Cancion.Cancion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian Vargas
 * @author Andres Aguilar
 * @author Kenneth Sanchez
 */
public class InformacionCancionDisco extends javax.swing.JFrame {
    
    private MenuPrincipal main;
    private DefaultComboBoxModel cancionesCombo;
    private DefaultListModel listaCanciones;
    private Cancion cancion;
   
    /**
     * Crea una nueva ventana
     * @param main
     * @param cancionesCombo
     * @param listaCancionesModel
     * @param cancion 
     */
    public InformacionCancionDisco(MenuPrincipal main, DefaultComboBoxModel cancionesCombo, DefaultListModel listaCancionesModel, Cancion cancion) {
        this.main = main;
        this.cancionesCombo = cancionesCombo;
        this.listaCanciones = listaCancionesModel;
        this.cancion = cancion;
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

        jLabel1 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        cantanteLabel = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        duracionLabel = new javax.swing.JLabel();
        nombreCodigoLabel = new javax.swing.JLabel();
        cantanteInput = new javax.swing.JTextField();
        generoInput = new javax.swing.JTextField();
        duracionInput = new javax.swing.JTextField();
        notaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informacion de la cancion:");

        botonActualizar.setText("Actualizar informacion");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre:");

        cantanteLabel.setText("Cantante:");

        generoLabel.setText("Genero:");

        duracionLabel.setText("Duracion: ");

        nombreCodigoLabel.setText(this.cancion.getNombre());

        cantanteInput.setText(this.cancion.getCantante());

        generoInput.setText(this.cancion.getGenero());
        generoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoInputActionPerformed(evt);
            }
        });

        duracionInput.setText(Integer.toString(this.cancion.getDuracion()));
        duracionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                duracionInputKeyTyped(evt);
            }
        });

        notaLabel.setText("Nota: No se puede actualizar el nombre de la cancion.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(cantanteLabel)
                            .addComponent(generoLabel)
                            .addComponent(duracionLabel))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCodigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantanteInput, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(generoInput)
                            .addComponent(duracionInput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(notaLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreCodigoLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantanteLabel)
                    .addComponent(cantanteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoLabel)
                    .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracionLabel)
                    .addComponent(duracionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonActualizar)
                .addGap(38, 38, 38)
                .addComponent(notaLabel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Actualiza la cancion, y la lista de canciones del disco.
     * @param evt 
     */
    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        String cantante = this.cantanteInput.getText(); // Nombre a colocar
        String genero = this.generoInput.getText(); // Genero a colocar
        String duracionStr = this.duracionInput.getText(); // Duracion a colocar
        
        // Si algun input del usuario no contiene informacion se indica que los datos estan incompletos
        if(cantante.isEmpty() || genero.isEmpty() || duracionStr.isEmpty()){
            JOptionPane.showMessageDialog(this, "Datos incompletos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Se remueve la antigua cancion de la lista
        this.listaCanciones.removeElement(cancion.getNombre() + " - " 
            + cancion.getGenero() + " - " +  cancion.getCantante());
        

        int duracion = Integer.parseInt(duracionStr); // Duracion en enteros
        
        this.cancion.setCantante(cantante); // Se actualiza el cantante de la cancion
        this.cancion.setGenero(genero); // Se actualiza el genero de la cancion
        this.cancion.setDuracion(duracion); // Se actualiza la duracion de la cancion
        
        // Se añade la cancion ya actualizada a la lista
        this.listaCanciones.addElement(cancion.getNombre() + " - " 
            + cancion.getGenero() + " - " +  cancion.getCantante());
        
        main.setVisible(true);
        JOptionPane.showMessageDialog(main, "Cancion actualizada con exito", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void generoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoInputActionPerformed
        // TODO add your handlinnombreLabelhere:
    }//GEN-LAST:event_generoInputActionPerformed
    /**
     * Unicamente permite digitar numeros en el input de  duracion
     * @param evt 
     */
    private void duracionInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duracionInputKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_duracionInputKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JTextField cantanteInput;
    private javax.swing.JLabel cantanteLabel;
    private javax.swing.JTextField duracionInput;
    private javax.swing.JLabel duracionLabel;
    private javax.swing.JTextField generoInput;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombreCodigoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel notaLabel;
    // End of variables declaration//GEN-END:variables
}
