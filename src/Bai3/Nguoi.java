package Bai3;

abstract class Nguoi {
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

    String ten;
    String namSinh;
}
