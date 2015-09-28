/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;



/**
 *
 * @author Peter
 */
public class FichaCadastroProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FichaCadastroProfessor
     */
    public FichaCadastroProfessor() {
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

        jLabelSexoProfessor = new javax.swing.JLabel();
        BairroProfessor = new javax.swing.JTextField();
        jButtonSalvarProfessor = new javax.swing.JButton();
        jButtonCancelarProfessor = new javax.swing.JButton();
        jLabelNomeProfessor = new javax.swing.JLabel();
        CelProfessor = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter celular = new javax.swing.text.MaskFormatter("(##)####-####");

            CelProfessor = new javax.swing.JFormattedTextField(celular);
        }catch(Exception e){
        }
        jLabelEnderecoProfessor = new javax.swing.JLabel();
        NomeProfessor = new javax.swing.JTextField();
        TelProfessor = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter tel = new javax.swing.text.MaskFormatter("(##)####-####");

            TelProfessor = new javax.swing.JFormattedTextField(tel);
        }catch(Exception e){
        }
        jLabelCidadeProfessor = new javax.swing.JLabel();
        SexoProfessor = new javax.swing.JTextField();
        jLabelCPFProfessor = new javax.swing.JLabel();
        jLabelBairroProfessor = new javax.swing.JLabel();
        EndProfessor = new javax.swing.JTextField();
        jLabelCadastroProfessor = new javax.swing.JLabel();
        jLabelTelefoneProfessor = new javax.swing.JLabel();
        jLabelCelularProfessor = new javax.swing.JLabel();
        CidadeProfessor = new javax.swing.JTextField();
        jLabelTurnoProfessor = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        CpfProfessor = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");

            CpfProfessor = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelSexoProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSexoProfessor.setText("Sexo:");

        BairroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroProfessorActionPerformed(evt);
            }
        });

        jButtonSalvarProfessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonSalvarProfessor.setText("Salvar");
        jButtonSalvarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarProfessorActionPerformed(evt);
            }
        });

        jButtonCancelarProfessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonCancelarProfessor.setText("Cancelar");
        jButtonCancelarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarProfessorActionPerformed(evt);
            }
        });

        jLabelNomeProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeProfessor.setText("Nome: ");

        CelProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelProfessorActionPerformed(evt);
            }
        });

        jLabelEnderecoProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEnderecoProfessor.setText("Endereço:");

        NomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeProfessorActionPerformed(evt);
            }
        });

        jLabelCidadeProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidadeProfessor.setText("Cidade: ");

        SexoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoProfessorActionPerformed(evt);
            }
        });

        jLabelCPFProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCPFProfessor.setText("CPF:");

        jLabelBairroProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBairroProfessor.setText("Bairro:");

        EndProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndProfessorActionPerformed(evt);
            }
        });

        jLabelCadastroProfessor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelCadastroProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroProfessor.setText("Cadastro de Professor");

        jLabelTelefoneProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefoneProfessor.setText("Telefone:");

        jLabelCelularProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelularProfessor.setText("Celular:");

        CidadeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeProfessorActionPerformed(evt);
            }
        });

        jLabelTurnoProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTurnoProfessor.setText("Turno:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manha", "Tarde", "Noite" }));

        CpfProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfProfessorActionPerformed(evt);
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
                            .addComponent(jLabelTurnoProfessor)
                            .addComponent(jLabelEnderecoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidadeProfessor)
                            .addComponent(jLabelSexoProfessor)
                            .addComponent(jLabelTelefoneProfessor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EndProfessor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(CidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelBairroProfessor)))
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonSalvarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButtonCancelarProfessor)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCelularProfessor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(BairroProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SexoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(NomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelCPFProfessor)
                                .addGap(49, 49, 49)
                                .addComponent(CpfProfessor)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPFProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexoProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidadeProfessor)
                    .addComponent(jLabelBairroProfessor)
                    .addComponent(BairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEnderecoProfessor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCelularProfessor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefoneProfessor)
                            .addComponent(TelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTurnoProfessor)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarProfessor)
                    .addComponent(jButtonCancelarProfessor))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(566, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BairroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroProfessorActionPerformed

    private void jButtonSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarProfessorActionPerformed

    private void CelProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelProfessorActionPerformed

    private void NomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeProfessorActionPerformed

    private void SexoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoProfessorActionPerformed

    private void EndProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndProfessorActionPerformed

    private void CidadeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeProfessorActionPerformed

    private void jButtonCancelarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarProfessorActionPerformed
        FichaCadastroProfessor.this.dispose();
    }//GEN-LAST:event_jButtonCancelarProfessorActionPerformed

    private void CpfProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfProfessorActionPerformed
      
    }//GEN-LAST:event_CpfProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(FichaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaCadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroProfessor;
    private javax.swing.JFormattedTextField CelProfessor;
    private javax.swing.JTextField CidadeProfessor;
    private javax.swing.JFormattedTextField CpfProfessor;
    private javax.swing.JTextField EndProfessor;
    private javax.swing.JTextField NomeProfessor;
    private javax.swing.JTextField SexoProfessor;
    private javax.swing.JFormattedTextField TelProfessor;
    private javax.swing.JButton jButtonCancelarProfessor;
    private javax.swing.JButton jButtonSalvarProfessor;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabelBairroProfessor;
    private javax.swing.JLabel jLabelCPFProfessor;
    private javax.swing.JLabel jLabelCadastroProfessor;
    private javax.swing.JLabel jLabelCelularProfessor;
    private javax.swing.JLabel jLabelCidadeProfessor;
    private javax.swing.JLabel jLabelEnderecoProfessor;
    private javax.swing.JLabel jLabelNomeProfessor;
    private javax.swing.JLabel jLabelSexoProfessor;
    private javax.swing.JLabel jLabelTelefoneProfessor;
    private javax.swing.JLabel jLabelTurnoProfessor;
    // End of variables declaration//GEN-END:variables
}
