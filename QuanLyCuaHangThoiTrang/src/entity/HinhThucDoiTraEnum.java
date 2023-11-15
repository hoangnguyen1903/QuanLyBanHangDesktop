package entity;

public enum HinhThucDoiTraEnum {
	HOANTRA, DOISANPHAMKHAC;
        
        @Override
	public String toString() {
		switch(this) {
			case HOANTRA: return "Hoàn trả";
			case DOISANPHAMKHAC: return "Đổi sản phẩm khác";
                        default: return "Hoàn trả";
		}
	}
}
