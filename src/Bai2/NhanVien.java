package Bai2;

public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String namSinh;
    private String trinhDo;
    private String truongDaoTao;
    private String chuyenMon;
    private float luongCoBan;


    public NhanVien(String maNhanVien, String tenNhanVien, String namSinh, String trinhDo, String truongDaoTao, String chuyenMon, float luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
        this.truongDaoTao = truongDaoTao;
        this.chuyenMon = chuyenMon;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {

    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getTruongDaoTao() {
        return truongDaoTao;
    }

    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
}
