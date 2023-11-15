package entity;

public enum TinhTrangSPEnum {
	DANGBAN, NGUNGBAN;
	
	@Override
	public String toString() {
		switch(this) {
			case DANGBAN: return "Đang bán";
			case NGUNGBAN: return "Ngừng bán";
		}
		return null;
	}
}
