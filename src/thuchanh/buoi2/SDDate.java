package thuchanh.buoi2;

import java.util.Scanner;

public class SDDate {
    public static void main(String[] args) {
        Date d = new Date();
        Scanner sc = new Scanner(System.in);

        d.nhap();
        d.hienThi();
        System.out.print("Nhap so ngay muon cong: " );
        int n = sc.nextInt();
        d.congNgay(n).hienThi();
    }
}
