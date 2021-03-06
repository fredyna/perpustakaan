/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.buku;

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
import perpus.umum.Koneksi;

/**
 *
 * @author fredd
 */
public class TambahBuku extends javax.swing.JDialog {

    /**
     * Creates new form TambahBuku
     */
    public TambahBuku(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadSupplier();
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
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbSupplier = new javax.swing.JComboBox<>();
        txtIsbn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ID Buku");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        jLabel2.setText("Judul");

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        jLabel3.setText("Pengarang");

        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });
        txtPengarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPengarangKeyTyped(evt);
            }
        });

        jLabel4.setText("Penerbit");

        txtPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbitActionPerformed(evt);
            }
        });
        txtPenerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPenerbitKeyTyped(evt);
            }
        });

        jLabel5.setText("Tahun");

        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });
        txtTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTahunKeyTyped(evt);
            }
        });

        jLabel6.setText("Supplier");

        cbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnKeyTyped(evt);
            }
        });

        jLabel8.setText("ISBN");

        jLabel10.setText("Jumlah");

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

        jPanel1.setBackground(new java.awt.Color(65, 89, 151));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/add.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("FORM TAMBAH BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTahun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengarangActionPerformed

    private void txtPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenerbitActionPerformed

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = txtID.getText().toUpperCase();
        String judul = txtJudul.getText().toUpperCase();
        String pengarang = txtPengarang.getText().toUpperCase();
        String penerbit = txtPenerbit.getText().toUpperCase();
        String isbn = txtIsbn.getText();
        String tahun = txtTahun.getText();
        String jumlah = txtJumlah.getText();
        String id_sp = cbSupplier.getSelectedItem().toString();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom ID buku masih kosong");
            txtID.requestFocus();
        } else if(judul.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom judul masih kosong");
            txtJudul.requestFocus();
        } else if(pengarang.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom pengarang masih kosong");
            txtPengarang.requestFocus();
        } else if(penerbit.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom penerbit masih kosong");
            txtPenerbit.requestFocus();
        } else if(isbn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom ISBN masih kosong");
            txtIsbn.requestFocus();
        } else if(tahun.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom tahun masih kosong");
            txtTahun.requestFocus();
        } else if(jumlah.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom jumlah masih kosong");
            txtJumlah.requestFocus();
        } else if(id_sp.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kolom ID supplier masih kosong");
            cbSupplier.requestFocus();
        }else if(cekID(id) > 0){
            try {
                String query = "UPDATE BUKU SET JUDUL=?, PENGARANG=?,"
                        + "PENERBIT=?, ISBN=?, TAHUN=YEAR('"+tahun+"-01-01'),"
                        + "JUMLAH=?, ID_SUPPLIER=? WHERE ID_BUKU=?";
                //String query = "INSERT INTO BUKU VALUES (?,?,?,?,?,"
                //        + "YEAR('"+tahun+"-01-01'),?,?)";
                PreparedStatement ps = Koneksi.konek().prepareStatement(query);
                ps.setString(1, judul);
                ps.setString(2, pengarang);
                ps.setString(3, penerbit);
                ps.setString(4, isbn);
                ps.setInt(5, Integer.valueOf(jumlah));
                ps.setString(6, id_sp);
                ps.setString(7, id);
                
                ps.executeUpdate();
               
                JOptionPane.showMessageDialog(this, "Berhasil update data!");
                Buku.refreshMethod();
                setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : "+e.getMessage());
            }
        }else{
            try {
                String query = "INSERT INTO BUKU VALUES (?,?,?,?,?,"
                        + "YEAR('"+tahun+"-01-01'),?,?)";
                PreparedStatement ps = Koneksi.konek().prepareStatement(query);
                ps.setString(1, id);
                ps.setString(2, judul);
                ps.setString(3, pengarang);
                ps.setString(4, penerbit);
                ps.setString(5, isbn);
                ps.setInt(6, Integer.valueOf(jumlah));
                ps.setString(7, id_sp);
                
                ps.executeUpdate();
               
                JOptionPane.showMessageDialog(this, "Berhasil simpan data!");
                Buku.refreshMethod();
                setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : "+e.getMessage());
            }
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || Character.isLetter(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||
                c == KeyEvent.VK_TAB || c == KeyEvent.VK_ENTER)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan huruf dan angka");
        } else{
            if(c == KeyEvent.VK_ENTER){
                String id = txtID.getText().toString();
                if(cekID(id) > 0){
                    fillForm(id);
                }
            }
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtPengarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPengarangKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isLetter(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||
                c == KeyEvent.VK_SPACE || c == KeyEvent.VK_TAB)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan huruf");
        }
    }//GEN-LAST:event_txtPengarangKeyTyped

    private void txtPenerbitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPenerbitKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || Character.isLetter(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||
                c == KeyEvent.VK_SPACE || c == KeyEvent.VK_TAB)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan huruf dan angka");
        }
    }//GEN-LAST:event_txtPenerbitKeyTyped

    private void txtIsbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_MINUS))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan angka dan (-)");
        }
    }//GEN-LAST:event_txtIsbnKeyTyped

    private void txtTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTahunKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan angka");
        }
    }//GEN-LAST:event_txtTahunKeyTyped

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || 
                c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)))
        {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Hanya dibolehkan angka");
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

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
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahBuku dialog = new TambahBuku(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables

    private int cekID(String id){
        int n = 0;
        try {            
            java.sql.Statement st = Koneksi.konek().createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS JML FROM "
                    + "BUKU WHERE ID_BUKU='"+id+"'");
            while (rs.next()) {                 
                n = rs.getInt("JML");
            }            
        } catch (SQLException e) {
        }
        return n;  
    }
    
    private void loadSupplier() {
        cbSupplier.removeAllItems();
        Connection kon = Koneksi.konek();
        Statement st;
        ResultSet rs;
        try {
            st = (Statement) kon.createStatement();
            String query = "SELECT * FROM SUPPLIER";
            rs = st.executeQuery(query);
            while(rs.next()){
                cbSupplier.addItem(rs.getString(1));
            }
            rs.close();
            st.close();
            kon.close();
        } catch (SQLException e) {
        }
    }
    
    public void fillForm(String id_buku){
        if(!id_buku.isEmpty()){
            Connection kon = Koneksi.konek();
            try {
                Statement st = (Statement) kon.createStatement();
                String query = "SELECT * FROM BUKU WHERE ID_BUKU='"+id_buku+"'";
                ResultSet rs = st.executeQuery(query);
                DateFormat dateFormat = new SimpleDateFormat("yyyy");
                while(rs.next()){
                    txtID.setText(rs.getObject(1).toString());
                    txtJudul.setText(rs.getObject(2).toString());
                    txtPengarang.setText(rs.getObject(3).toString());
                    txtPenerbit.setText(rs.getObject(4).toString());
                    txtIsbn.setText(rs.getObject(5).toString());
                    txtTahun.setText(dateFormat.format(rs.getDate(6)).toString());
                    txtJumlah.setText(rs.getObject(7).toString());
                    cbSupplier.setSelectedItem(rs.getObject(8).toString());
                }
                
                txtID.setEnabled(false);
                lblTitle.setText("FORM EDIT BUKU");
                lblIcon.setIcon(new ImageIcon("img/edit.png"));
                rs.close();
                st.close();
                kon.close();
            } catch (SQLException e) {
            }
        } else{
        }
    }
}
