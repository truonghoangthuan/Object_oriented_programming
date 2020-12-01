package thuchanh.buoi1;
import java.util.Scanner;

public class Binary {

    public void toBinary(int n) {
        int [] arr = new int[32];
        int i = 0;
        while (n != 0) {
            arr[i] = n % 2;
            i++;
            n /= 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        Binary b = new Binary();

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print(n + " nhị phân là: ");
        b.toBinary(n);
    }
}
