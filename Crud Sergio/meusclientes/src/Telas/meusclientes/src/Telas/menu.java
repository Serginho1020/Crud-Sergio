/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
/**
 *
 * @author Administrador
 */
public class menu extends javax.swing.JFrame {
/**
 * Creates new form menu
 */
public menu() {
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
jButton1 = new javax.swing.JButton();
jLabel2 = new javax.swing.JLabel();
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
jMenuItem1 = new javax.swing.JMenuItem();
jMenuItem2 = new javax.swing.JMenuItem();
jSeparator1 = new javax.swing.JPopupMenu.Separator();
jSair = new javax.swing.JMenuItem();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
jButton1.setText("Sair");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
"/Telas/ETE_IMAGEM_gif.gif"))); // NOI18N
jMenu1.setText("Clientes ETE");
jMenu1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenu1ActionPerformed(evt);
}
});
jMenuItem1.setText("Novo Cliente");
jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem1ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem1);
jMenuItem2.setText("Atualizar cliente");
jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem2ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem2);
jMenu1.add(jSeparator1);
jSair.setText("Sair");
jSair.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jSairActionPerformed(evt);
}
});
jMenu1.add(jSair);
jMenuBar1.add(jMenu1);
setJMenuBar(jMenuBar1);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.
swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addGap(33, 33, 33)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
javax.swing.GroupLayout.PREFERRED_SIZE)))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.
GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.
MAX_VALUE)
.addComponent(jButton1)
.addContainerGap())
);
pack();
}// </editor-fold>//GEN-END:initComponents
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
CadCliente CadCli = new CadCliente();
CadCli.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed
private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
//CadCliente CadCli = new CadCliente();
//CadCli.setVisible(true);
}//GEN-LAST:event_jMenu1ActionPerformed
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
AtuCliente atucliente = new AtuCliente();
atucliente.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton1ActionPerformed
dispose(); // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed
private void jSairActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jSairActionPerformed
// TODO add your handling code here:
dispose();
}//GEN-LAST:event_jSairActionPerformed
/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
/*
 * Set the Nimbus look and feel
 */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
/*
 * If Nimbus (introduced in Java SE 6) is not available, stay with the
 * default look and feel. For details see
 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
.SEVERE, null, ex);
}
//</editor-fold>
/*
 * Create and display the form
 */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new menu().setVisible(true);
}
});
}
// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel2;
private javax.swing.JMenu jMenu1;
private javax.swing.JMenuBar jMenuBar1;
private javax.swing.JMenuItem jMenuItem1;
private javax.swing.JMenuItem jMenuItem2;
private javax.swing.JMenuItem jSair;
private javax.swing.JPopupMenu.Separator jSeparator1;
// End of variables declaration//GEN-END:variables
}
