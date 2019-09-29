package View;

import Model.Radioemisora.RadioEmisora;
import Model.Programa.Programa;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class InformacionPrograma extends javax.swing.JFrame {
    
    private RadioEmisora emisora;
    private Programa programaSeleccionado;
    private DefaultListModel programasListModel;
    private DefaultComboBoxModel programasComboBoxModel;
    
    public InformacionPrograma(RadioEmisora emisora, Programa programaSeleccionado, 
            DefaultListModel programasListModel, DefaultComboBoxModel programasComboBoxModel) {        
        this.emisora = emisora;
        this.programaSeleccionado = programaSeleccionado;
        this.programasListModel = programasListModel;
        this.programasComboBoxModel = programasComboBoxModel;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        tituloSeparator = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        horarioInput = new javax.swing.JTextField();
        duracionLabel = new javax.swing.JLabel();
        duracionInput = new javax.swing.JTextField();
        generoLabel = new javax.swing.JLabel();
        generoInput = new javax.swing.JTextField();
        actualizarProgramaBtn = new javax.swing.JButton();
        nombreProgramaLabelShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion Programa");

        tituloLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloLabel.setText("Informacion del programa");

        nombreLabel.setText("Nombre:");

        horarioLabel.setText("Horario:");

        horarioInput.setText(this.programaSeleccionado.getHorario());

        duracionLabel.setText("Duracion:");

        duracionInput.setText(Integer.toString(this.programaSeleccionado.getDuracion())
        );
        duracionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                duracionInputKeyTyped(evt);
            }
        });

        generoLabel.setText("Genero:");

        generoInput.setText(this.programaSeleccionado.getGenero());

        actualizarProgramaBtn.setText("Actualizar Programa");
        actualizarProgramaBtn.setToolTipText("");
        actualizarProgramaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProgramaBtnActionPerformed(evt);
            }
        });

        nombreProgramaLabelShow.setText(this.programaSeleccionado.getNombre());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProgramaLabelShow))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(horarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(duracionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(actualizarProgramaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProgramaLabelShow))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(actualizarProgramaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Actualiza los datos de dicho programa
     * @param evt El evento generado al presionar el boton
     */
    private void actualizarProgramaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProgramaBtnActionPerformed
        // Obtener datos
        String horario = this.horarioInput.getText();
        String duracionStr = this.duracionInput.getText();
        String genero = this.generoInput.getText();
        // Validar campos vacios
        if(horario.isEmpty() || duracionStr.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay discos creados.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Eliminar de los modelos del UI
        this.programasListModel.removeElement(this.programaSeleccionado.toString());
        this.programasComboBoxModel.removeElement(this.programaSeleccionado.getNombre());
        // Asignar nuevos valores
        this.programaSeleccionado.setHorario(horario);
        this.programaSeleccionado.setDuracion(Integer.parseInt(duracionStr));
        this.programaSeleccionado.setGenero(genero);
        // Agregar elementos al UI
        this.programasListModel.addElement(this.programaSeleccionado.toString());
        this.programasComboBoxModel.addElement(this.programaSeleccionado.getNombre());
        
        this.dispose();
    }//GEN-LAST:event_actualizarProgramaBtnActionPerformed
    
    /**
     * Verifica si el caracter ingresado por el usuario es un digito
     * @param evt El evento generado al presionar la tecla
     */
    private void duracionInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_duracionInputKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_duracionInputKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarProgramaBtn;
    private javax.swing.JTextField duracionInput;
    private javax.swing.JLabel duracionLabel;
    private javax.swing.JTextField generoInput;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTextField horarioInput;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreProgramaLabelShow;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JSeparator tituloSeparator;
    // End of variables declaration//GEN-END:variables
}
