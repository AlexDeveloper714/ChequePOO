package Interfaz;

import codigo.*;
import javax.swing.*;

public class CambiarCategoriaBP extends javax.swing.JFrame {

    CatalogoEstampa c1 = new CatalogoEstampa(Registro.UsuarioActivo, null, null, 0, null);

    public CambiarCategoriaBP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        for (int i = 0; i < CatalogoEstampa.inidiceCategoria; i++) {
            CategoriaComboBox.addItem(c1.RecojerCategoria(i));
        }
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMINISTRAR ESTAMPAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EstampaAntTxt = new javax.swing.JTextField();
        EstampaTxt = new javax.swing.JTextField();
        CambiarBoton = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CategoriaComboBox = new javax.swing.JComboBox();
        AgregarBtn = new javax.swing.JButton();
        OcultarBtn = new javax.swing.JButton();
        RestaurarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        CambiarBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CambiarBoton.setText("CAMBIAR");
        CambiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarBotonActionPerformed(evt);
            }
        });

        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBoton.setText("VOLVER");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ESTAMPA ANTERIOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NUEVO NOMBRE ESTAMPA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CATEGORIA A CAMBIAR");

        AgregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgregarBtn.setText("AGREGAR");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        OcultarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OcultarBtn.setText("OCULTAR");
        OcultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultarBtnActionPerformed(evt);
            }
        });

        RestaurarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RestaurarBtn.setText("RESTAURAR");
        RestaurarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EstampaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(EstampaAntTxt)
                            .addComponent(CategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CambiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OcultarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RestaurarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(EstampaAntTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(EstampaTxt)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CambiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OcultarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestaurarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CategoriaComboBox, EstampaAntTxt, EstampaTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed

    }//GEN-LAST:event_VolverBotonActionPerformed

    private void CambiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBotonActionPerformed
        String EstampaAnt = EstampaAntTxt.getText();
        String NuevaEstampa = EstampaTxt.getText();
        String Categoria = CategoriaComboBox.getSelectedItem().toString();
        if (EstampaAnt.equals("") || NuevaEstampa.equals("") || Categoria.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Llena todas las casillas");
        } else {
            int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cambiar los datos de su estampa?");
            if (a == JOptionPane.YES_OPTION) {
                if (c1.cambiarEstampa(Registro.UsuarioActivo, EstampaAnt, NuevaEstampa, Categoria) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Los datos de su estampa fueron cambiados");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Su estampa no existe");
                }

            }
        }
    }//GEN-LAST:event_CambiarBotonActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void OcultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OcultarBtnActionPerformed

    private void RestaurarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestaurarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JButton CambiarBoton;
    private javax.swing.JComboBox CategoriaComboBox;
    private javax.swing.JTextField EstampaAntTxt;
    private javax.swing.JTextField EstampaTxt;
    private javax.swing.JButton OcultarBtn;
    private javax.swing.JButton RestaurarBtn;
    private javax.swing.JButton VolverBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
