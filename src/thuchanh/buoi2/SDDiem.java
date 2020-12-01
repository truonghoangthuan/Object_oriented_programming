package thuchanh.buoi2;

public class SDDiem {

    public static void main(String[] args) {
        Diem d = new Diem();
        Diem p = new Diem();

        d.nhapDiem();
        d.hienThiDiem();
        d.doiDiem(d.getX(),d.getY());
        System.out.println("Doi diem");
        d.hienThiDiem();
        System.out.println("hoanh do = " + d.getX());
        System.out.println("tung do = " + d.getY());
        System.out.println("Khoang cach den goc toa do = " + d.khoangCach());
        System.out.println("Nhap diem p");
        p.nhapDiem();
        System.out.println("Khoang cach den diem p = " + d.khoangCach(p));
    }
}
