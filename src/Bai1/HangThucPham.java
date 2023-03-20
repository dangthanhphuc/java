package Bai1;

public class HangThucPham extends MatHang{
    private String ngaySanSuat;
    private String ngayHetHang;

    public HangThucPham(){}

    public HangThucPham(String maHang, String tenHang, String nhaSanSuat, float gia, String ngaySanSuat, String ngayHetHang) {
        super(maHang, tenHang, nhaSanSuat, gia);
        this.ngaySanSuat = ngaySanSuat;
        this.ngayHetHang = ngayHetHang;
    }

    public String getNgaySanSuat() {
        return ngaySanSuat;
    }

    public void setNgaySanSuat(String ngaySanSuat) {
        this.ngaySanSuat = ngaySanSuat;
    }

    public String getNgayHetHang() {
        return ngayHetHang;
    }

    public void setNgayHetHang(String ngayHetHang) {
        this.ngayHetHang = ngayHetHang;
    }
}
