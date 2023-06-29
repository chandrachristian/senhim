/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FormAbsensi;

import Konektor.Koneksi;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class Report extends javax.swing.JFrame {
DefaultTableModel  model;
    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
     model =new DefaultTableModel();
     TampilData();
     Tampil();
        
    }
    
   /* public void tampildata(String d1, String d2) throws SQLException{
        Connection conn= Konektor.Koneksi.getKoneksi();
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            if(d1.equals("") || d2.equals("")){
                pst=conn.prepareStatement("select * from tbmasuk");
            }else{
                pst=conn.prepareStatement("select * from tbmasuk where NIP AND Tanggal_masuk BETWEEN ? AND ?");
                pst.setString(1, d1);
                pst.setString(2, d2);
            }
            
            rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)Table.getModel();
            
            Object[]row;
            
            while (rs.next()) {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                model.addRow(row);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/
 
    private void CariData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NIP");
        tbl.addColumn("Nama");
        tbl.addColumn("Jabatan");
        tbl.addColumn("Divisi");
        
        try {
            String sql = "SELECT * FROM tbPersonal WHERE NIP like '%"+ Cari.getText() +"%'";
            Connection conn = (Connection)Konektor.Koneksi.getKoneksi();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("NIP"),
                    rs.getString("Nama"),
                    rs.getString("Jabatan"),
                    rs.getString("Divisi")
                });
                Table1.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }    
    
private void TampilData(){

        try {
            Connection conn = (Connection)Konektor.Koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery("SELECT * FROM tbmasuk");
            Table.setModel(DbUtils.resultSetToTableModel(rs));  
        } catch (SQLException | HeadlessException e) {
        }
    }

private void Tampil(){
        try {
            Connection conn = (Connection)Konektor.Koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tbPersonal");
            Table1.setModel(DbUtils.resultSetToTableModel(sql));
        } catch (SQLException | HeadlessException e) {
        }
    }
  
    
    private void Cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NIP");
        tbl.addColumn("Nama");
        tbl.addColumn("Jabatan");
        tbl.addColumn("Divisi");
        tbl.addColumn("Absen");
        tbl.addColumn("Tanggal Absen");
        tbl.addColumn("Jam");
        Table.setModel(tbl);
        
        SimpleDateFormat date;
        date = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            
            String sql = "SELECT * FROM tbmasuk WHERE NIP = '"+txtCari.getText()+"' AND Tanggal_Absen between '"
                    +date.format(Tanggal1.getDate())+"' AND '"+date.format(Tanggal2.getDate())+"'";
            Connection conn = (Connection)Konektor.Koneksi.getKoneksi();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
           while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("NIP"),
                    rs.getString("Nama"),
                    rs.getString("Jabatan"),
                    rs.getString("Divisi"),
                    rs.getString("Absen"),
                    rs.getString("Tanggal_Absen"),
                    rs.getString("Jam")
                    
                });
                Table.setModel(tbl);
            }
        } catch (SQLException e) {
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        Cari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Tanggal1 = new com.toedter.calendar.JDateChooser();
        Tanggal2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIP", "Nama", "Posisi", "Mapel", "Tanggal", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(2, 47, 127));
        jPanel6.setPreferredSize(new java.awt.Dimension(700, 400));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Table1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIP", "Nama", "Posisi"
            }
        ));
        Table1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Table1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        Table1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Table1PropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(Table1);

        Cari.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        btnCari.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Pegawai", jPanel1);

        Tanggal1.setDateFormatString("dd-MMM-yyyy");
        Tanggal1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tanggal1PropertyChange(evt);
            }
        });

        Tanggal2.setDateFormatString("dd-MMM-yyyy");
        Tanggal2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tanggal2PropertyChange(evt);
            }
        });

        Table.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIP", "Nama", "Posisi", "Mapel", "Absen", "Tanggal Absen", "Jam"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tanggal1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtCari))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 349, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rekap Absen", jPanel2);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Dashboard().show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Cari();

        /*    int row=model.getRowCount();
        for(int i=0;i<row;i++){
            model.removeRow(0);
        } try {
            Table.setModel(new DefaultTableModel(null, Object[]{"NIP","Nama","Posisi","Mapel","Tanggal_masuk"}));
            SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd 00:00:00.0");
            SimpleDateFormat dfm = new SimpleDateFormat("yyy-MM-dd 23:59:00.0");
            String date1 = df.format(Tanggal1.getDate());
            String date2 = dfm.format(Tanggal2.getDate());
            showData(date1, date2);
        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablePropertyChange
        // TODO add your handling code here:   
    }//GEN-LAST:event_TablePropertyChange

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TableMouseClicked

    private void Tanggal2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tanggal2PropertyChange

    }//GEN-LAST:event_Tanggal2PropertyChange

    private void Tanggal1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tanggal1PropertyChange

    }//GEN-LAST:event_Tanggal1PropertyChange

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1MouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        CariData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void Table1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Table1PropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Table1PropertyChange

    private void Table1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1AncestorAdded

    
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari;
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private com.toedter.calendar.JDateChooser Tanggal1;
    private com.toedter.calendar.JDateChooser Tanggal2;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
