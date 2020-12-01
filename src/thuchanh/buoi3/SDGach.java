package thuchanh.buoi3;

import java.util.Scanner;

public class SDGach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhap so loai gach: ");
        int n = sc.nextInt();

        Gach[] brick = new Gach[n];

        for (int i = 0; i < brick.length; i++) {
            System.out.println("- Nhap thong tin hop thu " + (i + 1));
            brick[i] = new Gach();
            brick[i].nhapThongTin();
        }

        for (int i = 0; i < brick.length; i++) {
            System.out.println("- Thong tin hop thu " + (i + 1));
            brick[i].hienThiThongTin();
        }

        double min = brick[0].giaBanLe() / brick[0].dienTichHopGachLotDuoc();
        int pos = 0;
        for (int i = 1; i < brick.length; i++) {
            if (min > (brick[i].giaBanLe() / brick[i].dienTichHopGachLotDuoc())) {
                min = (brick[i].giaBanLe() / brick[i].dienTichHopGachLotDuoc());
                pos = i;
            }
        }
        System.out.println("- Loai gach re nhat: " + (pos + 1));

        for (int i = 0; i < brick.length; i++) {
            System.out.println(brick[i].dienTichHopGachLotDuoc());
        }

        for (int i = 0; i < brick.length; i++) {
            int sohop = brick[i].soLuongHop(2000, 500);
            System.out.println(brick[i].soLuongHop(2000, 500));
            double giatien = brick[i].getGiaban();
            System.out.println("- Tong tien khi lot nen hop thu " + (i + 1) + ": " + giatien * sohop);
        }
    }
}
