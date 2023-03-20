package Bai1;

import java.util.Scanner;

public class HangThucPham extends MatHang{
    private String ngaySanSuat;
    private String ngayHetHang;

    public HangThucPham(){}

    public HangThucPham(String maHang, String tenHang, String nhaSanSuat, float gia, String ngaySanSuat, String ngayHetHang) {
        super(maHang, tenHang, nhaSanSuat, gia);
        this.ngaySanSuat = ngaySanSuat;
        this.ngayHetHang = ngayHetHang;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ngay san xuat: ");
        this.ngaySanSuat = sc.nextLine();
        System.out.print("Nhap ngay het han: ");
        this.ngayHetHang = sc.nextLine();

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngay san xuat: " + ngaySanSuat);
        System.out.println("Ngay het han: " + ngayHetHang);

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
