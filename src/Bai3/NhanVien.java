package Bai3;

import java.util.Scanner;

public class NhanVien extends Nguoi{

    private float luong;
    private String ngayNhaViec;
    private PhongBanKhoa pbk;

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

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        PhongBanKhoa phongBanKhoa = new PhongBanKhoa();
        super.input();
        phongBanKhoa.input();
        this.pbk = phongBanKhoa;
        System.out.print("Nhap luong: ");
        this.luong = sc.nextFloat();
        System.out.print("Nhap ngay nhan viec: ");
        this.ngayNhaViec = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        pbk.output();
        System.out.println("Luong: " + luong);
        System.out.println("Ngay nhan viec: " + ngayNhaViec);
    }
}
