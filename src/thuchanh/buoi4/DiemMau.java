package thuchanh.buoi4;

import thuchanh.buoi2.Diem;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String mau;
    Scanner sc = new Scanner(System.in);

    public DiemMau(String mau) {
        this.mau = mau;
    }

    public DiemMau() {

    }

    public DiemMau(int x, int y) {
        super(x, y);
    }

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void ganMau(String mau) {
        this.mau = mau;
    }

    public void nhapDiemMau() {
        super.nhapDiem();
        System.out.print("Nhap mau: ");
        this.mau = sc.nextLine();
    }

    public void hienThiDiemMau() {
        super.hienThiDiem();
        System.out.println("Mau cua diem: " + this.mau);
    }
}
