/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Radioemisora.RadioEmisora;
import javax.swing.JOptionPane;

/**
 *
 * @author kenne
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private RadioEmisora emisora;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(RadioEmisora pEmisora) {
        initComponents();
        emisora = pEmisora;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        Tabs = new javax.swing.JTabbedPane();
        radioEmisoraTab = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        frecuenciaLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        direccionFisicaLabel = new javax.swing.JLabel();
        nombreEmisoraShow = new javax.swing.JLabel();
        frecuenciaEmisoraShow = new javax.swing.JLabel();
        urlEmisoraShow = new javax.swing.JLabel();
        direccionFisicaEmisoraShow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nuevoNombreLabel = new javax.swing.JLabel();
        nuevaFrecuenciaLabel = new javax.swing.JLabel();
        nuevoUrlLabel = new javax.swing.JLabel();
        nuevaDireccionFisicaLabel = new javax.swing.JLabel();
        nombreEmisoraInput = new javax.swing.JTextField();
        frecuenciaEmisoraInput = new javax.swing.JTextField();
        urlEmisoraInput = new javax.swing.JTextField();
        direccionFisicaInput = new javax.swing.JTextField();
        btnActualizarEmisora = new javax.swing.JButton();
        locutoresTab = new javax.swing.JPanel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setText("Nombre:");

        frecuenciaLabel.setText("Frecuencia:");

        urlLabel.setText("URL:");

        direccionFisicaLabel.setText("Dirección Física:");

        nombreEmisoraShow.setText("INDEFINIDO");

        frecuenciaEmisoraShow.setText("INDEFINIDO");

        urlEmisoraShow.setText("INDEFINIDO");

        direccionFisicaEmisoraShow.setText("INDEFINIDO");

        nuevoNombreLabel.setText("Nuevo Nombre:");

        nuevaFrecuenciaLabel.setText("Nueva Frecuencia:");

        nuevoUrlLabel.setText("Nuevo URL:");

        nuevaDireccionFisicaLabel.setText("Nueva Dirección Física:");

        nombreEmisoraInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmisoraInputActionPerformed(evt);
            }
        });

        urlEmisoraInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlEmisoraInputActionPerformed(evt);
            }
        });

        direccionFisicaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFisicaInputActionPerformed(evt);
            }
        });

        btnActualizarEmisora.setText("Actualizar Información");
        btnActualizarEmisora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmisoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout radioEmisoraTabLayout = new javax.swing.GroupLayout(radioEmisoraTab);
        radioEmisoraTab.setLayout(radioEmisoraTabLayout);
        radioEmisoraTabLayout.setHorizontalGroup(
            radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(radioEmisoraTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarEmisora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(radioEmisoraTabLayout.createSequentialGroup()
                        .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(frecuenciaLabel)
                            .addComponent(urlLabel)
                            .addComponent(direccionFisicaLabel))
                        .addGap(60, 60, 60)
                        .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionFisicaEmisoraShow)
                            .addComponent(urlEmisoraShow)
                            .addComponent(frecuenciaEmisoraShow)
                            .addComponent(nombreEmisoraShow))
                        .addGap(0, 467, Short.MAX_VALUE))
                    .addGroup(radioEmisoraTabLayout.createSequentialGroup()
                        .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevaDireccionFisicaLabel)
                            .addComponent(nuevoUrlLabel)
                            .addComponent(nuevaFrecuenciaLabel)
                            .addComponent(nuevoNombreLabel))
                        .addGap(25, 25, 25)
                        .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreEmisoraInput)
                            .addComponent(frecuenciaEmisoraInput)
                            .addComponent(urlEmisoraInput)
                            .addComponent(direccionFisicaInput))))
                .addContainerGap())
        );
        radioEmisoraTabLayout.setVerticalGroup(
            radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioEmisoraTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreEmisoraShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frecuenciaLabel)
                    .addComponent(frecuenciaEmisoraShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(urlEmisoraShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionFisicaLabel)
                    .addComponent(direccionFisicaEmisoraShow))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoNombreLabel)
                    .addComponent(nombreEmisoraInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaFrecuenciaLabel)
                    .addComponent(frecuenciaEmisoraInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoUrlLabel)
                    .addComponent(urlEmisoraInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(radioEmisoraTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaDireccionFisicaLabel)
                    .addComponent(direccionFisicaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizarEmisora)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        Tabs.addTab("RadioEmisora", radioEmisoraTab);

        javax.swing.GroupLayout locutoresTabLayout = new javax.swing.GroupLayout(locutoresTab);
        locutoresTab.setLayout(locutoresTabLayout);
        locutoresTabLayout.setHorizontalGroup(
            locutoresTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        locutoresTabLayout.setVerticalGroup(
            locutoresTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        Tabs.addTab("Locutores", locutoresTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEmisoraInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmisoraInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmisoraInputActionPerformed

    private void urlEmisoraInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlEmisoraInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlEmisoraInputActionPerformed

    private void direccionFisicaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFisicaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFisicaInputActionPerformed

    private void btnActualizarEmisoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmisoraActionPerformed
        String nombre = this.nombreEmisoraInput.getText();
        String url = this.urlEmisoraInput.getText();
        String frecuencia = this.frecuenciaEmisoraInput.getText();
        String direccion = this.direccionFisicaInput.getText();
          if(nombre.isEmpty() || url.isEmpty()
             || frecuencia.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Datos invalidos...", "ERROR", JOptionPane.ERROR_MESSAGE);
          } else {
              emisora.setNombre(nombre);
              emisora.setFrecuencia(frecuencia);
              emisora.setUrlSitioWeb(url);
              emisora.setDireccionFisica(direccion);
              
              this.direccionFisicaEmisoraShow.setText(emisora.getDireccionFisica());
              this.frecuenciaEmisoraShow.setText(emisora.getFrecuencia());
              this.nombreEmisoraShow.setText(emisora.getNombre());
              this.urlEmisoraShow.setText(emisora.getUrlSitioWeb());
          }
    }//GEN-LAST:event_btnActualizarEmisoraActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnActualizarEmisora;
    public javax.swing.JLabel direccionFisicaEmisoraShow;
    public javax.swing.JTextField direccionFisicaInput;
    private javax.swing.JLabel direccionFisicaLabel;
    public javax.swing.JTextField frecuenciaEmisoraInput;
    public javax.swing.JLabel frecuenciaEmisoraShow;
    private javax.swing.JLabel frecuenciaLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel locutoresTab;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    public javax.swing.JTextField nombreEmisoraInput;
    public javax.swing.JLabel nombreEmisoraShow;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nuevaDireccionFisicaLabel;
    private javax.swing.JLabel nuevaFrecuenciaLabel;
    private javax.swing.JLabel nuevoNombreLabel;
    private javax.swing.JLabel nuevoUrlLabel;
    private javax.swing.JPanel radioEmisoraTab;
    public javax.swing.JTextField urlEmisoraInput;
    public javax.swing.JLabel urlEmisoraShow;
    private javax.swing.JLabel urlLabel;
    // End of variables declaration//GEN-END:variables
}
