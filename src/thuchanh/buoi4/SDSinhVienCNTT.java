package thuchanh.buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVienCNTT[] sv = new SinhVienCNTT[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\tNhap thong tin sinh vien thu " + (i + 1));
            sv[i] = new SinhVienCNTT();
            sv[i].nhapThongTinSinhVienCNTT();
        }

        System.out.print("- Nhap email can tim: ");
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.equalsIgnoreCase(sv[i].getEmail())) {
                for (int j = 0; j < sv[i].getSoHocPhan(); j++) {
                    System.out.println("- Hoc phan " + sv[i].getTenHocPhan()[j] + ": " + sv[i].getDiemHocPhan()[j]);
                }
            }
        }
    }
}
