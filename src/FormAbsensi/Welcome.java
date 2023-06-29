package FormAbsensi;


public class Welcome extends javax.swing.JFrame {


    public Welcome() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButton1 = new javax.swing.JLabel();
        JButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Image/him200.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        JButton1.setForeground(new java.awt.Color(255, 255, 255));
        JButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JButton1.setText("Click Here");
        JButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton1MouseClicked(evt);
            }
        });
        getContentPane().add(JButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 312, 100, 20));

        JButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        JButton.setForeground(new java.awt.Color(255, 255, 255));
        JButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JButton.setText("Absen Disini");
        JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonMouseClicked(evt);
            }
        });
        getContentPane().add(JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 244, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Menu Welcome.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton1MouseClicked
        // TODO add your handling code here:
        new FormLogin().show();
        this.dispose();
    }//GEN-LAST:event_JButton1MouseClicked

    private void JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonMouseClicked
        // TODO add your handling code here:
        new AbsensiMasuk().show();
        this.dispose();
    }//GEN-LAST:event_JButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JButton;
    private javax.swing.JLabel JButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
