/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Interface.DanhMucSanPham_Interface;
import entity.DanhMucSanPhamEntity;
import java.util.ArrayList;
import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tran Hien Vinh
 */
public class DanhMucSanPham_dao implements DanhMucSanPham_Interface{

    @Override
    public ArrayList<DanhMucSanPhamEntity> getAllDMSP() {
         ArrayList<DanhMucSanPhamEntity> dsDMSP=new ArrayList<DanhMucSanPhamEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con=ConnectDB.getConnection();
            PreparedStatement ps=null;
            String sql="select * from DanhMucSanPham";
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                String maDanhMuc=rs.getString("maDanhMuc");
                String tenDanhMuc=rs.getString("tenDanhMuc");
                DanhMucSanPhamEntity dmsp=new DanhMucSanPhamEntity(maDanhMuc, tenDanhMuc);
                dsDMSP.add(dmsp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucSanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsDMSP;
    }
    
}
