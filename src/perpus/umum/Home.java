/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.umum;

import perpus.buku.*;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perpus.akun.Users;
import static perpus.buku.Buku.tbBuku;
import perpus.retur.Retur;
import perpus.supplier.Supplier;
import perpus.supplier.TambahSupplier;


/**
 *
 * @author afi makarim
 */
public class Home extends javax.swing.JFrame {



    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
        waktu();
        setExtendedState(this.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        tanggaal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        logo = new javax.swing.JLabel();
        judul1 = new javax.swing.JLabel();
        btnUsers = new javax.swing.JLabel();
        btnBuku = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JLabel();
        descReturn = new javax.swing.JLabel();
        descBuku = new javax.swing.JLabel();
        descUsers = new javax.swing.JLabel();
        descSupplier = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        descExit = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tegal.png"))); // NOI18N
        logo.setMaximumSize(new java.awt.Dimension(70, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(30, 509, 7, 96);
        getContentPane().add(logo, gridBagConstraints);

        judul1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        judul1.setForeground(new java.awt.Color(255, 255, 255));
        judul1.setText("APLIKASI PERPUSTAKAAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 430, 0, 17);
        getContentPane().add(judul1, gridBagConstraints);

        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/users.png"))); // NOI18N
        btnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsersMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(100, 250, 0, 0);
        getContentPane().add(btnUsers, gridBagConstraints);

        btnBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/book_white.png"))); // NOI18N
        btnBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBukuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(102, 501, 2, 1);
        getContentPane().add(btnBuku, gridBagConstraints);

        judul2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judul2.setForeground(new java.awt.Color(255, 255, 255));
        judul2.setText("PEMERINTAH KOTA TEGAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(40, 520, 17, 111);
        getContentPane().add(judul2, gridBagConstraints);

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/return.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(30, 500, 0, 0);
        getContentPane().add(btnReturn, gridBagConstraints);

        descReturn.setBackground(new java.awt.Color(255, 255, 255));
        descReturn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descReturn.setForeground(new java.awt.Color(255, 255, 255));
        descReturn.setText("RETURN");
        descReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descReturnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 500, 0, 0);
        getContentPane().add(descReturn, gridBagConstraints);

        descBuku.setBackground(new java.awt.Color(255, 255, 255));
        descBuku.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descBuku.setForeground(new java.awt.Color(255, 255, 255));
        descBuku.setText("DATA BUKU");
        descBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descBukuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 500, 0, 0);
        getContentPane().add(descBuku, gridBagConstraints);

        descUsers.setBackground(new java.awt.Color(255, 255, 255));
        descUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descUsers.setForeground(new java.awt.Color(255, 255, 255));
        descUsers.setText("USERS");
        descUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descUsersMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 250, 0, 0);
        getContentPane().add(descUsers, gridBagConstraints);

        descSupplier.setBackground(new java.awt.Color(255, 255, 255));
        descSupplier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descSupplier.setForeground(new java.awt.Color(255, 255, 255));
        descSupplier.setText("SUPPLIERS");
        descSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descSupplierMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 250, 0, 0);
        getContentPane().add(descSupplier, gridBagConstraints);

        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/supplier.png"))); // NOI18N
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(30, 250, 0, 0);
        getContentPane().add(btnSupplier, gridBagConstraints);

        tanggal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setText("TANGGAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 107, 0, 53);
        getContentPane().add(tanggal, gridBagConstraints);

        jam.setBackground(new java.awt.Color(255, 255, 255));
        jam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jam.setForeground(new java.awt.Color(255, 255, 255));
        jam.setText("JAM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        getContentPane().add(jam, gridBagConstraints);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/logout.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 81, 0, 15);
        getContentPane().add(btnExit, gridBagConstraints);

        descExit.setForeground(new java.awt.Color(255, 255, 255));
        descExit.setText("EXIT");
        descExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descExitMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 6;
        getContentPane().add(descExit, gridBagConstraints);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/wal.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel5.add(bg, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel1.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel2.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel3.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel4.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel6.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        jPanel7.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 14;
        getContentPane().add(jPanel7, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseClicked
        if(btnUsers.isEnabled()){
            Users users = new Users();
            users.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_btnUsersMouseClicked

    private void descUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descUsersMouseClicked
        if(descUsers.isEnabled()){
            Users users = new Users();
            users.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_descUsersMouseClicked

    private void btnBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBukuMouseClicked
        if(btnBuku.isEnabled()){
            Buku buku = new Buku();
            buku.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_btnBukuMouseClicked

    private void descBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descBukuMouseClicked
        if(descBuku.isEnabled()){
            Buku buku = new Buku();
            buku.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_descBukuMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        if(btnSupplier.isEnabled()){
            Supplier sp = new Supplier();
            sp.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void descSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descSupplierMouseClicked
        if(descSupplier.isEnabled()){
            Supplier sp = new Supplier();
            sp.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_descSupplierMouseClicked

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        if(btnReturn.isEnabled()){
            Retur retur = new Retur();
            retur.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_btnReturnMouseClicked

    private void descReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descReturnMouseClicked
        if(descReturn.isEnabled()){
            Retur retur = new Retur();
            retur.setVisible(true);
            menuNonAktif();
        }
    }//GEN-LAST:event_descReturnMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        if(btnExit.isEnabled()){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void descExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descExitMouseClicked
        if(descExit.isEnabled()){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_descExitMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private static javax.swing.JLabel btnBuku;
    private static javax.swing.JLabel btnExit;
    private static javax.swing.JLabel btnReturn;
    private static javax.swing.JLabel btnSupplier;
    private static javax.swing.JLabel btnUsers;
    private static javax.swing.JLabel descBuku;
    private static javax.swing.JLabel descExit;
    private static javax.swing.JLabel descReturn;
    private static javax.swing.JLabel descSupplier;
    private static javax.swing.JLabel descUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables

    public void waktu()
    {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (true) {                            
                        java.util.Date d = new java.util.Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

                        jam.setText(sdf.format(d));

                        Thread.sleep(1000);

                    }

                } catch (Exception e) {
                }
            }
        }).start();
    }
    
    public void tanggaal()
    {
        Date date = new Date();
          SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
          String tgl = s.format(date).toString();
        tanggal.setText(tgl);
    }
    
    public static void menuNonAktif(){
       btnUsers.setEnabled(false);
       btnBuku.setEnabled(false);
       btnSupplier.setEnabled(false);
       btnReturn.setEnabled(false);
       btnExit.setEnabled(false);
       descUsers.setEnabled(false);
       descBuku.setEnabled(false);
       descSupplier.setEnabled(false);
       descReturn.setEnabled(false);
       descExit.setEnabled(false);
    }
    
    public static void menuAktif(){
       btnUsers.setEnabled(true);
       btnBuku.setEnabled(true);
       btnSupplier.setEnabled(true);
       btnReturn.setEnabled(true);
       btnExit.setEnabled(true);
       descUsers.setEnabled(true);
       descBuku.setEnabled(true);
       descSupplier.setEnabled(true);
       descReturn.setEnabled(true);
       descExit.setEnabled(true);
    }
      
}
