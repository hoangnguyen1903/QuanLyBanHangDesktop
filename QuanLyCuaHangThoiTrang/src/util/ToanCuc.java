
package util;

public class ToanCuc {
    private static String ma = "";
    private static String name = "";
    private static String gioitnh ="";
    private static String chucvu ="";
    

    public  ToanCuc(){
        
    }

    public static String getName() {
        return name;
    }
    public static void setName(String aName) {
        name = aName;
    }

    public static String getMa() {
        return ma;
    }

    public static void setMa(String ma) {
        ToanCuc.ma = ma;
    }

    public static String getGioitnh() {
        return gioitnh;
    }

    public static void setGioitnh(String gioitnh) {
        ToanCuc.gioitnh = gioitnh;
    }

    public static String getChucvu() {
        return chucvu;
    }

    public static void setChucvu(String chucvu) {
        ToanCuc.chucvu = chucvu;
    }
    
}
