/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.retur;

import perpus.buku.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static perpus.buku.Buku.model;
import static perpus.buku.Buku.tbBuku;
import static perpus.retur.Retur.model;
import perpus.supplier.TambahSupplier;
import perpus.umum.Koneksi;

/**
 *
 * @author fredd
 */
public class TambahRetur extends javax.swing.JDialog {
    int jumlah_awal = 0;

    /**
     * Creates new form TambahBuku
     */
    public TambahRetur(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKet = new javax.swing.JTextArea();
        tanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ID Buku");

        jLabel2.setText("Jumlah");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });

        jLabel3.setText("Keterangan");

        jLabel10.setText("Tanggal");

        jPanel1.setBackground(new java.awt.Color(65, 89, 151));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/add.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("FORM TAMBAH DATA RETURN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(lblIcon))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(65, 89, 151));

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        txtID.setText("ID Buku");

        btnPilih.setText("PILIH");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        txtKet.setColumns(20);
        txtKet.setRows(5);
        txtKet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKetKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtKet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPilih))
                    .addComponent(jScrollPane1)
                    .addComponent(txtJumlah)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID)
                    .addComponent(btnPilih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5))
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = txtID.getText().toUpperCase();
        int jumlah = Integer.parseInt(txtJumlah.getText());
        String ket = txtKet.getText().toUpperCase();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = df.format(tanggal.getDate());
        
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom ID buku masih kosong");
            btnPilih.requestFocus();
        } else if(String.valueOf(jumlah).isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom jumlah masih kosong");
            txtJumlah.requestFocus();
        } else if(ket.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom keterangan masih kosong");
            txtKet.requestFocus();
        } else if(tgl.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom tanggal masih kosong");
            tanggal.requestFocus();
        } else if(cekID(id) < jumlah){
            JOptionPane.showMessageDialog(this, "Maaf jumlah tidak sesuai!");
        }else{
            int selisih = jumlah_awal - jumlah;
            try {
                String query2 = "INSERT INTO RETUR (ID_BUKU, JUMLAH, KETERANGAN, "
                        + "TANGGAL) VALUES (?,?,?,?)";
                PreparedStatement ps = Koneksi.konek().prepareStatement(query2);
                ps.setString(1, id);
                ps.setInt(2, jumlah);
                ps.setString(3, ket);
                ps.setString(4, tgl);

                ps.executeUpdate();

                String query3 = "UPDATE BUKU SET JUMLAH =? "
                        + "WHERE ID_BUKU=?";
                PreparedStatement ps2 = Koneksi.konek().prepareStatement(query3);
                ps2.setInt(1, selisih);
                ps2.setString(2, id);

                ps2.executeUpdate();

                JOptionPane.showMessageDialog(this, "Berhasil simpan data!");
                Retur.refreshMethod();
                setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : "+e.getMessage());
            }
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        AmbilBuku ambil = new AmbilBuku(null, true);
        ambil.setLocationRelativeTo(null);
        ambil.setVisible(true);
    }//GEN-LAST:event_btnPilihActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || c == KeyEvent.VK_TAB ||
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan angka");
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtKetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKetKeyTyped
        
    }//GEN-LAST:event_txtKetKeyTyped

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
            java.util.logging.Logger.getLogger(TambahRetur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahRetur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahRetur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahRetur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahRetur dialog = new TambahRetur(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    private com.toedter.calendar.JDateChooser tanggal;
    private static javax.swing.JLabel txtID;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextArea txtKet;
    // End of variables declaration//GEN-END:variables

    private int cekID(String id){
        int n = 0;
        try {            
            java.sql.Statement st = Koneksi.konek().createStatement();
            ResultSet rs = st.executeQuery("SELECT JUMLAH FROM BUKU "
                    + "WHERE ID_BUKU='"+id+"'");
            while (rs.next()) {                 
                n = rs.getInt("JUMLAH");
                jumlah_awal = n;
            }            
        } catch (SQLException e) {
        }
        return n;  
    }
    
    public static void changeID(String id){
        txtID.setText(id);
    }
}
