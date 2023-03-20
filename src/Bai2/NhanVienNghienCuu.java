package Bai2;

public class NhanVienNghienCuu extends NhanVien{
    private float phuCapDocHai;
    public NhanVienNghienCuu(){
        super();
    }
    public NhanVienNghienCuu(String maNhanVien, String tenNhanVien, String namSinh,
                             String trinhDo, String truongDaoTao, String chuyenMon,
                             float phuCapDocHai, float luongCoBan) {
        super(maNhanVien, tenNhanVien, namSinh, trinhDo, truongDaoTao, chuyenMon, luongCoBan);
        this.phuCapDocHai = phuCapDocHai;
    }

    public float getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public void setPhuCapDocHai(float phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }
}
