package entity;

public enum KichThuocEnum {
    XS, S, M, L, XL, XXL;

    @Override
    public String toString() {
        switch (this) {
            case XS:
                return "XS";
            case S:
                return "S";
            case M:
                return "M";
            case L:
                return "L";
            case XL:
                return "XL";
            case XXL:
                return "XXl";
            default:
                return null;
        }
    }

}
