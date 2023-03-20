package Bai2;

public class NhanVienPhucVu extends NhanVien{
    public NhanVienPhucVu(){
        super();
    }
    public NhanVienPhucVu(String maNhanVien, String tenNhanVien, String namSinh,
                          String trinhDo, float luongCoBan) {
        super(maNhanVien, tenNhanVien, namSinh, trinhDo, null, null, luongCoBan);
    }
}
