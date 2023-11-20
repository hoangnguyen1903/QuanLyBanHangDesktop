
package dao;

import entity.HoaDonEntity;
import java.util.ArrayList;
import connectDB.ConnectDB;
import entity.ChiTietHoaDonEntity;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConvertStringToEnum;

/**
 *
 * @author DELL
 */
public class HoaDon_dao implements  Interface.HoaDon_Interface{
    
    private ConvertStringToEnum toEnum = new ConvertStringToEnum();
    
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
                 String tinhTrang = rs.getString("tinhTrang");
                 
                 ConvertStringToEnum toEnum = new ConvertStringToEnum();
                 
                 HoaDonEntity hd = new HoaDonEntity(ma, ngayLap, kh, nv, ctkm, tienKhuyenMai, tongTien, tienThanhToan, toEnum.TinhTrangHDToEnum(tinhTrang));
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
            
            String sql = "Insert into HoaDon(maHD, maKH, maNV, maCTKM, ngayLapHD, tienKhuyenMai, tongTien, tienThanhToan, tinhTrang) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            
            statement.setString(1, hoaDon.getMaHD());
            statement.setString(2, hoaDon.getKhachHang().getMaKH());
            statement.setString(3, hoaDon.getNhanVien().getMaNV());
            statement.setString(4, hoaDon.getChuongTrinhKM().getMaCTKM());
            statement.setDate(5, hoaDon.getNgayLapHD());
            statement.setDouble(6, hoaDon.getTienKhuyenMai());
            statement.setDouble(7, hoaDon.getTongTien());
            statement.setDouble(8, hoaDon.getTienThanhToan());
            statement.setString(9, "Đã thanh toán");
            
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
    
    @Override
    public boolean luuTamHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD) {
        PreparedStatement statement = null;
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            
            String sql = "Insert into HoaDon(maHD, maKH, maNV, maCTKM, ngayLapHD, tienKhuyenMai, tongTien, tienThanhToan, tinhTrang) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            
            statement.setString(1, hoaDon.getMaHD());
            statement.setString(2, hoaDon.getKhachHang().getMaKH());
            statement.setString(3, hoaDon.getNhanVien().getMaNV());
            statement.setString(4, hoaDon.getChuongTrinhKM().getMaCTKM());
            statement.setDate(5, hoaDon.getNgayLapHD());
            statement.setDouble(6, hoaDon.getTienKhuyenMai());
            statement.setDouble(7, hoaDon.getTongTien());
            statement.setDouble(8, hoaDon.getTienThanhToan());
            statement.setString(9, "Chưa thanh toán");
            
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
    
    @Override
    public boolean themHoaDonLuuTam(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD) {
        PreparedStatement statement = null;
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            
            String sql = "Update HoaDon set maNV=?, maCTKM=?, ngayLapHD=?, tienKhuyenMai=?, tongTien=?, tienThanhToan=?, tinhTrang=? where maHD=? and maKH=?";
            statement = con.prepareStatement(sql);
            
            statement.setString(1, hoaDon.getNhanVien().getMaNV());
            statement.setString(2, hoaDon.getChuongTrinhKM().getMaCTKM());
            statement.setDate(3, hoaDon.getNgayLapHD());
            statement.setDouble(4, hoaDon.getTienKhuyenMai());
            statement.setDouble(5, hoaDon.getTongTien());
            statement.setDouble(6, hoaDon.getTienThanhToan());
            statement.setString(7, "Đã thanh toán");
            statement.setString(8, hoaDon.getMaHD());
            statement.setString(9, hoaDon.getKhachHang().getMaKH());
            
            int ketQua = statement.executeUpdate();
            if(ketQua < 1) {
                return false;
            }
            
            ChiTietHoaDon_dao cthd_dao = new ChiTietHoaDon_dao();
            boolean kq = cthd_dao.xoaCTHDTheoMaHoaDon(hoaDon.getMaHD());
            
            if(kq) {
                for (ChiTietHoaDonEntity cthd : danhSachCTHD) {
                    if(!cthd_dao.themChiTietHoaDon(cthd)) {
                        return false;
                    }
                }
            } else {
                return false;
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

    @Override
    public ArrayList<HoaDonEntity> timKiemHoaDonChuaThanhToan(String sdt) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        
        try {
            String sql = "Select hd.*, kh.hoTen, kh.gioiTinh, kh.diaChi from HoaDon as hd inner join KhachHang as kh on hd.maKH=kh.maKH " +
            "where kh.soDienThoai=? and hd.tinhTrang=N'Chưa thanh toán' ";
            statement = con.prepareStatement(sql);
            statement.setString(1, sdt);
            
            ResultSet rs = statement.executeQuery();
            ArrayList<HoaDonEntity> hdList = new ArrayList<>();
            while(rs.next()) {
                String mahd = rs.getString("maHD");
                String makh = rs.getString("maKH");
                String hoTen = rs.getString("hoTen");
                String gioiTinh = rs.getString("gioiTinh");
                String diaChi = rs.getString("diaChi");
                KhachHangEntity kh = new KhachHangEntity();
                kh.setMaKH(makh);
                kh.setHoTen(hoTen);
                kh.setGioiTinh(toEnum.GioiTinhtoEnum(gioiTinh));
                kh.setDiaChi(diaChi);
                
                String manv = rs.getString("maNV");
                NhanVienEntity nv = new NhanVienEntity(manv);
                String mactkm = rs.getString("maCTKM");
                ChuongTrinhKhuyenMaiEntity km = new ChuongTrinhKhuyenMaiEntity(mactkm);
                Date nglap = rs.getDate("ngayLapHD");
                double tongTien = rs.getDouble("tongTien");
                double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                double tienThanhToan = rs.getDouble("tienThanhToan");
                
                HoaDonEntity hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKhuyenMai, tongTien, tienThanhToan, toEnum.TinhTrangHDToEnum("Chưa thanh toán"));
                hdList.add(hd);
            }
            return hdList;
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
            "where hd.maHD=? and tinhTrang=N'Đã thanh toán' ";
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
                System.out.println(mactkm+"");
                ChuongTrinhKhuyenMaiEntity km = new ChuongTrinhKhuyenMaiEntity(mactkm);
                Date nglap = rs.getDate("ngayLapHD");
                double tongTien = rs.getDouble("tongTien");
                double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                double tienThanhToan = rs.getDouble("tienThanhToan");
                String tinhTrang = rs.getString("tinhTrang");
                
                hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKhuyenMai, tongTien, tienThanhToan, toEnum.TinhTrangHDToEnum(tinhTrang));
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
    public int getSoLuongTonTheoMa(String maSP) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        
        try {
            String sql = "Select soLuongTonKho from SanPham where maSP=?";
            statement = con.prepareStatement(sql);
            statement.setString(1, maSP);
            
            ResultSet rs = statement.executeQuery();
            int soLuong=-1;
            if(rs.next()) {
                soLuong = rs.getInt("soLuongTonKho");
                
            }
            return soLuong;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
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
                String tinhTrang = rs.getString("tinhTrang");
                
                hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKhuyenMai, tongTien, tienThanhToan, toEnum.TinhTrangHDToEnum(tinhTrang));
                
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
                String tinhTrang = rs.getString("tinhTrang");
                
                HoaDonEntity hd = new HoaDonEntity(mahd, nglap, kh, nv, km, tienKM, tongTien, tienTT, toEnum.TinhTrangHDToEnum(tinhTrang));
                dshd.add(hd);
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
            return dshd;
    }

}
