
package Interface;

import entity.ChuongTrinhKhuyenMaiEntity;
import entity.LoaiKhuyenMaiEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ChuongTrinhKhuyenMai_Interface {
    public ArrayList<ChuongTrinhKhuyenMaiEntity > getallCTKM();
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getCTKMTheoMaCTKM(String maCTKM, String maLoai);
    public boolean create (ChuongTrinhKhuyenMaiEntity ctkm);
    public boolean delete (ChuongTrinhKhuyenMaiEntity ctkm);
    public boolean update (ChuongTrinhKhuyenMaiEntity ctkm);
    public ArrayList<LoaiKhuyenMaiEntity> getallLoaiCTKM() ;
<<<<<<< HEAD
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getallCTKMtheoLoaiKM(String ma);
=======
>>>>>>> 3889e5a70f3db062bc1350b0b31bb7314a235503
    // Nguyen Huy Hoang
    public ChuongTrinhKhuyenMaiEntity kiemTraKhuyenMai(double tongTien);
}
