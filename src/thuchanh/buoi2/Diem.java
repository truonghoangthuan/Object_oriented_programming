package thuchanh.buoi2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diem {
    private int x;
    private int y;

    public Diem() {

    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            try {
                System.out.print("Nhap x: ");
                setX(sc.nextInt());
                System.out.print("Nhap y: ");
                setY(sc.nextInt());
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Error!");
                sc.nextLine();
                flag = false;
            }
        } while (!flag);
    }

    public void hienThiDiem() {
        System.out.println("(" + getX() + ", " + getY() + ")");
    }

    public void doiDiem(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double khoangCach() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double khoangCach(Diem d) {
        double HDBinh = Math.pow(d.x - this.x, 2);
        double TDBinh = Math.pow(d.y - this.y, 2);
        double Kq = Math.sqrt(HDBinh + TDBinh);
        return Kq;
    }
}
