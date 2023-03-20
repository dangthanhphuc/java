package Bai3;

import java.util.Scanner;

public class PhongBanKhoa {
    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong ban: ");
        this.maPhongBan = sc.nextLine();
        System.out.print("Nhap ten phong ban: ");
        this.tenPhongBan = sc.nextLine();
    }

    public void output(){
        System.out.println("Ma phong ban: " + maPhongBan);
        System.out.println("Ten phong ban: " + tenPhongBan);
    }

    private String maPhongBan;
    private String tenPhongBan;
}
