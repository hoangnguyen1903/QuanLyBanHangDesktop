package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ChuongTrinhKhuyenMaiEntity {
	private String maCTKM, tenCTKM;
	private double soTienToiThieu;
	private int giamGia;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	public ChuongTrinhKhuyenMaiEntity(String maCTKM, String tenCTKM, double soTienToiThieu, int giamGia,
			Date ngayBatDau, Date ngayKetThuc) {
		super();
		this.maCTKM = maCTKM;
		this.tenCTKM = tenCTKM;
		this.soTienToiThieu = soTienToiThieu;
		this.giamGia = giamGia;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}
	public ChuongTrinhKhuyenMaiEntity(String maCTKM) {
		super();
		this.maCTKM = maCTKM;
	}
	public ChuongTrinhKhuyenMaiEntity() {
		super();
	}
	public String getMaCTKM() {
		return maCTKM;
	}
	public void setMaCTKM(String maCTKM) {
		this.maCTKM = maCTKM;
	}
	public String getTenCTKM() {
		return tenCTKM;
	}
	public void setTenCTKM(String tenCTKM) {
		this.tenCTKM = tenCTKM;
	}
	public double getSoTienToiThieu() {
		return soTienToiThieu;
	}
	public void setSoTienToiThieu(double soTienToiThieu) {
		this.soTienToiThieu = soTienToiThieu;
	}
	public int getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	@Override
	public String toString() {
		return "ChuongTrinhKhuyenMaiEntity [maCTKM=" + maCTKM + ", tenCTKM=" + tenCTKM + ", soTienToiThieu="
				+ soTienToiThieu + ", giamGia=" + giamGia + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc="
				+ ngayKetThuc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maCTKM);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuongTrinhKhuyenMaiEntity other = (ChuongTrinhKhuyenMaiEntity) obj;
		return Objects.equals(maCTKM, other.maCTKM);
	}
	
	
}
