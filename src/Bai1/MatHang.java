package Bai1;

import java.util.Scanner;

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

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public MatHang(){
        this.maHang = null;
        this.tenHang = null;
        this.nhaSanSuat = null;
        this.gia = -1f;
    }

    public MatHang(String maHang, String tenHang, String nhaSanSuat, float gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanSuat = nhaSanSuat;
        this.gia = gia;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSanSuat = sc.nextLine();
        System.out.print("Nhap gia: ");
        this.gia = sc.nextFloat();
    }

    public void output(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Nha san xuat: " + nhaSanSuat);
        System.out.println("Gia: " + gia);
    }


    private String maHang;
    private String tenHang;
    private String nhaSanSuat;
    private float gia;


}
