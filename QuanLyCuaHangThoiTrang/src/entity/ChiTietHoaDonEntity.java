package entity;

import java.util.Objects;

public class ChiTietHoaDonEntity {
	
	private SanPhamEntity sanPham;
	private HoaDonEntity hoaDon;
	private int soLuong;
        private double giaBan;
        private double thanhTien;
        
        public ChiTietHoaDonEntity( SanPhamEntity sanPham, HoaDonEntity hoaDon, int soLuong, double giaBan, double thanhTien) {
		
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
                this.giaBan = giaBan;
                this.thanhTien = thanhTien;
	}

	public ChiTietHoaDonEntity() {
	}

	public SanPhamEntity getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPhamEntity sanPham) {
		this.sanPham = sanPham;
	}
	public HoaDonEntity getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDonEntity hoaDon) {
		this.hoaDon = hoaDon;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

        public double getGiaBan() {
            return giaBan;
        }

        public void setGiaBan() {
            if(sanPham.getChuongTrinhKhuyenMai() != null) {
                this.giaBan = (sanPham.getDonGia() * 1.4) * (1 - (sanPham.getChuongTrinhKhuyenMai().getGiamGia() * 0.01));
            } else {
                this.giaBan = sanPham.getDonGia() * 1.4;
            }
        }

        public double getThanhTien() {
            return thanhTien;
        }

        public void setThanhTien() {
            this.thanhTien = giaBan * soLuong;
        }

        @Override
        public String toString() {
            return "ChiTietHoaDonEntity{" + "sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", thanhTien=" + thanhTien + '}';
        }
        
}
