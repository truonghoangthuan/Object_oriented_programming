package thuchanh.buoi3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        Scanner sc = new Scanner(System.in);

//        a.nhapThongTin();
//        a.nhapDiemHocPhan();
//        a.themHocPhan();
//        System.out.println("\tThong tin sinh vien\t");
//        System.out.println(a.toString());
//        System.out.println();
        int n = 0;
        SinhVien[] b = new SinhVien[0];
        try {
            FileOutputStream file = new FileOutputStream("D:\\InformationTec\\Java\\BTVN\\src\\btvn\\text.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            System.out.print("- Nhap so sinh vien trong danh sach: ");
            n = sc.nextInt();
            b = new SinhVien[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\tNhap thong tin sinh vien thu " + (i + 1) + "\t");
                b[i] = new SinhVien();
                b[i].nhapThongTin();
                b[i].nhapDiemHocPhan();
            }
            System.out.println();
            obj.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            diem[i] = b[i].diemTrungBinh();
        }
        for (int i = 0; i < n; i++) {
            if (diem[i] < 1) {
                System.out.println("- " + b[i].getHoTen() + " bi canh cao");
            }
        }
        System.out.println();
        double max = diem[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, diem[i]);
        }
        for (int i = 0; i < n; i++) {
            if (max == diem[i]) {
                System.out.println("- " + b[i].getHoTen() + " diem cao nhat lop");
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i].getHoTen().compareToIgnoreCase(b[j].getHoTen()) > 0) {
                    SinhVien tmp = new SinhVien();
                    tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("\tSinh vien thu " + (i + 1) + "\t");
            System.out.println(b[i].toString());
        }
    }
}
