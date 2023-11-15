
package Interface;

import entity.ChuongTrinhKhuyenMaiEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ChuongTrinhKhuyenMai_Interface {
    public ArrayList<ChuongTrinhKhuyenMaiEntity > getallCTKM();
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getCTKMTheoMaCTKM(String maCTKM);
    public boolean create (ChuongTrinhKhuyenMaiEntity ctkm);
    public boolean delete (ChuongTrinhKhuyenMaiEntity ctkm);
    public boolean update (ChuongTrinhKhuyenMaiEntity ctkm);
    
    // Nguyen Huy Hoang
    public ChuongTrinhKhuyenMaiEntity kiemTraKhuyenMai(double tongTien);
}
