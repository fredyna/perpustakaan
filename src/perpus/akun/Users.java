/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.akun;

import perpus.buku.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.StringUtils;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import perpus.umum.BuatBarcode;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perpus.umum.Home;
import perpus.umum.Koneksi;

/**
 *
 * @author fredd
 */
public class Users extends javax.swing.JFrame {
    public static DefaultTableModel model;
    private String id_user;
    public static Container container;

    /**
     * Creates new form Buku
     */
    public Users() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        container = getContentPane();
        startClock();
        loadData("");
    }
    
    private void startClock(){
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String waktu = df.format(c.getTime());
                dateTime.setText(waktu);
            }
        }, 0, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCetakBarcode = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsers = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnLihat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/add_dark.png"))); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/edit_dark.png"))); // NOI18N
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/delete.png"))); // NOI18N
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCetakBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/printer.png"))); // NOI18N
        btnCetakBarcode.setEnabled(false);
        btnCetakBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakBarcodeActionPerformed(evt);
            }
        });

        txtCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCariFocusLost(evt);
            }
        });

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/search.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tbUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NO", "ID USER", "USERNAME", "NAMA", "ROLE"
            }
        ));
        tbUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsers);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/refresh.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnLihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/eye_dark.png"))); // NOI18N
        btnLihat.setEnabled(false);
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(65, 89, 151));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/users.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA USERS");

        dateTime.setForeground(new java.awt.Color(255, 255, 255));
        dateTime.setText("Datetime");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERPUSTAKAAN PEMKOT TEGAL");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/logout_kecil.png"))); // NOI18N
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTime)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCetakBarcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLihat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUbah, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCetakBarcode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambah))
                        .addComponent(btnLihat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahUser tambah = new TambahUser(this, true);
        tambah.setLocationRelativeTo(null);
        tambah.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCetakBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakBarcodeActionPerformed
        int n = tbUsers.getRowCount();
        if(n > 0){
            int i = tbUsers.getSelectedRow();
            if(i >= 0){
                String code = tbUsers.getValueAt(i, 1).toString();
                BuatBarcode b = new BuatBarcode(this, true);
                b.setLocationRelativeTo(null);
                b.QR_Code = code;
                b.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(this, "Pilih User Terlebih Dahulu");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data user");
        }
    }//GEN-LAST:event_btnCetakBarcodeActionPerformed

    private void txtCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusGained
        String key = txtCari.getText();
        if(key.equals("cari...")){
            txtCari.setText("");
        }
    }//GEN-LAST:event_txtCariFocusGained

    private void txtCariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusLost
        
    }//GEN-LAST:event_txtCariFocusLost

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String key = txtCari.getText().toUpperCase();        
        if(key.isEmpty()){
            loadData(""); 
        }else{
            try {
                String where = " WHERE ID_USER LIKE '%"+key+"%' "
                        + "OR USERNAME LIKE '%"+key+"%' OR NAMA_USER LIKE '%"+key+"%'"
                        + "OR ROLE='"+key+"'";
                loadData(where);
                Users.disabledButton();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : Gagal Cari Data! "
                        + "Silahkan coba lagi!");
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadData("");
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnLihat.setEnabled(false);
        btnCetakBarcode.setEnabled(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tbUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsersMouseClicked
        // TODO add your handling code here:
        int row = tbUsers.getSelectedRow();
        id_user = tbUsers.getModel().getValueAt(row, 1).toString();
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnLihat.setEnabled(true);
        btnCetakBarcode.setEnabled(true);
    }//GEN-LAST:event_tbUsersMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        if(!id_user.isEmpty()){
            UbahUser ubah = new UbahUser(this, true, id_user);
            ubah.setLocationRelativeTo(null);
            ubah.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        if(!id_user.isEmpty()){
            LihatUser lihat = new LihatUser(this, true, id_user);
            lihat.setLocationRelativeTo(null);
            lihat.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(!id_user.isEmpty()){
            int konfir = JOptionPane.showConfirmDialog(null, "Apakah yakin akan menghapus?", 
                "Hapus Buku", JOptionPane.YES_NO_OPTION);
            if(konfir == JOptionPane.YES_OPTION){
                try {
                    String query = "DELETE FROM USERS WHERE ID_USER='"+id_user+"'";
                    PreparedStatement ps = Koneksi.konek().prepareStatement(query);
                    ps.executeUpdate();
                    
                    Users.refreshMethod();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error : Gagal Hapus Data! "
                            + "Silahkan coba lagi!");
                }
            }
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih!");
        }
        
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home.menuAktif();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private static javax.swing.JButton btnCetakBarcode;
    private static javax.swing.JButton btnHapus;
    private static javax.swing.JButton btnLihat;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private static javax.swing.JButton btnUbah;
    private javax.swing.JLabel dateTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbUsers;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    
    private static void loadData(String where) {
        initTable();
        Connection kon = Koneksi.konek();
        Statement st;
        ResultSet rs;
        int no = 1;
        try {
            st = (Statement) kon.createStatement();
            String query = "SELECT * FROM USERS"+where+" ORDER BY USERNAME ASC";
            rs = st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{no++, rs.getObject(1), rs.getObject(2),
                rs.getObject(3), rs.getObject(5)});
            }
            rs.close();
            st.close();
            kon.close();
            tbUsers.setModel(model);
        } catch (SQLException e) {
        }
    }
    
    public static void disabledButton(){
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnLihat.setEnabled(false);
        btnCetakBarcode.setEnabled(false);
    }
    
    public static void refreshMethod(){
        loadData("");
        disabledButton();
    }
    
    private static void initTable() {
        model = new DefaultTableModel(
                new Object[][]{},
                new String []{"NO", "ID USER", "USERNAME", "NAMA", "ROLE"}
        );
    }
    
}
