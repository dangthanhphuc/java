package Bai3;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLCao{
    private float phuCapCV;

    public NVQuanLy(String ten, String namSinh, float luong, String ngayNhaViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao,
                    float phuCapCV) {
        super(ten, namSinh, luong, ngayNhaViec, pbk, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    public float getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(float phuCapCV) {
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap cong viec: ");
        this.phuCapCV = sc.nextFloat();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Phu cap cong viec: " + phuCapCV);
    }
}
