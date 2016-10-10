package Interfaz;

import codigo.*;
import javax.swing.*;

public class RegistroP extends javax.swing.JFrame {

    public RegistroP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO USUARIO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JLabel();
        txtUsuarioR = new javax.swing.JLabel();
        txtContraseñaR = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JLabel();
        cajonUsuarioR = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        cajonEmail = new javax.swing.JTextField();
        txtNumeroCuenta = new javax.swing.JLabel();
        cajonNumeroCuenta = new javax.swing.JPasswordField();
        RegresarBtn = new javax.swing.JButton();
        RegistrarBtn = new javax.swing.JButton();
        cajonNombre = new javax.swing.JTextField();
        cajonDocumento = new javax.swing.JTextField();
        cajonContraseñaR = new javax.swing.JPasswordField();
        cajonConfirmacion = new javax.swing.JPasswordField();
        AvatarTxt = new javax.swing.JLabel();
        txtNumeroCuenta1 = new javax.swing.JLabel();
        CargarAvBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");

        txtDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDocumento.setText("Documento");

        txtUsuarioR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuarioR.setText("Usuario");

        txtContraseñaR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContraseñaR.setText("Contraseña");

        txtConfirmacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtConfirmacion.setText("Confirmar contraseña");

        cajonUsuarioR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setText("Email");

        cajonEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtNumeroCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCuenta.setText("Telefono");

        cajonNumeroCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        RegresarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });

        RegistrarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegistrarBtn.setText("Registrarse");
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });

        cajonNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonContraseñaR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonConfirmacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        AvatarTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumeroCuenta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCuenta1.setText("Avatar");

        CargarAvBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CargarAvBtn.setText("Cargar Avatar");
        CargarAvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarAvBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonNombre)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonDocumento)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonEmail)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtNombre)
                    .addComponent(txtDocumento)
                    .addComponent(txtUsuarioR)
                    .addComponent(txtContraseñaR)
                    .addComponent(txtNumeroCuenta)
                    .addComponent(txtConfirmacion)
                    .addComponent(txtNumeroCuenta1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cajonNumeroCuenta))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajonUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajonContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegistrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CargarAvBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cajonConfirmacion, cajonContraseñaR, cajonUsuarioR});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioR, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaR, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cajonContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajonNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuenta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargarAvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Registro registrarUsuario = new Registro();
    Ingreso pantallaIngreso = new Ingreso();
    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
        String nombre = cajonNombre.getText();
        String documento = cajonDocumento.getText();
        String usuario = cajonUsuarioR.getText();
        String contraseña = new String(cajonContraseñaR.getPassword());
        String confirmar = new String(cajonConfirmacion.getPassword());
        String email = cajonEmail.getText();
        String numeroCuenta = new String(cajonNumeroCuenta.getPassword());
        boolean Igual = registrarUsuario.buscarIgual(usuario);
//Guardar Registro
        if (nombre.equals("") || documento.equals("") || usuario.equals("") || contraseña.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(cajonDocumento, "Llene todos los campos por favor", "ERROR", 2);
        } else {
            if (contraseña.equals(confirmar)) {
                if (Igual == false) {
                    int a = JOptionPane.showConfirmDialog(null, "¿Deseas registrarte como Cliente con los siguientes datos?:"
                            + "\nNombre: " + nombre
                            + "\nDocumento: " + documento
                            + "\nUsuario: " + usuario
                            + "\nEmail: " + email);
                    if (a == JOptionPane.YES_OPTION) {
                        registrarUsuario.ingresarUsuario(nombre, documento, usuario, contraseña, email, numeroCuenta);
                        //Mensaje de confirmacion
                        JOptionPane.showMessageDialog(cajonDocumento, "El Usuario se registro con los datos\n"
                                + "\nNombre: " + nombre
                                + "\nDocumento: " + documento
                                + "\nUsuario: " + usuario
                                + "\nEmail: " + email, "Registro realizado", 1);
                        //Retorno a pantalla de logeo  
                        pantallaIngreso.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(cajonDocumento, "El userName ya se uso");
                    cajonUsuarioR.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Las contraseñas no coinciden, intentelo de nuevo", "ERROR", 2);
                cajonContraseñaR.setText("");
                cajonConfirmacion.setText("");
            }
        }
    }//GEN-LAST:event_RegistrarBtnActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Deseas volver al menu principal?");
        if (a == JOptionPane.YES_OPTION) {
            pantallaIngreso.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void CargarAvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarAvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarAvBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvatarTxt;
    private javax.swing.JButton CargarAvBtn;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JPasswordField cajonConfirmacion;
    private javax.swing.JPasswordField cajonContraseñaR;
    private javax.swing.JTextField cajonDocumento;
    private javax.swing.JTextField cajonEmail;
    private javax.swing.JTextField cajonNombre;
    private javax.swing.JPasswordField cajonNumeroCuenta;
    private javax.swing.JTextField cajonUsuarioR;
    private javax.swing.JLabel txtConfirmacion;
    private javax.swing.JLabel txtContraseñaR;
    private javax.swing.JLabel txtDocumento;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroCuenta;
    private javax.swing.JLabel txtNumeroCuenta1;
    private javax.swing.JLabel txtUsuarioR;
    // End of variables declaration//GEN-END:variables
}
