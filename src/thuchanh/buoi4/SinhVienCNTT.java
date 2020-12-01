package thuchanh.buoi4;

import thuchanh.buoi2.Date;
import thuchanh.buoi3.SinhVien;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    Scanner sc = new Scanner(System.in);
    private String taikhoan, matkhau, email;

    public SinhVienCNTT() {

    }

    public SinhVienCNTT(String mssv,
                        String hoTen,
                        Date ngaySinh,
                        int soHocPhan,
                        String[] tenHocPhan,
                        String[] diemHocPhan,
                        String taikhoan,
                        String matkhau,
                        String email) {
        super(mssv, hoTen, ngaySinh, soHocPhan, tenHocPhan, diemHocPhan);
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhapThongTinSinhVienCNTT() {
        super.nhapThongTin();
        super.nhapDiemHocPhan();
        System.out.print("- Nhap tai khoan: ");
        this.taikhoan = sc.nextLine();
        System.out.print("- Nhap mat khau: ");
        this.matkhau = sc.nextLine();
        System.out.print("- Nhap email: ");
        this.email = sc.nextLine();
    }

    public String toString() {
        String s = super.toString();

        s += "- Ten tai khoan: " + this.taikhoan.toString() + "\n";
        s += "- Mat khau: " + this.matkhau.toString() + "\n";
        s += "- Email: " + this.email.toString() + "\n";

        return s;
    }

    public void doiMatKhau(String newpass) {
        this.matkhau = newpass;
    }
}
