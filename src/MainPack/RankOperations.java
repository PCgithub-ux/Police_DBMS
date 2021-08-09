/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPack;

/**
 *
 * @author shubham
 */
public class RankOperations extends javax.swing.JFrame {

    /**
     * Creates new form RankOperations
     */
    public RankOperations() {
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

        jLabel2 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        DisplayBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("Rank Menu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 40, 140, 29);

        AddBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn);
        AddBtn.setBounds(310, 90, 140, 39);

        SearchBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBtn);
        SearchBtn.setBounds(310, 150, 140, 39);

        DisplayBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        DisplayBtn.setText("Display");
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DisplayBtn);
        DisplayBtn.setBounds(310, 210, 140, 39);

        UpdateBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        UpdateBtn.setText("Update");
        getContentPane().add(UpdateBtn);
        UpdateBtn.setBounds(310, 269, 140, 40);

        DeleteBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(310, 330, 140, 40);

        BackBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/back.png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(310, 430, 110, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/add new patient background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        dispose();
        m.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
        // TODO add your handling code here:
        RankDisplay r= new RankDisplay();
        dispose();
        r.setVisible(true);
    }//GEN-LAST:event_DisplayBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        RankSearch r= new RankSearch();
        dispose();
        r.setVisible(true);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        RankDetails r = new RankDetails();
        dispose();
        r.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        RankDelete r = new RankDelete();
        dispose();
        r.setVisible(true);
    }//GEN-LAST:event_DeleteBtnActionPerformed
        
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
            java.util.logging.Logger.getLogger(RankOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}