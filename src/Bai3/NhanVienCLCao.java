package Bai3;

import java.util.Scanner;

public class NhanVienCLCao extends NhanVien{

    private String trinhDo;
    private String nganh;
    private String noiDaoTao;

    public NhanVienCLCao(String ten, String namSinh, float luong, String ngayNhaViec,
                         PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhaViec, pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Nhap nganh: ");
        this.nganh = sc.nextLine();
        System.out.print("Nhap noi dao tao: ");
        this.noiDaoTao = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Trinh do: " + trinhDo);
        System.out.println("Nganh: " + nganh);
        System.out.println("Noi dao tao: " + noiDaoTao);
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }
}
