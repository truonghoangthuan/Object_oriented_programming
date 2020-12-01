package thuchanh.buoi3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gach {
    private String ms;
    private String mau;
    private int soluong;
    private int chieudai;
    private int chieungang;
    private long giaban;

    public Gach() {

    }

    public Gach(String ms, String mau, int soluong, int chieudai, int chieungang, long giaban) {
        this.ms = ms;
        this.mau = mau;
        this.soluong = soluong;
        this.chieudai = chieudai;
        this.chieungang = chieungang;
        this.giaban = giaban;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieungang() {
        return chieungang;
    }

    public void setChieungang(int chieungang) {
        this.chieungang = chieungang;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(long giaban) {
        this.giaban = giaban;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                System.out.print("Nhap ma so: ");
                setMs(sc.nextLine());
                System.out.print("Nhap mau: ");
                setMau(sc.nextLine());
                System.out.print("Nhap so gach cua hop: ");
                setSoluong(sc.nextInt());
                System.out.print("Nhap chieu dai: ");
                setChieudai(sc.nextInt());
                System.out.print("Nhap chieu ngang: ");
                setChieungang(sc.nextInt());
                System.out.print("Nhap gia ban: ");
                setGiaban(sc.nextLong());
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Nhap sai!");
                flag = false;
            }
        } while (flag != true);
    }

    public void hienThiThongTin() {
        System.out.println("Ma so hop gach: " + getMs());
        System.out.println("Mau gach: " + getMau());
        System.out.println("So gach trong hop: " + getSoluong());
        System.out.println("Chieu dai vien gach: " + getChieudai());
        System.out.println("Chieu ngang vien gach: " + getChieungang());
        System.out.println("Gia ban cua hop: " + getGiaban());
    }

    public float giaBanLe() {
        float giabanle = getGiaban() / getSoluong();
        float giatien = (float) (giabanle * 1.2F);

        return giatien;
    }

    public double dienTichHopGachLotDuoc() {
        double dientich1vien = getChieudai() * getChieungang();
        double tongdientich = getSoluong() * dientich1vien;

        return tongdientich;
    }

    public int soLuongHop(int D, int N) {
        int dientich = D * N;

        return (int) Math.round(dientich / dienTichHopGachLotDuoc());
    }
}
