
package dao;

import Interface.ChuongTrinhKhuyenMai_Interface;
import connectDB.ConnectDB;
import entity.ChuongTrinhKhuyenMaiEntity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class ChuongTrinhKhuyenMai_dao implements ChuongTrinhKhuyenMai_Interface {

    public ChuongTrinhKhuyenMai_dao() {
    }

    public ArrayList<ChuongTrinhKhuyenMaiEntity> getallCTKM() {
        ArrayList<ChuongTrinhKhuyenMaiEntity> dsctkm = new ArrayList<ChuongTrinhKhuyenMaiEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "Select * from ChuongTrinhKhuyenMai";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String ma = rs.getString("maCTKM");
                String ten = rs.getString("tenCTKM");
                double sotienTT = rs.getDouble("soTienToiThieu");
                int giamgia = rs.getInt("giamGia");
                Date ngaybatdau = rs.getDate("ngayBatDau");
                Date ngayketthuc = rs.getDate("ngayKetThuc");

                ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(ma, ten, sotienTT, giamgia, ngaybatdau, ngayketthuc);
                dsctkm.add(ctkm);
            }

//            ResultSet rs = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsctkm;
    }

    @Override
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getCTKMTheoMaCTKM(String maCTKM) {
        ArrayList<ChuongTrinhKhuyenMaiEntity> dsctkm = new ArrayList<ChuongTrinhKhuyenMaiEntity>();
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT * FROM ChuongTrinhKhuyenMai WHERE maCTKM = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maCTKM);
            ResultSet  rs = stmt.executeQuery();
            while (rs.next()){
                String ma =  rs.getString("maCTKM");
                String ten = rs.getString("tenCTKm");
                Double sotien = rs.getDouble("soTienToiThieu");
                int giamgia = rs.getInt("giamGia");
                Date ngaybatdau = rs.getDate("ngayBatDau");
                Date ngayketthuc = rs.getDate("ngayKetThuc");
                ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(maCTKM, ten, sotien, giamgia, ngaybatdau, ngayketthuc);
                dsctkm.add(ctkm);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsctkm;
    }

    @Override
    public boolean create(ChuongTrinhKhuyenMaiEntity ctkm) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection con = ConnectDB.getConnection();
       PreparedStatement stmt = null;
       int n =0;
        try {
            stmt = con.prepareStatement("INSERT INTO ChuongTrinhKhuyenMai values(?,?,?,?,?,?)");
            stmt.setString(1, ctkm.getMaCTKM());
            stmt.setString(2, ctkm.getTenCTKM());
            stmt.setDouble(3, ctkm.getSoTienToiThieu());
            stmt.setInt(4, ctkm.getGiamGia());
            stmt.setDate(5, (Date) ctkm.getNgayBatDau());
            stmt.setDate(6, (Date) ctkm.getNgayKetThuc());
            n = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                stmt.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return n >0;
    }

    @Override
    public boolean delete(ChuongTrinhKhuyenMaiEntity ctkm) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection con = ConnectDB.getConnection();
       PreparedStatement stmt = null;
       int n =0;
        try {
            String sql = "DELETE FROM ChuongTrinhKhuyenMai WHERE maCTKM = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ctkm.getMaCTKM());
//            stmt.executeQuery();
            n = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return n >0;
    }

    @Override
    public boolean update(ChuongTrinhKhuyenMaiEntity ctkm) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection con = ConnectDB.getConnection();
       PreparedStatement stmt = null;
       int n =0;
        try {
            stmt = con.prepareStatement("update ChuongTrinhKhuyenMai set tenCTKM = ?,soTienToiThieu = ?,giamGia = ?,ngayBatDau = ?,ngayKetThuc = ? where maCTKM = ? ");
            stmt.setString(1, ctkm.getTenCTKM());
            stmt.setDouble(2, ctkm.getSoTienToiThieu());
            stmt.setInt(3, ctkm.getGiamGia());
            stmt.setDate(4, (Date) ctkm.getNgayBatDau());
            stmt.setDate(5,(Date)ctkm.getNgayKetThuc());
            stmt.setString(6, ctkm.getMaCTKM());
            n = stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n >0;
    }
    
    // Nguyen Huy Hoang
    public ChuongTrinhKhuyenMaiEntity kiemTraKhuyenMai(double tongTien) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        
        try {
            String sql = "Select top 1 * from ChuongTrinhKhuyenMai where getdate() between ngayBatDau and ngayKetThuc and soTienToiThieu <= ? order by giamGia desc";
            statement = con.prepareStatement(sql);
            statement.setDouble(1, tongTien);
            
            ResultSet rs = statement.executeQuery();
            ChuongTrinhKhuyenMaiEntity ctkm = null;
            if(rs.next()) {
                String maCTKM = rs.getString("maCTKM");
                String tenCTKM = rs.getString("tenCTKM");
                double soTienToiThieu = rs.getDouble("soTienToiThieu");
                int giamGia = rs.getInt("giamGia");
                Date ngayBatDau = rs.getDate("ngayBatDau");
                Date ngayKetThuc = rs.getDate("ngayKetThuc");
                
                ctkm = new ChuongTrinhKhuyenMaiEntity(maCTKM, tenCTKM, soTienToiThieu, giamGia, ngayBatDau, ngayKetThuc);
            }
            
            return ctkm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChuongTrinhKhuyenMai_dao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
