package Bai3;

import Bai2.NhanVienQuanLy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void menu(){
        System.out.println("1.Nhap 1 hoc vien");
        System.out.println("2.Nhap 1 nhan vien quan ly");
        System.out.println("3.Nhap 1 giao vien");
        System.out.println("4.Xuat thong tin 1 hoc vien");
        System.out.println("5.Xuat thong tin 1 nhan vien quan ly");
        System.out.println("6.Xuat thong tin 1 giao vien");
        System.out.println("0.Thoat");
        System.out.print("Nhap lua chon: ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nguoi nguoi;
        List<Nguoi> list = new ArrayList<>();
        int option = 0;

        do{
            menu();
            option = sc.nextInt();
            System.out.println();

            switch(option){

                case 1:
                    nguoi = new HocVien();
                    nguoi.input();
                    System.out.println();
                    list.add(nguoi);
                    break;
                case 2:
                    nguoi = new NVQuanLy();
                    nguoi.input();
                    System.out.println();
                    list.add(nguoi);
                    break;
                case 3:
                    nguoi = new GiaoVien();
                    nguoi.input();
                    System.out.println();
                    list.add(nguoi);
                    break;
                case 4:
                    for (Nguoi n: list )
                        if( n instanceof HocVien) {
                            n.output();
                            System.out.println();
                        }
                    break;
                case 5:
                    for (Nguoi n: list )
                        if( n instanceof NVQuanLy) {
                            n.output();
                            System.out.println();
                        }
                    break;
                case 6:
                    for (Nguoi n: list ){
                        if( n instanceof GiaoVien)
                            n.output();
                        System.out.println();
                    }
                    break;
                default:
                    option = 0;
                    break;
            }
        }while( option>0 && option <= 6 );
    }
}
