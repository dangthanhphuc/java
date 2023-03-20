package Bai3;

import java.util.Scanner;

public class Nguoi {
    public Nguoi(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        this.namSinh = sc.nextLine();
    }

    public void output(){
        System.out.println("Ten: " + ten);
        System.out.println("Nam sinh: " + namSinh);
    }

    private String ten;
    private String namSinh;
}
