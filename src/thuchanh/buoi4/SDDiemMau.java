package thuchanh.buoi4;

public class SDDiemMau {
    public static void main(String[] args) {
        DiemMau A = new DiemMau(5, 10, "trang");
        A.hienThiDiemMau();

        DiemMau B = new DiemMau();
        B.nhapDiemMau();
        B.doiDiem(10, 8);
        B.hienThiDiem();
        B.ganMau("Vang");
        B.hienThiDiemMau();
    }
}
