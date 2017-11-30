/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.fatec.museu.view;

import com.fatec.museu.controllers.ControleGerenciarInstituicao;
import com.fatec.museu.model.Instituicao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Panda
 */
public class FormGerenciaInstituicao extends javax.swing.JInternalFrame {
    private ControleGerenciarInstituicao controle = new ControleGerenciarInstituicao();
    static private FormGerenciaInstituicao instanciaInstituicao;
    private Instituicao inst = new Instituicao();
    
    /**
     * Creates new form FormGerenciaInstituicao
     */
    public FormGerenciaInstituicao() {
        initComponents();
    }
    
    public static FormGerenciaInstituicao getInstance() {
        if(instanciaInstituicao == null) {
            instanciaInstituicao = new FormGerenciaInstituicao();
        }
        return instanciaInstituicao;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new com.fatec.museu.util.GradientButton();

        btnCadastrar = new com.fatec.museu.util.GradientButton();
        btnVoltar = new com.fatec.museu.util.GradientButton();

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDados = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnRemover = new com.fatec.museu.util.GradientButton();
        gradientButton7 = new com.fatec.museu.util.GradientButton();
        gradientButton8 = new com.fatec.museu.util.GradientButton();

        setPreferredSize(new java.awt.Dimension(800, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterar.setText("Alterar");


        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });

        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 110, 40));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 110, 40));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 40));

        tbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 760, 270));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 30));

        jLabel8.setText("Endereco");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 30));

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 70, 30));

        jLabel3.setText("Nome da Instituição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gerenciar Instituição");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 360, 80));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 220, 30));

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        gradientButton7.setText("Remover");
        gradientButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        gradientButton8.setText("Remover");
        gradientButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed
    

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Instituicao inst = new Instituicao();
        
        inst.setEndereco(txtEndereco.getText());
        inst.setNome(txtNome.getText());
        inst.setTelefone(txtTelefone.getText());
        
        controle.registrarInstituicao(inst);
        
        carregarDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed
    
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    private void gradientButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton7ActionPerformed
    
    private void gradientButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton8ActionPerformed
    
    private void carregarDados() {
        DefaultTableModel tableModel = new DefaultTableModel(controle.carregaLinhas(), controle.carregaColunas()){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        tbDados.setModel(tableModel);
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        carregarDados();
        try{
            instanciaInstituicao.setSelected(true);
            //diz que a janela interna é maximizável
            instanciaInstituicao.setMaximizable(false);
            instanciaInstituicao.setResizable(false);
            //set o tamanho máximo dela, que depende da janela pai
            // TODO add your handling code here:
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_formInternalFrameOpened


    private void tbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDadosMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbDados.getModel();
        int selectedRowIndex = tbDados.getSelectedRow();

        btnCadastrar.setEnabled(false);

        
        inst.setIdInstituicao(Long.parseLong(model.getValueAt(selectedRowIndex, 0).toString()));

        txtNome.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtEndereco.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtTelefone.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_tbDadosMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        inst.setEndereco(txtEndereco.getText());
        inst.setNome(txtNome.getText());
        inst.setTelefone(txtTelefone.getText());
        
        controle.atualizarInstituicao(inst);
        
    }//GEN-LAST:event_btnAlterarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fatec.museu.util.GradientButton btnAlterar;

    private com.fatec.museu.util.GradientButton btnCadastrar;
    private com.fatec.museu.util.GradientButton btnRemover;
    private com.fatec.museu.util.GradientButton btnVoltar;

    private com.fatec.museu.util.GradientButton gradientButton7;
    private com.fatec.museu.util.GradientButton gradientButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDados;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
