/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class CommunityLogin extends javax.swing.JPanel {

    /**
     * Creates new form CommunityLogin
     */
    public CommunityLogin() {
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

        ComLoginLbl = new javax.swing.JLabel();
        ComPasswordLbl = new javax.swing.JLabel();
        ComLoginId = new javax.swing.JTextField();
        ComPassword = new javax.swing.JTextField();
        ComLbl = new javax.swing.JLabel();
        ComSignInBtn = new javax.swing.JButton();
        ComCancelLbl = new javax.swing.JButton();

        ComLoginLbl.setText("Login       :");

        ComPasswordLbl.setText("Password:");

        ComLbl.setText("Community");

        ComSignInBtn.setText("Sign in");
        ComSignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComSignInBtnActionPerformed(evt);
            }
        });

        ComCancelLbl.setText("Cancel");
        ComCancelLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComCancelLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComPasswordLbl)
                    .addComponent(ComLoginLbl))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ComLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComSignInBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComCancelLbl))
                            .addComponent(ComPassword)
                            .addComponent(ComLoginId))
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ComLbl)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComLoginLbl))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComPasswordLbl)
                    .addComponent(ComPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComSignInBtn)
                    .addComponent(ComCancelLbl))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComSignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComSignInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComSignInBtnActionPerformed

    private void ComCancelLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComCancelLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComCancelLblActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComCancelLbl;
    private javax.swing.JLabel ComLbl;
    private javax.swing.JTextField ComLoginId;
    private javax.swing.JLabel ComLoginLbl;
    private javax.swing.JTextField ComPassword;
    private javax.swing.JLabel ComPasswordLbl;
    private javax.swing.JButton ComSignInBtn;
    // End of variables declaration//GEN-END:variables
}
