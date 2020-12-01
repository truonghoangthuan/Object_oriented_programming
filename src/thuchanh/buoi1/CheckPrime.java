package thuchanh.buoi1;

import java.util.Scanner;

public class CheckPrime {

    public boolean isPrime(int n) {
        boolean check = true;
        if (n <= 1) {
            check = false;
        } else if (n == 2) {
            check = true;
        } else if (n > 2) {
            for (int i = 3; i < n; i = i + 2) {
                if (n % i == 0) {
                    check = false;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPrime x = new CheckPrime();
        Binary b = new Binary();

        System.out.print("Nhập n: ");
        int num = sc.nextInt();
        if (x.isPrime(num) == true) {
            System.out.print(num + " nhị phân là: ");
            b.toBinary(num);
        } else {
            System.out.println(num + " không phải số nguyên tố");
        }
    }
}
