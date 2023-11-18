/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import bus.NhanVien_bus;
import connectDB.ConnectDB;
import dao.NhanVien_dao;
import entity.NhanVienEntity;
import entity.TaiKhoanEntity;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.MD5Encode;
import util.ToanCuc;

/**
 *
 * @author 84335
 */
public class DangNhap_GUI extends javax.swing.JFrame {

    private LamMoiMatKhau_GUI lammoiDangNhap_GUI = new LamMoiMatKhau_GUI();
//    private ThayDoiMatKhau_GUI thaydoimatkhau_gui = new ThayDoiMatKhau_GUI();
    private NhanVien_bus nvbus;

    /**
     * Creates new form DangNhap_GUI
     */
    public DangNhap_GUI() {
        initComponents();
        String b = "<HTML><u>Quên mật khẩu?</u></HTML>";
        jlb_QuanMatKhau.setText(b);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//icon//stores.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        jLabel1.setIcon(img_btnTimKiem);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jtf_TenTaiKhoan = new javax.swing.JTextField();
        jpf_MatKhau = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlb_TenTaiKhoan = new javax.swing.JLabel();
        jlb_MatKhau = new javax.swing.JLabel();
        jlb_QuanMatKhau = new javax.swing.JLabel();
        btn_HuyBo = new javax.swing.JButton();
        jlb_DangNhap = new javax.swing.JLabel();
        btn_DangNhap4 = new javax.swing.JButton();
        btn_DangNhap1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_TenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_TenTaiKhoan.setText("0976474170");
        jtf_TenTaiKhoan.setToolTipText("");
        jtf_TenTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_TenTaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(jtf_TenTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 180, 227, 30));

        jpf_MatKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jpf_MatKhau.setText("1111");
        jpf_MatKhau.setToolTipText("");
        getContentPane().add(jpf_MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 238, 227, 30));

        jPanel2.setBackground(new java.awt.Color(187, 205, 197));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(187, 205, 197));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        jPanel3.setBackground(new java.awt.Color(187, 205, 197));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_TenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlb_TenTaiKhoan.setText("Tên tài khoản");
        jPanel3.add(jlb_TenTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jlb_MatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlb_MatKhau.setText("Mật khẩu");
        jPanel3.add(jlb_MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jlb_QuanMatKhau.setDisplayedMnemonic('\u0001');
        jlb_QuanMatKhau.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jlb_QuanMatKhau.setForeground(new java.awt.Color(51, 153, 255));
        jlb_QuanMatKhau.setText("Quên mật khẩu?");
        jlb_QuanMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_QuanMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_QuanMatKhauMouseClicked(evt);
            }
        });
        jPanel3.add(jlb_QuanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 190, 30));

        btn_HuyBo.setBackground(new java.awt.Color(0, 51, 51));
        btn_HuyBo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_HuyBo.setForeground(new java.awt.Color(255, 255, 255));
        btn_HuyBo.setText("Hủy bỏ");
        btn_HuyBo.setBorder(null);
        btn_HuyBo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_HuyBo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HuyBoMouseClicked(evt);
            }
        });
        btn_HuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyBoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_HuyBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 120, 40));

        jlb_DangNhap.setFont(new java.awt.Font("Times New Roman", 1, 44)); // NOI18N
        jlb_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_DangNhap.setText("Đăng Nhập");
        jlb_DangNhap.setToolTipText("");
        jlb_DangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlb_DangNhap.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jlb_DangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jlb_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 400, 160));
        jlb_DangNhap.getAccessibleContext().setAccessibleParent(jlb_DangNhap);

        btn_DangNhap4.setBackground(new java.awt.Color(0, 51, 51));
        btn_DangNhap4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_DangNhap4.setForeground(new java.awt.Color(255, 255, 255));
        btn_DangNhap4.setText("Đăng nhập");
        btn_DangNhap4.setBorder(null);
        btn_DangNhap4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DangNhap4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DangNhap4MouseClicked(evt);
            }
        });
        btn_DangNhap4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhap4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_DangNhap4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 120, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 820, 440));

        btn_DangNhap1.setBackground(new java.awt.Color(0, 51, 51));
        btn_DangNhap1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_DangNhap1.setForeground(new java.awt.Color(255, 255, 255));
        btn_DangNhap1.setText("Đăng nhập");
        btn_DangNhap1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_DangNhap1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DangNhap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DangNhap1MouseClicked(evt);
            }
        });
        btn_DangNhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhap1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DangNhap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 320, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_TenTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_TenTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_TenTaiKhoanActionPerformed

    private void jlb_QuanMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_QuanMatKhauMouseClicked

        lammoiDangNhap_GUI.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_QuanMatKhauMouseClicked


    private void btn_DangNhap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DangNhap1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DangNhap1MouseClicked

    private void btn_DangNhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DangNhap1ActionPerformed

    private void btn_HuyBoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HuyBoMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HuyBoMouseClicked

    private void btn_HuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HuyBoActionPerformed

    private void btn_DangNhap4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DangNhap4MouseClicked

        try {

            String tfTK = jtf_TenTaiKhoan.getText();
            char[] pass = jpf_MatKhau.getPassword();
            String stringPass = new String(pass);
            String encodePass = MD5Encode.md5Encode(stringPass);

            dao.NhanVien_dao nv_dao = new NhanVien_dao();
            dao.TaiKhoan_dao tk_dao = new dao.TaiKhoan_dao();
            nvbus = new NhanVien_bus();
            TaiKhoanEntity tk = new TaiKhoanEntity();
            try {
                tk = tk_dao.getTaiKhoan(tfTK, encodePass);
                // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (tk == null) {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng!");
            } else {
                tk_dao.thoiGianDNGN(tk);

                NhanVienEntity nv = nvbus.getNV(tfTK);
                System.out.println(nv);
                ToanCuc tc = new ToanCuc();
                tc.setName(nv.getHoTen());
                tc.setMa(nv.getMaNV());
                tc.setChucvu(nv.getChucVu().toString());
                tc.setGioitnh(nv.getGioiTinh().toString());
                this.setVisible(false);
                gui.TrangChu_GUI trangChu_GUI = new TrangChu_GUI();
                trangChu_GUI.setVisible(true);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DangNhap_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_DangNhap4MouseClicked

    private void btn_DangNhap4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhap4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DangNhap4ActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConnectDB.getInstance().connect();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                new DangNhap_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangNhap1;
    private javax.swing.JButton btn_DangNhap4;
    private javax.swing.JButton btn_HuyBo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlb_DangNhap;
    private javax.swing.JLabel jlb_MatKhau;
    private javax.swing.JLabel jlb_QuanMatKhau;
    private javax.swing.JLabel jlb_TenTaiKhoan;
    private javax.swing.JPasswordField jpf_MatKhau;
    private javax.swing.JTextField jtf_TenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
