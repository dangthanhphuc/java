package Bai3;

public class NhanVien extends Nguoi{
    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getNgayNhaViec() {
        return ngayNhaViec;
    }

    public void setNgayNhaViec(String ngayNhaViec) {
        this.ngayNhaViec = ngayNhaViec;
    }

    public PhongBanKhoa getPbk() {
        return pbk;
    }

    public void setPbk(PhongBanKhoa pbk) {
        this.pbk = pbk;
    }

    public NhanVien(String ten, String namSinh, float luong, String ngayNhaViec, PhongBanKhoa pbk) {
        super(ten,namSinh);
        this.luong = luong;
        this.ngayNhaViec = ngayNhaViec;
        this.pbk = pbk;
    }

    public void out(){
        super.getTen();
        super.getNamSinh();

    }

    private float luong;
    private String ngayNhaViec;
    private PhongBanKhoa pbk;

}
