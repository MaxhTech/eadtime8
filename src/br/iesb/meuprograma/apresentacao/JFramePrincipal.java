
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.apresentacao.assunto.JDialogAssunto;
import br.iesb.meuprograma.apresentacao.assunto.JPanelAssunto;
import br.iesb.meuprograma.apresentacao.unidade.JDialogUnidade;
import br.iesb.meuprograma.apresentacao.unidade.JPanelUnidade;
import javax.swing.ViewportLayout;

public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
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

        mainPanel = new javax.swing.JPanel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        sistemaAssuntos = new javax.swing.JMenuItem();
        sistemaUnidades = new javax.swing.JCheckBoxMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cadastroUnidades = new javax.swing.JMenuItem();
        cadastroAssuntos = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Programa");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jMenuSistema.setMnemonic('S');
        jMenuSistema.setText("Sistema");

        sistemaAssuntos.setText("Assunto");
        sistemaAssuntos.setActionCommand("Assuntos");
        sistemaAssuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaAssuntosActionPerformed(evt);
            }
        });
        jMenuSistema.add(sistemaAssuntos);

        sistemaUnidades.setSelected(true);
        sistemaUnidades.setText("Unidade");
        sistemaUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaUnidadesActionPerformed(evt);
            }
        });
        jMenuSistema.add(sistemaUnidades);

        jMenuItemSair.setMnemonic('r');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuSistema);

        jMenuCadastro.setMnemonic('C');
        jMenuCadastro.setText("Cadastro");

        jMenuItem1.setText("Processos...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        cadastroUnidades.setText("Unidades");
        cadastroUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUnidadesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(cadastroUnidades);

        cadastroAssuntos.setText("Assuntos");
        cadastroAssuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAssuntosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(cadastroAssuntos);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuAjuda.setMnemonic('j');
        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setMnemonic('S');
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBarPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JDialogSobre dialog = new JDialogSobre(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cadastroAssuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAssuntosActionPerformed
        JDialogAssunto assuntoDialog = new JDialogAssunto(new javax.swing.JFrame(), true);
        assuntoDialog.setVisible(true);
    }//GEN-LAST:event_cadastroAssuntosActionPerformed

    private void sistemaAssuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaAssuntosActionPerformed
        // TODO add your handling code here:
        JPanelAssunto panelAssunto = new JPanelAssunto();
        panelAssunto.setVisible(true);
        
        this.setNewPanel(panelAssunto);
    }//GEN-LAST:event_sistemaAssuntosActionPerformed

    private void sistemaUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaUnidadesActionPerformed
        // TODO add your handling code here:
        JPanelUnidade panelUnidade = new JPanelUnidade();
        panelUnidade.setVisible(true);
    }//GEN-LAST:event_sistemaUnidadesActionPerformed

    private void cadastroUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUnidadesActionPerformed
        // TODO add your handling code here:
        JDialogUnidade unidadeDialog = new JDialogUnidade(new javax.swing.JFrame(), true);
        unidadeDialog.setVisible(true);
    }//GEN-LAST:event_cadastroUnidadesActionPerformed

    private void setNewPanel(javax.swing.JPanel panel) {
        this.mainPanel.setLayout(new java.awt.BorderLayout());
        this.mainPanel.add(panel);
        this.mainPanel.repaint();
        this.mainPanel.revalidate();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroAssuntos;
    private javax.swing.JMenuItem cadastroUnidades;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem sistemaAssuntos;
    private javax.swing.JCheckBoxMenuItem sistemaUnidades;
    // End of variables declaration//GEN-END:variables
}
