/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.fatec.museu.view;

import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Panda
 */
public class FormMenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form FormMenuPrincipal
     */
    public FormMenuPrincipal() {
        initComponents();
    }
    
    /*
          private JInternalFrame abrirFrame(JInternalFrame frame) throws PropertyVetoException{
            deskPane1.add(frame);
            frame.setVisible(true);
            frame.setBorder(null);
            ((BasicInternalFrameUI)frame.getUI()).setNorthPane(null);
            frame.setMaximum(true);
            return frame;
        }
    /*
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuObra = new javax.swing.JMenu();
        menuAcervo = new javax.swing.JMenu();
        menuExposicao = new javax.swing.JMenu();
        menuRestauracao = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout deskPane1Layout = new javax.swing.GroupLayout(deskPane1);
        deskPane1.setLayout(deskPane1Layout);
        deskPane1Layout.setHorizontalGroup(
            deskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        deskPane1Layout.setVerticalGroup(
            deskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        menuObra.setText("Obra");
        menuObra.setActionCommand("");
        menuObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuObraMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuObra);

        menuAcervo.setText("Acervo");
        menuAcervo.setActionCommand("");
        menuAcervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAcervoMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuAcervo);

        menuExposicao.setText("Exposição");
        menuExposicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExposicaoMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuExposicao);

        menuRestauracao.setText("Restauração");
        menuRestauracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRestauracaoMouseClicked(evt);
            }
        });
        menuRestauracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestauracaoActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuRestauracao);

        menuSair.setText("Sair");
        jMenuBar2.add(menuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened
    
    private void menuRestauracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRestauracaoMouseClicked
       FormGerenciaRestauracao formulario = FormGerenciaRestauracao.getInstance();
        for(JInternalFrame f : deskPane1.getAllFrames()) {
            if(f.equals(formulario)) {
                formulario.setVisible(true);
                return;
            }
        }
        deskPane1.add(formulario);
        formulario.setVisible(true);
            // TODO add your handling code here:
    }//GEN-LAST:event_menuRestauracaoMouseClicked
    
    private void menuRestauracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestauracaoActionPerformed

     
        //abrirFrame(formulario);
    }//GEN-LAST:event_menuRestauracaoActionPerformed

    private void menuObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuObraMouseClicked
        FormGerenciaObra formulario = FormGerenciaObra.getInstance();
        for(JInternalFrame f : deskPane1.getAllFrames()) {
            if(f.equals(formulario)) {
                formulario.setVisible(true);
                return;
            }
        }
        deskPane1.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_menuObraMouseClicked

    private void menuAcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAcervoMouseClicked
        
        FormGerenciaAcervo formulario = FormGerenciaAcervo.getInstance();
        for(JInternalFrame f : deskPane1.getAllFrames()) {
            if(f.equals(formulario)) {
                formulario.setVisible(true);
                return;
            }
        }
        deskPane1.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_menuAcervoMouseClicked

    private void menuExposicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExposicaoMouseClicked
        FormGerenciaExposicao formulario = FormGerenciaExposicao.getInstance();
        for(JInternalFrame f : deskPane1.getAllFrames()) {
            if(f.equals(formulario)) {
                formulario.setVisible(true);
                return;
            }
        }
        deskPane1.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_menuExposicaoMouseClicked

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
java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new FormMenuPrincipal().setVisible(true);

}
});
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskPane1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuAcervo;
    private javax.swing.JMenu menuExposicao;
    private javax.swing.JMenu menuObra;
    private javax.swing.JMenu menuRestauracao;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
