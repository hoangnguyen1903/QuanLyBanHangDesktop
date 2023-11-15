/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import entity.SanPhamEntity;
import java.util.ArrayList;

/**
 *
 * @author Tran Hien Vinh
 */
public interface SanPham_Interface {

    public ArrayList<SanPhamEntity> getAllSanPham();

    public boolean themSP(SanPhamEntity sp);

    public ArrayList<SanPhamEntity> timSanPham(String ma);

    public boolean capNhatSanPham(SanPhamEntity sp);
    public ArrayList<SanPhamEntity> kiemTraTonKho();

    public SanPhamEntity timKiemSanPham(String ma);
    public int laySoLuongTonKhoTheoMaSP(String maSP);
    public boolean capNhatSoLuong(String maSP, int soLuongNhap);
}
