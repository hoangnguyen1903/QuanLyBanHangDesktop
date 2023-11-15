
package Interface;

import entity.ChiTietHoaDonEntity;
import entity.HoaDonEntity;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public interface HoaDon_Interface {
    //Đinh Nguyên Chung
    public ArrayList<HoaDonEntity> getallHoaDon();
    public double getTotalMoney(String maHD);
    public HoaDonEntity getHoaDonTheoMaHD(String maHD);
    public ArrayList<HoaDonEntity> getHoaDonTheoNgayLap(java.sql.Date ngayLap);
//    public ArrayList<HoaDonEntity> getHoaDonTheoMaHDvaNgayLap(String maHD,java.sql.Date ngayLap);
    
    // Nguyen Huy Hoang
    public boolean themHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD);
    public HoaDonEntity timKiemHoaDonTheoMa(String maHD);
}
