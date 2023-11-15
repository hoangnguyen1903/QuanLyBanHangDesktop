/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import Interface.ChuongTrinhKhuyenMai_Interface;
import dao.ChuongTrinhKhuyenMai_dao;
import entity.ChuongTrinhKhuyenMaiEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChuongTrinhKhuyenMai_bus implements ChuongTrinhKhuyenMai_Interface{
    ChuongTrinhKhuyenMai_dao ctkm_dao = new ChuongTrinhKhuyenMai_dao();
    @Override
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getallCTKM() {
       return ctkm_dao.getallCTKM();
    }

    @Override
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getCTKMTheoMaCTKM(String maCTKM) {
       return ctkm_dao.getCTKMTheoMaCTKM(maCTKM);
    }

    @Override
    public boolean create(ChuongTrinhKhuyenMaiEntity ctkm) {
        return ctkm_dao.create(ctkm);
    }

    @Override
    public boolean delete(ChuongTrinhKhuyenMaiEntity ctkm) {
       return ctkm_dao.delete(ctkm);
    }

    @Override
    public boolean update(ChuongTrinhKhuyenMaiEntity ctkm) {
       return ctkm_dao.update(ctkm);
    }

    @Override
    public ChuongTrinhKhuyenMaiEntity kiemTraKhuyenMai(double tongTien) {
       return ctkm_dao.kiemTraKhuyenMai(tongTien);
    }

 
    
}
