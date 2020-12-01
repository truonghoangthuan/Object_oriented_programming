package thuchanh.buoi1;

import java.util.Scanner;

public class NameFromFname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fname: ");
        String fname = sc.nextLine();
        fname = fname.trim();
        int space = fname.lastIndexOf(" ");
        for (int i = space; i < fname.length(); i++) {
            System.out.print(fname.charAt(i));
        }
    }
}
