/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Virginity;

import Menu.MENU;
import java.awt.event.KeyEvent;

/**
 *
 * @author TrMTu
 */
public class Virginity3 extends javax.swing.JFrame {

    /** Creates new form Virginity3 */
    public Virginity3() {
        initComponents();
    }

    public Virginity3(MENU menu) {
        menu=menu;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReturn = new javax.swing.JButton();
        jtxtA = new javax.swing.JTextField();
        jtxtA.setEnabled(false);
        jtxtnA = new javax.swing.JTextField();
        jtxtB = new javax.swing.JTextField();
        jtxtB.setEnabled(false);
        jtxtnB = new javax.swing.JTextField();
        jtxtC = new javax.swing.JTextField();
        jtxtC.setEnabled(false);
        jtxtnC = new javax.swing.JTextField();
        btnKQ = new javax.swing.JButton();
        jtxtnD = new javax.swing.JTextField();
        jtxtD = new javax.swing.JTextField();
        jtxtD.setEnabled(false);
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtKQ = new javax.swing.JTextArea();
        jtxtKQ.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReturn.setText("⬅");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jtxtA.setText("a =");

        jtxtB.setText("b = ");

        jtxtC.setText("c =");

        btnKQ.setText("Kết Quả:");
        btnKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKQActionPerformed(evt);
            }
        });
        btnKQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnKQKeyPressed(evt);
            }
        });

        jtxtnD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtnDKeyPressed(evt);
            }
        });

        jtxtD.setText("d =");

        jtxtKQ.setColumns(20);
        jtxtKQ.setRows(5);
        jScrollPane2.setViewportView(jtxtKQ);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKQ)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtnA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtnB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtnD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addComponent(btnReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtnB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtnC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtnD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKQ)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        MENU menu = new MENU();
        this.setVisible(false);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKQActionPerformed
        // TODO add your handling code here:

        Double a,b,c,d;
        a=Double.parseDouble(jtxtnA.getText());
        b=Double.parseDouble(jtxtnB.getText());
        c=Double.parseDouble(jtxtnC.getText());
        d=Double.parseDouble(jtxtnD.getText());
        String kq = GiaiPT.GiaiPTB3(a, b, c, d);
        jtxtKQ.setText(kq);
    }//GEN-LAST:event_btnKQActionPerformed

    private void jtxtnDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnDKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Double a,b,c,d;
        a=Double.parseDouble(jtxtnA.getText());
        b=Double.parseDouble(jtxtnB.getText());
        c=Double.parseDouble(jtxtnC.getText());
        d=Double.parseDouble(jtxtnD.getText());
        String kq = GiaiPT.GiaiPTB3(a, b, c, d);
        jtxtKQ.setText(kq);
        }
    }//GEN-LAST:event_jtxtnDKeyPressed

    private void btnKQKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnKQKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Double a,b,c,d;
        a=Double.parseDouble(jtxtnA.getText());
        b=Double.parseDouble(jtxtnB.getText());
        c=Double.parseDouble(jtxtnC.getText());
        d=Double.parseDouble(jtxtnD.getText());
        String kq = GiaiPT.GiaiPTB3(a, b, c, d);
        jtxtKQ.setText(kq);
        }
    }//GEN-LAST:event_btnKQKeyPressed

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
            java.util.logging.Logger.getLogger(Virginity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Virginity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Virginity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Virginity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        Virginity3 mainFrame = new Virginity3();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKQ;
    private javax.swing.JButton btnReturn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtA;
    private javax.swing.JTextField jtxtB;
    private javax.swing.JTextField jtxtC;
    private javax.swing.JTextField jtxtD;
    private javax.swing.JTextArea jtxtKQ;
    private javax.swing.JTextField jtxtnA;
    private javax.swing.JTextField jtxtnB;
    private javax.swing.JTextField jtxtnC;
    private javax.swing.JTextField jtxtnD;
    // End of variables declaration//GEN-END:variables

}
