package Bai1;

public class HangDienMay extends MatHang{
    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public float getDienAp() {
        return dienAp;
    }

    public void setDienAp(float dienAp) {
        this.dienAp = dienAp;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }



    public HangDienMay() {}

    public HangDienMay(String maHang, String tenHang, String nhaSanSuat, float gia, String thoiGianBaoHanh, float dienAp, float congSuat) {
        super(maHang, tenHang, nhaSanSuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    private String thoiGianBaoHanh;
    private float dienAp;
    private float congSuat;
}
