/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modeloConnection.ConexaoBD;
import modeloDao.DaoAluno;
import modeloBeans.BeansAluno;

/**
 *
 * @author Peter
 */
public class FichaCadastroAluno extends javax.swing.JFrame {
    BeansAluno modaluno = new BeansAluno();
    ConexaoBD conex = new ConexaoBD();
    DaoAluno controlaluno = new DaoAluno();
    int flag = 0;
    /**
     * Creates new form FichaCadastroAluno
     */
    public FichaCadastroAluno() {
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

        CelAluno = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter celular = new javax.swing.text.MaskFormatter("(##)####-####");

            CelAluno = new javax.swing.JFormattedTextField(celular);
        }catch(Exception e){
        }
        jLabelCadastroAluno = new javax.swing.JLabel();
        jLabelNomeAluno = new javax.swing.JLabel();
        jLabelEnderecoAluno = new javax.swing.JLabel();
        jLabelCidadeAluno = new javax.swing.JLabel();
        jLabelCPFAluno = new javax.swing.JLabel();
        jLabelBairroAluno = new javax.swing.JLabel();
        jLabelTelefoneAluno = new javax.swing.JLabel();
        jLabelCelularAluno = new javax.swing.JLabel();
        jLabelTurnoAluno = new javax.swing.JLabel();
        jLabelSexoAluno = new javax.swing.JLabel();
        jButtonSalvarAluno = new javax.swing.JButton();
        jButtonCancelarAluno = new javax.swing.JButton();
        CpfAluno = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");

            CpfAluno = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){
        }
        NomeAluno = new javax.swing.JTextField();
        SexoAluno = new javax.swing.JTextField();
        EndAluno = new javax.swing.JTextField();
        CidAluno = new javax.swing.JTextField();
        BairroAluno = new javax.swing.JTextField();
        TelAluno = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)####-####");

            TelAluno = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        turno = new javax.swing.JComboBox();
        CELAluno = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter celular = new javax.swing.text.MaskFormatter("(##)####-####");

            CELAluno = new javax.swing.JFormattedTextField(celular);
        }catch(Exception e){
        }
        DatMatricula = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            DatMatricula = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        jLabel1 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaaluno = new javax.swing.JTable();
        jTextFieldpesquisaaluno = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldIDaluno = new javax.swing.JTextField();
        jLabelIDaluno = new javax.swing.JLabel();

        CelAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelAlunoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelCadastroAluno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelCadastroAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroAluno.setText("Cadastro de Aluno");
        jLabelCadastroAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelNomeAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeAluno.setText("Nome: ");

        jLabelEnderecoAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelEnderecoAluno.setText("Endereço:");

        jLabelCidadeAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCidadeAluno.setText("Cidade: ");

        jLabelCPFAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCPFAluno.setText("CPF:");

        jLabelBairroAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelBairroAluno.setText("Bairro:");

        jLabelTelefoneAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTelefoneAluno.setText("Telefone:");

        jLabelCelularAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCelularAluno.setText("Celular:");

        jLabelTurnoAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTurnoAluno.setText("Turno:");

        jLabelSexoAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSexoAluno.setText("Sexo:");

        jButtonSalvarAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonSalvarAluno.setText("Salvar");
        jButtonSalvarAluno.setEnabled(false);
        jButtonSalvarAluno.setPreferredSize(new java.awt.Dimension(83, 23));
        jButtonSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlunoActionPerformed(evt);
            }
        });

        jButtonCancelarAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonCancelarAluno.setText("Cancelar");
        jButtonCancelarAluno.setEnabled(false);
        jButtonCancelarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAlunoActionPerformed(evt);
            }
        });

        CpfAluno.setEnabled(false);
        CpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfAlunoActionPerformed(evt);
            }
        });

        NomeAluno.setEnabled(false);
        NomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAlunoActionPerformed(evt);
            }
        });

        SexoAluno.setEnabled(false);
        SexoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoAlunoActionPerformed(evt);
            }
        });

        EndAluno.setEnabled(false);
        EndAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndAlunoActionPerformed(evt);
            }
        });

        CidAluno.setEnabled(false);
        CidAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidAlunoActionPerformed(evt);
            }
        });

        BairroAluno.setEnabled(false);
        BairroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroAlunoActionPerformed(evt);
            }
        });

        TelAluno.setEnabled(false);

        turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manhã", "Tarde", "Noite" }));
        turno.setEnabled(false);

        CELAluno.setEnabled(false);

        DatMatricula.setEnabled(false);
        DatMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatMatriculaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Data Matricula:");

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setMaximumSize(new java.awt.Dimension(67, 23));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(83, 23));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableTabelaaluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableTabelaaluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTabelaaluno);

        jTextFieldpesquisaaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpesquisaalunoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTextFieldIDaluno.setEnabled(false);
        jTextFieldIDaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDalunoActionPerformed(evt);
            }
        });

        jLabelIDaluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelIDaluno.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jButtonSalvarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCPFAluno)
                                                .addComponent(jLabelSexoAluno))
                                            .addComponent(jLabelCidadeAluno, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NomeAluno)
                                            .addComponent(SexoAluno)
                                            .addComponent(CpfAluno)
                                            .addComponent(CidAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabelIDaluno))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DatMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldIDaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBairroAluno)
                                    .addComponent(jLabelTelefoneAluno)
                                    .addComponent(jLabelCelularAluno)
                                    .addComponent(jLabelTurnoAluno))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CELAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EndAluno)
                                        .addComponent(BairroAluno)
                                        .addComponent(TelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldpesquisaaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabelCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDaluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(DatMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPFAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SexoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSexoAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CidAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidadeAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEnderecoAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBairroAluno)
                            .addComponent(BairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefoneAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CELAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCelularAluno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTurnoAluno)
                            .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButtonCancelarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldpesquisaaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        setSize(new java.awt.Dimension(891, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfAlunoActionPerformed

    }//GEN-LAST:event_CpfAlunoActionPerformed

    private void NomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAlunoActionPerformed

    private void SexoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoAlunoActionPerformed

    private void EndAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndAlunoActionPerformed

    private void CidAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidAlunoActionPerformed

    private void CelAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelAlunoActionPerformed

    private void jButtonSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlunoActionPerformed
        if(flag == 1){
        modaluno.setNome(NomeAluno.getText());
        modaluno.setData_Matricula(DatMatricula.getText());
        modaluno.setCPF(CpfAluno.getText());
        modaluno.setSexo(SexoAluno.getText());
        modaluno.setCidade(CidAluno.getText());
        modaluno.setBairro(BairroAluno.getText());
        modaluno.setEndereco(EndAluno.getText());
        modaluno.setTelefone(TelAluno.getText());
        modaluno.setCelular(CELAluno.getText());
        modaluno.setTurno((String)turno.getSelectedItem());
        controlaluno.salvar(modaluno);
        DatMatricula.setEnabled(!true);
        NomeAluno.setEnabled(!true);
        CpfAluno.setEnabled(!true);
        SexoAluno.setEnabled(!true);
        CidAluno.setEnabled(!true);
        EndAluno.setEnabled(!true);
        BairroAluno.setEnabled(!true);
        TelAluno.setEnabled(!true);
        CELAluno.setEnabled(!true);
        turno.setEnabled(!true);
        jButtonSalvarAluno.setEnabled(!true);
        jButtonCancelarAluno.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        DatMatricula.setText("");
        NomeAluno.setText("");
        CpfAluno.setText("");
        SexoAluno.setText("");
        CidAluno.setText("");
        EndAluno.setText("");
        BairroAluno.setText("");
        TelAluno.setText("");
        CELAluno.setText("");
        }else{
            modaluno.setCodigo(Integer.parseInt(jTextFieldIDaluno.getText()));
            modaluno.setNome(NomeAluno.getText());
            modaluno.setCPF(CpfAluno.getText());
            modaluno.setSexo(SexoAluno.getText());
            modaluno.setCidade(CidAluno.getText());
            modaluno.setEndereco(EndAluno.getText());
            modaluno.setBairro(BairroAluno.getText());
            modaluno.setTelefone(TelAluno.getText());
            modaluno.setCelular(CELAluno.getText());
            modaluno.setTurno((String)turno.getSelectedItem());
            controlaluno.EditarAluno(modaluno);
            jButtonSalvarAluno.setEnabled(false);
            jButtonCancelarAluno.setEnabled(false);
            jButtonNovo.setEnabled(true);
            DatMatricula.setEnabled(!true);
            NomeAluno.setEnabled(!true);
            CpfAluno.setEnabled(!true);
            SexoAluno.setEnabled(!true);
            CidAluno.setEnabled(!true);
            EndAluno.setEnabled(!true);
            BairroAluno.setEnabled(!true);
            TelAluno.setEnabled(!true);
            CELAluno.setEnabled(!true);
            turno.setEnabled(!true);
            jTextFieldpesquisaaluno.setText("");
            DatMatricula.setText("");
            NomeAluno.setText("");
            CpfAluno.setText("");
            SexoAluno.setText("");
            CidAluno.setText("");
            EndAluno.setText("");
            BairroAluno.setText("");
            TelAluno.setText("");
            CELAluno.setText("");
        }
        
    }//GEN-LAST:event_jButtonSalvarAlunoActionPerformed

    private void jButtonCancelarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAlunoActionPerformed
        DatMatricula.setEnabled(!true);
        NomeAluno.setEnabled(!true);
        CpfAluno.setEnabled(!true);
        SexoAluno.setEnabled(!true);
        CidAluno.setEnabled(!true);
        EndAluno.setEnabled(!true);
        BairroAluno.setEnabled(!true);
        TelAluno.setEnabled(!true);
        CELAluno.setEnabled(!true);
        turno.setEnabled(!true);
        jButtonSalvarAluno.setEnabled(!true);
        jButtonCancelarAluno.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(!true);
        DatMatricula.setText("");
        NomeAluno.setText("");
        CpfAluno.setText("");
        SexoAluno.setText("");
        CidAluno.setText("");
        EndAluno.setText("");
        BairroAluno.setText("");
        TelAluno.setText("");
        CELAluno.setText("");
        
    }//GEN-LAST:event_jButtonCancelarAlunoActionPerformed

    private void DatMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatMatriculaActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        DatMatricula.setEnabled(true);
        NomeAluno.setEnabled(true);
        CpfAluno.setEnabled(true);
        SexoAluno.setEnabled(true);
        CidAluno.setEnabled(true);
        EndAluno.setEnabled(true);
        BairroAluno.setEnabled(true);
        TelAluno.setEnabled(true);
        CELAluno.setEnabled(true);
        turno.setEnabled(true);
        jButtonSalvarAluno.setEnabled(true);
        jButtonCancelarAluno.setEnabled(true);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        modaluno.setPesquisa(jTextFieldpesquisaaluno.getText());
        BeansAluno modeloAluno = controlaluno.buscaAluno(modaluno);
        jTextFieldIDaluno.setText(String.valueOf(modaluno.getCodigo()));
        DatMatricula.setText(modeloAluno.getData_Matricula());
        NomeAluno.setText(modeloAluno.getNome());
        CpfAluno.setText(modeloAluno.getCPF());
        SexoAluno.setText(modeloAluno.getSexo());
        CidAluno.setText(modeloAluno.getCidade());
        EndAluno.setText(modeloAluno.getEndereco());
        BairroAluno.setText(modeloAluno.getBairro());
        BairroAluno.setText(modeloAluno.getTelefone());
        CELAluno.setText(modeloAluno.getCelular());
        turno.setSelectedItem(modeloAluno.getTurno());
        jTableTabelaaluno.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonSalvarAluno.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldpesquisaalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpesquisaalunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpesquisaalunoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        DatMatricula.setEnabled(true);
        NomeAluno.setEnabled(true);
        CpfAluno.setEnabled(true);
        SexoAluno.setEnabled(true);
        CidAluno.setEnabled(true);
        EndAluno.setEnabled(true);
        BairroAluno.setEnabled(true);
        TelAluno.setEnabled(true);
        CELAluno.setEnabled(true);
        turno.setEnabled(true);
        jButtonSalvarAluno.setEnabled(true);
        jButtonCancelarAluno.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja Realmente Efetuar Exclusão? ");
        if(resposta==JOptionPane.YES_OPTION){
            modaluno.setCodigo(Integer.parseInt(jTextFieldIDaluno.getText()));
            controlaluno.ExcluirAluno(modaluno);
            jTextFieldpesquisaaluno.setText("");
            jTextFieldIDaluno.setText("");
            DatMatricula.setText("");
            NomeAluno.setText("");
            CpfAluno.setText("");
            SexoAluno.setText("");
            CidAluno.setText("");
            EndAluno.setText("");
            BairroAluno.setText("");
            TelAluno.setText("");
            CELAluno.setText("");
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonNovo.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldIDalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDalunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDalunoActionPerformed

    private void BairroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FichaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroAluno;
    private javax.swing.JTextField CELAluno;
    private javax.swing.JFormattedTextField CelAluno;
    private javax.swing.JTextField CidAluno;
    private javax.swing.JTextField CpfAluno;
    private javax.swing.JTextField DatMatricula;
    private javax.swing.JTextField EndAluno;
    private javax.swing.JTextField NomeAluno;
    private javax.swing.JTextField SexoAluno;
    private javax.swing.JFormattedTextField TelAluno;
    private javax.swing.JButton jButtonCancelarAluno;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairroAluno;
    private javax.swing.JLabel jLabelCPFAluno;
    private javax.swing.JLabel jLabelCadastroAluno;
    private javax.swing.JLabel jLabelCelularAluno;
    private javax.swing.JLabel jLabelCidadeAluno;
    private javax.swing.JLabel jLabelEnderecoAluno;
    private javax.swing.JLabel jLabelIDaluno;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JLabel jLabelSexoAluno;
    private javax.swing.JLabel jLabelTelefoneAluno;
    private javax.swing.JLabel jLabelTurnoAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaaluno;
    private javax.swing.JTextField jTextFieldIDaluno;
    private javax.swing.JTextField jTextFieldpesquisaaluno;
    private javax.swing.JComboBox turno;
    // End of variables declaration//GEN-END:variables

    private void jTableTabelaaluno(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
