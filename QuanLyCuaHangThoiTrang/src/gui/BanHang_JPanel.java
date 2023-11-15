package gui;

import bus.ChuongTrinhKhuyenMai_bus;
import bus.HoaDon_bus;
import bus.KhachHang_bus;
import bus.SanPham_bus;
import entity.ChiTietHoaDonEntity;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.HoaDonEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import entity.SanPhamEntity;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.ConvertStringToEnum;
import util.GenerateID;
import util.ToanCuc;

public class BanHang_JPanel extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    private SanPham_bus sp_bus = new SanPham_bus();
    private KhachHang_bus kh_bus = new KhachHang_bus();
    private ChuongTrinhKhuyenMai_bus ctkm_bus = new ChuongTrinhKhuyenMai_bus();
    private HoaDon_bus hd_bus = new HoaDon_bus();
    
    private HoaDonEntity hoaDon = new HoaDonEntity();
    private ArrayList<ChiTietHoaDonEntity> cthdList = new ArrayList<ChiTietHoaDonEntity>();
    private ToanCuc tc = new ToanCuc();
    private ConvertStringToEnum toEnum = new ConvertStringToEnum();

    public BanHang_JPanel() {
        initComponents();
         setBounds(0, 0, 1020, 720);
         
        ImageIcon img_btnTimKiemSanPham = new ImageIcon("src//pic//icon//buttonTimKiem.png");
        Image scaled_btnTimKiemSanPham = img_btnTimKiemSanPham.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiemSanPham = new ImageIcon(scaled_btnTimKiemSanPham);
        btn_TimKiemSanPham.setIcon(img_btnTimKiemSanPham);
        
        ImageIcon img_btnTimKiemKhachHang = new ImageIcon("src//pic//icon//buttonTimKiem.png");
        Image scaled_btnTimKiemKhachHang = img_btnTimKiemKhachHang.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiemKhachHang = new ImageIcon(scaled_btnTimKiemKhachHang);
        btn_TimKiemKhachHang.setIcon(img_btnTimKiemKhachHang);
        
        ImageIcon img_btnThemVaoGio = new ImageIcon("src//pic//icon//buttonThem.png");
        Image scaled_btnThemVaoGio = img_btnThemVaoGio.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnThemVaoGio = new ImageIcon(scaled_btnThemVaoGio);
        btn_ThemVaoGio.setIcon(img_btnThemVaoGio);
        
        ImageIcon img_btnXoaKhoiGio = new ImageIcon("src//pic//icon//buttonXoa.png");
        Image scaled_btnXoaKhoiGio = img_btnXoaKhoiGio.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnXoaKhoiGio = new ImageIcon(scaled_btnXoaKhoiGio);
        btn_XoaKhoiGio.setIcon(img_btnXoaKhoiGio);
        
        ImageIcon img_btnLamMoi = new ImageIcon("src//pic//icon//buttonLamMoi.png");
        Image scaled_btnLamMoi = img_btnLamMoi.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLamMoi = new ImageIcon(scaled_btnLamMoi);
        btn_LamMoi.setIcon(img_btnLamMoi);
        
        ImageIcon img_btnTaoHoaDon = new ImageIcon("src//pic//icon//buttonThem.png");
        Image scaled_btnTaoHoaDon = img_btnTaoHoaDon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTaoHoaDon = new ImageIcon(scaled_btnTaoHoaDon);
        btn_TaoHoaDon.setIcon(img_btnTaoHoaDon);
        
        ImageIcon img_btnTinh = new ImageIcon("src//pic//icon//buttonThem.png");
        Image scaled_btnTinh = img_btnTinh.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTinh = new ImageIcon(scaled_btnTinh);
        btn_Tinh.setIcon(img_btnTinh);
        
        String[] cols = {"Mã sản phẩm", "Tên sản phẩm", "Kích thước", "Màu sắc", "Số lượng", "Giá bán", "Thành tiền"};
        tableModel = new DefaultTableModel(cols, 0);
        table_GioHang.setModel(tableModel);
        
//        lbl_ThueVAT.setText(THUE_VAT+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_BH = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_MaSanPham = new javax.swing.JTextField();
        btn_TimKiemSanPham = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_TenSanPham = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_KichThuoc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_ChatLieu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_MauSac = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_ThuongHieu = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_DanhMuc = new javax.swing.JLabel();
        btn_ThemVaoGio = new javax.swing.JButton();
        btn_XoaKhoiGio = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lbl_MaSanPham = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spinner_SoLuong = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lbl_DonGia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_GioHang = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        btn_TimKiemKhachHang = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lbl_MaKhachHang = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_TenKhachHang = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_TongTien = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl_KhuyenMai = new javax.swing.JLabel();
        lbl_ThueVAT = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_TienThanhToan = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_TienNhan = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btn_Tinh = new javax.swing.JButton();
        lbl_TienTraLai = new javax.swing.JLabel();
        btn_LamMoi = new javax.swing.JButton();
        btn_TaoHoaDon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_KhuyenMai1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 205, 197));

        lbl_BH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_BH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_BH.setText("QUẢN LÝ BÁN HÀNG");
        jPanel1.add(lbl_BH);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 50));

        jPanel2.setBackground(new java.awt.Color(187, 205, 197));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Mã sản phẩm");

        btn_TimKiemSanPham.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiemSanPham.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TimKiemSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiemSanPham.setText("Tìm kiếm");
        btn_TimKiemSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_TimKiemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemSanPhamActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Tên sản phẩm");

        lbl_TenSanPham.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Kích thước");

        lbl_KichThuoc.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Chất liệu");

        lbl_ChatLieu.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Màu sắc");

        lbl_MauSac.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Thương hiệu");

        lbl_ThuongHieu.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("Danh mục");

        lbl_DanhMuc.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        btn_ThemVaoGio.setBackground(new java.awt.Color(0, 51, 51));
        btn_ThemVaoGio.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_ThemVaoGio.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThemVaoGio.setText("Thêm vào giỏ");
        btn_ThemVaoGio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_ThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemVaoGioActionPerformed(evt);
            }
        });

        btn_XoaKhoiGio.setBackground(new java.awt.Color(204, 0, 0));
        btn_XoaKhoiGio.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_XoaKhoiGio.setForeground(new java.awt.Color(255, 255, 255));
        btn_XoaKhoiGio.setText("Xoá khỏi giỏ");
        btn_XoaKhoiGio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_XoaKhoiGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaKhoiGioActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setText("Mã sản phẩm");

        lbl_MaSanPham.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setText("Số lượng");

        spinner_SoLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Đơn giá");

        lbl_DonGia.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_TimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(spinner_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_DonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_XoaKhoiGio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_MauSac, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaKhoiGio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(spinner_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(lbl_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lbl_ThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lbl_DanhMuc)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1000, 140));

        jPanel3.setBackground(new java.awt.Color(187, 205, 197));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_GioHang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_GioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên sản phẩm", "Kích thước", "Màu sắc", "Số lượng", "Giá bán", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_GioHang);
        if (table_GioHang.getColumnModel().getColumnCount() > 0) {
            table_GioHang.getColumnModel().getColumn(0).setResizable(false);
            table_GioHang.getColumnModel().getColumn(0).setPreferredWidth(150);
            table_GioHang.getColumnModel().getColumn(1).setResizable(false);
            table_GioHang.getColumnModel().getColumn(1).setPreferredWidth(150);
            table_GioHang.getColumnModel().getColumn(2).setResizable(false);
            table_GioHang.getColumnModel().getColumn(2).setPreferredWidth(20);
            table_GioHang.getColumnModel().getColumn(3).setResizable(false);
            table_GioHang.getColumnModel().getColumn(3).setPreferredWidth(50);
            table_GioHang.getColumnModel().getColumn(4).setResizable(false);
            table_GioHang.getColumnModel().getColumn(4).setPreferredWidth(20);
            table_GioHang.getColumnModel().getColumn(5).setResizable(false);
            table_GioHang.getColumnModel().getColumn(5).setPreferredWidth(100);
            table_GioHang.getColumnModel().getColumn(6).setResizable(false);
            table_GioHang.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 290));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1000, 320));

        jPanel4.setBackground(new java.awt.Color(187, 205, 197));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Số điện thoại");

        btn_TimKiemKhachHang.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiemKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TimKiemKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiemKhachHang.setText("Tìm kiếm");
        btn_TimKiemKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_TimKiemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemKhachHangActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Mã khách hàng");

        lbl_MaKhachHang.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Tên khách hàng");

        lbl_TenKhachHang.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setText("Số điện thoại");

        lbl_SoDienThoai.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setText("Địa chỉ");

        lbl_DiaChi.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setText("Tổng tiền");

        lbl_TongTien.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lbl_TongTien.setText("0");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("Khuyến mãi");

        lbl_KhuyenMai.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        lbl_ThueVAT.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Tiền phải thanh toán");

        lbl_TienThanhToan.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lbl_TienThanhToan.setText("0");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel33.setText("Tiền nhận");

        txt_TienNhan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Tiền trả lại");

        btn_Tinh.setBackground(new java.awt.Color(0, 51, 51));
        btn_Tinh.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Tinh.setForeground(new java.awt.Color(255, 255, 255));
        btn_Tinh.setText("Tính");
        btn_Tinh.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TinhActionPerformed(evt);
            }
        });

        lbl_TienTraLai.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lbl_TienTraLai.setText("0");

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_LamMoi.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_LamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        btn_TaoHoaDon.setBackground(new java.awt.Color(0, 51, 51));
        btn_TaoHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TaoHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_TaoHoaDon.setText("Tạo hoá đơn");
        btn_TaoHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_TaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoHoaDonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel5.setText("VND");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel7.setText("VND");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel9.setText("VND");

        lbl_KhuyenMai1.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lbl_KhuyenMai1.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(txt_TienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_KhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_KhuyenMai1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lbl_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lbl_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(267, 267, 267)
                                        .addComponent(lbl_ThueVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_TienTraLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_TienThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_TimKiemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_TaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btn_TimKiemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ThueVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_KhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(lbl_TienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(lbl_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_KhuyenMai1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(btn_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)))
                .addContainerGap())
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 1000, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TimKiemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemSanPhamActionPerformed
        timKiemSanPham();
    }//GEN-LAST:event_btn_TimKiemSanPhamActionPerformed

    private void btn_ThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemVaoGioActionPerformed
        themVaoGioHang();
    }//GEN-LAST:event_btn_ThemVaoGioActionPerformed

    private void btn_XoaKhoiGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaKhoiGioActionPerformed
        xoaKhoiGioHang();
    }//GEN-LAST:event_btn_XoaKhoiGioActionPerformed

    private void btn_TimKiemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemKhachHangActionPerformed
        timKiemKhachHang();
    }//GEN-LAST:event_btn_TimKiemKhachHangActionPerformed

    private void btn_TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TinhActionPerformed
        tinhTien();
    }//GEN-LAST:event_btn_TinhActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        lamMoi();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_TaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoHoaDonActionPerformed
        taoHoaDon();
    }//GEN-LAST:event_btn_TaoHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_TaoHoaDon;
    private javax.swing.JButton btn_ThemVaoGio;
    private javax.swing.JButton btn_TimKiemKhachHang;
    private javax.swing.JButton btn_TimKiemSanPham;
    private javax.swing.JButton btn_Tinh;
    private javax.swing.JButton btn_XoaKhoiGio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BH;
    private javax.swing.JLabel lbl_ChatLieu;
    private javax.swing.JLabel lbl_DanhMuc;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_DonGia;
    private javax.swing.JLabel lbl_KhuyenMai;
    private javax.swing.JLabel lbl_KhuyenMai1;
    private javax.swing.JLabel lbl_KichThuoc;
    private javax.swing.JLabel lbl_MaKhachHang;
    private javax.swing.JLabel lbl_MaSanPham;
    private javax.swing.JLabel lbl_MauSac;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenKhachHang;
    private javax.swing.JLabel lbl_TenSanPham;
    private javax.swing.JLabel lbl_ThueVAT;
    private javax.swing.JLabel lbl_ThuongHieu;
    private javax.swing.JLabel lbl_TienThanhToan;
    private javax.swing.JLabel lbl_TienTraLai;
    private javax.swing.JLabel lbl_TongTien;
    private javax.swing.JSpinner spinner_SoLuong;
    private javax.swing.JTable table_GioHang;
    private javax.swing.JTextField txt_MaSanPham;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TienNhan;
    // End of variables declaration//GEN-END:variables
    public void timKiemSanPham() {
        String maSP = txt_MaSanPham.getText().trim();
        if(maSP.equals("")) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm chưa nhập !");
            return;
        }
        SanPhamEntity sanPham = sp_bus.timKiemSanPham(maSP);
        if(sanPham != null) {
            lbl_MaSanPham.setText(sanPham.getMaSP());
            lbl_TenSanPham.setText(sanPham.getTenSP());
            lbl_KichThuoc.setText(sanPham.getKichThuoc().toString());
            lbl_ChatLieu.setText(sanPham.getChatLieu().getTenChatLieu());
            lbl_MauSac.setText(sanPham.getMauSac().toString());
            lbl_ThuongHieu.setText(sanPham.getThuongHieu().getTenThuongHieu());
            lbl_DanhMuc.setText(sanPham.getDanhMucSanPham().getTenDanhMuc());
            lbl_DonGia.setText(sanPham.getDonGia()+"");
        } else {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm không tồn tại!");
        }
    }
    
    public void timKiemKhachHang() {
        String soDienThoai = txt_SoDienThoai.getText().trim();
        if(soDienThoai.equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại chưa nhập !");
            return;
        }
        KhachHangEntity khachHang = kh_bus.timKiemTheoSDT(soDienThoai);
        if(khachHang != null) {
            lbl_MaKhachHang.setText(khachHang.getMaKH());
            lbl_TenKhachHang.setText(khachHang.getHoTen());
            lbl_SoDienThoai.setText(khachHang.getSoDienThoai());
            lbl_DiaChi.setText(khachHang.getDiaChi());
            
            txt_SoDienThoai.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại !");
        }
    }
    
    public void themVaoGioHang() {
        String maSP = lbl_MaSanPham.getText().trim();
        String tenSP = lbl_TenSanPham.getText().trim();
        String kichThuoc = lbl_KichThuoc.getText().trim();
        String mauSac = lbl_MauSac.getText().trim();
        int soLuong = Integer.parseInt(spinner_SoLuong.getValue().toString());
        String donGia = lbl_DonGia.getText().trim();
        
        if(maSP.equals("") || tenSP.equals("") || kichThuoc.equals("") || mauSac.equals("") || donGia.equals("")) {
            JOptionPane.showMessageDialog(this, "Sản phẩm chưa được tìm thấy !");
            return;
        }
        
        if(soLuong <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0 !");
            return;
        
        }    
            
        boolean flag = false;
        for (ChiTietHoaDonEntity chiTietHD : cthdList) {
            if(chiTietHD.getSanPham().getMaSP().equals(maSP)) {
                  chiTietHD.setSoLuong(chiTietHD.getSoLuong() + soLuong);
                  chiTietHD.setThanhTien();
                  flag = true;
                  break;
            }
        }
        if(!flag) {
            SanPhamEntity sanPham = new SanPhamEntity();
            sanPham.setMaSP(maSP);
            sanPham.setTenSP(tenSP);
            sanPham.setKichThuoc(toEnum.KichThuoctoEnum(kichThuoc));
            sanPham.setMauSac(toEnum.MauSactoEnum(mauSac));
            sanPham.setDonGia(Double.parseDouble(donGia));

            ChiTietHoaDonEntity cthd = new ChiTietHoaDonEntity();
            cthd.setSanPham(sanPham);
            cthd.setGiaBan();
            cthd.setSoLuong(soLuong);
            cthd.setThanhTien();
            cthdList.add(cthd);   
        }
        
        importGioHang();
        txt_MaSanPham.setText("");
        spinner_SoLuong.setValue(0);
        
        tinhTienGioHang();
        
        lbl_MaSanPham.setText("");
        lbl_TenSanPham.setText("");
        lbl_KichThuoc.setText("");
        lbl_MauSac.setText("");
        lbl_ThuongHieu.setText("");
        lbl_ChatLieu.setText("");
        lbl_DanhMuc.setText("");
        lbl_DonGia.setText("");
    }
    
    private void importGioHang() {
        tableModel.setRowCount(0);
        for (ChiTietHoaDonEntity cthd : cthdList) {
            String[] data = {cthd.getSanPham().getMaSP(), cthd.getSanPham().getTenSP(), cthd.getSanPham().getKichThuoc().toString(), cthd.getSanPham().getMauSac().toString(), cthd.getSoLuong()+"", cthd.getGiaBan()+"", cthd.getThanhTien()+""};
            tableModel.addRow(data);
        }
    }
    
    public void xoaKhoiGioHang() {
        int row = table_GioHang.getSelectedRow();
        String maSP = table_GioHang.getValueAt(row, 0).toString();
        ChiTietHoaDonEntity chiTietHoaDon = new ChiTietHoaDonEntity();
        for (ChiTietHoaDonEntity cthd : cthdList) {
            if(cthd.getSanPham().getMaSP().equals(maSP)) {
                chiTietHoaDon = cthd;
                break;
            }
        }
        cthdList.remove(chiTietHoaDon);
        
        if(row < 0) {
            JOptionPane.showMessageDialog(this, "Sản phẩm chưa được chọn !");
            return;
        }
        tableModel.removeRow(row);
        tinhTienGioHang();
    }
    
    public void tinhTienGioHang() {
        double tongTien=0;
        for(int i = 0; i <= table_GioHang.getRowCount() -1; i++) {
               double thanhTien = Double.parseDouble(table_GioHang.getValueAt(i, 6).toString());
               tongTien+=thanhTien;
        }
        lbl_TongTien.setText(tongTien+"");
        
        ChuongTrinhKhuyenMaiEntity ctkm = ctkm_bus.kiemTraKhuyenMai(tongTien);
        if(ctkm != null) {
            lbl_KhuyenMai.setText(ctkm.getGiamGia()+""); 
            hoaDon.setChuongTrinhKM(ctkm);
        } else {
            lbl_KhuyenMai.setText("0"); 
            hoaDon.setChuongTrinhKM(new ChuongTrinhKhuyenMaiEntity("KM081123230307"));
        }
        hoaDon.setTongTien(tongTien);
        hoaDon.setTienKhuyenMai();
        hoaDon.setTienThanhToan();
        double tienThanhToan = hoaDon.getTienThanhToan();
        
        lbl_TienThanhToan.setText(tienThanhToan+"");
    }
    
    public void taoHoaDon() {
        int rowCount = table_GioHang.getRowCount();
        if(rowCount == 0) {
            JOptionPane.showMessageDialog(this, "Giỏ hàng chưa có sản phẩm !");
            return;
        }
        String maKH = lbl_MaKhachHang.getText().trim();
        String hoTen = lbl_TenKhachHang.getText().trim();
        String sdt = lbl_SoDienThoai.getText().trim();
        String diaChi = lbl_DiaChi.getText().trim();
        if(maKH.equals("") || hoTen.equals("") || sdt.equals("") || diaChi.equals("")) {
            JOptionPane.showMessageDialog(this, "Thông tin khách hàng chưa có !");
            return;
        } 
        
        if(lbl_TienTraLai.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Khách hàng chưa thanh toán !");
            return;
        }
        
        GenerateID generateID = new GenerateID();
        hoaDon.setMaHD(generateID.sinhMa("HD"));
        KhachHangEntity khachHang = new KhachHangEntity(maKH);
        hoaDon.setKhachHang(khachHang);
        // Nhan Vien
        NhanVienEntity nhanVien = new NhanVienEntity(tc.getMa());
        hoaDon.setNhanVien(nhanVien);
        hoaDon.setNgayLapHD(new java.sql.Date(new Date().getTime()));
        
        for (ChiTietHoaDonEntity cthd : cthdList) {
            cthd.setHoaDon(hoaDon);
        }
        
        if(hd_bus.themHoaDon(hoaDon, cthdList)) {
            JOptionPane.showMessageDialog(this, "Tạo hoá đơn thành công !");
            lamMoi();
            
        } else {
            JOptionPane.showMessageDialog(this, "Tạo hoá đơn thất bại !");
        }
    }
    
    public void lamMoi() {
        lbl_MaSanPham.setText("");
        lbl_TenSanPham.setText("");
        lbl_KichThuoc.setText("");
        lbl_MauSac.setText("");
        lbl_ThuongHieu.setText("");
        lbl_ChatLieu.setText("");
        lbl_DanhMuc.setText("");
        lbl_DonGia.setText("");
        
        table_GioHang.clearSelection();
        hoaDon = new HoaDonEntity();
        cthdList = new ArrayList<ChiTietHoaDonEntity>();
        importGioHang();
        
        lbl_MaKhachHang.setText("");
        lbl_TenKhachHang.setText("");
        lbl_SoDienThoai.setText("");
        lbl_DiaChi.setText("");
        lbl_TongTien.setText("0.0");
        lbl_KhuyenMai.setText("0");
        lbl_TienThanhToan.setText("0.0");
        lbl_TienTraLai.setText("0.0");
    }
    
    public void tinhTien() {
        String tienNhan = txt_TienNhan.getText().trim();
        if(tienNhan.equals("")) {
            JOptionPane.showMessageDialog(this, "Tiền nhận chưa nhập !");
            return;
        }
        double tienNhanKH = Double.parseDouble(tienNhan);
        double tienThanhToan = Double.parseDouble(lbl_TienThanhToan.getText());
        
        if(tienNhanKH < tienThanhToan) {
            JOptionPane.showMessageDialog(this, "Tiền nhận phải lớn hơn hoặc bằng tiền phải thanh toán !");
            return;
        }
        
        double tienTraLai = tienNhanKH - tienThanhToan;
        lbl_TienTraLai.setText(tienTraLai+"");
    }

}
