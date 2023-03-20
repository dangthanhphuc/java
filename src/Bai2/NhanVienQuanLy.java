package Bai2;

public class NhanVienQuanLy extends NhanVien{

    private float phuCapChucVu;

    public NhanVienQuanLy(String maNhanVien, String tenNhanVien, String namSinh,
                          String trinhDo, String truongDaoTao, String chuyenMon,
                          float phuCapChucVu, float luongCoBan) {
        super(maNhanVien, tenNhanVien, namSinh, trinhDo, truongDaoTao, chuyenMon, luongCoBan);
        this.phuCapChucVu = phuCapChucVu;
    }

    public float getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(float phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

}
