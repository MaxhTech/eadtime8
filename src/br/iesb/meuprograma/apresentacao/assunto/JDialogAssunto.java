
package br.iesb.meuprograma.apresentacao.assunto;

import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.assunto.Assunto;
import br.iesb.meuprograma.negocio.assunto.AssuntoBO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JDialogAssunto extends javax.swing.JDialog {
    
    private Assunto assunto;
    /**
     * Creates new form JDialogAssunto
     */
    public JDialogAssunto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDialogAssunto(java.awt.Frame parent, boolean modal, Assunto assunto) {
        super(parent, modal);
        initComponents();
        this.setAssunto(assunto);
        this.initializeFields();
    }

    JDialogAssunto(JFrame jFrame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFechar = new javax.swing.JButton();
        jButtonFechar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAssuntoId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAssunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chkIsAtivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Assunto");
        setResizable(false);

        jButtonFechar.setMnemonic('c');
        jButtonFechar.setText("Cancelar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonFechar1.setMnemonic('c');
        jButtonFechar1.setText("Salvar");
        jButtonFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Assunto");

        jLabel2.setText("ID:");

        txtAssuntoId.setEditable(false);
        txtAssuntoId.setToolTipText("ID Autopreenchido");

        jLabel3.setText("Assunto:");

        txtAssunto.setToolTipText("Descrição do assunto");

        jLabel4.setText("Situação:");

        chkIsAtivo.setText("Ativo");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(layout.createSequentialGroup()
                                .add(38, 38, 38)
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtAssuntoId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 404, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel4)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtAssunto)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jButtonFechar)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButtonFechar1))
                                    .add(chkIsAtivo))
                                .add(0, 0, Short.MAX_VALUE)))))
                .add(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtAssuntoId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtAssunto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(chkIsAtivo))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonFechar)
                    .add(jButtonFechar1))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechar1ActionPerformed
        // TODO add your handling code here:
        if (this.assunto == null) {
            this.setAssunto(new Assunto());
        }
        this.assunto.setAssunto(this.txtAssunto.getText());
        this.assunto.setIsAtivo(this.chkIsAtivo.isSelected());
        try {
            AssuntoBO assuntoBO = new AssuntoBO();
            assuntoBO.validar(assunto);
            assuntoBO.salvar(assunto);
            JOptionPane.showMessageDialog(this, "Assunto salvo com sucesso!");
            dispose();
        } catch(NegocioException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonFechar1ActionPerformed

    private void initializeFields() {
        this.txtAssuntoId.setText(this.assunto.getAssuntoId().toString());
        this.txtAssunto.setText(this.assunto.getAssunto());
        this.chkIsAtivo.setSelected(this.assunto.isAtivo());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkIsAtivo;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFechar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtAssuntoId;
    // End of variables declaration//GEN-END:variables

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

}
