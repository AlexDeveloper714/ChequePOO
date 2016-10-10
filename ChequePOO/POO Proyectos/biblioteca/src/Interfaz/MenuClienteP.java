package Interfaz;

import codigo.*;
import javax.swing.*;

public class MenuClienteP extends javax.swing.JFrame {

    public MenuClienteP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU CLIENTE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCrearCamiseta = new javax.swing.JButton();
        botonEditarDatos = new javax.swing.JButton();
        botonTerminarSeccion = new javax.swing.JButton();
        CarritoBoton = new javax.swing.JButton();
        AvatarTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        botonCrearCamiseta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCrearCamiseta.setText("Crear Camiseta");
        botonCrearCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCamisetaActionPerformed(evt);
            }
        });

        botonEditarDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEditarDatos.setText("Editar datos");
        botonEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarDatosActionPerformed(evt);
            }
        });

        botonTerminarSeccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonTerminarSeccion.setText("Terminar seccion");
        botonTerminarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarSeccionActionPerformed(evt);
            }
        });

        CarritoBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CarritoBoton.setText("Mostrar Carrito");
        CarritoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoBotonActionPerformed(evt);
            }
        });

        AvatarTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCrearCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CarritoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvatarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearCamiseta)
                    .addComponent(botonEditarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarritoBoton)
                    .addComponent(botonTerminarSeccion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonTerminarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarSeccionActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?");
        if (a == JOptionPane.YES_OPTION) {
            camiseta.borrarCarritoUsuario();
            Ingreso pantallaIngreso = new Ingreso();
            pantallaIngreso.setVisible(true);
            dispose();
//            CatalogoCamiseta.CarritoUsuario=0;
        }
    }//GEN-LAST:event_botonTerminarSeccionActionPerformed

    private void botonEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarDatosActionPerformed
        EditarDatosP pantallaCambio = new EditarDatosP();
        pantallaCambio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonEditarDatosActionPerformed

    private void botonCrearCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCamisetaActionPerformed
        if (CatalogoEstampa.indiceEstampa > 0) {
            CompraLibroP p1 = new CompraLibroP();
            p1.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(CarritoBoton, "No hay estampas para adquirir camisetas...");
        }

    }//GEN-LAST:event_botonCrearCamisetaActionPerformed
    CatalogoCamiseta camiseta = new CatalogoCamiseta(0, null, null, null, null, null, 1000, Registro.UsuarioActivo);
    private void CarritoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoBotonActionPerformed
        camiseta.revisarUsuario(Registro.UsuarioActivo);
        if (CatalogoCamiseta.CarritoActual > 0) {
            dispose();
            MostrarLibroP c1 = new MostrarLibroP();
            c1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(CarritoBoton, "No tienes camisetas en tus carritos");
        }
    }//GEN-LAST:event_CarritoBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvatarTxt;
    private javax.swing.JButton CargarAvBtn;
    private javax.swing.JButton CarritoBoton;
    private javax.swing.JButton botonCrearCamiseta;
    private javax.swing.JButton botonEditarDatos;
    private javax.swing.JButton botonTerminarSeccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
