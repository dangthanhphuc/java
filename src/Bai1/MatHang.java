package Bai1;

public class MatHang {
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhaSanSuat() {
        return nhaSanSuat;
    }

    public void setNhaSanSuat(String nhaSanSuat) {
        this.nhaSanSuat = nhaSanSuat;
    }

    public MatHang(){
        this.maHang = null;
        this.tenHang = null;
        this.nhaSanSuat = null;
    }

    public MatHang(String maHang, String tenHang, String nhaSanSuat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanSuat = nhaSanSuat;
    }

    private String maHang;
    private String tenHang;
    private String nhaSanSuat;

}
