package Bai1;

import java.util.Scanner;

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

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = sc.nextLine();
        System.out.print("Nhap dien ap: ");
        this.dienAp = sc.nextFloat();
        System.out.print("Nhap loai nguyen lieu: ");
        this.congSuat = sc.nextFloat();
        System.out.println();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
        System.out.println();
    }

    private String thoiGianBaoHanh;
    private float dienAp;
    private float congSuat;
}
