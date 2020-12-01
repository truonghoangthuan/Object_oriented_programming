package thuchanh.buoi2;

import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();

        x.nhapPhanSo();
        x.hienThi();
        y.nhapPhanSo();
        y.hienThi();

        x.giaTriNghichDao().hienThi();

        x.cong(y).hienThi();
    }
}
