package dao;

import Interface.ThongKe_Interface;
import java.sql.*;
import connectDB.ConnectDB;
import java.util.ArrayList;
import util.ConvertDoubleToMoney;

public class ThongKe_dao implements ThongKe_Interface {
    private ConvertDoubleToMoney convert;

    public ThongKe_dao() {
        this.convert = new ConvertDoubleToMoney();
    }

    @Override
    public ArrayList<Object[]> getListThongKeDoanhThu() {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT\n"
                    + "    COUNT(DISTINCT ChiTietHoaDon.maSP) AS SoSanPhamDaBan,\n"
                    + "    SUM(ChiTietHoaDon.soLuong) AS TongSoLuongBan,\n"
                    + "    SUM(ChiTietHoaDon.thanhTien) AS TongGiaBan,\n"
                    + "    SUM(HoaDon.tongTien) AS TongGiaChi,\n"
                    + "    SUM(MatHangNhap.soLuongNhap * SanPham.donGia) AS TongNhapHang,\n"
                    + "    SUM(HoaDon.tongTien - (MatHangNhap.soLuongNhap * SanPham.donGia)) AS LoiNhuan\n"
                    + "FROM\n"
                    + "    HoaDon\n"
                    + "    JOIN ChiTietHoaDon ON HoaDon.maHD = ChiTietHoaDon.maHD\n"
                    + "    LEFT JOIN SanPham ON ChiTietHoaDon.maSP = SanPham.maSP\n"
                    + "    LEFT JOIN MatHangNhap ON SanPham.maSP = MatHangNhap.maSP;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int sospban = rs.getInt("SoSanPhamDaBan");
                int tongsoluong = rs.getInt("TongSoLuongBan");
                double thanhtien = rs.getDouble("TongGiaBan");
                double giachi = rs.getDouble("TongGiaChi");
                double tongnhaphang = rs.getDouble("TongNhapHang");
                double loinhuan = rs.getDouble("LoiNhuan");
                Object[] row = {sospban, tongsoluong, thanhtien, giachi, tongnhaphang, loinhuan};
                ds.add(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public ArrayList<Object[]> getListThongKeDoanhSo() {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT top 5\n"
                    + "    SanPham.maSP AS MaSanPham,\n"
                    + "    SanPham.tenSP AS TenSanPham,\n"
                    + "    SUM(ChiTietHoaDon.soLuong) AS SoLuongBan\n"
                    + "FROM\n"
                    + "    SanPham\n"
                    + "    JOIN ChiTietHoaDon ON SanPham.maSP = ChiTietHoaDon.maSP\n"
                    + "GROUP BY\n"
                    + "    SanPham.maSP, SanPham.tenSP\n"
                    + "ORDER BY\n"
                    + "    SoLuongBan DESC";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String ma = rs.getString("MaSanPham");
                String ten = rs.getString("TenSanPham");
                int soluong = rs.getInt("SoLuongBan");
                Object[] row = {ma, ten, soluong};
                ds.add(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public ArrayList<Object[]> getListThongKeDoanhSoTheoThangNam(String thangNam,String sort) {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
           String sql = "SELECT TOP 5\n"
                    + "    SanPham.maSP AS MaSanPham,\n"
                    + "    SanPham.tenSP AS TenSanPham,\n"
                    + "    SUM(ChiTietHoaDon.soLuong) AS SoLuongBan\n"
                    + "FROM\n"
                    + "    SanPham\n"
                    + "    JOIN ChiTietHoaDon ON SanPham.maSP = ChiTietHoaDon.maSP\n"
                    + "WHERE ChiTietHoaDon.maHD LIKE 'HD__' + ? + '%'\n"  // Sử dụng ? để thay thế giá trị của thangNam
                    + "GROUP BY\n"
                    + "    SanPham.maSP, SanPham.tenSP\n"
                    + "ORDER BY\n"
                    + "    SoLuongBan "+sort;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, thangNam);      
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("MaSanPham");
                String ten = rs.getString("TenSanPham");
                int soluong = rs.getInt("SoLuongBan");
                Object[] row = {ma, ten, soluong};
                ds.add(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public ArrayList<Object[]> getListDoanhThuTheoThangvaNam(String thang, String nam) {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT \n"
                    + "    ngayLapHD AS NgayBan,\n"
                    + "    COUNT(DISTINCT cthd.maSP) AS 'SoSanPhamBanDuoc',\n"
                    + "    SUM(cthd.thanhTien) AS 'DoanhThuTrongNgay'\n"
                    + "FROM \n"
                    + "    HoaDon hd\n"
                    + "JOIN \n"
                    + "    ChiTietHoaDon cthd ON hd.maHD = cthd.maHD\n"
                    + "WHERE \n"
                    + "    YEAR(ngayLapHD) = ? AND MONTH(ngayLapHD) = ?\n"
                    + "GROUP BY \n"
                    + "    ngayLapHD;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nam);
            stmt.setString(2, thang);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Date ngay = rs.getDate("NgayBan");
                int soluong = rs.getInt("SoSanPhamBanDuoc");
                double doanhthu = rs.getDouble("DoanhThuTrongNgay");
                Object[] row = {ngay, soluong, doanhthu};
                ds.add(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public ArrayList<Object[]> getListDoanhThuTrongNam(String nam) {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "	SELECT \n"
                    + "    MONTH(ngayLapHD) AS Thang,\n"
                    + "    COUNT(DISTINCT cthd.maSP) AS 'SoSanPhamBanDuoc',\n"
                    + "    SUM(cthd.thanhTien) AS 'DoanhThuTrongThang'\n"
                    + "FROM \n"
                    + "    HoaDon hd\n"
                    + "JOIN \n"
                    + "    ChiTietHoaDon cthd ON hd.maHD = cthd.maHD\n"
                    + "WHERE \n"
                    + "    YEAR(ngayLapHD) = ? \n"
                    + "GROUP BY \n"
                    + "    MONTH(ngayLapHD);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nam);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int thang = rs.getInt("Thang");
                int soluong = rs.getInt("SoSanPhamBanDuoc");
                double doanhthu = rs.getDouble("DoanhThuTrongThang");
                Object[] row = {thang, soluong, doanhthu};
                ds.add(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public ArrayList<Object[]> getListTop5NhanVienDoanhThuCaoNhat(String thang, String nam) {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
           String sql = """
                        SELECT TOP 5
                            	NV.maNV, NV.hoTen, SUM(tongTien) AS tongDoanhThu
                            FROM HoaDon AS HD  JOIN NhanVien AS NV ON HD.maNV = NV.maNV
                            WHERE MONTH(ngayLapHD) = ? AND YEAR(ngayLapHD) = ?
                            GROUP BY
                            NV.maNV, NV.hoTen
                            ORDER BY
                            tongDoanhThu DESC """; // Sử dụng ? để thay thế giá trị của thangNam
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, thang);
            stmt.setString(2, nam);      
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maNV = rs.getString("maNV");
                String hoTen = rs.getString("hoTen");
                String tongDT = rs.getString("tongDoanhThu");
                Object[] row = {maNV, hoTen , convert.toStringMoney(tongDT)};
                ds.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    

    @Override
    public ArrayList<Object[]> getListTop5KhachHangMuaHangNhieuNhat(String thang, String nam) {
        ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
           String sql = """
                        SELECT TOP 5
                                KH.maKH, KH.hoTen, SUM(tienThanhToan) AS tongDoanhThu
                            FROM HoaDon AS HD  JOIN KhachHang AS KH ON HD.maKH = KH.maKH
                            WHERE MONTH(ngayLapHD) = ? AND YEAR(ngayLapHD) = ?
                            GROUP BY
                            KH.maKH, KH.hoTen
                            ORDER BY
                            tongDoanhThu DESC """; // Sử dụng ? để thay thế giá trị của thangNam
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, thang);
            stmt.setString(2, nam);      
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("maKH");
                String hoTen = rs.getString("hoTen");
                String tongDT = rs.getString("tongDoanhThu");
                Object[] row = {maKH, hoTen ,convert.toStringMoney(tongDT)};
                ds.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

}
