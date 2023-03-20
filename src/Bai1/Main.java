package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void menu(){
        System.out.println("1.Nhap 1 hang dien may");
        System.out.println("2.Nhap 1 hang sanh su");
        System.out.println("3.Nhap 1 hang thuc pham");
        System.out.println("4.Xuat thong tin 1 hang dien may");
        System.out.println("5.Xuat thong tin 1 hang sanh su");
        System.out.println("6.Xuat thong tin 1 hang thuc pham");
        System.out.println("0.Thoat");
        System.out.print("Nhap lua chon: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatHang matHang;
        List<MatHang> list = new ArrayList<>();
        int option = 0;

        do{
            menu();
            option = sc.nextInt();
            System.out.println();

            switch(option){

                case 1:
                    matHang = new HangDienMay();
                    matHang.input();
                    System.out.println();
                    list.add(matHang);
                    break;
                case 2:
                    matHang = new HangSanhSu();
                    matHang.input();
                    System.out.println();
                    list.add(matHang);
                    break;
                case 3:
                    matHang = new HangThucPham();
                    matHang.input();
                    System.out.println();
                    list.add(matHang);
                    break;
                case 4:
                    for (MatHang n: list )
                        if( n instanceof HangDienMay) {
                            n.output();
                            System.out.println();
                        }
                    break;
                case 5:
                    for (MatHang n: list )
                        if( n instanceof HangSanhSu) {
                            n.output();
                            System.out.println();
                        }
                    break;
                case 6:
                    for (MatHang n: list ){
                        if( n instanceof HangThucPham)
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
