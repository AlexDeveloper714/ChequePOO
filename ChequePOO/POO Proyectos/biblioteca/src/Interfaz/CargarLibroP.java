package Interfaz;

import codigo.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class CargarLibroP extends javax.swing.JFrame {

    CatalogoEstampa c1 = new CatalogoEstampa(Registro.UsuarioActivo, null, null, 0, null);
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("imagenes (.JPG,.PNG,.GIF,.JPEG)", "jpg", "png", "gif", "jpeg");

    public CargarLibroP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CARGA ESTAMPAS");
        for (int i = 0; i < CatalogoEstampa.inidiceCategoria; i++) {
            combTipoEstampa.addItem(c1.RecojerCategoria(i));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        txtTipoEstampa = new javax.swing.JLabel();
        combTipoEstampa = new javax.swing.JComboBox();
        txtPrecioEstampa = new javax.swing.JLabel();
        cajonPrecio = new javax.swing.JTextField();
        botonSubirEstampa = new javax.swing.JButton();
        botonSelecionarArchivo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        Carrusel = new javax.swing.JLabel();
        cajonNombreEstampa = new javax.swing.JTextField();
        txtTipoEstampa1 = new javax.swing.JLabel();
        combTipoEstampa1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setText("Nombre Libro");

        txtTipoEstampa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipoEstampa.setText("Categoria");

        combTipoEstampa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPrecioEstampa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecioEstampa.setText("Precio");

        cajonPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonSubirEstampa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSubirEstampa.setText("SUBIR");
        botonSubirEstampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirEstampaActionPerformed(evt);
            }
        });

        botonSelecionarArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSelecionarArchivo.setText("Seleccionar Portada");
        botonSelecionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSelecionarArchivoActionPerformed(evt);
            }
        });

        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        Carrusel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cajonNombreEstampa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtTipoEstampa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipoEstampa1.setText("Idioma");

        combTipoEstampa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combTipoEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajonNombreEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSelecionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoEstampa1)
                            .addComponent(combTipoEstampa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioEstampa)
                            .addComponent(cajonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVolver)
                        .addGap(18, 18, 18)
                        .addComponent(botonSubirEstampa))
                    .addComponent(Carrusel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoEstampa)
                    .addComponent(txtNombre))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajonNombreEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSelecionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTipoEstampa)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTipoEstampa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combTipoEstampa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combTipoEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPrecioEstampa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSubirEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Carrusel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSelecionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSelecionarArchivoActionPerformed
        try {
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.showOpenDialog(null);
            chooser.getSelectedFile().getPath();
            ImageIcon imagen2 = new ImageIcon(chooser.getSelectedFile().getPath());
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(Carrusel.getWidth(), Carrusel.getHeight(), Image.SCALE_DEFAULT));
            Carrusel.setIcon(icono);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_botonSelecionarArchivoActionPerformed

    private void botonSubirEstampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirEstampaActionPerformed
        String nombreEstampa = cajonNombreEstampa.getText();
        String tipoEstampa = (String) combTipoEstampa.getSelectedItem();
        File archivo = chooser.getSelectedFile();
        try {
            int precioEstampa = Integer.parseInt(cajonPrecio.getText());
            if (precioEstampa > 20000 || precioEstampa <= 1000) {
                precioEstampa = -1;
            }
            if (nombreEstampa.equals("") || tipoEstampa.equals("") || precioEstampa == 0) {
                JOptionPane.showMessageDialog(rootPane, "Llene todas las casillas");
            } else {
                if (precioEstampa == -1) {
                    JOptionPane.showMessageDialog(rootPane, "El precio debe mayor o igual a 1000 y menos de 20000");
                    cajonPrecio.setText("");
                } else {
                    if (archivo != null) {
                        int a = JOptionPane.showConfirmDialog(null, "¿Deseas cargar la estampa?");
                        if (a == JOptionPane.YES_OPTION) {
                            c1.alamacenarEstampa(Registro.UsuarioActivo, nombreEstampa, tipoEstampa, precioEstampa, archivo);
                            Carrusel.setIcon(null);
                            cajonNombreEstampa.setText("");
                            cajonPrecio.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Se subio la estampa");
                        }
                    } else {
                        Carrusel.setIcon(null);
                        JOptionPane.showMessageDialog(rootPane, "Vuelva a subir su estampa otra vez o subala si no lo hizo");
                    }
                }
            }
            chooser.setSelectedFile(null);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Digite el precio de la estampa que debe ser");
        }

    }//GEN-LAST:event_botonSubirEstampaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed

    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrusel;
    private javax.swing.JButton botonSelecionarArchivo;
    private javax.swing.JButton botonSubirEstampa;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField cajonNombreEstampa;
    private javax.swing.JTextField cajonPrecio;
    private javax.swing.JComboBox combTipoEstampa;
    private javax.swing.JComboBox combTipoEstampa1;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecioEstampa;
    private javax.swing.JLabel txtTipoEstampa;
    private javax.swing.JLabel txtTipoEstampa1;
    // End of variables declaration//GEN-END:variables
}
