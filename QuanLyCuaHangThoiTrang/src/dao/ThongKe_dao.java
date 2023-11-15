
package dao;

import Interface.ThongKe_Interface;
import java.sql.*;
import connectDB.ConnectDB;
import java.util.ArrayList;

public class ThongKe_dao implements ThongKe_Interface{

    @Override
    public ArrayList<Object[]> getListThongKeDoanhThu() {
       ArrayList<Object[]> ds = new ArrayList<Object[]>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql ="SELECT\n" +
                        "    COUNT(DISTINCT ChiTietHoaDon.maSP) AS SoSanPhamDaBan,\n" +
                        "    SUM(ChiTietHoaDon.soLuong) AS TongSoLuongBan,\n" +
                        "    SUM(ChiTietHoaDon.thanhTien) AS TongGiaBan,\n" +
                        "    SUM(HoaDon.tongTien) AS TongGiaChi,\n" +
                        "    SUM(MatHangNhap.soLuongNhap * SanPham.donGia) AS TongNhapHang,\n" +
                        "    SUM(HoaDon.tongTien - (MatHangNhap.soLuongNhap * SanPham.donGia)) AS LoiNhuan\n" +
                        "FROM\n" +
                        "    HoaDon\n" +
                        "    JOIN ChiTietHoaDon ON HoaDon.maHD = ChiTietHoaDon.maHD\n" +
                        "    LEFT JOIN SanPham ON ChiTietHoaDon.maSP = SanPham.maSP\n" +
                        "    LEFT JOIN MatHangNhap ON SanPham.maSP = MatHangNhap.maSP;";
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
           while (rs.next()){
               int  sospban = rs.getInt("SoSanPhamDaBan");
               int tongsoluong = rs.getInt("TongSoLuongBan");
               double thanhtien = rs.getDouble("TongGiaBan");
               double giachi = rs.getDouble("TongGiaChi");
               double tongnhaphang = rs.getDouble("TongNhapHang");
               double loinhuan = rs.getDouble("LoiNhuan");
               Object[] row = {sospban,tongsoluong,thanhtien,giachi,tongnhaphang,loinhuan};
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
            String sql ="SELECT\n" +
                        "    SanPham.maSP AS MaSanPham,\n" +
                        "    SanPham.tenSP AS TenSanPham,\n" +
                        "    SUM(ChiTietHoaDon.soLuong) AS SoLuongBan\n" +
                        "FROM\n" +
                        "    SanPham\n" +
                        "    JOIN ChiTietHoaDon ON SanPham.maSP = ChiTietHoaDon.maSP\n" +
                        "GROUP BY\n" +
                        "    SanPham.maSP, SanPham.tenSP;";
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
           while (rs.next()){
               String ma = rs.getString("MaSanPham");
               String ten = rs.getString("TenSanPham");
               int soluong = rs.getInt("SoLuongBan");
               Object[] row = {ma,ten,soluong};
               ds.add(row);
               
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
}
