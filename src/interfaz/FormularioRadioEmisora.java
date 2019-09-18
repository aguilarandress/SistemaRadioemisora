package interfaz;

import javax.swing.JOptionPane;
import radioemisora.RadioEmisora;

/**
 *
 * @author Andres
 */
public class FormularioRadioEmisora extends javax.swing.JFrame {

    /**
     * Creates new form FormularioRadioEmisora
     */
    public FormularioRadioEmisora() {
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

        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        labelDireccionFisica = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        labelFrecuencia = new javax.swing.JLabel();
        inputFrecuencia = new javax.swing.JTextField();
        labelSitioWeb = new javax.swing.JLabel();
        inputSitioWeb = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        labelTitulo.setText("Sistema de Radioemisora");

        labelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNombre.setText("Nombre");

        inputNombre.setText("Nombre de la radioemisora...");

        labelDireccionFisica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccionFisica.setText("Direccion Fisica");

        inputDireccion.setText("Dirección física...");

        labelFrecuencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFrecuencia.setText("Frecuencia");

        inputFrecuencia.setText("Frecuencia...");

        labelSitioWeb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSitioWeb.setText("Sitio Web");

        inputSitioWeb.setText("Sitio Web");

        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelFrecuencia)
                            .addComponent(labelNombre)
                            .addComponent(inputNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(inputFrecuencia))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDireccionFisica)
                            .addComponent(inputDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(labelSitioWeb)
                            .addComponent(inputSitioWeb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelDireccionFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFrecuencia)
                    .addComponent(labelSitioWeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(agregarBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        // Obtener datos
        String nombre = this.inputNombre.getText();
        String direccion = this.inputDireccion.getText();
        String frecuencia = this.inputFrecuencia.getText();
        String sitioWeb = this.inputSitioWeb.getText();
        // Validar datos
        if(nombre.isEmpty() || direccion.isEmpty() || 
           frecuencia.isEmpty() || sitioWeb.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Datos invalidos...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        RadioEmisora radioEmisora = new RadioEmisora(nombre, direccion, frecuencia, sitioWeb);
        System.out.println(radioEmisora.toString());
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioRadioEmisora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRadioEmisora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRadioEmisora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRadioEmisora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormularioRadioEmisora().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputFrecuencia;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputSitioWeb;
    private javax.swing.JLabel labelDireccionFisica;
    private javax.swing.JLabel labelFrecuencia;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSitioWeb;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
