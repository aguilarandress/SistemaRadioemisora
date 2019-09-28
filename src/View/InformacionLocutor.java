/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Locutor.Locutor;
import Model.Radioemisora.RadioEmisora;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth Sanchez
 * @author Andres Aguilar
 * @author Fabian Vargas
 */
public class InformacionLocutor extends javax.swing.JFrame {
    private Locutor locutor;
    private RadioEmisora emisora;
    private DefaultListModel locutoresListModel;
    private DefaultComboBoxModel locutoresComboBoxModel;
    private DefaultComboBoxModel locutoresProgramasComboBoxModel;
    private DefaultListModel programasListModel;
    MenuPrincipal main;
    /**
     * Creates new form InformacionLocutor
     */
    public InformacionLocutor(MenuPrincipal main, JButton pVerInfoLocutor, Locutor pLocutor, RadioEmisora pEmisora,
            DefaultListModel pLocutoresListModel, DefaultComboBoxModel pLocutoresComboBoxModel,
            DefaultComboBoxModel pLocutoresProgramasComboBoxModel) {
        this.locutor = pLocutor;
        this.emisora = pEmisora;
        this.locutoresListModel = pLocutoresListModel;
        this.locutoresComboBoxModel = pLocutoresComboBoxModel;
        this.locutoresProgramasComboBoxModel = pLocutoresProgramasComboBoxModel;
        this.programasListModel = pProgramasListModel;
        this.main = main;
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

        informacionLocutorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreLocutorLabel = new javax.swing.JLabel();
        idLocutorLabel = new javax.swing.JLabel();
        correoLocutorLabel = new javax.swing.JLabel();
        telefonoLocutorLabel = new javax.swing.JLabel();
        direccionLocutorLabel = new javax.swing.JLabel();
        sexoLocutorLabel = new javax.swing.JLabel();
        fechaLocutorLabel = new javax.swing.JLabel();
        botonActualizarInfo = new javax.swing.JButton();
        botonEliminarLocutor = new javax.swing.JButton();
        nombreLocutorInput = new javax.swing.JTextField();
        idLocutorInput = new javax.swing.JTextField();
        correoLocutorInput = new javax.swing.JTextField();
        telefonoLocutorInput = new javax.swing.JTextField();
        direccionLocutorInput = new javax.swing.JTextField();
        sexoLocutorInput = new javax.swing.JTextField();
        fechaLocutorInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        informacionLocutorLabel.setText("Información del Locutor:");

        nombreLocutorLabel.setText("Nombre:");

        idLocutorLabel.setText("ID:");

        correoLocutorLabel.setText("Correo:");

        telefonoLocutorLabel.setText("Telefono: ");

        direccionLocutorLabel.setText("Dirección:");

        sexoLocutorLabel.setText("Sexo:");

        fechaLocutorLabel.setText("Fecha:");

        botonActualizarInfo.setText("Actualizar");
        botonActualizarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarInfoActionPerformed(evt);
            }
        });

        botonEliminarLocutor.setText("Eliminar");
        botonEliminarLocutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarLocutorActionPerformed(evt);
            }
        });

        nombreLocutorInput.setText(this.locutor.getNombre());
        nombreLocutorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLocutorInputActionPerformed(evt);
            }
        });

        idLocutorInput.setText(this.locutor.getId());

        correoLocutorInput.setText(this.locutor.getCorreo());
        correoLocutorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoLocutorInputActionPerformed(evt);
            }
        });

        telefonoLocutorInput.setText(this.locutor.getTelefono());

        direccionLocutorInput.setText(this.locutor.getDireccion());

        sexoLocutorInput.setText(this.locutor.getSexo());

        fechaLocutorInput.setText(this.locutor.getFecha());
        fechaLocutorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaLocutorInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonActualizarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarLocutor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaLocutorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(fechaLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(direccionLocutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idLocutorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(correoLocutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreLocutorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telefonoLocutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(sexoLocutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telefonoLocutorInput, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                                    .addComponent(direccionLocutorInput)
                                    .addComponent(correoLocutorInput)
                                    .addComponent(idLocutorInput)
                                    .addComponent(nombreLocutorInput)
                                    .addComponent(sexoLocutorInput))))
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(informacionLocutorLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacionLocutorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLocutorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLocutorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correoLocutorLabel)
                    .addComponent(correoLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefonoLocutorLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionLocutorLabel)
                            .addComponent(direccionLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(telefonoLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLocutorLabel)
                    .addComponent(sexoLocutorInput, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(fechaLocutorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(fechaLocutorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminarLocutor)
                    .addComponent(botonActualizarInfo))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaLocutorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaLocutorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaLocutorInputActionPerformed

    private void nombreLocutorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLocutorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLocutorInputActionPerformed

    private void correoLocutorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoLocutorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoLocutorInputActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * Actualiza la información del locutor
     * @param evt 
     */
    private void botonActualizarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarInfoActionPerformed
        String id = this.idLocutorInput.getText().trim();
        String nombre = this.nombreLocutorInput.getText().trim();
        String correo = this.correoLocutorInput.getText().trim();
        String telefono = this.telefonoLocutorInput.getText().trim();
        String direccion = this.direccionLocutorInput.getText().trim();
        String sexo = this.sexoLocutorInput.getText().trim();
        String fecha = this.fechaLocutorInput.getText().trim();
        
        String idOriginal = id;
        
        // Verificaciones
        if (id.isEmpty() || nombre.isEmpty() || correo.isEmpty() ||
            telefono.isEmpty() || direccion.isEmpty() || sexo.isEmpty() ||
            fecha.isEmpty()){
            JOptionPane.showMessageDialog(this, "Datos invalidos...", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Remueve los strings con la informacion desactualizada del lugar respectivo
        this.locutoresListModel.removeElement("-Nombre: " + this.locutor.getNombre() + "  " 
                                           +"-ID: "+ this.locutor.getId());
        
        this.locutoresComboBoxModel.removeElement(this.locutor.getId());
        this.locutoresProgramasComboBoxModel.removeElement(this.locutor.getId());
        
        // Validaciones
        if (!this.locutor.telefonoValido()) {
            System.out.println("Telefono: " + this.locutor.getTelefono());
            JOptionPane.showMessageDialog(this, "Telefono invalido...", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!this.locutor.correoValido()) {
            JOptionPane.showMessageDialog(this, "Correo invalido...", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (idOriginal.equals(this.locutor.getId())){
            this.locutor.setId(id);
            System.out.println("MISMA CEDULA QUE ANTES");
        } else if(this.emisora.verificarCedulaRepetida(id)) {
            JOptionPane.showMessageDialog(this, "ID repetido...", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            this.locutor.setId(id);
        }
        
        this.locutor.setNombre(nombre);
        this.locutor.setCorreo(correo);
        this.locutor.setDireccion(direccion);
        this.locutor.setSexo(sexo);
        this.locutor.setFecha(fecha);
        this.locutor.setTelefono(telefono);
        
        // Pone un nuevo string con la informacion actualizada en el lugar respectivo
        this.locutoresListModel.addElement("-Nombre: " + this.locutor.getNombre() + "  " 
                                           +"-ID: "+ this.locutor.getId());
        this.locutoresComboBoxModel.addElement(this.locutor.getId());
        this.locutoresProgramasComboBoxModel.addElement(this.locutor.getId());
        
        // Cierra la ventanilla sin cerrar la principal
        this.dispose();
    }//GEN-LAST:event_botonActualizarInfoActionPerformed
    
    /**
     * Elimina al locutor del sistema
     * @param evt 
     */
    private void botonEliminarLocutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarLocutorActionPerformed
        // Remueve el string con la informacion del locutor a desecha de los lugares respectivos 
        this.locutoresListModel.removeElement("-Nombre: " + this.locutor.getNombre() + "  " 
                                           +"-ID: "+ this.locutor.getId());
        
        this.locutoresComboBoxModel.removeElement(this.locutor.getId());
        this.locutoresProgramasComboBoxModel.removeElement(this.locutor.getId());
        
        // Remueva al locutor del sistema
        this.emisora.removerLocutor(this.locutor);
        
        // Cierra la ventanilla sin cerrar la ventana principal
        this.dispose();
    }//GEN-LAST:event_botonEliminarLocutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarInfo;
    private javax.swing.JButton botonEliminarLocutor;
    private javax.swing.JTextField correoLocutorInput;
    private javax.swing.JLabel correoLocutorLabel;
    private javax.swing.JTextField direccionLocutorInput;
    private javax.swing.JLabel direccionLocutorLabel;
    private javax.swing.JTextField fechaLocutorInput;
    private javax.swing.JLabel fechaLocutorLabel;
    private javax.swing.JTextField idLocutorInput;
    private javax.swing.JLabel idLocutorLabel;
    private javax.swing.JLabel informacionLocutorLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreLocutorInput;
    private javax.swing.JLabel nombreLocutorLabel;
    private javax.swing.JTextField sexoLocutorInput;
    private javax.swing.JLabel sexoLocutorLabel;
    private javax.swing.JTextField telefonoLocutorInput;
    private javax.swing.JLabel telefonoLocutorLabel;
    // End of variables declaration//GEN-END:variables
}
