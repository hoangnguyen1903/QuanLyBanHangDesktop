
package gui;

import bus.ChiTietHoaDon_bus;
import bus.SanPham_bus;
import connectDB.ConnectDB;
import entity.ChiTietHoaDonEntity;
import entity.SanPhamEntity;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import util.HoaDon_toancuc;

/**
 *
 * @author 84335
 */
public class ChiTietHoaDon_GUI extends javax.swing.JFrame {
    
     public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            private ChiTietHoaDon_GUI frame;
            public void run() {
                try {
                    frame = new ChiTietHoaDon_GUI();
//                     frame.setUndecorated(true);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
    }
    private final ChiTietHoaDon_bus cthdbus;
    private DefaultTableModel model;
    private SanPham_bus spbus;
    private HoaDon_JPanel HDPanel;


    /**
     * Creates new form ChiTietHoaDon_GUI
     */
    public ChiTietHoaDon_GUI() {
           try {
            ConnectDB.getInstance().connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
        cthdbus = new ChiTietHoaDon_bus();
        HoaDon_toancuc hdtc = new HoaDon_toancuc();
       if(hdtc == null) JOptionPane.showMessageDialog(null, "HoaDon ToanCuc rỗng !");
       else {
           System.out.println(" MÃ hoá đơn" + hdtc.getMaHD());
        lbl_MaHoaDon.setText(hdtc.getMaHD());
        lbl_MaKhachHang.setText(hdtc.getMaKH());
        lbl_MaNhanVien.setText(hdtc.getMaNV());
        lbl_NgayLapHoaDon.setText(hdtc.getNgayLap());
       }
        lbl_IConExit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
        
          DocDuLieuSQLvaoTable();

    }

    private void DocDuLieuSQLvaoTable() {
    ArrayList<ChiTietHoaDonEntity> listCTHD = cthdbus.getallCTHD();
    int sl = 0;
        try {
            
            String maHD = lbl_MaHoaDon.getText();
            ArrayList<SanPhamEntity> allSP = new ArrayList<SanPhamEntity>(); // Danh sách tất cả sản phẩm
             allSP = cthdbus.getSanPhamTheoMaHD(maHD);
             System.out.println(allSP);
            for(SanPhamEntity sp: allSP){
                listCTHD = cthdbus.getCTHDTheoMaHDvaMaSP(maHD, sp.getMaSP());
                for(ChiTietHoaDonEntity ct: listCTHD){
                    System.out.println(sl);
                addRows(new Object[]{sp.getTenSP(),sp.getKichThuoc(),sp.getMauSac(),ct.getSoLuong(),ct.getGiaBan(),ct.getThanhTien()});
                }
            }
           TongTien();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hoá đơn cần xem !");
            e.printStackTrace();
        }
   

}

       public void addRows (Object[] row){
        model = (DefaultTableModel) table.getModel();
        model.addRow(row);
   } 
    public boolean getHD(String maHD,String maKH,String maNV,String ngayLap ){
//        lbl_MaHoaDon.setText(maHD);
//        lbl_MaKhachHang.setText(maKH);
//        lbl_MaNhanVien.setText(maNV);
//        lbl_NgayLapHoaDon.setText(ngayLap);
        return false;
    }
    public void TongTien(){
        double tt =0;
        try {
            int row = table.getRowCount();
            for (int i = 0; i < row ; i++) {
                tt += Double.parseDouble(table.getValueAt(i, 5).toString());
            }
            lblTongTien.setText(tt+" đ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_IConExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_MaKhachHang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_MaHoaDon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_MaNhanVien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_NgayLapHoaDon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_XacNhan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 205, 197));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_IConExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_IConExitMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_IConExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        jPanel2.setBackground(new java.awt.Color(187, 205, 197));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CHI TIẾT HÓA ĐƠN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Mã Khách Hàng");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 30));

        lbl_MaKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_MaKhachHang.setText("KH20202278");
        jPanel2.add(lbl_MaKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Mã Hóa Đơn");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, 30));

        lbl_MaHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_MaHoaDon.setText("HD120923091230");
        jPanel2.add(lbl_MaHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Mã Nhân Viên");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 30));

        lbl_MaNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_MaNhanVien.setText("NV29097654");
        jPanel2.add(lbl_MaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 110, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Ngày Lập Hóa Đơn");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 110, 30));

        lbl_NgayLapHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_NgayLapHoaDon.setText("21/10/2023");
        jPanel2.add(lbl_NgayLapHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 110, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Kích Thước", "Màu Sắc", "Số Lượng", "Giá bán", "Thành tiền"
            }
        ));
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 760, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Tổng Tiền");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 80, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("0");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 100, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Thuế VAT");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 80, 30));

        lblTongTien.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTongTien.setText("1000.000.000");
        jPanel2.add(lblTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 100, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Khuyến Mãi");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("0");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 100, 30));

        btn_XacNhan.setBackground(new java.awt.Color(0, 51, 51));
        btn_XacNhan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_XacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btn_XacNhan.setText("Xác Nhận");
        btn_XacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_XacNhanMouseClicked(evt);
            }
        });
        jPanel2.add(btn_XacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 680));

        jPanel3.setBackground(new java.awt.Color(187, 205, 197));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 800, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_IConExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IConExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_IConExitMouseClicked

    private void btn_XacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XacNhanMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_XacNhanMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lbl_IConExit;
    private javax.swing.JLabel lbl_MaHoaDon;
    private javax.swing.JLabel lbl_MaKhachHang;
    private javax.swing.JLabel lbl_MaNhanVien;
    private javax.swing.JLabel lbl_NgayLapHoaDon;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
