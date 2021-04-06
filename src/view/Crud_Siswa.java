/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.KoneksiDB;
/**
 *
 * @author WINDOWS10 PRO
 */
public class Crud_Siswa extends javax.swing.JFrame {

    /**
     * Creates new form Crud_Siswa
     */
    public Crud_Siswa() {
        initComponents();
        tampilkan();
        autofillKELAS();
        autofillTAHUN();
        
        BtnUpdate.setEnabled(false);
    }

         int _kelas;    
         int _tahun;

    Statement st;
    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TNOTELP = new javax.swing.JTextField();
        TNISN = new javax.swing.JTextField();
        TNIS = new javax.swing.JTextField();
        idspp = new javax.swing.JComboBox<>();
        TNAMA = new javax.swing.JTextField();
        TALAMAT = new javax.swing.JTextField();
        CBKELAS = new javax.swing.JComboBox<>();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBack1 = new javax.swing.JButton();
        BtnRefresh1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelSiswa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 720, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        BtnRefresh.setText("Refresh Table");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 600, 260, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("ID SPP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Kelas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Nama Siswa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("NIS SMK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("NISN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("No Telp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));
        getContentPane().add(TNOTELP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, 170, 40));
        getContentPane().add(TNISN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 170, 40));
        getContentPane().add(TNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 240, 170, 40));

        idspp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        idspp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~ ID SPP" }));
        idspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsppActionPerformed(evt);
            }
        });
        getContentPane().add(idspp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, 170, 40));
        getContentPane().add(TNAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 290, 170, 40));
        getContentPane().add(TALAMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 170, 40));

        CBKELAS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CBKELAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~ Pilih Kelas" }));
        CBKELAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKELASActionPerformed(evt);
            }
        });
        getContentPane().add(CBKELAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 170, 40));

        BtnSimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 80, 50));

        BtnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnUpdate.setText("Ubah");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 80, 50));

        BtnHapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 80, 50));

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 600, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBack1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack1.setText("Kembali");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        BtnRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnRefresh1.setText("Refresh Table");
        BtnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(BtnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnRefresh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 270, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARI   :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KELOLA DATA SISWA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgCrud.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard dsb = new Dashboard();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        resetForm();
        BtnUpdate.setEnabled(false);
        BtnSimpan.setEnabled(true);
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void TabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSiswaMouseClicked
        int i = TabelSiswa.getSelectedRow();
        TNISN.setText(model.getValueAt(i, 0).toString());
        TNIS.setText(model.getValueAt(i, 1).toString());
        TNAMA.setText(model.getValueAt(i, 2).toString());
        CBKELAS.setSelectedItem(model.getValueAt(i, 3));
        TALAMAT.setText(model.getValueAt(i, 4).toString());
        TNOTELP.setText(model.getValueAt(i, 5).toString());
        idspp.setSelectedItem(model.getValueAt(i, 6));

        //       disabled item on klik row table
        TNISN.setEnabled(false);
        BtnSimpan.setEnabled(false);
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_TabelSiswaMouseClicked

    private void idsppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsppActionPerformed
        try {
            String comboboxIsi = idspp.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from spp where tahun='"+comboboxIsi+"'");
            while(rs.next()) {
                _tahun = Integer.parseInt(rs.getString("id_spp"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_idsppActionPerformed

    private void CBKELASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKELASActionPerformed
        try {
            String comboboxIsi = CBKELAS.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from kelas where nama_kelas='"+comboboxIsi+"'");
            while(rs.next()) {
                _kelas = Integer.parseInt(rs.getString("id_kelas"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CBKELASActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String nisn = TNISN.getText();
        String nis = TNIS.getText();
        String nama = TNAMA.getText();
        int kelas =  _kelas;
        String alamat = TALAMAT.getText();
        String telp = TNOTELP.getText();
        int tahun =  _tahun;

        try{
            con.createStatement().executeUpdate("insert into siswa value ('"+nisn+"','"+nis+"','"+nama+"','"+CBKELAS.getSelectedItem()+"','"+alamat+"','"+telp+"','"+idspp.getSelectedItem()+"')");
            JOptionPane.showMessageDialog(null, "Data siswa berhasil ditambahkan");
            resetForm();

        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            String valueKelas = CBKELAS.getSelectedItem().toString();
            String valueTahun = idspp.getSelectedItem().toString();

            ResultSet rsKelas = con.createStatement().executeQuery("select id_kelas from kelas where nama_kelas='"+valueKelas+"'");
            ResultSet rsTahun = con.createStatement().executeQuery("select id_spp from spp where tahun='"+valueTahun+"'");

            while(rsKelas.next()) {
                _kelas = Integer.parseInt(rsKelas.getString("id_kelas"));
            }
            while(rsTahun.next()) {
                _tahun = Integer.parseInt(rsTahun.getString("id_spp"));
            }
            String nis = TNIS.getText();
            String nama = TNAMA.getText();
            String alamat = TALAMAT.getText();
            String telp = TNOTELP.getText();

            con.createStatement().executeUpdate("update siswa set nis='"+nis+"', nama='"+nama+"',id_kelas='"+CBKELAS.getSelectedItem()+"', alamat='"+alamat+"', no_telp='"+telp+"', id_spp='"+idspp.getSelectedItem()+"' where nisn='"+TNISN.getText()+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
        }
        resetForm();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try {
            con.createStatement().executeUpdate("delete from siswa where nisn ='"+TNISN.getText()+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        tampilkan();
    }//GEN-LAST:event_cariKeyPressed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        tampilkan();
    }//GEN-LAST:event_cariKeyReleased

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        Dashboard dsb = new Dashboard();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void BtnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefresh1ActionPerformed
        resetForm();
        BtnUpdate.setEnabled(false);
        BtnSimpan.setEnabled(true);
    }//GEN-LAST:event_BtnRefresh1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnRefresh1;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JComboBox<String> CBKELAS;
    private javax.swing.JTextField TALAMAT;
    private javax.swing.JTextField TNAMA;
    private javax.swing.JTextField TNIS;
    private javax.swing.JTextField TNISN;
    private javax.swing.JTextField TNOTELP;
    private javax.swing.JTable TabelSiswa;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> idspp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        String[] judul = {"NISN","NIS","Nama","Kelas","Alamat","Telepon","ID SPP"};
        model = new DefaultTableModel(judul,0);
        TabelSiswa.setModel(model);
        String sql = "SELECT * FROM siswa WHERE nisn LIKE '%"+cari.getText()+"%' OR nis LIKE '%"+cari.getText()+"%' OR nama LIKE '%"+cari.getText()+"%' OR id_kelas LIKE '%"+cari.getText()+"%' OR alamat LIKE '%"+cari.getText()+"%' OR no_telp LIKE '%"+cari.getText()+"%' OR id_spp LIKE '%"+cari.getText()+"%' ";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                String data[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)};
                model.addRow(data);
                }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    
    private void autofillKELAS() {                
       try {
           rs = con.createStatement().executeQuery("select * from kelas");
           while (rs.next()) {
               CBKELAS.addItem(rs.getString("id_kelas"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }
    
    private void autofillTAHUN() {                
       try {
           rs = con.createStatement().executeQuery("select * from spp");
           while (rs.next()) {
               idspp.addItem(rs.getString("id_spp"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }

    public void resetForm(){
        TNISN.setText("");
        TNIS.setText("");
        TNAMA.setText("");
        CBKELAS.setSelectedItem("~ Pilih Kelas");
        TALAMAT.setText("");
        TNOTELP.setText("");
        idspp.setSelectedItem("~ Angkatan Tahun");
        
        tampilkan();
        BtnSimpan.setEnabled(true);
        TNISN.setEnabled(true);
    }




}
