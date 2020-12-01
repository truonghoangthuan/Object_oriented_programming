package lythuyet;

public class GCD_LCM {

    public double gcd(double a, double b) {
        double max = Math.max(Math.abs(a), Math.abs(b));
        double min = Math.min(Math.abs(a), Math.abs(b));

        if (max % min == 0) {
            return min;
        } else {
            double gcd = 0;
            for (double i = min - 1; i > 0; i--) {
                if (max % i == 0 && min % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }

    public double lcm(double a, double b) {
        return (a * b) / gcd(a, b);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        GCD_LCM g = new GCD_LCM();
//        GCD_LCM l = new GCD_LCM();
//
//        System.out.print("Nhập a: ");
//        double a = sc.nextDouble();
//        System.out.print("Nhập b: ");
//        double b = sc.nextDouble();
//
//        System.out.println("Ước chung lớn nhất: " + g.gcd(a, b));
//        System.out.println("Bội chung nhỏ nhất: " + l.lcm(a, b));
//    }
}
