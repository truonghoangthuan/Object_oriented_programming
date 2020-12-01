package thuchanh.buoi3;

import thuchanh.buoi2.Diem;

public class DoanThang {
    private Diem d1 = new Diem();
    private Diem d2 = new Diem();

    public DoanThang() {
    }

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public DoanThang(int ax, int ay, int bx, int by) {
        this.d1 = new Diem(ax, ay);
        this.d2 = new Diem(ax, ay);
    }

    public Diem getD1() {
        return d1;
    }

    public void setD1(Diem d1) {
        this.d1 = d1;
    }

    public Diem getD2() {
        return d2;
    }

    public void setD2(Diem d2) {
        this.d2 = d2;
    }

    public void nhapToaDo() {
        System.out.println("- Nhap toa do diem thu nhat: ");
        d1.nhapDiem();
        System.out.println("- Nhap toa do diem thu hai: ");
        d2.nhapDiem();
    }

    public void hienThiDauMut() {
        System.out.println("- Diem thu nhat:");
        d1.hienThiDiem();
        System.out.println("- Diem thu hai:");
        d2.hienThiDiem();
    }

    public void tinhTien(int dx, int dy) {
        d1.setX(d1.getX() + dx);
        d1.setY(d1.getY() + dy);
        d2.setX(d2.getX() + dx);
        d2.setY(d2.getY() + dy);
    }

    public double doDaiDoanThang() {
        return d1.khoangCach(d2);
    }

    public double gocVoiTrucHoanh() {
        double tu = Math.abs(d2.getX()-d1.getX());
        double hoanhDoBinh = Math.pow(d2.getX() - d1.getX(), 2);
        double tungDoBinh = Math.pow(d2.getY() - d1.getY(), 2);
        double mau = Math.sqrt(hoanhDoBinh + tungDoBinh);

        return Math.toDegrees(Math.acos(tu / mau));
    }
}
