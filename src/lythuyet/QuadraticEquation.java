package lythuyet;

public class QuadraticEquation {

    public void quadraticEquation(double a, double b, double c) {
        double d = b*b - 4*a*c;

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

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        QuadraticEquation x = new QuadraticEquation();
//
//        System.out.print("Nhập a: ");
//        double a = sc.nextDouble();
//        System.out.print("Nhập b: ");
//        double b = sc.nextDouble();
//        System.out.print("Nhập c: ");
//        double c = sc.nextDouble();
//        x.quadraticEquation(a, b, c);
//    }
}
