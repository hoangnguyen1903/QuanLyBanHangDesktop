
package bus;

import Interface.ThongKe_Interface;
import dao.ThongKe_dao;
import java.util.ArrayList;

public class ThongKe_bus implements ThongKe_Interface {
    ThongKe_dao  tk_dao = new ThongKe_dao();

    @Override
    public ArrayList<Object[]> getListThongKeDoanhThu() {
       return tk_dao.getListThongKeDoanhThu();
    }

    @Override
    public ArrayList<Object[]> getListThongKeDoanhSo() {
        return tk_dao.getListThongKeDoanhSo();
    }
    
}
