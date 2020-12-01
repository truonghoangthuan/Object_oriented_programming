package thuchanh.buoi2;

import lythuyet.GCD_LCM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhanSo {
    private int Tu;
    private int Mau;

    public void PhanSo(int tu, int mauSo) {
        Tu = tu;
        Mau = mauSo;
    }

    public int getTu() {
        return Tu;
    }

    public void setTu(int tu) {
        Tu = tu;
    }

    public int getMau() {
        return Mau;
    }

    public void setMau(int mau) {
        Mau = mau;
    }

    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                System.out.print("Nhap tu so: ");
                setTu(sc.nextInt());
                System.out.print("Nhap mau so: ");
                setMau(sc.nextInt());
                flag = true;
                if (getMau() == 0) {
                    flag = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhap sai!");
                sc.nextLine();
                flag = false;
            }
        } while (flag != true);
    }

    public void hienThi() {
        if (getTu() == 0) {
            System.out.println(0);
        } else if (getMau() == 1) {
            System.out.println(getTu());
        } else if (getMau() == -1 && getTu() < 0) {
            System.out.println(Math.abs(getTu()));
        } else if (getMau() == -1 && getTu() > 0) {
            System.out.println("-"+getTu());
        } else if (getTu() < 0 && getMau() < 0) {
            System.out.println(Math.abs(getTu()) + "/" + Math.abs(getMau()));
        } else if (getTu() < 0 || getMau() < 0) {
            System.out.println("-" + Math.abs(getTu()) + "/" + Math.abs(getMau()));
        } else {
            System.out.println(getTu() + "/" + getMau());
        }
    }

    public void nghichDao() {
        PhanSo ps = new PhanSo();

        ps.setMau(getMau());
        ps.setTu(getTu());

        setMau(ps.getTu());
        setTu(ps.getMau());
    }

    public PhanSo giaTriNghichDao() {
        PhanSo ps = new PhanSo();

        ps.setMau(getMau());
        ps.setTu(getTu());

        ps.setMau(ps.getTu());
        ps.setTu(ps.getMau());

        return ps;
    }

    public double giaTriThuc() {
        return (double) getTu()/(double) getMau();
    }

    public boolean lonHon(PhanSo a) {
        double ps1 = giaTriThuc();
        double ps2 = a.giaTriThuc();
        double max = Math.max(ps1, ps2);

        if (max == ps1) {
            return true;
        } else {
            return false;
        }
    }

    public PhanSo cong(PhanSo a) {
        PhanSo ps = new PhanSo();

        ps.setTu((getTu() * a.getMau()) + (a.getTu() * getMau()));
        ps.setMau(getMau() * a.getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo tru(PhanSo a) {
        PhanSo ps = new PhanSo();

        ps.setTu((getTu() * a.getMau()) - (a.getTu() * getMau()));
        ps.setMau(getMau() * a.getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo nhan(PhanSo a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu() * a.getTu());
        ps.setMau(getMau() * a.getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo chia(PhanSo a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu() * a.getMau());
        ps.setMau(getMau() * a.getTu());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo cong(int a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu() + (a * getMau()));
        ps.setMau(getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo tru(int a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu() - (a * getMau()));
        ps.setMau(getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo nhan(int a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu() * a);
        ps.setMau(getMau());

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }

    public PhanSo chia(int a) {
        PhanSo ps = new PhanSo();

        ps.setTu(getTu());
        ps.setMau(getMau() * a);

        GCD_LCM ucln = new GCD_LCM();
        double GCD = ucln.gcd((double) ps.getTu(), (double) ps.getMau());
        ps.setTu((int) ((double) ps.getTu()/GCD));
        ps.setMau((int) ((double) ps.getMau()/GCD));

        return ps;
    }
}
