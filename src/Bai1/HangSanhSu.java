package Bai1;

public class HangSanhSu extends MatHang{
    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    public HangSanhSu() {}

    public HangSanhSu(String maHang, String tenHang, String nhaSanSuat, float gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanSuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    private String loaiNguyenLieu;
}
