
package dao;

import entity.HoaDonEntity;
import java.util.ArrayList;
import connectDB.ConnectDB;
import entity.ChiTietHoaDonEntity;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import gui.KhuyenMai_JPanel;
import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class HoaDon_dao implements  Interface.HoaDon_Interface{
    public HoaDon_dao(){
    
}
    
    @Override
    public ArrayList<HoaDonEntity> getallHoaDon() {
        ArrayList<HoaDonEntity> dshd = new ArrayList<HoaDonEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con =ConnectDB.getConnection();
            String sql = "Select * from HoaDon";
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sql);
             while(rs.next()){
                 String ma = rs.getString("maHD");
                 Date ngayLap = rs.getDate("ngaylapHD");
                 KhachHangEntity kh = new KhachHangEntity(rs.getString("maKH"));
                 NhanVienEntity nv = new NhanVienEntity(rs.getString("maNV"));
                 ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(rs.getString("maCTKM"));
                 double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                 double tongTien = rs.getDouble("tongTien");
                 double tienThanhToan = rs.getDouble("tienThanhToan");
                 
                 HoaDonEntity hd = new HoaDonEntity(ma, ngayLap, kh, nv, ctkm, tienKhuyenMai, tongTien, tienThanhToan);
                 dshd.add(hd);
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshd;
       
    }

    @Override
    public double getTotalMoney(String maHD) {
        double total = 0;
        String sql = "select tongTien from HoaDon where maHD = ? ";
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement sta = null;
            sta =  con.prepareStatement(sql);
            sta.setString(1, maHD);
            ResultSet rs = sta.executeQuery();
            while (rs.next()){
                total = rs.getInt("tongTien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
    
    // Nguyen Huy Hoang
    @Override
    public boolean themHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD) {
        PreparedStatement statement = null;
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            
            String sql = "Insert into HoaDon(maHD, maKH, maNV, maCTKM, ngayLapHD, tienKhuyenMai, tongTien, tienThanhToan) values (?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            
            statement.setString(1, hoaDon.getMaHD());
            statement.setString(2, hoaDon.getKhachHang().getMaKH());
            statement.setString(3, hoaDon.getNhanVien().getMaNV());
            statement.setString(4, hoaDon.getChuongTrinhKM().getMaCTKM());
            statement.setDate(5, hoaDon.getNgayLapHD());
            statement.setDouble(6, hoaDon.getTienKhuyenMai());
            statement.setDouble(7, hoaDon.getTongTien());
            statement.setDouble(8, hoaDon.getTienThanhToan());
            
            int ketQua = statement.executeUpdate();
            if(ketQua < 1) {
                return false;
            }
            
            ChiTietHoaDon_dao cthd_dao = new ChiTietHoaDon_dao();
            for (ChiTietHoaDonEntity cthd : danhSachCTHD) {
                if(!cthd_dao.themChiTietHoaDon(cthd)) {
                    return false;
                }
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                statement.close();
                ConnectDB.getInstance().disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public HoaDonEntity timKiemHoaDonTheoMa(String maHD) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        
        try {
            String sql = "Select hd.*, kh.hoTen, kh.soDienThoai from HoaDon as hd inner join KhachHang as kh on hd.maKH=kh.maKH " +
            "where hd.maHD=?";
            statement = con.prepareStatement(sql);
            statement.setString(1, maHD);
            
            ResultSet rs = statement.executeQuery();
            HoaDonEntity hd = null;
            if(rs.next()) {
                String mahd = rs.getString("maHD");
                String makh = rs.getString("maKH");
                String hoTen = rs.getString("hoTen");
                String soDienThoai = rs.getString("soDienThoai");
                KhachHangEntity kh = new KhachHangEntity();
                kh.setMaKH(makh);
                kh.setHoTen(hoTen);
                kh.setSoDienThoai(soDienThoai);
                String manv = rs.getString("maNV");
                NhanVienEntity nv = new NhanVienEntity(manv);
                String mactkm = rs.getString("maCTKM");
                ChuongTrinhKhuyenMaiEntity km = new ChuongTrinhKhuyenMaiEntity(mactkm);
                Date nglap = rs.getDate("ngayLapHD");
                double tongTien = rs.getDouble("tongTien");
                double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                double tienThanhToan = rs.getDouble("tienThanhToan");
                
                hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKhuyenMai, tongTien, tienThanhToan);
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public HoaDonEntity getHoaDonTheoMaHD(String maHD) {
            HoaDonEntity hd = null;
            try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement stmt = con.prepareCall("select * from HoaDon where maHD = ?");
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                String mahd = rs.getString("maHD");
                String makh = rs.getString("maKH");
                KhachHangEntity kh = new KhachHangEntity(makh);
                String manv = rs.getString("maNV");
                NhanVienEntity nv = new NhanVienEntity(manv);
                String mactkm = rs.getString("maCTKM");
                ChuongTrinhKhuyenMaiEntity km = new ChuongTrinhKhuyenMaiEntity(mactkm);
                Date nglap = rs.getDate("ngayLapHD");
                double tongTien = rs.getDouble("tongTien");
                double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                double tienThanhToan = rs.getDouble("tienThanhToan");
                hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKhuyenMai, tongTien, tienThanhToan);
                
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
            return hd;
    }

    @Override
    public ArrayList<HoaDonEntity> getHoaDonTheoNgayLap(Date ngayLap) {
         ArrayList<HoaDonEntity> dshd = new ArrayList<HoaDonEntity>();
            try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement stmt = con.prepareCall("select * from HoaDon where ngayLapHD = ?");
            stmt.setDate(1,ngayLap);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                String mahd = rs.getString("maHD");
                String makh = rs.getString("maKH");
                KhachHangEntity kh = new KhachHangEntity(makh);
                String manv = rs.getString("maNV");
                NhanVienEntity nv = new NhanVienEntity(manv);
                String mactkm = rs.getString("maCTKM");
                ChuongTrinhKhuyenMaiEntity km = new ChuongTrinhKhuyenMaiEntity(mactkm);
                Date nglap = rs.getDate("ngayLapHD");
                double tongTien = rs.getDouble("tongTien");
                double tienKM = rs.getDouble("tienKhuyenMai");
                double tienTT = rs.getDouble("tienThanhToan");
                HoaDonEntity hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKM, tongTien, tienTT);
                dshd.add(hd);
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
            return dshd;
    }


}
