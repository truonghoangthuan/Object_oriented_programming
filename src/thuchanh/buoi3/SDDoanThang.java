package thuchanh.buoi3;

import thuchanh.buoi2.Diem;

public class SDDoanThang {
    public static void main(String[] args) {
        Diem A = new Diem(2,5);
        Diem B = new Diem(20,35);
        DoanThang AB = new DoanThang(A, B);

        AB.hienThiDauMut();
        AB.tinhTien(5, 3);
        System.out.println("- Tinh tien doan thang AB");
        AB.hienThiDauMut();

        Diem C = new Diem();
        Diem D = new Diem();
        DoanThang CD = new DoanThang(C, D);

        CD.nhapToaDo();
        CD.hienThiDauMut();
        System.out.println("- Do dai doan thang CD");
        System.out.println(CD.doDaiDoanThang());
        System.out.println("- Goc CD voi truc hoanh");
        System.out.println(CD.gocVoiTrucHoanh());
    }
}
