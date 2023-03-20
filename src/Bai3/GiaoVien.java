package Bai3;

public class GiaoVien extends NhanVienCLCao{
    private float thuLaoGD;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String ten, String namSinh, float luong, String ngayNhaViec, PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, float thuLaoGD) {
        super(ten, namSinh, luong, ngayNhaViec, pbk, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    public float getThuLaoGD() {
        return thuLaoGD;
    }

    public void setThuLaoGD(float thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }
}
