package thuchanh.buoi1;

import java.util.Scanner;

public class DaySo {
    int a[];

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    public void ThongKe() {
        
    }
}
