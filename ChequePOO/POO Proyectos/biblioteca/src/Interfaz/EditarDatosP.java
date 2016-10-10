package Interfaz;

import codigo.*;
import javax.swing.*;

public class EditarDatosP extends javax.swing.JFrame {

    public EditarDatosP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("EDITAR DATOS");
        if (Registro.x == 1) {
            NumLab.setVisible(false);
            NumeroCuentaTxt.setVisible(false);
        } else {
            NumLab.setVisible(true);
            NumeroCuentaTxt.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreLab = new javax.swing.JLabel();
        DocLab = new javax.swing.JLabel();
        ContLab = new javax.swing.JLabel();
        ConfLab = new javax.swing.JLabel();
        EmailLab = new javax.swing.JLabel();
        NumLab = new javax.swing.JLabel();
        CambiarBtn = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();
        ContraseñaPass = new javax.swing.JPasswordField();
        ConfirmarPass = new javax.swing.JPasswordField();
        NombreTxt = new javax.swing.JTextPane();
        DocumentoTxt = new javax.swing.JTextPane();
        EmailTxt = new javax.swing.JTextPane();
        ContraseñaAntPass = new javax.swing.JPasswordField();
        ContAntLab1 = new javax.swing.JLabel();
        NumeroCuentaTxt = new javax.swing.JPasswordField();
        txtNumeroCuenta1 = new javax.swing.JLabel();
        AvatarTxt = new javax.swing.JLabel();
        CargarAvBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        NombreLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreLab.setText("Nombre");

        DocLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocLab.setText("Documento");

        ContLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContLab.setText("Contraseña");

        ConfLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfLab.setText("Repetir Contraseña");

        EmailLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailLab.setText("Email");

        NumLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NumLab.setText("Telefono");

        CambiarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CambiarBtn.setText("Cambiar");
        CambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarBtnActionPerformed(evt);
            }
        });

        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBoton.setText("Volver");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });

        ContAntLab1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContAntLab1.setText("Antigua Contraseña");

        txtNumeroCuenta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCuenta1.setText("Avatar");

        AvatarTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLab)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ContAntLab1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContraseñaAntPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NombreTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(DocumentoTxt, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumeroCuenta1)
                                .addGap(24, 24, 24)
                                .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CargarAvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CambiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DocLab)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumLab)
                            .addComponent(EmailLab))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroCuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ContLab))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConfLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DocLab)
                    .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContAntLab1)
                    .addComponent(ContraseñaAntPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ContLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfLab)
                            .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ContraseñaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLab)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumLab)
                    .addComponent(NumeroCuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuenta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargarAvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBtnActionPerformed
        try {
            String nombre = NombreTxt.getText();
            String documento = DocumentoTxt.getText();
            String contraseñaAnt = new String(ContraseñaAntPass.getPassword());
            String contraseña = new String(ContraseñaPass.getPassword());
            String confirmar = new String(ConfirmarPass.getPassword());
            String email = EmailTxt.getText();
            String numeroCuenta = new String(NumeroCuentaTxt.getPassword());
            boolean Cambio = true;
            if ((!nombre.equals("")) || (!documento.equals("")
                    || !contraseñaAnt.equals("") || !contraseña.equals("")
                    || !confirmar.equals("") || !email.equals(""))) {
                switch (Registro.x) {
                    case 1:
                        if (contraseña.equals(confirmar)) {
                            int a = JOptionPane.showConfirmDialog(null, "¿Deseas cambiar sus datos?");
                            if (a == JOptionPane.YES_OPTION) {
                                Cambio = registrarUsuario.CambiarDatos(Registro.UsuarioActivo, nombre, documento, contraseñaAnt, contraseña, email, numeroCuenta);
                                if (Cambio == true) {
                                    JOptionPane.showMessageDialog(rootPane, "Tus datos como usuario ya cambiaron");
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Su contraseña anterior es incorrecta");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Digite bien la contraseña a cambiar");
                        }
                        break;
                    case 2:
                        if (contraseña.equals(confirmar)) {
                            int a = JOptionPane.showConfirmDialog(null, "¿Deseas cambiar sus datos?");
                            if (a == JOptionPane.YES_OPTION) {
                                Cambio = registrarUsuario.CambiarDatos(Registro.UsuarioActivo, nombre, documento, contraseñaAnt, contraseña, email, numeroCuenta);
                                if (Cambio == true) {
                                    JOptionPane.showMessageDialog(rootPane, "Tus datos como usuario ya cambiaron");
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Su contraseña anterior es incorrecta");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Digite bien la contraseña a cambiar");
                        }
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Recuerde digitar todos sus datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "el numero de cuenta debe ser solo númerico");
        }

    }//GEN-LAST:event_CambiarBtnActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        switch (Registro.x) {
            case 1:
                MenuClienteP volver = new MenuClienteP();
                volver.setVisible(true);
                dispose();
                break;
        }

    }//GEN-LAST:event_VolverBotonActionPerformed

    private void CargarAvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarAvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarAvBtnActionPerformed

    Registro registrarUsuario = new Registro();
    Ingreso pantallaIngreso = new Ingreso();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvatarTxt;
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JButton CargarAvBtn;
    private javax.swing.JLabel ConfLab;
    private javax.swing.JPasswordField ConfirmarPass;
    private javax.swing.JLabel ContAntLab1;
    private javax.swing.JLabel ContLab;
    private javax.swing.JPasswordField ContraseñaAntPass;
    private javax.swing.JPasswordField ContraseñaPass;
    private javax.swing.JLabel DocLab;
    private javax.swing.JTextPane DocumentoTxt;
    private javax.swing.JLabel EmailLab;
    private javax.swing.JTextPane EmailTxt;
    private javax.swing.JLabel NombreLab;
    private javax.swing.JTextPane NombreTxt;
    private javax.swing.JLabel NumLab;
    private javax.swing.JPasswordField NumeroCuentaTxt;
    private javax.swing.JButton VolverBoton;
    private javax.swing.JLabel txtNumeroCuenta1;
    // End of variables declaration//GEN-END:variables
}
