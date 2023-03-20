package Bai1;

import java.util.Scanner;

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

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap loai nguyen lieu: ");
        this.loaiNguyenLieu = sc.nextLine();
        System.out.println();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Loai nguyen lieu: " + this.loaiNguyenLieu);
        System.out.println();
    }

    private String loaiNguyenLieu;
}
