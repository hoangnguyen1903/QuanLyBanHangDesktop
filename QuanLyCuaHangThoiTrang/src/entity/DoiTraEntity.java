package entity;

import java.sql.Date;
import java.util.Objects;

public class DoiTraEntity {
	private String maDYCDT;
	private HoaDonEntity hoaDon;
	private NhanVienEntity nhanVien;
	private HinhThucDoiTraEnum hinhThucDoiTra;
	private Date thoiGianDoiTra;

        public DoiTraEntity() {
        }

        public DoiTraEntity(String maDYCDT, HoaDonEntity hoaDon, NhanVienEntity nhanVien, HinhThucDoiTraEnum hinhThucDoiTra, Date thoiGianDoiTra) {
            this.maDYCDT = maDYCDT;
            this.hoaDon = hoaDon;
            this.nhanVien = nhanVien;
            this.hinhThucDoiTra = hinhThucDoiTra;
            this.thoiGianDoiTra = thoiGianDoiTra;
        }

        public String getMaDYCDT() {
            return maDYCDT;
        }

        public void setMaDYCDT(String maDYCDT) {
            this.maDYCDT = maDYCDT;
        }

        public HoaDonEntity getHoaDon() {
            return hoaDon;
        }

        public void setHoaDon(HoaDonEntity hoaDon) {
            this.hoaDon = hoaDon;
        }

        public NhanVienEntity getNhanVien() {
            return nhanVien;
        }

        public void setNhanVien(NhanVienEntity nhanVien) {
            this.nhanVien = nhanVien;
        }

        public HinhThucDoiTraEnum getHinhThucDoiTra() {
            return hinhThucDoiTra;
        }

        public void setHinhThucDoiTra(HinhThucDoiTraEnum hinhThucDoiTra) {
            this.hinhThucDoiTra = hinhThucDoiTra;
        }

        public Date getThoiGianDoiTra() {
            return thoiGianDoiTra;
        }

        public void setThoiGianDoiTra(Date thoiGianDoiTra) {
            this.thoiGianDoiTra = thoiGianDoiTra;
        }

        @Override
        public String toString() {
            return "DonYeuCauDoiTraEntity{" + "maDYCDT=" + maDYCDT + ", hoaDon=" + hoaDon + ", nhanVien=" + nhanVien + ", hinhThucDoiTra=" + hinhThucDoiTra + ", thoiGianDoiTra=" + thoiGianDoiTra + '}';
        }
        
	@Override
	public int hashCode() {
		return Objects.hash(maDYCDT);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoiTraEntity other = (DoiTraEntity) obj;
		return Objects.equals(maDYCDT, other.maDYCDT);
	}
	
	
}
