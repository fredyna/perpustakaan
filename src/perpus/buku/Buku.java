/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.buku;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.StringUtils;
import java.awt.Container;
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
public class Buku extends javax.swing.JFrame {
    public static DefaultTableModel model;
    private String id_buku;

    /**
     * Creates new form Buku
     */
    public Buku() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        tbBuku = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnLihat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txtCari.setText("cari...");
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

        tbBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "JUDUL", "PENGARANG", "PENERBIT", "ISBN", "TAHUN", "JUMLAH", "ID SUPPLIER"
            }
        ));
        tbBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBuku);

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

        jPanel2.setBackground(new java.awt.Color(65, 89, 151));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/book_white.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA BUKU");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTime)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTime)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUbah, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCetakBarcode, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTambah))
                    .addComponent(btnLihat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCari)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahBuku tambah = new TambahBuku(this, true);
        tambah.setLocationRelativeTo(null);
        tambah.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCetakBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakBarcodeActionPerformed
        int n = tbBuku.getRowCount();
        if(n > 0){
            int i = tbBuku.getSelectedRow();
            if(i >= 0){
                String code = tbBuku.getValueAt(i, 0).toString();
                BuatBarcode b = new BuatBarcode(this, true);
                b.QR_Code = code;
                b.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(this, "Pilih Buku Terlebih Dahulu");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data buku");
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
                String where = " WHERE ID_BUKU LIKE '%"+key+"%' OR JUDUL LIKE '%"
                        +key+"%' OR PENGARANG LIKE '"+key+"%' "
                        + "OR PENERBIT LIKE '"+key+"' OR ISBN LIKE '%"+key+"%' "
                        + "OR TAHUN=STR_TO_DATE('"+key+"', '%Y') "
                        + "OR ID_SUPPLIER LIKE '%"+key+"%'";
                loadData(where);
                Buku.disabledButton();
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

    private void tbBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBukuMouseClicked
        // TODO add your handling code here:
        int row = tbBuku.getSelectedRow();
        id_buku = tbBuku.getModel().getValueAt(row, 0).toString();
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnLihat.setEnabled(true);
        btnCetakBarcode.setEnabled(true);
    }//GEN-LAST:event_tbBukuMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        if(!id_buku.isEmpty()){
            UbahBuku ubah = new UbahBuku(this, true, id_buku);
            ubah.setLocationRelativeTo(null);
            ubah.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        if(!id_buku.isEmpty()){
            LihatBuku lihat = new LihatBuku(this, true, id_buku);
            lihat.setLocationRelativeTo(null);
            lihat.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, "Belum ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(!id_buku.isEmpty()){
            int konfir = JOptionPane.showConfirmDialog(null, "Apakah yakin akan menghapus?", 
                "Hapus Buku", JOptionPane.YES_NO_OPTION);
            if(konfir == JOptionPane.YES_OPTION){
                try {
                    String query = "DELETE FROM BUKU WHERE ID_BUKU='"+id_buku+"'";
                    PreparedStatement ps = Koneksi.konek().prepareStatement(query);
                    ps.executeUpdate();
                       
                    Buku.refreshMethod();
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
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbBuku;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    
    private static void loadData(String where) {
        initTable();
        Connection kon = Koneksi.konek();
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) kon.createStatement();
            String query = "SELECT * FROM BUKU"+where+" ORDER BY JUDUL ASC";
            rs = st.executeQuery(query);
            DateFormat dateFormat = new SimpleDateFormat("yyyy");
            while(rs.next()){
                model.addRow(new Object[]{rs.getObject(1), rs.getObject(2),
                rs.getObject(3), rs.getObject(4), rs.getObject(5), dateFormat.format(rs.getDate(6)),
                rs.getObject(7), rs.getObject(8)});
            }
            rs.close();
            st.close();
            kon.close();
            tbBuku.setModel(model);
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
                new String []{"ID", "JUDUL", "PENGARANG", "PENERBIT", "ISBN",
                "TAHUN", "JUMLAH", "ID SUPPLIER"}
        );
    }
}
