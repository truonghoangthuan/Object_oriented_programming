package lythuyet;

public class Fibonacci {
    public int nFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return nFibonacci(n - 1) + nFibonacci(n - 2);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Fibonacci fibo = new Fibonacci();
//
//        System.out.print("Nhập n: ");
//        int n = sc.nextInt();
//        System.out.print("Số Fibonacci vị trí thứ " + n + ": " + fibo.nFibonacci(n));
//    }
}
