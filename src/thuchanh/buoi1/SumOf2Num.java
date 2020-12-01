package thuchanh.buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOf2Num {
    public int sum() {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, sum = 0;
        boolean flag = true;

        do {
            try {
                System.out.print("Enter a: ");
                a = sc.nextInt();
                System.out.print("Enter b: ");
                b = sc.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Error");
                sc.nextLine();
                flag = false;
            }
        } while (flag == !true);
        sum = a + b;
        return (sum);
    }

    public static void main(String[] args) {
        SumOf2Num sum = new SumOf2Num();
        System.out.println("Sum = " + sum.sum());
    }
}
