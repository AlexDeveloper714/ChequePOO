
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("CONVERSION INFIJO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoCheque = new javax.swing.JTextField();
        CreaChequeBtn = new javax.swing.JButton();
        OperacionesTxt1 = new javax.swing.JTextArea();
        ChequeTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoCheque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoCheque.setAutoscrolls(false);

        CreaChequeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CreaChequeBtn.setText("Crear Cheque");
        CreaChequeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaChequeBtnActionPerformed(evt);
            }
        });

        OperacionesTxt1.setEditable(false);
        OperacionesTxt1.setBackground(new java.awt.Color(214, 217, 223));
        OperacionesTxt1.setColumns(20);
        OperacionesTxt1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        OperacionesTxt1.setRows(5);
        OperacionesTxt1.setText("Digite los dolares (de 1 a 999999999) \ncon los centavos (separado por una coma\ny de 1 a 99) para crear tu cheque.");
        OperacionesTxt1.setAutoscrolls(false);
        OperacionesTxt1.setBorder(null);
        OperacionesTxt1.setFocusable(false);
        OperacionesTxt1.setRequestFocusEnabled(false);
        OperacionesTxt1.setVerifyInputWhenFocusTarget(false);

        ChequeTxt.setEditable(false);
        ChequeTxt.setBackground(new java.awt.Color(214, 217, 223));
        ChequeTxt.setColumns(20);
        ChequeTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ChequeTxt.setRows(5);
        ChequeTxt.setAutoscrolls(false);
        ChequeTxt.setBorder(null);
        ChequeTxt.setFocusable(false);
        ChequeTxt.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreaChequeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OperacionesTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(ChequeTxt))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OperacionesTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreaChequeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChequeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    CrearCheque cambiar = new CrearCheque();


    private void CreaChequeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaChequeBtnActionPerformed
        String[] numero = TextoCheque.getText().trim().split(",");
        if (numero.length != 2) {
            ChequeTxt.setText("Digite números validos \n"
                    + "(recuerda que es de 1 a 999999999\n"
                    + "para dolares y para centavos de \n"
                    + "1 a 99),ademas debes digitar \n"
                    + "solo 1 coma!!!!");
        } else if (numero[0].length() < 10 && numero[1].length() < 3) {
            int dolares = Integer.parseInt(numero[0]), centavos = Integer.parseInt(numero[1]),
                    centenas = 0, millares = 0, millones = 0;
            String letraDolar = "", letraCenta = "";
            if (dolares > 0 || centavos > 0) {
                centenas = dolares % 1000;
                millares = (dolares % 1000000) / 1000;
                millones = (dolares % 1000000000) / 1000000;
                letraDolar = cambiar.generarLetraExp(centenas, millares, millones);
                centenas = centavos % 1000;
                millares = (centavos % 1000000) / 1000;
                millones = (centavos % 1000000000) / 1000000;
                letraCenta = cambiar.generarLetraExp(centenas, millares, millones);
                if (dolares == 0) {
                    ChequeTxt.setText("cero dolares con\n" + letraCenta
                            + " centavos");
                } else if (centavos == 0) {
                    ChequeTxt.setText(letraDolar
                            + "\ndolares con cero centavos");
                } else {
                    ChequeTxt.setText(letraDolar
                            + "\ndolares con\n" + letraCenta
                            + " centavos");
                }
            } else {
                ChequeTxt.setText("Digite números validos \n"
                        + "(recuerda que es de 1 a 999999999\n"
                        + "para dolares y para centavos de \n"
                        + "1 a 99),ademas debes digitar \n"
                        + "solo 1 coma!!!!");
            }
        } else {
            ChequeTxt.setText("Digite números validos \n"
                    + "(recuerda que es de 1 a 999999999\n"
                    + "para dolares y para centavos de \n"
                    + "1 a 99),ademas debes digitar \n"
                    + "solo 1 coma!!!!");
        }


    }//GEN-LAST:event_CreaChequeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ChequeTxt;
    private javax.swing.JButton CreaChequeBtn;
    private javax.swing.JTextArea OperacionesTxt1;
    private javax.swing.JTextField TextoCheque;
    // End of variables declaration//GEN-END:variables
}
