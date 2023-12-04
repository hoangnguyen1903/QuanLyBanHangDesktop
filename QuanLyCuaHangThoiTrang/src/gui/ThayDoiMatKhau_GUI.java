/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.ConnectDB;
import dao.TaiKhoan_dao;
import entity.TaiKhoanEntity;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.MD5Encode;
import util.ToanCuc;

/**
 *
 * @author 84335
 */
public class ThayDoiMatKhau_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap_GUI
     */
    public ThayDoiMatKhau_GUI() {
        initComponents();
        String a = "<HTML><u>Quên mật khẩu?</u></HTML>";
        setLocationRelativeTo(null);
        ToanCuc tc = new  ToanCuc();
        jlf_TenTaiKhoan.setText(tc.getSdt());
        jlf_TenTaiKhoan.setEnabled(false);
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
        jlb_ThayDoiMatKhau = new javax.swing.JLabel();
        jlb_MatKhauHienTai = new javax.swing.JLabel();
        jlb_TenTaiKhoan = new javax.swing.JLabel();
        jpf_MatKhauHienTai = new javax.swing.JPasswordField();
        jlf_TenTaiKhoan = new javax.swing.JLabel();
        btn_HuyBo = new javax.swing.JButton();
        btn_ThuyDoi = new javax.swing.JButton();
        jlb_MatKhauMoi = new javax.swing.JLabel();
        jpf_MatKhauMoi = new javax.swing.JPasswordField();

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
        setUndecorated(true);

        jlb_ThayDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jlb_ThayDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_ThayDoiMatKhau.setText("Thay Đổi Mật Khẩu");
        jlb_ThayDoiMatKhau.setToolTipText("");
        jlb_ThayDoiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlb_ThayDoiMatKhau.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jlb_ThayDoiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jlb_MatKhauHienTai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlb_MatKhauHienTai.setText("Mật khẩu hiện tại");

        jlb_TenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlb_TenTaiKhoan.setText("Tên tài khoản");

        jpf_MatKhauHienTai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jpf_MatKhauHienTai.setToolTipText("");

        jlf_TenTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlf_TenTaiKhoan.setText("Tên tài khoản");

        btn_HuyBo.setBackground(new java.awt.Color(0, 51, 51));
        btn_HuyBo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_HuyBo.setForeground(new java.awt.Color(255, 255, 255));
        btn_HuyBo.setText("Hủy bỏ");
        btn_HuyBo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btn_ThuyDoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_ThuyDoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_ThuyDoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThuyDoi.setText("Thay đổi");
        btn_ThuyDoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ThuyDoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ThuyDoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThuyDoiMouseClicked(evt);
            }
        });
        btn_ThuyDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThuyDoiActionPerformed(evt);
            }
        });

        jlb_MatKhauMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlb_MatKhauMoi.setText("Mật khẩu mới");

        jpf_MatKhauMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jpf_MatKhauMoi.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btn_ThuyDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_HuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_MatKhauHienTai)
                                    .addComponent(jlb_TenTaiKhoan)
                                    .addComponent(jlb_MatKhauMoi))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpf_MatKhauHienTai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpf_MatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jlf_TenTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_ThayDoiMatKhau)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlb_ThayDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_TenTaiKhoan)
                    .addComponent(jlf_TenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_MatKhauHienTai)
                    .addComponent(jpf_MatKhauHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_MatKhauMoi)
                    .addComponent(jpf_MatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThuyDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_HuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jlb_ThayDoiMatKhau.getAccessibleContext().setAccessibleParent(jlb_ThayDoiMatKhau);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HuyBoActionPerformed

    private void btn_ThuyDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThuyDoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThuyDoiActionPerformed

    private void btn_HuyBoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HuyBoMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_HuyBoMouseClicked

    private void btn_ThuyDoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThuyDoiMouseClicked
        try {                                         
            String tenTaiKhoan = jlf_TenTaiKhoan.getText();
            char[] po = jpf_MatKhauHienTai.getPassword();
            char[] pn = jpf_MatKhauMoi.getPassword();
            String oldPass = new String(po);
            String newPass = new String(pn);
            
            
            String encodeOldPass = MD5Encode.md5Encode(oldPass);       
            String encodeNewPass = MD5Encode.md5Encode(newPass);

            dao.TaiKhoan_dao tk_dao = new TaiKhoan_dao();
            entity.TaiKhoanEntity tk = new TaiKhoanEntity();
            if(tenTaiKhoan.trim().length() ==0){
                 JOptionPane.showMessageDialog(null, "Tài khoản không được rổng");
                 return;
            }else if(oldPass.trim().length() ==0){
                 JOptionPane.showMessageDialog(null, "chưa nhập mật khẩu hiện tại");
                 return;
            }else if(newPass.trim().length() ==0){
                 JOptionPane.showMessageDialog(null, "chưa nhập mật khẩu mới");
                 return;
            }
            
            
            try {
                tk = tk_dao.getTaiKhoan(tenTaiKhoan, encodeOldPass);
            } catch (SQLException ex) {
                Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(tk == null){
                JOptionPane.showMessageDialog(null, "Tài khoản và mật khẩu không khớp");
            }else {
                
                entity.TaiKhoanEntity newTK = new  TaiKhoanEntity(tenTaiKhoan, encodeNewPass);
                if(tk_dao.lamMoiMatKhau(newTK) == true){
                    JOptionPane.showMessageDialog(null, "đồi mật khẩu thành công");
                    jlf_TenTaiKhoan.setText("");
                    jpf_MatKhauHienTai.setText("");
                    jpf_MatKhauMoi.setText("");
                }
                
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ThuyDoiMouseClicked

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
            java.util.logging.Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                    ConnectDB.getInstance().connect();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                new ThayDoiMatKhau_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HuyBo;
    private javax.swing.JButton btn_ThuyDoi;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlb_MatKhauHienTai;
    private javax.swing.JLabel jlb_MatKhauMoi;
    private javax.swing.JLabel jlb_TenTaiKhoan;
    private javax.swing.JLabel jlb_ThayDoiMatKhau;
    private javax.swing.JLabel jlf_TenTaiKhoan;
    private javax.swing.JPasswordField jpf_MatKhauHienTai;
    private javax.swing.JPasswordField jpf_MatKhauMoi;
    // End of variables declaration//GEN-END:variables
}
