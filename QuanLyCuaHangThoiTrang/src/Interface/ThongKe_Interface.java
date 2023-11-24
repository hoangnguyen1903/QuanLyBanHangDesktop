
package Interface;

import java.util.ArrayList;

public interface ThongKe_Interface {
    //Đinh Nguyên Chung
    public ArrayList<Object[]> getListThongKeDoanhThu();
    public ArrayList<Object[]> getListThongKeDoanhSo();
    public ArrayList<Object[]> getListDoanhThuTheoThangvaNam(String thang,String nam);
    public ArrayList<Object[]> getListDoanhThuTrongNam(String nam);
    public ArrayList<Object[]> getListThongKeDoanhSoTheoThangNam(String thangNam,String sort);
}
