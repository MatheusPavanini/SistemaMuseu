/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.view;

import com.fatec.museu.controllers.ControleGerenciarSala;
import com.fatec.museu.model.Sala;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class FormGerenciaSala extends javax.swing.JInternalFrame {
    static private FormGerenciaSala instaciaSala;
    private ControleGerenciarSala controle = new ControleGerenciarSala();
    /**
     * Creates new form FormGerenciaSala
     */
    public FormGerenciaSala() {
        initComponents();
    }
    
    public static FormGerenciaSala getInstance() {
        if(instaciaSala == null) {
            instaciaSala = new FormGerenciaSala();
        }
        return instaciaSala;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new com.fatec.museu.util.GradientButton();
        btnDeletar = new com.fatec.museu.util.GradientButton();
        txtNumeroSala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDados = new javax.swing.JTable();
        btnVoltar = new com.fatec.museu.util.GradientButton();
        txtMaximoVisitantes = new javax.swing.JTextField();
        btnAlterar = new com.fatec.museu.util.GradientButton();

        setPreferredSize(new java.awt.Dimension(706, 550));
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("                      Gerenciar Sala");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 690, 100));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 100, 40));

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, 40));

        txtNumeroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSalaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, 30));

        jLabel2.setText("Numero Maximo De Visitantes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 30));

        jLabel3.setText("Numero Da Sala");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 20));

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
        jScrollPane2.setViewportView(tbDados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 240));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 100, 40));

        txtMaximoVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoVisitantesActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaximoVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, 30));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Sala sala = new Sala();
        
        sala.setMaximoDeVisitantes(Integer.parseInt(txtMaximoVisitantes.getText()));
        sala.setNumeroSala(Integer.parseInt(txtNumeroSala.getText()));

        controle.registrarSala(sala);
        carregarDados();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtNumeroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSalaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtMaximoVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoVisitantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximoVisitantesActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    private void carregarDados() {
        DefaultTableModel model = new DefaultTableModel(controle.carregarLinhas(), controle.carregarColunas());
        tbDados.setModel(model);
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        carregarDados();
        try{
            instaciaSala.setSelected(true);
            //diz que a janela interna é maximizável
            instaciaSala.setMaximizable(false);
            instaciaSala.setResizable(false);
            //set o tamanho máximo dela, que depende da janela pai
                   // TODO add your handling code here:
        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fatec.museu.util.GradientButton btnAlterar;
    private com.fatec.museu.util.GradientButton btnDeletar;
    private com.fatec.museu.util.GradientButton btnRegistrar;
    private com.fatec.museu.util.GradientButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDados;
    private javax.swing.JTextField txtMaximoVisitantes;
    private javax.swing.JTextField txtNumeroSala;
    // End of variables declaration//GEN-END:variables
}
