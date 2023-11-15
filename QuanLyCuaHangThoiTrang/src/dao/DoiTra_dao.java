/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.DoiTra_Interface;
import connectDB.ConnectDB;
import entity.DoiTraEntity;
import entity.HinhThucDoiTraEnum;
import entity.HoaDonEntity;
import entity.NhanVienEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import util.ConvertStringToEnum;

/**
 *
 * @author Admin
 */
public class DoiTra_dao implements DoiTra_Interface{
    
    public DoiTra_dao() {
        
    }
    
    @Override
    public boolean taoDoiTra(DoiTraEntity dt) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(DoiTra_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "Insert into DonYeuCauDoiTra(maDYCDT, maHD, maNV, thoiGianDoiTra, hinhThucDoiTra) values (?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);

            statement.setString(1, dt.getMaDYCDT());
            statement.setString(2, dt.getHoaDon().getMaHD());
            statement.setString(3, dt.getNhanVien().getMaNV());
            statement.setDate(4, dt.getThoiGianDoiTra());
            statement.setString(5, dt.getHinhThucDoiTra().toString());

            int ketQua = statement.executeUpdate();
            if(ketQua < 1) {
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
    public ArrayList<DoiTraEntity> getAllDoiTra() {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(DoiTra_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "Select * from DonYeuCauDoiTra";
            statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            
            ArrayList<DoiTraEntity> dtList = new ArrayList<>();
            while(rs.next()) {
                String maDYCDT = rs.getString("maDYCDT");
                String maHD = rs.getString("maHD");
                HoaDonEntity hd = new HoaDonEntity(maHD);
                String maNV = rs.getString("maNV");
                NhanVienEntity nv = new NhanVienEntity(maNV);
                Date thoiGian = rs.getDate("thoiGianDoiTra");
                String hinhThuc = rs.getString("hinhThucDoiTra");
                
                ConvertStringToEnum toEnum = new ConvertStringToEnum();
                
                DoiTraEntity dt = new DoiTraEntity(maDYCDT, hd, nv, toEnum.HinhThucDTToEnum(hinhThuc), thoiGian);
                dtList.add(dt);
            }

            return dtList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                statement.close();
                ConnectDB.getInstance().disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
