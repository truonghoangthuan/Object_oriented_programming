package thuchanh.buoi3;

import thuchanh.buoi2.Date;

import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);

    private String mssv;
    private String hoTen;
    private Date ngaySinh = new Date();
    private int soHocPhan;
    private String[] tenHocPhan = new String[100];
    private String[] diemHocPhan = {"A", "B+", "B", "C+", "C", "D+", "D", "F"};

    public SinhVien() {
    }

    public SinhVien(String mssv, String hoTen, Date ngaySinh, int soHocPhan, String[] tenHocPhan, String[] diemHocPhan) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soHocPhan = soHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.diemHocPhan = diemHocPhan;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoHocPhan() {
        return soHocPhan;
    }

    public void setSoHocPhan(int soHocPhan) {
        this.soHocPhan = soHocPhan;
    }

    public String[] getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String[] tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public String[] getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(String[] diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }

    public void nhapThongTin() {
        System.out.print("- Nhap ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("- Nhap MSSV: ");
        mssv = sc.nextLine();
        System.out.println("- Nhap ngay sinh: ");
        ngaySinh.nhap();
    }

    public void nhapDiemHocPhan() {
        System.out.print("- Nhap so hoc phan: ");
        soHocPhan = sc.nextInt();

        for (int i = 0; i < soHocPhan; i++) {
            System.out.print("- Nhap ten hoc phan thu " + (i + 1) + ": ");
            tenHocPhan[i] = sc.next();
            System.out.print("  Nhap diem hoc phan thu " + (i + 1) + ": ");
            diemHocPhan[i] = sc.next();
        }
    }

    public String toString() {

        String s = "";
        s += "- Ho ten: " + hoTen.toString() + "\n";
        s += "- MSSV: " + mssv.toString() + "\n";
        s += "- Ngay sinh: " + ngaySinh.getNgay() + "/" + ngaySinh.getThang() + "/" + ngaySinh.getNam() + "\n";
        s += "- Tong so hoc phan: " + soHocPhan + "\n";

        for (int i = 0; i < soHocPhan; i++) {
            s += "- Hoc phan thu " + (i + 1) + ": " + tenHocPhan[i].toString() + "\n";
            s += "  Diem hoc phan thu " + (i + 1) + ": " + diemHocPhan[i].toString() + "\n";
        }

        return s;
    }

    public double diemTrungBinh() {
        double sum = 0;

        for (int i = 0; i < soHocPhan; i++) {
            switch (diemHocPhan[i]) {
                case "A":
                    sum += 4;
                    break;
                case "B+":
                    sum += 3.5;
                    break;
                case "B":
                    sum += 3;
                    break;
                case "C+":
                    sum += 2.5;
                    break;
                case "C":
                    sum += 2;
                    break;
                case "D+":
                    sum += 1.5;
                    break;
                case "D":
                    sum += 1;
                    break;
                default:
                    break;
            }
        }

        return sum / soHocPhan;
    }

    public void themHocPhan() {
        soHocPhan++;
        for (int i = 0; i < soHocPhan; i++) {
            if (i == soHocPhan - 1) {
                System.out.print("- Nhap ten hoc phan muon them: ");
                tenHocPhan[i] = sc.next();
                System.out.print("- Nhap diem hoc phan: ");
                diemHocPhan[i] = sc.next();
            }
        }
    }

    public void xoaHocPhan() {
        System.out.print("- Nhap ten hoc phan can xoa: ");
        String tmp = sc.nextLine();

        for (int i = 0; i < soHocPhan; i++) {
            if (tenHocPhan[i].equalsIgnoreCase(tmp)) {
                tenHocPhan[i] = tenHocPhan[i + 1];
                diemHocPhan[i] = diemHocPhan[i + 1];
                soHocPhan--;
            }
        }
    }
}
