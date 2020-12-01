package thuchanh.buoi1;

import java.util.Scanner;

public class ListNumbers {
    public int Count(int a, int [] mang) {
        int k = 0, cnt = 0;
        while (k <= mang.length) {
            if (a == mang[k]) {
                cnt += 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNumbers Dem = new ListNumbers();

        System.out.print("Enter size of list: ");
        int size= sc.nextInt();
        int [] Arr = new int[size];
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Enter " + i + " number: ");
            Arr[i] = sc.nextInt();
        }
        for (int j = 0; j <= Arr.length; j++) {
            System.out.println(Dem.Count(Arr[j],Arr));
        }
    }
}
