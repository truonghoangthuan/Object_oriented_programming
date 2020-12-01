package lythuyet;

public class Factorial {

    public double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Factorial f = new Factorial();
//
//        System.out.print("Nhập n: ");
//        double n = sc.nextDouble();
//
//        System.out.print(n + " giai thừa = ");
//        System.out.print(f.factorial(n));
//    }
}
