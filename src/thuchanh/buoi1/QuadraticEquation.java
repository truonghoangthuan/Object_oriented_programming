package thuchanh.buoi1;

import java.util.Scanner;

public class QuadraticEquation {
    public static double ptBacMot() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pt bac 1");
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        return (-b / a);
    }
    public static void ptBacHai() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pt bac 2");
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        double d = (Math.pow(b, 2) - (4 * a * c));
        if(d < 0)
            System.out.print("Vô nghiệm");
        else if(d == 0) {
            double x = -(b / 2*a);
            System.out.print("x = " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(d)) / 2*a;
            double x2 = (-b - Math.sqrt(d)) / 2*a;
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
    }

    public static void main(String[] args) {
        System.out.println(ptBacMot());
        ptBacHai();
    }
}
